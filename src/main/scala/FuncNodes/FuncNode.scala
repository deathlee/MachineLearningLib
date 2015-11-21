package FuncNodes
import breeze.linalg._
import breeze.numerics._
import WeightUpdator._
trait FuncNode {
    var activationVector:DenseVector[Double]=_
    var errorVector:DenseVector[Double]=_
    def forwardPropagate():Unit
    def backPropagate():Unit
    def update:Unit
}