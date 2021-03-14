/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myDemoApp;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;




class AppTest {
  
  public void testNullStringArraytestect()
  {
      App obj = new App();
      ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>(Arrays.asList(false,false,false,false));
      ArrayList<String> stringArr = null;
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      assertEquals(null, ans);
  }

  public void testNullIntegerArraytestObject()
  {
      App obj = new App();
      ArrayList<Integer> intArray = null;
      ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>(Arrays.asList(false,false,false,false));
      ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("abc","def","ghe","jkl"));
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      assertEquals(null, ans);
  }
  public void testNullBooleanArrayObject()
  {
      App obj = new App();
      ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Boolean> booleanArrayList =null;
      ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("abc","def","ghe","jkl"));
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      assertEquals(null, ans);
  }

  public void testNullIntegerArrayListObject()
  {
      App obj = new App();
      ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Integer> intArrayList = null;
      ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>(Arrays.asList(false,false,false,false));
      ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("abc","def","ghe","jkl"));
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      assertEquals(null, ans);
  }

  public void testAreLengthOfObjectsNotEqual()
  {
      App obj = new App();
      ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
      ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>(Arrays.asList(false,false,false,false));
      ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("abc","def","ghe","jkl"));
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      assertEquals(null, ans);
  }

  public void testAreLengthOfObjectsEqual()
  {
      App obj = new App();
      ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>(Arrays.asList(false,false,false,false));
      ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("abc","def","ghe","jkl"));
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      assertEquals(stringArr, ans);
  }

  public void testExpectedOutputWhileAdditionIsOn(){
      App obj = new App();
      ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(5,6,7,8));
      ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
      ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>(Arrays.asList(true,true,true,true));
      ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("abc","def","ghe","jkl"));
      ArrayList<String> expectedOutput = new ArrayList<String>(Arrays.asList("abc5","def66","ghe777","jkl8888"));
      ArrayList<String> ans = obj.computation(intArray, intArrayList, stringArr, booleanArrayList);
      String sumTrue = "", sumAns = "";
      for (int i = 0; i < expectedOutput.size(); i++){
          sumTrue += expectedOutput.get(i);
          sumAns += ans.get(i);
      }
      assertTrue(sumTrue.equals(sumAns));
  }

}

