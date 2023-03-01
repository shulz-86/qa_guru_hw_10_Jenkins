package demoqa;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

public class TestsData {



    Faker faker = new Faker(new Locale("en"));
    Random random = new Random();
    /**
     * Заполняем тестовые данные
     */
    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = getSexRandom(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = getMonthRandom(),
            year = String.valueOf(faker.number().numberBetween(1970, 2010)),
            subject = getSubjectRandom(),
            hobbies = getHobbiesRandom(),
            avatar = "src/test/resources/16-7-scaled.jpg",
            currentAddress = faker.address().streetAddress(),
            city = getCityRandom(),
            state = getStateByCity(city);

    public String getSexRandom() {
        String[] sex = {"Male", "Female", "Other"};
        int index = random.nextInt(sex.length);
        return sex[index];
    }

    public String getMonthRandom() {
        String[] arrMonth = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        int index = random.nextInt(arrMonth.length);
        return arrMonth[index];
    }

    public String getHobbiesRandom() {
        String[] arrHobbies = {"Sports", "Reading", "Music"};
        int index = random.nextInt(arrHobbies.length);
        return arrHobbies[index];
    }

    public String getSubjectRandom() {
        String[] arrSubjects = {"Hindi", "English", "Civics", "Computer Science",
                "Social Studies", "Maths", "Commerce", "Arts", "Biology",
                "Accounting", "Chemistry", "Economics", "History", "Physics"};
        int index = random.nextInt(arrSubjects.length);
        return arrSubjects[index];
    }

    public String getCityRandom() {
        String[] states = {"Delhi", "Agra", "Karnal", "Gurgaon",
                "Lucknow", "Panipat", "Jaipur", "Jaiselmer"};
        int i = random.nextInt(states.length);
        return states[i];
    }

    public String getStateByCity(String value) {
        HashMap<String, String> cityAndState = new HashMap<>();
        cityAndState.put("Delhi", "NCR");
        cityAndState.put("Gurgaon", "NCR");
        cityAndState.put("Agra", "Uttar Pradesh");
        cityAndState.put("Lucknow", "Uttar Pradesh");
        cityAndState.put("Karnal", "Haryana");
        cityAndState.put("Panipat", "Haryana");
        cityAndState.put("Jaipur", "Rajasthan");
        cityAndState.put("Jaiselmer", "Rajasthan");
        return cityAndState.get(value);
    }
}
