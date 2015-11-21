package ActivationFunc/**
 * @author zhuangli
 */
trait ActivationFunc {
  def active(inputVec:Vector[Double]):Vector[Double]
  def activePrime(inputVec:Vector[Double]):Vector[Double]
} 