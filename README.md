# Meu-Prontuario
Prontuário pessoal


## Configurações de Data Source:

1. Realizar o donwload do driver JDBC, no link: [JDBC Driver](https://jdbc.postgresql.org/download/postgresql-9.4.1211.jre6.jar)
  1. Adicionar o jar no diretório: <tomee_home>/lib 
  
2. Adicionar o seguinte recurso no \<tomee_home\>/conf/tomee.xml 

\<Resource id="MeuProntuarioDB" type="javax.sql.DataSource"\><br>
jdbcDriver = org.postgresql.Driver<br>
jdbcUrl = jdbc:postgresql://localhost:5432/meuprontuariodb<br>
jtaManaged = true<br>
password = 123456<br>
userName = local_user<br>
\</Resource\>
    
3. Verificar se o plugin do Eclipse está gerenciando o tomEE:
  1. Remover todos os contextos do server;
  2. Iniciar TomEE;
  3. Clique duplo, na aba server na instância do TomEE;
  4. No fieldset: Server Locations, setar: Use Tomcat installation (takes control of Tomcat installation);
  
4. Importar arquivos de configuração extras para gerenciamento do plugin do Eclipse
  1. No projeto criado pelo plugin chamado Servers, clique com botão direito;
  2. Import...; 
  3. General -> File System; 
  4. Navegar até <tomee_home>; 
  5. Adicionar os seguintes arquivos: logging.properties, tomee.xml e system.properties.
  
