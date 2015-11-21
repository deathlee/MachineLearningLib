package FuncNodes
import breeze.linalg._
import breeze.numerics._
import WeightUpdator._
trait FuncNode {
    var parent:List[FuncNode]=_
    var child:List[FuncNode]=_
    var activationVector:DenseVector[Double]=_
    var errorVector:DenseVector[Double]=_
    def forwardPropagate():Unit
    def backPropagate():Unit
    def update:Unit
}