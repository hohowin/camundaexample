# My Camunda Project

## Run the project

1\. Start Postgres 

```bash
docker-compose up -d
```

2\. Start Camunda by running `java.com.example.workflow.Application`

3\. Login Camunda by browsing http://localhost:8080/camundapostgres/app/welcome/default/#!/login and enter `admin/admin`

4\. Click on `Task List -> Start Process -> 'The Ahoy Process' -> Add a variable -> Type in variable name myVariable and enter a value`

5\. Click Start to start the process instance

6\. It is going to wait for the response at `User Task 1` and `User Task 3`. To complete the user tasks, go to `Tasklist` and claim and complete the task.

6\. Check out the Console for the output from `System Task 2`.

## Check tables

Check the connection information in `src/main/resources/application.yaml`

## Tear Down

1\. Stop Camunda

2\. Stop postgres

```bash
docker-compose down
```