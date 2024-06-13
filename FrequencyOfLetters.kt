fun main() 
{
    var string ="hemant kumar"
    val frequency = mutableMapOf<Char, Int>()
    for(char in string) 
    {
        if(char.isLetter())
        {
        	frequency[char] = frequency.getOrDefault(char, 0) + 1;
        }
    }
    println("$frequency")
}