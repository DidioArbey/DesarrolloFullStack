<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css">
    <title>Formulario validacion</title>
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
    <div class="field is-horizontal">
    <div class="field">
    <label class="label">Formulario de validación de PHP</label><br>
    </div>
    <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
        <div class="field">
            <div method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <div class="field">
                <br><br>
                <label class="label">Nombre :</label>
                <div class="control">
                    <input class="input is-primary" type="text" placeholder="Nombre" name="nombre" required>
                </div>
            </div>

                <div class="field">
                    <label class="label">E-mail :</label>
                    <div class="control has-icons-left has-icons-right">
                        <input class="input is-primary" type="email" placeholder="ingresar e-mail" name="email" >
                        <span class="icon is-small is-left">
                            <i class="fas fa-envelope"></i>
                        </span>
                        <span class="icon is-small is-right">
                            <i class="fas fa-exclamation-triangle"></i>
                        </span>
                    </div>
                </div>

                <div class="field">
                    <label class="label">Website :</label>
                    <div class="control">
                        <input class="input is-primary" type="text" placeholder="Sitio Web" name="website">
                    </div>
                </div>

                <div class="field">
                    <label class="label">Comentario :</label>
                    <div class="control">
                        <textarea class="textarea is-primary" placeholder="Textarea" name="comentario"></textarea>
                    </div>
                </div>

                <div class="field">
                    <label class="label">Genero :</label>
                    <div class="control">
                        <label class="radio">
                            <input type="radio" name="genero" value="femenino" required>
                            Femenino
                        </label>
                        <label class="radio">
                            <input type="radio" name="genero" value="masculino" required>
                            Masculino
                        </label>
                    </div>
                </div>

                <div class="field is-grouped is-grouped-centered">
                    <div class="control">
                        <button class="button is-link" name="enviar" value="enviar">Enviar</button>
                    </div>
                    <div class="control">
                        <button class="button is-link is-light">Cancelar</button>
                    </div>
                </div>

            </form>
        </div>
        <?php
        echo "<br>";
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
    <div >

    </div>

</body>

</html>

