package controller;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

import static com.newrelic.commonwords.controller.CommonWordsController.readTheWordsFromTheFile;

public class CommonWordsTest {

    @Test(groups = {"commonTest"})
    public void findTheTopDuplicateThreeWords() throws IOException {
        readTheWordsFromTheFile(new File("src/main/resources/payload/theWhale.txt"));
    }
}
