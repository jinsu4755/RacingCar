fun main(){
    val stringExpression = InputView.readCalculationString()
    val expressionElementList = stringExpressionConvertor().toExpressionElementList(stringExpression)
    
}