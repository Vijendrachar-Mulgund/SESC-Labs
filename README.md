# Introduction and Setup

In this Lab session, we setup our development environment and Launch the Finance and Library microservices.

✅ Oracle Java JDK 21 setup is completed.  
✅ InteliJ IDEA Ultimate IDE is setup.  
✅ Docker is setup.  
✅ Postman is installed.

As the setup is now completed, we now clone and launch the Microservices

### Finance Microservice

We now clone the [Finance Repository](https://github.com/tvergilio/finance) and change the `.env.example` file to `.env`. This file contains the environment variables such as Database name and password.

We can now launch the Microservice using the `docker-compose up` command.

The Finance portal is now available on `http://localhost:8081`

![Finance portal!](/assets/finance-portal.png "Finance Portal")

![Finance portal!](/assets/finance-docker.png "Finance Portal")

### Library Microservice

We now clone the [Library Repository](https://github.com/tvergilio/CESBooks) and change the `.env.example` file to `.env`. This file contains the environment variables such as Database name and password.

The Docker image in this repository was outdated and hence we need update and rebuild the docker image with the following steps.

- Update dependency to `cs50~=9.3.0` in `requirements.txt` file.
- Run `docker build --tag ces-books:4.0 .` in terminal to create a new Docker image
- Update `docker-compose.yml` file to use the image that we created:

```
# docker-compose.yml
...
libraryapp:
  image: ces-books:4.0
...
```

- Run `docker-compose up -d` in terminal.

The Library portal is now available on `http://localhost:80`

![Library portal!](/assets/library-portal.png "Library Portal")

![Library portal!](/assets/library-docker.png "Library Portal")
