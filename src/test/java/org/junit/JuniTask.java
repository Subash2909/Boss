package org.junit;

public class JuniTask {
@BeforeClass//in before class we should mention  Static
public static void beforeClass() {
System.out.println("before Class");
}
@AfterClass//in After class we should mention  Static
public static void AftClass() {
System.out.println("Aft Class");
}@Before
public void before() {
System.out.println("Before");
}@After
public void after() {
System.out.println("after");

}@Ignore//to skip particular method
@Test
public void tc10() {
System.out.println("test10");
}@Test
public void tc5() {
System.out.println("test 05");
}@Test
public void tc9() {
System.out.println("test 08");
}


}
