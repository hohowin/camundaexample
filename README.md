# My Camunda Project

## Run the project

1\. Start Postgres and Kafka

```bash
docker-compose up -d
```

2\. Start Camunda by running `java.com.example.workflow.Application`

3\. Login Camunda by browsing http://localhost:8080/camundapostgres/app/welcome/default/#!/login and enter `admin/admin`

4\. Click on `Task List -> Start Process -> [Try for different processes] -> Add a variable -> Type in variable name myVariable and enter a value`

5\. Click Start to start the process instance

6\. If the process has User task, then, to complete the user tasks, go to `Tasklist` and claim and complete the task.

7\. Check console for any output or exception

8\. Check Cockpit for any pending process

`Note: For the Kafka Workflow, you must put "bus" as the buinsess key for the message correlation to work.`

## Check tables

Check the connection information in `src/main/resources/application.yaml`

## Tear Down

1\. Stop Camunda

2\. Stop postgres and kafka

```bash
docker-compose down
```
