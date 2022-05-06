package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DoctorTest {

    Doctor underTest = new Doctor("1", "name", "speciality");

//    sickpatient is object
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare(){
//        method that is going to take on an object
//        patient stats will increase
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawingBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf90k(){
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }

}
