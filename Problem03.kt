
import kotlin.math.floor
import kotlin.math.pow


fun largestPrimeFactor(inputNumber: Long): Long {



    var lpf : Int = 2
    var inputNumber = inputNumber



    while (inputNumber>lpf) {

        if (inputNumber%lpf == 0.toLong()) {

            inputNumber /= lpf

        }

        else {

            lpf += 1

        }

    }


    return inputNumber


}



fun isPrime(e: Int): Boolean  {

    var factorList: MutableList<Int> = mutableListOf()


    for (j in 1..e) {

        if (e % j == 0) {

            factorList.add(j)

        }

    }

    return factorList.size == 2

}


fun main() {


    var number5: Long = 600851475143

    println(largestPrimeFactor(number5))


}