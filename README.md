#About The library
###How To Run?
There is a CommonWordController class which includes readTheWordsFromTheFile function. 

This function is called from the test folder under the unit test.

After the run action from IDE, a sample output would be;
 - ofthesea --- 57
 - oneofthe --- 64
 - outofthe --- 57
 - thewhitewhale --- 71
 - chapterthe --- 160
 - thespermwhale --- 85
 - asortof --- 51
 - ofthewhale --- 77
 - partofthe --- 53
 
####The second way, Running from Terminal:
 Runnring mvn test command from the terminal will result;
 [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 28.363 s - in controller.CommonWordsTest
 [INFO] Results:
 [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
 [INFO] ------------------------------------------------------------------------
 [INFO] BUILD SUCCESS
 [INFO] ------------------------------------------------------------------------
 [INFO] Total time:  30.956 s

###More TODO's:
 Even though I tried come up with a working method, rather than POJO oriented framework and code skills.
 There could be more to improve;

 The output would be space separated words,
 Java Collections / Streams could be more helpful to reduce the number of lines,
 Trying some other unit tests, such as trying with a json file instead of a txt file,
 POM file could be elaborated in more details,
 Adding test reports, such as Allure,
 Adding more parameters to provide different file path inputs.
 