package com.mrg.boot1;

import com.mrg.boot1.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot1ApplicationTests {

        @Autowired
        private Person dog;

        @Test
        void contextLoads() {
            System.out.println(dog);
        }

    }
