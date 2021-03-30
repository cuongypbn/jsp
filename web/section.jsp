<%-- 
    Document   : section
    Created on : Jan 17, 2018, 10:58:05 PM
    Author     : chienbinhdondoc
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="entity.Product"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        <% Vector<Product> vectorpProducts = (Vector<Product>) request.getAttribute("hienthi");
                
        %>
        <% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>


        <div class="list_item">
            <div class="container">
                <div class="row">
                    <% for (Product product : vectorpProducts) {%>
                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="conten1-2-3">
                            <div class="box">
                                <div class="img-box" style="width:100%">
                                    <img style="width: 100%" src="<%=product.getImg()%>">
                                </div>
                                <div class="conten-box" style="text-align: left; size: 30px; padding-left: 10px">
                                    <a href="Product_controller?service=infor&ID=<%=product.getPid()%>"><h2><%=product.getProducName()%></h2>

                                    </a>
                                    <h3><%=formatter.format(product.getPrice()) + "VND"%></h3>
                                    <p><%=product.getDescriptions()%></p>

                                    <fieldset class="rating">
                                        <input type="radio" id="<%=product.getPid() %>_star5" name="rating_<%=product.getPid() %>" value="5" /><label class = "full" for="<%=product.getPid() %>_star5" title="Awesome - 5 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star4half" name="rating_<%=product.getPid()%>" value="4 and a half" /><label class="half" for="<%=product.getPid() %>_star4half" title="Pretty good - 4.5 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star4" name="rating_<%=product.getPid() %>" value="4" /><label class = "full" for="<%=product.getPid() %>_star4" title="Pretty good - 4 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star3half" name="rating_<%=product.getPid() %>" value="3 and a half" /><label class="half" for="<%=product.getPid() %>_star3half" title="Meh - 3.5 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star3" name="rating_<%=product.getPid() %>" value="3" /><label class = "full" for="<%=product.getPid() %>_star3" title="Meh - 3 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star2half" name="rating_<%=product.getPid() %>" value="2 and a half" /><label class="half" for="<%=product.getPid() %>_star2half" title="Kinda bad - 2.5 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star2" name="rating_<%=product.getPid() %>" value="2" /><label class = "full" for="<%=product.getPid() %>_star2" title="Kinda bad - 2 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star1half" name="rating_<%=product.getPid() %>" value="1 and a half" /><label class="half" for="<%=product.getPid() %>_star1half" title="Meh - 1.5 stars"></label>
                                        <input type="radio" id="<%=product.getPid() %>_star1" name="rating_<%=product.getPid() %>" value="1" /><label class = "full" for="<%=product.getPid() %>_star1" title="Sucks big time - 1 star"></label>
                                        <input type="radio" id="<%=product.getPid() %>_starhalf" name="rating_<%=product.getPid() %>" value="half" /><label class="half" for="<%=product.getPid() %>_starhalf" title="Sucks big time - 0.5 stars"></label>
                                    </fieldset>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                    <%}%>
                </div>
            </div>
        </div>
        <style>           
            @import url(//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css);
            fieldset,
            label {
                margin: 0;
                padding: 0;
            }
            h1 {
                font-size: 1.5em;
                margin: 10px;
            }

            /****** Style Star Rating Widget *****/

            .rating {
                border: none;
                float: left;
            }

            .rating > input {
                display: none;
            }
            .rating > label:before {
                margin: 5px;
                font-size: 1.25em;
                font-family: FontAwesome;
                display: inline-block;
                content: "\f005";
            }

            .rating > .half:before {
                content: "\f089";
                position: absolute;
            }

            .rating > label {
                color: #ddd;
                float: right;
            }

            /***** CSS Magic to Highlight Stars on Hover *****/

            .rating > input:checked ~ label,
            /* show gold star when clicked */ .rating:not(:checked) > label:hover,
            /* hover current star */ .rating:not(:checked) > label:hover ~ label {
                color: #ffd700;
            } /* hover previous stars in list */

            .rating > input:checked + label:hover,
            /* hover current star when changing rating */
            .rating
            > input:checked
            ~ label:hover,
            .rating > label:hover ~ input:checked ~ label,
            /* lighten current selection */ .rating > input:checked ~ label:hover ~ label {
                color: #ffed85;
            }
        </style>
    </body>
</html>

