import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        //TODO: implement your test here
        Assert.assertEquals(backSort(listOf(5,4,6,3,2,1)), listOf(6,5,4,3,2,1))
    }
}