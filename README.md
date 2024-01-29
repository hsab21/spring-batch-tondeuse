# spring-batch-tondeuse
# se placer dans le repertoire du projet et taper la commande pour créer le jar livrable:
1 - mvn clean package   
2 - dans le repertoire target le jar a été généré sous forme "spring-batch-tendeuse-0.0.1-SNAPSHOT.jar"
3 - taper en suite la commande:
java -jar  target/spring-batch-tondeuse-0.0.1-SNAPSHOT.jar -instructFile=file:C:\\dev\\instructFile.txt # le nom de fichier ici est un paramettre dans mon projet le profil est par default 
java -jar -Dspring.profiles.active=prod target/spring-batch-tondeuse-0.0.1-SNAPSHOT.jar -instructFile=file:C:\\dev\\instructFile.txt // en cas ou traivailler avec un profil dev, calif, prod il faut juste activer le profil choisis ici c'est prod
