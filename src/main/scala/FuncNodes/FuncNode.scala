package FuncNodes
import breeze.linalg._
import breeze.numerics._
import WeightUpdator._
trait FuncNode {
    var activationVector:DenseVector[Double]=_
    var errorVector:DenseVector[Double]=_
    protected def parents:List[FuncNode]=List[FuncNode]()
    protected def children:List[FuncNode]=List[FuncNode]()
    def forwardPropagate():Unit
    def backPropagate():Unit
    def update:Unit
}