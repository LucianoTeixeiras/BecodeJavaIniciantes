<?php
  function getInfo($atributo){
    //$dados = array('titulo','descricao'); //Declaração padrão de array
    $dados = ["titulo"=>"BeCode PHP na Prática","descricao"=>"Capitulo 01 - Aula 03."]; //Outra Declaração de array
    return $dados[$atributo];
  }
?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title><?php echo getInfo("titulo")?></title>
  </head>
  <body>
    <h1><?php echo getInfo("titulo")?></h1>
    <p><?php echo getInfo("descricao")?></p>
  </body>
</html>
