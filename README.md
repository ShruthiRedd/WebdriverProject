Instructions to install all automation components
Step 1 - Install Java on your computer
Download and install the Java Software Development Kit (JDK) from https://www.oracle.com/technetwork/java/javase/downloads/index.html
This JDK version comes bundled with Java Runtime Environment (JRE), so you do not need to download and install the JRE separately.
Once installation is complete, open command prompt and type “java”. 

Step 2 - Install Eclipse IDE
Download latest version of "Eclipse IDE for Java Developers" from https://www.eclipse.org/downloads/. 
Be sure to choose correctly between Windows 32 Bit and 64 Bit versions.
You should be able to download an exe file named "eclipse-inst-win64" for Setup.
Double-click on file to Install the Eclipse. A new window will open. Click Eclipse IDE for Java Developers.
After that, a new window will open which click button marked 1 and change path to "\Application\eclipse". Post that Click on Install button marked 2
After successful completion of the installation procedure, a window will appear. On that window click on Launch

Step 3 - Download the Selenium Java Client Driver
You can download the Selenium Java Client Driver from https://www.seleniumhq.org/. 
You will find client drivers for other languages there, but only choose the one for Java.
This download comes as a ZIP file named "selenium-java-3.141.59.zip". For simplicity, extract the contents of this ZIP file on your C drive so that you would have the directory "C:\selenium-2.25.0\". 
This directory contains all the JAR files that we would later import on Eclipse.

Step 4: Download the Apache common IO jars from https://commons.apache.org/proper/commons-io/download_io.cgi

Step 5 - Configure Eclipse IDE with WebDriver
Launch the "eclipse.exe" file inside the "eclipse" folder that we extracted in step 2. 
If you followed step 2 correctly, the executable should be located on C:\eclipse\eclipse.exe.
When asked to select for a workspace, just accept the default location.
Create a new project through File > New > Java Project. Name the project as "Selenium".

Step 6:Clone the Project from https://github.com/ShruthiRedd/WebdriverProject.git

Step 7:Open the project's properties---> Java Build Path ---> Libraries tab ---> Add External Jars
Add the below required libraries for our project libraries 
commons-io-2.6.jar 
selenium-server-standalone-3.141.59.jar


Document complete instructions to execute automated tests

Once all the above steps are successfully completed .
Navigate to Main class -HelloWorld.java in ecilpse and click on Run button

