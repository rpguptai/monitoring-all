# monitoring POC


## Application

- ### movies-api

  `Spring Boot` Web Java application that exposes a REST API for managing movies.

## Build Environment

- Open a terminal and inside `monitoring-all` root folder run
  ```
  docker-compose up -d
  ```
  ```
  docker-compose ps
  ```

## Run as Docker container

- ### Build Docker image

  - Go inside `monitoring-all` folder
  - Run the following script to build the image
      ```
      ./docker-build.sh
      ```
	  
- ### Start containers

  - Run the container
    ```
    docker run -d --rm --name movies-api \
      -p 8080:8080 -e MYSQL_HOST=mysql \
      --network=monitoring-all_default \
      docker.mycompany.com/movies-api:1.0.0
    ```

## URLs

- **movies-api**
  
  `movies-api` Swagger is http://localhost:8080/swagger-ui.html

- **Prometheus**

  `Prometheus` can be accessed at http://localhost:9090

- **Grafana**

  `Grafana` can be accessed at http://localhost:3000

  login with `admin/admin`

- **Kibana**

  `Kibana` can be accessed at http://localhost:5601

   Create a pattern with `filebeat-*` and `@Timestamp` 

- **Elasticsearch**

  `Elasticsearch` URL is http://localhost:9200

  Other links
  ```
  # Check ES is up and running
  curl localhost:9200
  
  # Check indexes in ES
  curl "localhost:9200/_cat/indices?v"
  
  # Check filebeat index mapping
  curl "localhost:9200/filebeat-*/_mapping"
  
  # Simple search
  curl "localhost:9200/filebeat-*/_search?pretty"
  ```

## Shutdown

- Stop application

  - If the application was started as a Docker container, run the command below
    ```
    docker stop movies-api
    ```

- To stop go to monitoring-all folder and run
  ```
  docker-compose down -v
  ```