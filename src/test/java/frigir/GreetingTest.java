package frigir;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("In Before all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("asdsad"));
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("fdfdfd"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("In After all");
    }
}