package FuncNodes
import breeze.linalg._
import breeze.numerics._
import WeightUpdator._
import ActivationFunc._
class FeedForwardNode(weightsMatrix:DenseMatrix[Double],updator:WeightUpdator,activeFunc:ActivationFunc) extends FuncNode{ 
    var gradientMatrix:DenseMatrix[Double]= DenseMatrix.zeros(weightsMatrix.rows, weightsMatrix.cols)
    def forwardPropagate():Unit={
      activationVector=activeFunc.active(weightsMatrix.t * parents(0).activationVector)
    }
    def backPropagate():Unit={
      
    }
    def update:Unit={
      
    }

}