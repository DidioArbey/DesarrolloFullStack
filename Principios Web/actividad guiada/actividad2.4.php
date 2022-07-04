<html>
<head>
    <meta charset="UTF-8">
<title>Lo que se escriba se invertira</title>
</head>
<body>
    <form method="post" action="actividad2.4.php">
        <br/>
        Escribe una palabra: <input type="text" name="pal" value="">
        <br/>
        <br/>
        <input value = "Invertir" type="submit" name"boton"/>
        <br/>
</form>

<?php
if (isset($_POST['boton'])){
    $string=$_POST['pal'];
    $length = strlen($string);

    for($i=$length-1;$i >=0;$i--){
        echo $string[$i];
    }
}
?>

    </form>

</body>
</html>