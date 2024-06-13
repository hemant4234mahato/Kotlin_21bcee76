fun main()
{
    var num1 = 64;
    var num2 = 24;
    var temp1 = num1;
    var temp2 = num2;
    var remainder = 0;
    while (temp2 != 0) 
    {
      remainder = temp1 % temp2;
      temp1 = temp2;
      temp2 = remainder;
  }
    println("GCD of $num1 and $num2 is $temp1")
}