## Trello Automation
 Trello is a selenium based test automation platform for performing UI 
  based automation. 

### Tech stack used in building the framework 
##### Programming language used: java 1.8
##### Unit Test framework : TestNG version 6.14.3
##### Automation API : Selenium version 3.141.59
##### Build tool: Maven

### Prerequisite 1
##### java should be installed on the system.To check if java is available on the system, go to command prompt and type java -version.It should display: 
    
"java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)".

### Prerequisite 2 (not mandatory)
##### git should be configured on the system to pull the project from github. 

If github is not configured on the system, then project can be downloaded using the option "Download ZIP" from https://github.com/rohitbahadur/Trello





### Installation (using git, assumption is a repo created on github )
1. If using git,create a project folder on your local machine.
2. From the git repo click on Clone or download option and copy the link. 
2. Go to command prompt and navigate to the project and folder and type git clone "copy the link" (copy the link is the link copied from git repo).




### Installation (without git)
1. There is no additional settings or configurations required. The 
   project can be downloaded using git or option "Download ZIP" from 
   https://github.com/rohitbahadur/Trello.
2. unzip (if downloaded as a ZIP) the project folder and open in eclipse 
    (File-->Open Projects from File System ). Select the directory where 
    the project folder is available.



#### Project Design Strategy
#### The project is designed using page object model principles.
1. pages package --> Page objects are stored in their respective page 
   under "pages" 
   package.
2. config package --> Project configurations (baseurl, username, 
   password) which are used to 
   navigate to respective url and credentials need to login to 
   application are maintained in this package ProjectConfig.properties 
   file.
3. setup package --> This package has DriverSetup class to initialize the 
   webdriver/s which is used to launch the browser/s(chrome,firefox).For 
   the current implementation Chrome is used as a default browser.
   *Note* I have eliminated to need to download the browser drivers locally.
    This has been achieved using WebDriverManager.
4. utils package --> Also, we have included a utils package which has a 
   class "WaitForPagesToLoad" designed to wait for specific time for the 
   pages to load in the application.This has been extended in all the 
   page classes(BoardPageElement, HomePage, TrelloHomePage).
5. test package --> This package contains all the test classes designed. 
   These are testng type which are included in testng.xml to be included 
   for execution.
6. All the dependency required for project execution are available under 
   pom.xml.


#### Execution procedure
     For executing the tests, expand 
     com.klocktrello and right click pom.xml and select Run As --> Maven test             


