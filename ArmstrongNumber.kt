fun main()
{
    var number = 153
    var digit = 0
    var armstrong = 0
    var temp = number
    while(temp > 0)
    {
        digit = temp % 10
        armstrong = armstrong + (digit * digit * digit)
        temp = temp / 10
    }
    if(armstrong == number) 
    {
        println("$number is an Armstrong number")
    }

    else 
    {
        println("$number is not an armstrong number")
    }
}