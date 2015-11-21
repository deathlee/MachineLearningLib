package FuncNodes
import breeze.linalg._
import breeze.numerics._
import WeightUpdator._
import ActivationFunc._
class FeedForwardNode(weightsMatrix:DenseMatrix[Double],updator:WeightUpdator,activeFunc:ActivationFunc,bias:Boolean) extends FuncNode{
    
    var gradientMatrix:DenseMatrix[Double]= DenseMatrix.zeros(weightsMatrix.rows, weightsMatrix.cols)
    def forwardPropagate():Unit={
      var parentActivation:DenseVector[Double]={
      if(bias){
        DenseVector.vertcat[Double](DenseVector.ones[Double](1),parents(0).activationVector)
      }else{
        parents(0).activationVector
      }
      }
      activationVector=activeFunc.active(weightsMatrix.t *parentActivation )
    }
    def backPropagate():Unit={
      
    }
    def update:Unit={
      
    }

}