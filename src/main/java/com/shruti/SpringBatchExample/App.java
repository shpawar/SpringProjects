package com.shruti.SpringBatchExample;

import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       GenericApplicationContext ctx=new GenericXmlApplicationContext("beanConfig.xml");
       
       JobRegistry jobRegistry=ctx.getBean("jobRegistry", JobRegistry.class);
       JobLauncher jobLauncher=ctx.getBean("jobLaucher", JobLauncher.class);
       JobRepository jobRepository=ctx.getBean("jobRepository", JobRepository.class);
       
       System.out.println("jobRegistry "+jobRegistry);
       System.out.println("jobLauncher "+jobLauncher);
       System.out.println("jobRepository "+jobRepository);
       ctx.close();
    }
}
