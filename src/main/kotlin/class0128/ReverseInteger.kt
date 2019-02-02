package class0128

class ReverseInteger {
    fun reverseInteger(x: Int):Int{
        var element1: Int = x
        var digit: Int
        var reverse = 0

        while(element1!= 0){
            digit = element1 % 10
            element1 /= 10

            reverse = reverse * 10 + digit
        }
        return reverse
    }
}