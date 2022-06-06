<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Flight List</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">

        <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
        <link rel="stylesheet" href="css/animate.css">

        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">

        <link rel="stylesheet" href="css/aos.css">

        <link rel="stylesheet" href="css/ionicons.min.css">

        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="css/jquery.timepicker.css">


        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>

        <nav class="navbar navbar-expand-lg  ftco_navbar navbar-light ftco-navbar-dark "" id="ftco-navbar">
            <div class="container" style="color: #000000">
                <a class="navbar-brand" href="index.html">Adventure</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="oi oi-menu"></span> Menu
                </button>

                <div class="collapse navbar-collapse" id="ftco-nav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a href="index.html" class="nav-link">Home</a></li>
                        <li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
                        <li class="nav-item"><a href="places.html" class="nav-link">Places</a></li>
                        <li class="nav-item active"><a href="hotel.html" class="nav-link">Flights</a></li>
                        <li class="nav-item"><a href="blog.html" class="nav-link">Blog</a></li>
                        <li class="nav-item"><a href="contact.html" class="nav-link">Contact</a></li>
                        <li class="nav-item" <i class="fa fa-sign-in" aria-hidden="true"></i><a href="login.html" class="nav-link">Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- END nav -->


        <section class="ftco-section" style="background: #f7f7f7">

            <div style="position: relative;text-align: center;width: 60%;background: #FFF; margin-bottom: 15px; padding: 8px;border-radius: 15px;margin-left: 0px;margin-right: 0px ">

                <div class="tab-pane fade show active" id="v-pills-1" role="tabpanel" aria-labelledby="v-pills-nextgen-tab">
                    <form action="#" class="search-destination">
                        <div class="row">
                            <div class="col-md align-items-end">
                                <div class="form-group">
                                    <label for="#">From</label>
                                    <div class="form-field">
                                        <div class="icon"><span class="icon-my_location"></span></div>
                                        <input type="text" class="form-control" placeholder="From">
                                    </div>
                                </div>
                            </div>
                            <div class="col-md align-items-end">
                                <div class="form-group">
                                    <label for="#">To</label>
                                    <div class="form-field">
                                        <div class="icon"><span class="icon-map-marker"></span></div>
                                        <input type="text" class="form-control" placeholder="To">
                                    </div>
                                </div>
                            </div>
                            <div class="col-md align-items-end">
                                <div class="form-group">
                                    <label for="#">Check In</label>
                                    <div class="form-field">
                                        <div class="icon"><span class="icon-map-marker"></span></div>
                                        <input type="text" class="form-control checkin_date" placeholder="Check In">
                                    </div>
                                </div>
                            </div>
                            <div class="col-md align-items-end">
                                <div class="form-group">
                                    <label for="#">Check Out</label>
                                    <div class="form-field">
                                        <div class="icon"><span class="icon-map-marker"></span></div>
                                        <input type="text" class="form-control checkout_date" placeholder="From">
                                    </div>
                                </div>
                            </div>
                            <div class="col-md align-items-end">
                                <div class="form-group">
                                    <label for="#">Travelers</label>
                                    <div class="form-field">
                                        <div class="select-wrap">
                                            <div class="icon"><span class="ion-ios-arrow-down"></span></div>
                                            <select name="" id="" class="form-control">
                                                <option value="">1</option>
                                                <option value="">2</option>
                                                <option value="">3</option>
                                                <option value="">4</option>
                                                <option value="">5</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md align-self-end">
                                <div class="form-group">
                                    <div class="form-field">
                                        <input type="submit" value="Search" class="form-control btn btn-primary">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>


            <div class="container">
                <div class="row">
                    <div class="col-lg-3 sidebar " style="background: #FFF">
                        <div class="sidebar-wrap ftco-animate">
                            <h4 style="font-weight: bold;text-align: center;margin-top: 15px">Filter</h4>
                            <h3 class="heading mb-4" style="margin-top: 15px">Hãng Máy Bay</h3>
                            <form action="#">
                                <div class="fields">

                                    <div class="select-wrap one-third">
                                        <input type="checkbox" style="transform: scale(2);margin-left: 10px">
                                        <label style=" font-weight: bold;margin-left: 5px"><a href="#">Vietjet Air</label>

                                    </div>
                                    <hr>
                                    <div class="form-group">
                                        <h3 class="heading mb-4"> Giá Vé</h3>
                                        <div class="range-slider">
                                            <span>
                                                <input type="number" value="0" min="0" max="120000"/>	-
                                                <input type="number" value="50000" min="0" max="120000"/>
                                            </span>
                                            <input value="0" min="0" max="120000" step="500" type="range"/>
                                            </svg>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="submit" value="Search" class="btn btn-primary py-3 px-5">
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div><!-- END-->
                    <div class="col-lg-9"  >
                        <div class="row" >
                            <div class="col-sm col-md-24 col-lg-12 ftco-animate "  >
                                <div class="destination" >


                                    <div class="text p-3" >
                                        <div class="d-flex">
                                            <div class="one">
                                                <img style="width:40px;height:12px;" src="images/vietjet.png"> 
                                                <h8 style=" font-weight: bold"><a href="#">Vietjet Air</a></h8>
                                                <div>
                                                    <h9><a>VJ162/ Airbus A320</a></h9>
                                                </div>
                                                <br>
                                                <P style=" font-weight: unset;color: #EF3159">From Ha Noi To Da Nang</P>

                                            </div>
                                            <div class="one">
                                                <h7 style=" font-weight: bold;">12:30 </h7>                                               
                                                <img style="width:35px;height:35px;margin-left: 15px;margin-right: 15px" src="images/maybay.png"> 
                                                <h7 style=" font-weight: bold;">15:20 </h7>
                                            </div>
                                            <div class="two">
                                                <span class="price per-price">250.000 VND</span>
                                            </div>
                                        </div>

                                        <hr>
                                        <p class="bottom-area d-flex">
                                            <span><i class="icon-map-o"></i>  First Class</span> 
                                            <span class="ml-auto"><a href="#">Book Now</a></span>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div> 

                        <div class="row mt-5">
                            <div class="col text-center">
                                <div class="block-27">
                                    <ul>

                                        <li class="active"><span>1</span></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>

                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- .col-md-8 -->
                    </div>
                </div>
        </section> <!-- .section -->

        <section class="ftco-section-parallax">
            <div class="parallax-img d-flex align-items-center">
                <div class="container">
                    <div class="row d-flex justify-content-center">
                        <div class="col-md-7 text-center heading-section heading-section-white ftco-animate">
                            <h2>Subcribe to our Newsletter</h2>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in</p>
                            <div class="row d-flex justify-content-center mt-5">
                                <div class="col-md-8">
                                    <form action="#" class="subscribe-form">
                                        <div class="form-group d-flex">
                                            <input type="text" class="form-control" placeholder="Enter email address">
                                            <input type="submit" value="Subscribe" class="submit px-3">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <footer class="ftco-footer ftco-bg-dark ftco-section">
            <div class="container">
                <div class="row mb-5">
                    <div class="col-md">
                        <div class="ftco-footer-widget mb-4">
                            <h2 class="ftco-heading-2">Adventure</h2>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                            <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-3">
                                <li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
                                <li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
                                <li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md">
                        <div class="ftco-footer-widget mb-4 ml-md-4">
                            <h2 class="ftco-heading-2">Information</h2>
                            <ul class="list-unstyled">
                                <li><a href="#" class="py-2 d-block">About Us</a></li>
                                <li><a href="#" class="py-2 d-block">Online enquiry</a></li>
                                <li><a href="#" class="py-2 d-block">Call Us</a></li>
                                <li><a href="#" class="py-2 d-block">General enquiries</a></li>
                                <li><a href="#" class="py-2 d-block">Booking Conditions</a></li>
                                <li><a href="#" class="py-2 d-block">Privacy and Policy</a></li>
                                <li><a href="#" class="py-2 d-block">Refund policy</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md">
                        <div class="ftco-footer-widget mb-4">
                            <h2 class="ftco-heading-2">Experience</h2>
                            <ul class="list-unstyled">
                                <li><a href="#" class="py-2 d-block">Beach</a></li>
                                <li><a href="#" class="py-2 d-block">Adventure</a></li>
                                <li><a href="#" class="py-2 d-block">Wildlife</a></li>
                                <li><a href="#" class="py-2 d-block">Honeymoon</a></li>
                                <li><a href="#" class="py-2 d-block">Nature</a></li>
                                <li><a href="#" class="py-2 d-block">Party</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md">
                        <div class="ftco-footer-widget mb-4">
                            <h2 class="ftco-heading-2">Have a Questions?</h2>
                            <div class="block-23 mb-3">
                                <ul>
                                    <li><span class="icon icon-map-marker"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                                    <li><a href="#"><span class="icon icon-phone"></span><span class="text">+2 392 3929 210</span></a></li>
                                    <li><a href="#"><span class="icon icon-envelope"></span><span class="text">info@yourdomain.com</span></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 text-center">

                        <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
            </div>
        </footer>



        <!-- loader -->
        <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


        <script src="js/jquery.min.js"></script>
        <script src="js/jquery-migrate-3.0.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/aos.js"></script>
        <script src="js/jquery.animateNumber.min.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/jquery.timepicker.min.js"></script>
        <script src="js/scrollax.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
        <script src="js/google-map.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>