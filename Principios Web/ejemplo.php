<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma-rtl.min.css">
    <style>
    input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    }

    input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    }

    input[type=submit]:hover {
    background-color: #45a049;
    }

    div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    }
</style>
    <title>Document</title>
</head>
<body>
    <?php
        $nombre     = "";
        $email      = "";
        $website    = "";
        $comentario = "";
        $genero     = "";

        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $nombre     = validar($_POST["nombre"]);
            $email      = validar($_POST["email"]);
            $website    = validar($_POST["website"]);
            $comentario = validar($_POST["comentario"]);
            $genero     = validar($_POST["genero"]);
        }

        function validar ($data) {
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
        }
    ?>
    <h1>Formulario de validación de PHP</h1>
    <div class="columns is-vcentered">
        <h1>Formulario de validación de PHP</h1>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            Nombre:         <input class="input is-primary"     type="text" name="nombre" required><br><br>
            E-mail:         <input      type="text" name="email" required><br><br>
            Website:        <input      type="text" name="website" ><br><br>
            Comentario:<br> <textarea   name="comentario" rows="4" cols="50"></textarea><br><br>
            Genero:         <input      type="radio" name="genero" value="femenino" required> Femenino <input type="radio" name="genero" value="masculino" required> Masculino<br><br>
            <input class="textarea" type="submit" name="enviar" value="enviar">
        </form>
    </div>
    <div>
    <?php
        echo"<h1>Datos Procesados</h1>";
        echo "<br>";
        echo $nombre;
        echo "<br>";
        echo $email;
        echo "<br>";
        echo $website;
        echo "<br>";
        echo $comentario;
        echo "<br>";
        echo $genero;
        ?>
    </div>
</body>
</html>