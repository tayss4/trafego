
# Como rodar (COMECAR PELO DOCKERFILE):

Maven ( SE O PROJETO NÃO BUILDAR PELO DOCKERFILE) -> 

Usar o JAVA_HOME com OPENJDK 17

chmod +x mvnw

./mvnw install 

-------------------

DOCKERFILE:

Usando docker no mesmo diretório do Dockerfile ->
 
docker build . -t trafego

docker --run trafego -p8080:8080 -t trafego


