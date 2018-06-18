<?php
  function getInfo($atributo){
    $dados = ["titulo"=>"BeCode PHP na Prática","descricao"=>"Capitulo 01 - Aula 04."]; //Outra Declaração de array
    return $dados[$atributo];
  }

  function getUsuarios(){
    $dados = [["nome"=>"Luciano","email"=>"luciano@mail.com"],
              ["nome"=>"Lucas","email"=>"lucas@mail.com"],
              ["nome"=>"Lucian","email"=>"lucian@mail.com"],
              ["nome"=>"Luan","email"=>"luan@mail.com"],
              ["nome"=>"Luana","email"=>"luana@mail.com"]
              ];

    return $dados;
  }

  function exibeUsuario(){
    $usuarios = getUsuarios();
    $html = "";

    foreach ($usuarios as $key => $usuario) {
      $nome = $usuario["nome"];
      $email = $usuario["email"];
      $html .= "<li> Nome: $nome - E-mail: $email</li>";
    }

    return $html;
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


    <ul>
      <?php echo exibeUsuario() ?>
    </ul>

  </body>
</html>
