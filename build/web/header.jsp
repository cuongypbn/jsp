<%-- 
    Document   : header
    Created on : Jan 17, 2018, 10:47:58 PM
    Author     : chienbinhdondoc
--%>

<%@page import="entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>WEB</title>
        <!-- Bootstrap -->
        <!-- <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/> -->
        <link rel="stylesheet" type="text/css" href="css/blog.css">
        <link href="css/mdb.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <!-- Owl Carousel Assets -->
        <link href="./owl-carousel/owl.carousel.css" rel="stylesheet">
        <link href="./owl-carousel/owl.theme.css" rel="stylesheet">
        <link href="./owl-carousel/owl.transitions.css" rel="stylesheet">
        <link rel="stylesheet" href="./css/style_login.css">   
        <link rel="stylesheet" href="./css/style.css" />



    </head>
    <body>
        <%
            Customer user=(Customer)session.getAttribute("user");
//          String id=(String)session.getAttribute("ID");

            String name="abc";
            int id=-1;
            if(session.getAttribute("user")!=null)
            {
                 name=user.getUserName();
                 id=user.getCid();
                 
            }
                
               
            
        %>
        <nav class="container-fluid navbar navbar-default row " style="margin: 0px;" role="navigation">
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <form action="#" class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">
                        <span class="glyphicon glyphicon-search"></span> Search</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <!-- <a class="btn btn-primary" >Trigger modal</a> -->
                    <%if(id==-1){%>
                    <li >
                        <a data-toggle="modal" href='#modal-id' href="#">
                            <span class="glyphicon glyphicon-user"></span>login</a>
                    </li>
                    <%}else{%>
                
                    <li id="htlogin1"  class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><%=name %>
                            
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="Product_controller?service=logout">Logout</a>
                                </li>
                                <li>
                                    <a href="#">Account</a>
                                </li>
                                <li>
                                    <a href="Cart_controller">Cart</a>
                                </li>
                            </ul>
                        </li>
                        <%}%>
                    
                    <li class="Cart">
                        <a href="Cart_controller">
                            <span class="glyphicon glyphicon-shopping-cart"></span>Cart</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="modal fade" id="modal-id">
            <div class="modal-dialog">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6 col-md-offset-3">
                            <div class="panel panel-login">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <a class="active" id="login-form-link">Login</a>
                                        </div>
                                        <div class="col-xs-6">
                                            <a  id="register-form-link">Register</a>
                                        </div>
                                    </div>
                                    <hr>
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <form id="login-form" action="Product_controller" method="post" role="form" style="display: block;">
                                                <div class="form-group">
                                                    <input style="width: 90%" type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                                                </div>
                                                <div class="form-group">
                                                    <input style="width: 90%" type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                                </div>
                                                <div class="form-group text-center">
                                                    <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                                                    <label for="remember"> Remember Me</label>
                                                </div>
                                                <input type="hidden" name="service" value="login">
                                                <input type="hidden" name="service" value="display">
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-6 col-sm-offset-3">
                                                            <input style="width: 100px;" onclick="checklogin()" type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-lg-12">
                                                            <div class="text-center">
                                                                <a href="#" tabindex="5" class="forgot-password">Forgot Password?</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                            <form id="register-form" action="#" method="post" role="form" style="display: none;">
                                                <div class="form-group">
                                                    <input style="width: 90%"  type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                                                </div>
                                                <div class="form-group">
                                                    <input style="width: 90%"  type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
                                                </div>
                                                <div class="form-group">
                                                    <input style="width: 90%"  type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                                </div>
                                                <div class="form-group">
                                                    <input style="width: 90%"  type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
                                                </div>
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-6 col-sm-offset-3">
                                                            <input style="width: 100px;" type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>  
            </div>
        </div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="Product_controller">
                        <img src="img/fullimage1.jpg" style="width: 100px">
                    </a>
                </div>
                <div class="collapse navbar-collapse " id="myNavbar">
                    <ul class="nav navbar-nav nav-style">
                        <li class="dropdown-toggle">
                            <form class="navbar-form navbar-left search-input" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search">
                                    <button type="submit" class="btn btn-default">
                                        <span class="glyphicon glyphicon-search"></span> Search</button>
                                </div>
                            </form>
                        </li>
                        
                        <li class="dropdown">
                            <a href="Product_controller">Home</a>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Sản Phẩm
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Đồ uống</a>
                                </li>
                                <li>
                                    <a href="#">♠</a>
                                </li>
                                <li>
                                    <a href="#">Page 1-3</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Mẹo vật
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Page 1-1</a>
                                </li>
                                <li>
                                    <a href="#">Page 1-2</a>
                                </li>
                                <li>
                                    <a href="#">Page 1-3</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Công thức
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Page 1-1</a>
                                </li>
                                <li>
                                    <a href="#">Page 1-2</a>
                                </li>
                                <li>
                                    <a href="#">Page 1-3</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right search-input">
                        <%if(id==-1){%>
                    <li >
                        <a data-toggle="modal" href='#modal-id' href="#">
                            <span class="glyphicon glyphicon-user"></span>login</a>
                    </li>
                    <%}else{%>
                
                    <li id="htlogin1"  class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><%=name %>
                            
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="Product_controller?service=logout">Logout</a>
                                </li>
                                <li>
                                    <a href="#">Account</a>
                                </li>
                                <li>
                                    <a href="#">Cart</a>
                                </li>
                            </ul>
                        </li>
                        <%}%>
                        <li class="Cart">
                            <a href="#">
                                <span class="glyphicon glyphicon-shopping-cart"></span>Cart</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
            
<script>
    var use;
    use=<%=user %>;
    function checklogin(){
        if(use==="out"){
            document.getElementById("htlogin1").style.display="none !important";
             alert(tài khoản của bạn không tồn tại);
           
        }else if(use!==null){
            document.getElementById("htlogin1").style.display="block !important";
            document.getElementById("htlogin").style.display="none !important";
        }
    }
   </script>                     
                                
    </body>
</html>