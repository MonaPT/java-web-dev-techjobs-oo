package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1=new Job();
        Job job2=new Job();
        int actual=job1.getId();
        int expected=job2.getId();
        assertEquals(expected,actual,1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//assertTrue(job1 instanceof Job);
        assertTrue( job1.getEmployer()  instanceof Employer);
        assertTrue(job1.getEmployer().getValue().equals("ACME"));
        assertTrue( job1.getLocation()  instanceof Location);
        assertTrue(job1.getLocation().getValue().equals("Desert"));
        assertTrue( job1.getPositionType()  instanceof PositionType);
        assertTrue(job1.getPositionType().getValue().equals("Quality control"));
        assertTrue( job1.getCoreCompetency()  instanceof CoreCompetency);
        assertTrue(job1.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.equals(job2));
    }

    @Test
    //public String testInsertBlanks(Job job){      //This loop is for failure scenario
    public void testInsertBlanks(){
        Job job=new Job();
        String jobDesc="ID: "+job.getId()+'\n'+job.getName()+'\n'+job.getEmployer()+'\n'+job.getLocation()+
                '\n'+job.getPositionType()+'\n'+job.getCoreCompetency();
        System.out.println('\n'+jobDesc+'\n');
        // return "\n"+jobDesc+"\n";
    }



}
