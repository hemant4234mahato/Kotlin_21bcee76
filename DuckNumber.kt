fun main(){
    var num = 65778;
    var flag = false;
    var temp = num
    var digit = 0
    while(temp > 0)
    {
        digit = temp%10
        if(digit == 0)
        {
            flag = true
            break;
        }
        temp = temp/10
    }
    if(flag == true) 
    {
        println("$num is a duck number")
    }
    else 
    {
        println("$num is not a duck number")
    }
}