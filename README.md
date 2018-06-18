# Requirements
* Docker
* If running Windows switch to Linux Containers using the Docker tray icon	 


# Running
```
docker-compose up -d
```

# Notes
This build "bind mounts" your local projects to the Docker containers. 

Therefore you can make changes to your local files and the application will respond appropriately. For Java projects, you must recompile with maven to have chnages show up. PHP and static HTML changes will respond immediately.

You can connect to the mysql server from the host by using a client and connecting to localhost:3306 with credentials root/password

Use Powershell if using Windows

