<html>
<head>
    <meta charset="UTF-8">
<title>Área mayor, cuadrado triangulo </title>
</head>
<body>
<?php
$areacuadrado=0;
$lado=8;
$arearectangulo=0;
$recta=12;
$rectb=20;
echo "El lado ingresado del cuadrado es: ",$lado;
echo "<br>";
$areacuadrado = $lado*$lado;
echo "Su área es: ",$areacuadrado;
echo "<br>";
echo "<br>";
$arearectangulo = ($recta*$rectb);
echo "Su área es: ",$arearectangulo;
echo "<br>";
echo "<br>";

if ($areacuadrado>$arearectangulo){
    echo "El área del cuadrado es mayor que la del rectángulo";
}else {
    echo "El área del rectangulo es mayor que la del cuadrado";
}
?>
</body>
</html>