<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <!--Footer-->
        <footer  class="page-footer indigo center-on-small-only pt-0" style="margin-top: 200px;">

                <!--Footer Links-->
                <div class="container">

                    <!--First row-->
                    <div class="row">

                        <!--First column-->
                        <div class="col-md-12">

                            <div class="footer-socials mb-5 ">

                                <!--Facebook-->
                                <a class="icons-sm fb-ic"><i class="fa fa-facebook fa-lg white-text mr-md-4"> </i>css</a><br>
                                <!--Twitter-->
                                <a class="icons-sm tw-ic"><i class="fa fa-twitter fa-lg white-text mr-md-4"> </i>csc</a><br>
                                <!--Google +-->
                                <a class="icons-sm gplus-ic"><i class="fa fa-google-plus fa-lg white-text mr-md-4"> </i>scc</a>
                                <!--Linkedin-->
                                <a class="icons-sm li-ic"><i class="fa fa-linkedin fa-lg white-text mr-md-4"> </i></a>
                                <!--Instagram-->
                                <a class="icons-sm ins-ic"><i class="fa fa-instagram fa-lg white-text mr-md-4"> </i></a>
                                <!--Pinterest-->
                                <a class="icons-sm pin-ic"><i class="fa fa-pinterest fa-lg white-text"> </i></a>
                            </div>
                        </div>
                        <!--/First column-->
                    </div>
                    <!--/First row-->
                </div>
                <!--/Footer Links-->

                <!--Copyright-->
                <div class="footer-copyright">
                    <div class="container-fluid">
                        © 2018 Copyright: <a href="">Nguyễn Văn Cường</a>
                    </div>
                </div>
                <!--/Copyright-->

            </footer>
            <!--/Footer-->                                
        <style>
            #owl-demo .owl-item div{
                padding:5px;
            }
            #owl-demo .owl-item img{
                display: block;
                width: 100%;
                height: auto;
                -webkit-border-radius: 3px;
                -moz-border-radius: 3px;
                border-radius: 3px;
            }
        </style>

        <script>

            $(document).ready(function () {
                $("#owl-demo").owlCarousel({
                    autoPlay: 3000,
                    stopOnHover: true,
                    navigation: false,
                    paginationSpeed: 1000,
                    goToFirstSpeed: 2000,
                    singleItem: true,
                    autoHeight: true,
                    transitionStyle: "fade"
                });
            });
        </script>                  
        <script src="js/jquery-3.2.1.js"></script>
        <script src="./assets/js/jquery-1.9.1.min.js"></script> 
        <script src="js/bootstrap.min.js"></script>
         <script type="text/javascript" src="js/mdb.min.js"></script>
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script src="js/index.js"></script>
        <script src="./owl-carousel/owl.carousel.js"></script>
       
    </body>
</html>
