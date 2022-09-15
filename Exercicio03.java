< html >
< cabeça >
< meta  content =" text/html; charset = UTF-8 " http-equiv =" content-type " >

< title > Controle de Estoque </ title >
</ cabeça >

< tipo de script  =" texto/javascript " >

function  confirmarDeleteProduto ( id ,  descricao ,  preco )  {  
	
    if  ( confirm ( 'Confirmar a exclusão do produto ['  +  descricao  +  '] (ID '  +  id  + '  ) com preço R$ '  +  preco ) {   
        localização . href  =  '/produto/delete/'  +  id ;
    }
}
função  onLoad ( )  {
    if ( document . getElementById ( "msg" ) . value  !=  "" ) {
      alert ( document.getElementById ( " msg " ) . value ) ;
    }
}
</ script >


< body  onload =" onLoad() " >
	< h1 > Controle de Estoque </ h1 >
	< tipo de entrada  =" oculto " id =" msg " nome =" msg " valor ="" >
    < UM-PRODUTO >
	<br> _ _
	< LISTAR-PRODUTO >
	< estilo >
* {
	box-sizing : border-box;
}

corpo {
	cor de fundo : branco;
}


. input--main__style {
	cor de fundo :  # 00FF00 ;
}

. entrada--botão {
	peso da fonte : negrito;
	família de fontes : Arial;
	tamanho da fonte : médio;
	cor da borda : transparente;
	exibição : bloco;
	margem :  0 px automático;
	margem inferior :  10 px ;
	cor : branco;
}

. entrada--registro {
	exibição : em linha;
}

entrada {
	exibição : bloco;
	raio da borda :  7 px ;
	preenchimento :  10px ; _
	estilo de borda : sólido;
	cor da borda : cinza claro;
	cor : preto;
	preenchimento :  10px ; _
	margem inferior :  10 px ;
}

formulário  p {
	text-align : inicial;
	exibição : em linha;
	margem esquerda :  15 px ;
}

. p--nomargin {
	margem esquerda :  0 px ;
	margem direita :  10 px ;
}
</ estilo >
</ corpo >
</ html >
