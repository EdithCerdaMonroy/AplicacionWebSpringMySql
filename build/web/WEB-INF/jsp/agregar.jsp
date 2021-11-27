<%-- 
    Document   : agregar
    Created on : 16/11/2021, 09:24:28 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-----------------------------BOOTSTRAP----------------------------->
        <!--Icono-->
        <link rel="Icon" type="img/png" href="img/logoicono.png">
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
        <!--Ventanas emergentes-->
        <link rel="stylesheet" type="text/css" href="css/ventanas.css">
        <!-----------------------------/BOOTSTRAP----------------------------->

    </head>
    <body>
        <header class="jumbotron" style="background-color: #764B36">
        <center><img src="imagen/2.png" alt="img" width="1400" height="300"></center>
        
    </header>
        <div class="container mt-4 col-lg-4">
             <div class="card border-info">
                <div class="card-header bg-info">
                    <h3>Registrar Predio</h3>
                </div>
             </div>
             <div class="card-body">
                <form method="POST">
                    <label>CLAVE</label>
                    <input type="text" name="clave" class="form-control" />
                    <label>SUPERFICIE</label>
                    <input type="text" name="superficie" class="form-control"/>
                    <label>VALOR</label>
                    <input type="text" name="valor" class="form-control"/>
                    <label>UBICACION</label>
                    <input type="text" name="ubicacion" class="form-control"/>
                    <label>AÑO</label>
                    <input type="text" name="anio" class="form-control"/>
                    <label>TOTAL</label>
                    <input type="text" name="total" class="form-control"/>
                    
                    <input type="submit" value="Agregar" class="btn btn-success" />
                    <a href="index.htm">Regresar</a>
                </form>
            </div>
         </div>     


        
        
        <!-- js Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>
        <script type="text/javascript" src="js/municipios.js"></script>
        <script type="text/javascript" src="js/select_estados.js"></script>
        <!-- /js Plugins -->
        
    </body>
</html>
