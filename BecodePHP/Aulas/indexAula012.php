<?php

  $nome = "Luciano";
  $sobreNome = "Teixeira";
  $idade = 21;
  $peso = 111;

  $nomeCompleto = $nome." ".$sobreNome.", possui ".$idade;

  $msg = $nome." ".$sobreNome;

  //echo "Trabalahndo com PHP!!!";
  echo $nomeCompleto.'.';

  echo "<br><br>";

  echo "Nome: $nomeCompleto".'.';

?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>BeCode PHP na Prática - Cap 01 - Aula 02</title>
  </head>
  <body>
    <h4>Nome: <?php echo $msg ?></h4>
    <p>Idade: <?php echo $idade; ?></p>
    <p>Peso: <?php echo $peso; ?> Kg</p>
  </body>
</html>
