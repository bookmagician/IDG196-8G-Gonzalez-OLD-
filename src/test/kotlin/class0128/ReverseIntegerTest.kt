package class0128

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseIntegerTest {
    private val reverseInteger = ReverseInteger()

    @Test
    fun testIfReversePositiveNumber() {
        val value = 1234
        val expected = 4321

        val actual = reverseInteger.reverseInteger(value)

        assertEquals(expected,actual)
    }

    @Test
    fun testIfReversesNegative() {
        val value = 1234
        val expected = 4321

        val actual = reverseInteger.reverseInteger(value)

        assertEquals(expected,actual)
    }
}