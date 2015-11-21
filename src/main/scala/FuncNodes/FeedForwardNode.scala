package FuncNodes
import breeze.linalg._
import breeze.numerics._
import WeightUpdator._
import ActivationFunc._
class FeedForwardNode(var weightMatrix:DenseMatrix[Double],val updator:WeightUpdator=new DefaultUpdator,val activeFunc:ActivationFunc,val bias:Boolean) extends FuncNode{
    protected var parent:FeedForwardNode=_
    protected var child:FeedForwardNode=_
    protected var parentActivation:DenseVector[Double]=_
    protected var gradientMatrix:DenseMatrix[Double]= _
    def forwardPropagate():Unit={
      parentActivation={
      if(bias){
        DenseVector.vertcat[Double](DenseVector.ones[Double](1),parent.activationVector)
      }else{
        parent.activationVector
      }
      }
      activationVector=activeFunc.active(weightMatrix.t *parentActivation )
    }
    def backPropagate():Unit={
      errorVector = (child.weightMatrix*child.errorVector):*activeFunc.activePrime(errorVector)
      gradientMatrix=parentActivation*errorVector.t
      
    }
    def update:Unit={
      updator.update(gradientMatrix, weightMatrix)
    }

}