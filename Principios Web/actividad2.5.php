<html>
<head>
    <meta charset="UTF-8">
<title>Mayor de edad</title>
</head>
<body>
    <?php
    $a=15;
    $b=18;
    $pro=0;

    $pro = ($a+$b)/2;
    echo "El promedio de edad es: ",$pro;

    echo "<br>";

    if ($a>$b){
        echo $a; echo " E mayor que "; echo $b;
    }else{
        echo $b; echo "Es mayor que "; echo $a;
    }
    ?>

</body>
</html>
