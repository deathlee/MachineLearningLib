package WeightUpdator
import breeze.linalg._
import breeze.numerics._
abstract class WeightUpdator {
  def update(gradientMatrix:Matrix[Double],weightVector:Matrix[Double]):Unit={
    
  }
}