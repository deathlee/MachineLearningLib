package WeightUpdator
import breeze.linalg._
import breeze.numerics._
class DefaultUpdator(val alpha:Double=0.01) extends WeightUpdator{
  def update(gradientMatrix:DenseMatrix[Double],weightMatrix:DenseMatrix[Double]):Unit={
    weightMatrix += alpha*gradientMatrix
  }

}