package demoqa;

import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {

TestsData testsData = new TestsData();



    @Test
    void fillFormTest() {
        /**
         * Открываем форму. Заполняем форму тестовыми данными.
         * Нажимаем кнопку Submit
         */
        registrationPage.openPage()
                .setFirstName(testsData.firstName)
                .setLastName(testsData.lastName)
                .setEmail(testsData.userEmail)
                .setGender(testsData.userGender)
                .setPhone(testsData.userNumber)
                .setBirthDate(testsData.day, testsData.month, testsData.year)
                .setSubject(testsData.subject)
                .setHobbies(testsData.hobbies)
                .setAvatar(testsData.avatar)
                .setAddress(testsData.currentAddress)
                .setState(testsData.state)
                .setCity(testsData.city)
                .clickSubmit();

        /**
         * Проверяем заполненную форму построчно. Закрываем форму
         */
        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", testsData.firstName + " " + testsData.lastName)
                .verifyResult("Student Email", testsData.userEmail)
                .verifyResult("Gender", testsData.userGender)
                .verifyResult("Mobile", testsData.userNumber)
                .verifyResult("Date of Birth", testsData.day + " " + testsData.month + "," + testsData.year)
                .verifyResult("Subjects", testsData.subject)
                .verifyResult("Hobbies", testsData.hobbies)
                .verifyResult("Picture", testsData.avatar.replaceAll("src/test/resources/",""))
                .verifyResult("Address", testsData.currentAddress)
                .verifyResult("State and City", testsData.state + " " + testsData.city)
                .clickClose();
    }
}
