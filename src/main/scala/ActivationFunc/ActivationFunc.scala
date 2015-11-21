package ActivationFunc/**
 * @author zhuangli
 */
import breeze.linalg._
import breeze.numerics._
trait ActivationFunc {
  def active(inputVec:Vector[Double]):DenseVector[Double]
  def activePrime(inputVec:Vector[Double]):DenseVector[Double]
} 