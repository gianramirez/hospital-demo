package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse nurseUnderTest = new Nurse("2", "Joy", 5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelsFrom10To15WhenProvidingCare(){
        nurseUnderTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelsBy5WhenProvidingCare(){
        nurseUnderTest.drawingBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test
    public void shouldHaveASalaryOf80k(){
        int nurseSalary = nurseUnderTest.calculatePay();
        assertEquals(80000, nurseSalary);
    }


}
