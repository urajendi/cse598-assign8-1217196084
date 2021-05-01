/*
    Assignment 8. Dense Matrix Multiplication Comparison: Handcoded
    Submitted by Uma Mageswari RajendTimeiran as a part of CSE 598 Assignment-VIII.
    ASU ID - 1217196084
*/
object MatrixMultiply{

  // Main Function
  def main(args: Array[String]): Unit = {

    val random = new scala.util.Random
    // Function to fill the array with random values
    def random2dArray(dim1: Int, dim2: Int, maxValue: Int) = Array.fill(dim1, dim2){
      1 + random.nextInt(maxValue)
    }

    val iterations = 1000  // No of Iterations
    val dimension = 1000  // Matrix dimension
    val arrayOne = random2dArray(dimension, dimension, 100)
    val arrayTwo = random2dArray(dimension, dimension, 100)
    var output = Array.ofDim[Int](dimension, dimension)

    // Function to multiply two matrices
    def multiply(arrayOne: Array[Array[Int]], arrayTwo: Array[Array[Int]]) : Unit = {
      for (i <- 0 to arrayOne.length-1)
        for (j <- 0 to arrayTwo(0).length-1)
          for (k <- 0 to arrayTwo.length-1)
            output(i)(j) = output(i)(j) + arrayOne(i)(k) * arrayTwo(k)(j)
    }

    // Printing output
    multiply(arrayOne, arrayTwo)
    println(output.map(_.mkString("  ")).mkString("\n"))

    // Calculating time for total number of iterations
    val startTime = System.currentTimeMillis()
    for (_ <- 1 to iterations)
      multiply(arrayOne, arrayTwo)
    val endTime = System.currentTimeMillis()

    // Printing the time taken for computation
    println("\nDense Matrix Multiplication Comparison: Handcoded")
    println(s"\nNo. of Iterations: $iterations");
    println(s"\nTime Taken: ${(endTime-startTime)/1000.0} s \n")

  }
}