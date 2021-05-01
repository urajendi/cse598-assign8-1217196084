/*
    Assignment 8. Dense Matrix Multiplication Comparison: Breeze
    Submitted by Uma Mageswari RajendTimeiran as a part of CSE 598 Assignment-VIII.
    ASU ID - 1217196084
*/
package com.disml
import breeze.linalg.{DenseMatrix, DenseVector}
import breeze.numerics.exp

object MatrixMultiplyBreeze{

	// Main Function
	def main(args: Array[String]){

		val iterations = 1000  // No of Iterations
    	val dimension = 1000  // Matrix dimension
		val arrayOne = DenseMatrix.rand[Double](dimension, dimension)
		val arrayTwo = DenseMatrix.rand[Double](dimension, dimension)

		// Multiplying the two matrices
		var output = arrayOne * arrayTwo

		// Printing output
  		// println(arrayOne)
		// println(arrayTwo)
		// println(output)

		// Calculating time for total number of iterations
		val startTime = System.currentTimeMillis()
		for (_ <- 1 to iterations)
			output = arrayOne * arrayTwo
		val endTime = System.currentTimeMillis()

		// Printing the time taken for computation
		println("\nDense Matrix Multiplication Comparison: Breeze")
    	println(s"\nNo. of Iterations: $iterations");
    	println(s"\nTime Taken: ${(endTime-startTime)/1000.0} s \n")
		
	}

}