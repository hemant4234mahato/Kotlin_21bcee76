fun main() 
{
    var n = 5;
    for(i in 1..n)
    {
        for(j in 1..(n-i)) print(" ")
        for(j in 1..(2*i-1)) print("*")
        for(j in 1..(n-i)) print(" ")
        println(" ")
    }
    for(i in 1..n)
    {
        for(j in 1..(i-1)) print(" ")
        for(j in 1..(2*(n-i)+1)) print("*")
        for(j in 1..(i-1)) print(" ")
        println(" ")
    }
}