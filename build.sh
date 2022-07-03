echo "Remove the old container"
docker rm com-bank-core-service-iso-country-codes:1.0.0
echo "Old container removed"
echo "remove old image"
docker rmi dsilvamarsh/com-bank-core-service-iso-country-codes:1.0.0
echo "remove old image done"
echo "Build the target folder"
mvn clean compile package 
echo "Target folder build complete"
echo "Build Docker image"
DOCKER_BUILDKIT=1 docker build --rm -t dsilvamarsh/com-bank-core-service-iso-country-codes:1.0.0 .
echo "Docker Build complete"
echo "start application in docker"
#docker run --name=com-bank-core-service-account --network=host -p 80:8080 dsilvamarsh/com-bank-core-service-account:1.0.0
#docker push
docker push dsilvamarsh/com-bank-core-service-iso-country-codes:1.0.0
