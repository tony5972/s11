
object slip11
{
	def main(args:Array[String])
	{
		var occ:Int=0
		println("Enter String:");
		var str1=Console.readLine();
	
		println("Enter String:");
		var str2:Char =Console.readChar;
			
		for(i<-0 until str1.length)
		{
			if(str1(i)==str2)
			{
				if(str1(i).isLower)
				{
						str1(i).toUpper
				}
					else
					{
						str1(i).toLower
					}
				occ+=1
			}
		}		
		println("occurence: "+occ)
		println("String is : "+str1)
		
	}
}
	
