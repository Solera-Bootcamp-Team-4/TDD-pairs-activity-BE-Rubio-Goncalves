package com.solera.rubiogoncalves.airlinesapp.database;

import com.solera.rubiogoncalves.airlinesapp.AirlinesAppApplication;
import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import static com.mongodb.assertions.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DatabaseTest {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    //@Value("${spring.data.mongodb.database}")
    private String db = "test";

    @Test
    public void ConnectionUriNotNull() {
        System.out.println("The connection string:");
        System.out.println(uri);
        if (db.isEmpty()) {
            System.out.println("You need to copy the application.properties template into config/application.properties.");
        }

        assertNotNull(uri);
    }

    @Test
    public void DatabaseNameNotNull() {
        System.out.println("The database name: ");
        System.out.println(db);
        if (db.isEmpty())  {
            System.out.println("You need to copy the application.properties template into config/application.properties.");
        }

        assertNotNull(db);
    }

    @Test
    public void canConnectToDatabase() {
        SpringApplicationBuilder app = new SpringApplicationBuilder(AirlinesAppApplication.class);
        app.web(WebApplicationType.NONE)
                .run(
                        "--spring.data.mongodb.uri=" + uri,
                        "--spring.data.mongodb.database=" + db
                );

        String name = "Bar";

        MongoTemplate mongo = app.context().getBean(MongoTemplate.class);
        Document doc = Document.parse("{\"name\":\"" + name + "\"}");
        Document inserted = mongo.insert(doc, "foo");

        assertNotNull(inserted.get("_id"));
        assertEquals(inserted.get("name"), name);
    }

}
