# AWS

///////////////////////////////////////////////////////////////////////////////////////////////////  CI CD 
1 CI CD    
THE longer code remained checked out from the repository, the higher the chance for issues caused when re-integrating.  

Continuous integration is a process of automating regular code commits followed by an automated buuild and test process designed to highlight integration issues early  

tools:   
Bamboo, Cruise Control, Jenkins, Go, TeamCity, and many others   

//--------------------------------------------------------------------------------------------   

What is CI and CD?   

Continuous Deployment(CD) takes the form of a workflow based process which accepts a tested software build payload from a CI server.   

The CD server automates the deployment into a wokring Quality Assurance(QA), Pre-Production re production environment  

The majority of major CI servers incorporate functionality allowing continuous deployment  

AWS CodeDeploy and CodePipeline are used to provide CI/CD services

Other tools such as Elastic Beanstalk and Cloudformation provide functionality which can be utilized by CI/CD servers    

source---------->build-------->staging------>production
   |                                                |
   |                                                |
developers                                      customers
   |                                                |
   |                                                |
changes update fixes  <------------------ ideas requests bugs 

/////////////////////////////////////////////////////////////////////////////////////////////////// Deployment Types 


//--------------------------------------------------------------------------------------------single target deployment   
1 the default for small development projects, especially when legacy or non-highly-available(HA) infrastructure is involved  

2 when initiated a new application version is installed on the target server  

3 generally a brief outage occurs while the version is installed and since we have on secondary servers, testing opportunity is limited.
Rollback involved removing the new sersion and isntalling the previous.  


//--------------------------------------------------------------------------------------------all-at-once deployment      
1 depolyment happens in one step, as with single target deployment   
2 but with this method, the destination is multiple targets   
3 more complicated than single target, often requiring orchestration tooling   
4 still shares the negatives of single target, namely, no ability to test, small deployment outages and less than ideal rollback   


//--------------------------------------------------------------------------------------------Minimum in-service Deployment    
initial build stage------------>T1 T2 T3 T4 T5     
deployment stage 1 ------------>T1(remains in service) T2(remains in service) T3(upgraded) T4(upgraded) T5(upgraded)  
deployment stage 2 ------------>T1(remains in service) T2(remains in service) T3(passing health check) T4(passing health check) T5(passing health check)  
deployment complete------------>T1 T2 T3 T4 T5  

1 deployment happens in multiple stages   
2 deployment happens to as many targets as possible while maintaining the minimum in-service targets   
3 a few moving parts, orchestration and health checks are required   
4 allows automated testing, deployment targets are assessed and tested prior to continuing   
5 generally no downtime  
6 often quicker and less stages than rolling deployment   

//--------------------------------------------------------------------------------------------rolling deployment      
deployment stage 1 ------------>T1(deployment and health check) T2(deployment and health check)  T3 T4 T5     
deployment stage 2 ------------>T1(health check passed) T2(health check passed) T3(deployment and health check) T4(deployment and health check) T5 
deployment stage 3 ------------>T1(health check passed) T2(health check passed) T3(health check passed) T4(health check passed) T5(deployment and health check)  

1 deployment happens in multiple stages, number of targets per stage is user-defined  
2 moving parts, orchestration and health checks are required  
3 overall applicable health isn't necessarily maintained   
4 can be the least efficient deployment time based on time-taken  
5 allows automated testing, deployment targets are assessed and tested prior to continuing   
6 generally no downtime, assuming number of targets per run isn't large enough to impact the application   
7 can be paused, allowing limited multi-version testing(combined with small targets per stage)   

//--------------------------------------------------------------------------------------------blue green deployment      
D app.domain      T1(blue) T2(blue) T3(blue)    


D app.domain      T1(green) T2(green) T3(green)    T1(blue) T2(blue) T3(blue)    


D app.domain      T1(green-updated) T2(green-updated) T3(green-updated)    T1(blue) T2(blue) T3(blue) 


D app.domain      T1(green) T2(green) T3(green)    T1(blue) T2(blue) T3(blue) 
move traffic to green

1 requires advanced orchestration tooling   
2 carries significant cost - maintaining 2 environments for the duration of deployments   
3 deployment process is rapid - entire environment(blue and green) is deployed all at onece   (!!!!)
4 cutover and migration is clean and controoled(DNS change)                             
5 rollback is equally as clean, DNS regression   
6 healthe and performance of entire 'green' environment can be tested prior to cutover   
7 using advanced template systems. such as cloudformation, entire process can be fully automated   


//--------------------------------------------------------------------------------------------Module summary   
1 know the pro's and cons of each deployment type  
2 know when each should be used and when not  
3 know the limitations of each, how quick is deployment, how quick is rollback   
4 knwo how each deployment type impacts your applications   
5 know which AWS Service supports which deployment type - this will be reviewed in detail in later modules   



///////////////////////////////////////////////////////////////////////////////////////////////////AB Testing   
What is AB Testing..

With simple blue/green deployment the switchover between Blue and Green is immediate and binary.   

it's not used to feature test, it's used generally to perform full and final updates - unless you have a major issue its one way 

A/B testing adjusts, by sending a percentage of traffic to Blue(A) and a percentage to Green(B)   


//--------------------------------------------------------------------------------------------   
D app.domain
   |        |  
   green    blue
T1 T2 T3    T1 T2 T3

1 Environment starts with 100% of traffic directed at the current(Blue) environment  
2 when green deployment completes, the distribution of traffic is changed to direct a small amout at the new green environment   
3 as confidence builds, the distribution is reversed   
4 finally, 100% of traffic is directed at green   


//--------------------------------------------------------------------------------------------why do AB Testing      
1 it seperates different versions of your code, which may have different reliability or performance   
2 it allows a gradual performance/stability/heal analysis   
3 it allows new features to be tested with a subset of visitors  
4 it bugs are detectd, rollback can be enacted qucikly and the damage caused by the failed update is minimized  



//--------------------------------------------------------------------------------------------how is AB Testing performed      
1 generally, it uses Route 53 --- AWS advanced DNS solution  
2 two records are created, one pointing at A, the other point at B 
3 round-robin with a 50/50 request distribution  
4 weighted-round-robin is an advanced feature where you can specify a weight for each environment   
5 this allows a granular and adjustable distribution such as 100%/0%, 30%/70% in between   
6 !!!! it's based on DNS, caching and other DNS related issued can impact the overall accuracy of this technique   




//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   




/////////////////////////////////////////////////////////////////////////////////////////////////// 


//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



/////////////////////////////////////////////////////////////////////////////////////////////////// 


//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



/////////////////////////////////////////////////////////////////////////////////////////////////// 

//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



/////////////////////////////////////////////////////////////////////////////////////////////////// 

//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   




/////////////////////////////////////////////////////////////////////////////////////////////////// 

//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



//--------------------------------------------------------------------------------------------   



