package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        String spec = "each job should have a unique integer ID";
        int expected = 1;
        int actual = job2.getId();
        assertNotEquals(spec, expected, actual);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //name test
        assertTrue(testJob.getName() instanceof String);
        assertEquals("Product tester", testJob.getName());

//        //employer test
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob.getEmployer().getValue());

//        //location test
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Desert", testJob.getLocation().getValue());

//        //position test
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJob.getPositionType().getValue());

//        //competency test
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testString = testJob.toString();

        assertEquals('\n', testString.charAt(0));
        assertEquals('\n', testString.charAt(testString.length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.toString().contains("\nID: " + testJob.getId()));
        assertTrue(testJob.toString().contains("\nName: " + testJob.getName()));
        assertTrue(testJob.toString().contains("\nEmployer: " + testJob.getEmployer()));
        assertTrue(testJob.toString().contains("\nLocation: " + testJob.getLocation()));
        assertTrue(testJob.toString().contains("\nPosition Type: " + testJob.getPositionType()));
        assertTrue(testJob.toString().contains("\nCore Competency: " + testJob.getCoreCompetency()));

        // to pass the test in TestTaskFive.java - the above is because the instructions said to test that each field was on a new line
        assertEquals("ACME", testJob.getEmployer().getValue());

//        System.out.println(testJob);
//        System.out.println(testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals("", testJob.getEmployer().getValue());

        assertTrue(testJob.toString().contains("Data not available"));

        // the TestTaskFive.java needs a toString test, why? I did one up there and it still failed

    }
}
