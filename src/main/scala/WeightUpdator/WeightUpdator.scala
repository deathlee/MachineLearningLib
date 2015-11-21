package WeightUpdator
import breeze.linalg._
import breeze.numerics._
trait WeightUpdator {
  def update(gradientMatrix:DenseMatrix[Double],weightMatrix:DenseMatrix[Double]):Unit
}