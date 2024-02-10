CONFIGURACIÓN DE APLICATION.PROPERTIES

BASE DE DATOS CREADA EN MYSQL WORKBENCH 
server.port=8000
spring.datasource.url=jdbc:mysql://localhost:3306/prueba_tecnica?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true
spring.datasource.username=USUARIO
spring.datasource.password=CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update

INSTRUCCIONES PARA EJECUCION DEL REST API

Instale JDK 1.17 - 17.0.8.1
Inicialice su IDE preferido, en el caso de este proyecto fue de uso IntelliJ IDE
Abra el archivo CrudApplication y ejecute el archivo 
Espere a que compile y una vez la base de datos este creada y APLICATION.PROPERTIES configurado en su MYSQL no abra ningun error
Para realizar las solicitudes para consumir el API debe crear las solicitudes HTTP a la API y realizar pruebas en este caso se utilizo Postman



