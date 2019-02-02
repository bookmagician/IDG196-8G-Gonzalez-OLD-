package class0201

import org.junit.Assert.assertEquals
import org.junit.Test

class PalindromeTest {
    private val palindrome= Palindrome()

    @Test
    fun `returns false when number is negative`(){
        val number = -454
        val expected = false

        val actual = palindrome.checkPalindrome(number)
        assertEquals(expected,actual)
    }

    @Test
    fun `return 0 when number is palindrome`(){
        val number = 454
        val expected = 0

        val actual = palindrome.checkPalindrome(number)
        assertEquals(expected,actual)
    }

}