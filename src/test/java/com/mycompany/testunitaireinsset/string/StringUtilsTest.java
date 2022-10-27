///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.testunitaireinsset.string;
//
//import java.util.Map;
//import java.util.TreeMap;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author insset
// */
//public class StringUtilsTest {
//    
//    public StringUtilsTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of isChaineValide method, of class StringUtils.
//     */
//    @Test
//    public void testIsChaineValideTrue() {
//        System.out.println("isChaineValide");
//        //given
//        String str = "test";
//        StringUtils instance = new StringUtils();
//        boolean expResult = true;
//        
//        //when
//        boolean result = instance.isChaineValide(str);
//        
//        //then
//        assertEquals(expResult, result);
//    }
//    
//    //@Rule
//    public IllegalArgumentException exceptionRule;
//    
//    @Test
//    public void testIsChaineValideFalse() {
//        System.out.println("isChaineValide");
//       //exceptionRule.exceptionmessage("Il faut au moins deux caractere en entrÃ©e");
//      
//        //given
//        String str = "t";
//        StringUtils instance = new StringUtils();
//        
//        IllegalArgumentException expResult = exceptionRule;
//       
//        //when
//        boolean result = instance.isChaineValide(str);
//        
//        //then
//        assertEquals(expResult, result);
//    }
//
//    
//    /**
//     * Test of inverse method, of class StringUtils.
//     */
//    @Test
//    public void testInverseTrue() {
//        System.out.println("inverse");
//        //given
//        String str = "kayak";
//        StringUtils instance = new StringUtils();
//        String expResult = "kayak";
//        //when
//        String result = instance.inverse(str);
//        //then
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//    
//
//
//   /**
//     * Test of isPalindrome method, of class StringUtils.
//     **/
//    @Test
//    public void testIsPalindromeTrue() {
//        System.out.println("isPalindrome");
//        //given
//        String str = "kayak";
//        StringUtils instance = new StringUtils();
//        boolean expResult = true;
//        //when
//        boolean result = instance.isPalindrome(str);
//        //then
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//    @Test
//    public void testIsPalindromeFalse() {
//        System.out.println("isPalindrome");
//        //given
//        String str = "test";
//        StringUtils instance = new StringUtils();
//        boolean expResult = false;
//        //when
//        boolean result = instance.isPalindrome(str);
//        //then
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//    
//
//
// /**
//     * Test of compterOccurences method, of class StringUtils.
//     */
//    @Test
//    public void testCompterOccurences() {
//        System.out.println("compterOccurences");
//        //given
//        String str = "test";
//        StringUtils instance = new StringUtils();
//       Map<String, Integer> expResult;
//        expResult= new TreeMap<>();
//        
//        expResult.put("t",2);
//        expResult.put("e",1);
//        expResult.put("s",1);
//        
//        //when
//        Map<String, Integer> result = instance.compterOccurences(str);
//        //then
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    
//
//}