import org.testng.annotations.Test
import kotlin.test.assertEquals

class FbTest {
   @Test
   fun test_normal() {
       assertEquals("1", Fb.of(1))
       assertEquals("2", Fb.of(2))
       assertEquals("fizz", Fb.of(3))
       assertEquals("buzz", Fb.of(5))
       assertEquals("fizz", Fb.of(13))
       assertEquals("fizzbuzz", Fb.of(15))
       assertEquals("fizzbuzz", Fb.of(51))
       assertEquals("fizzbuzz", Fb.of(53))
   }
}