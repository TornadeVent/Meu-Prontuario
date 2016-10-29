# Meu-Prontuario
Prontuário pessoal


Configurações de Data Source

1) Realizar o donwload do driver JDBC, no link: https://jdbc.postgresql.org/download/postgresql-9.4.1211.jre6.jar;
  1.1) Adicionar o jar no diretório: <tomee_home>/lib
  
2) Adicionar o seguinte recurso no <tomee_home>/conf/tomee.xml 
  	<Resource id="MeuProntuarioDB" type="javax.sql.DataSource">
      jdbcDriver = org.postgresql.Driver
      jdbcUrl = jdbc:postgresql://localhost:5432/meuprontuariodb
      jtaManaged = true
      password = 123456
      userName = local_user
	  </Resource>
    
3) Verificar se o plugin do Eclipse está gerenciando o tomEE:
  3.1) Remover todos os contextos do server;
  3.2) Iniciar TomEE;
  3.3) Clique duplo, na aba server na instância do TomEE;
  3.4) No fieldset: Server Locations, setar: Use Tomcat installation (takes control of Tomcat installation);
  
4) Importar arquivos de configuração extras para gerenciamento do plugin do Eclipse
  4.1) No projeto criado pelo plugin chamado Servers, clique com botão direito;
  4.2) Import...;
  4.3) General -> File System;
  4.4) Navegar até <tomee_home>;
  4.5) Adicionar os seguintes arquivos: logging.properties, tomee.xml e system.properties.
  

