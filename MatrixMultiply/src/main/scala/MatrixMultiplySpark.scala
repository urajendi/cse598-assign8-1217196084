/*
    Assignment 8. Dense Matrix Multiplication Comparison: Spark
    Submitted by Uma Mageswari RajendTimeiran as a part of CSE 598 Assignment-VIII.
    ASU ID - 1217196084
*/
package com.disml
import org.apache.spark.mllib.linalg.DenseMatrix

object MatrixMultiplySpark{

  	// Main Function
	def main(args: Array[String]){

		val random = new scala.util.Random //java.security.SecureRandom
		// Function to fill the array with random values
		def random2dArray(dim1: Int, dim2: Int, maxValue: Int): DenseMatrix= {
			new DenseMatrix(dim1, dim2, Array.fill(dim1 * dim2)(random.nextInt(maxValue)))
		}
		
		val iterations = 1000  // No of Iterations
    	val dimension = 1000  // Matrix dimension
		val arrayOne = random2dArray(dimension, dimension, 100)
    	val arrayTwo = random2dArray(dimension, dimension, 100)

    	// Multiplying the two matrices
		var output = arrayOne.multiply(arrayTwo)

		// Printing output
		// println(arrayOne)
		// println(arrayTwo)
		// println(output)

		// Calculating time for total number of iterations
		val startTime = System.currentTimeMillis()
		for (_ <- 1 to iterations)
			output = arrayOne.multiply(arrayTwo)
		val endTime = System.currentTimeMillis()

		// Printing the time taken for computation
		println("\nDense Matrix Multiplication Comparison: Spark")
    	println(s"\nNo. of Iterations: $iterations");
    	println(s"\nTime Taken: ${(endTime-startTime)/1000.0} s \n")
		
	}

}
