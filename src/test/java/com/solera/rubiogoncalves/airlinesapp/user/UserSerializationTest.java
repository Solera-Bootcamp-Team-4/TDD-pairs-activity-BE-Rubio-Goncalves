package com.solera.rubiogoncalves.airlinesapp.user;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.File;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@JsonTest
class UserSerializationTest {

    @Autowired
    private JacksonTester<User> json;

    private final File userSampleJson = new File("src/test/resources/modelSamples/user-example.json");
    private final User expectedUser = new User("John", "Doe", "Fooenian", "12345678a", 20, new int[]{2,3,4});

    @Test
    void serialize() throws Exception {
        // Assert against a `.json` file in the same package as the test
        assertThat(this.json.write(expectedUser)).isEqualToJson(userSampleJson);
        // Or use JSON path based assertions
        assertThat(this.json.write(expectedUser)).hasJsonPathStringValue("@.name");
        assertThat(this.json.write(expectedUser)).extractingJsonPathStringValue("@.name").isEqualTo("John");
    }

    @Test
    void deserialize() throws Exception {
        System.out.println("Expected user is: " + expectedUser);
        System.out.println("Actual user is: " + this.json.read(userSampleJson));

        assertThat(this.json.read(userSampleJson)).isEqualTo(expectedUser);
        assertThat(this.json.read(userSampleJson));
    }

}
