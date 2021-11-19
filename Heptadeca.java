/*
 * 10 points) Project Heptadeca. Wednesday December 4, Thursday December 5 
 * Write a Heptadeca class that encapsulates a Heptadeca number value. 
 * THE USE OF ARRAYS IS NOT PERMITTED A Heptadeca number is one with 17 digits:
 *  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, G. 
public Heptadeca()//
 default constructor public Heptadeca(String value)// 
 explicit constructor public Heptadeca(Heptadeca value) 
public Heptadeca(int value) 
public Heptadeca add(int n) 
public Heptadeca subtract(int n) 
public Heptadeca multiply(int n)
public Heptadeca divide(int n) 
public Heptadeca add(Heptadeca other) 
public Heptadeca subtract(Heptadeca other) 
public Heptadeca multiply(Heptadeca other) 
public Heptadeca divide(Heptadeca other) 
public Heptadeca add(String other) 
public Heptadeca subtract(String other) 
public Heptadeca multiply(String other) 
public Heptadeca divide(String other)
public void setHeptadecaNumber(Heptadeca other)
public void setHeptadecaNumber(int other) 
public void setHeptadecaNumber(String other) 
public Heptadeca getHeptadecaNumber()//
one line of code public boolean equals(Heptadeca other) 
public void read( )
private void convertStringNumberberToIntegerValue(String stringNumber) 
private String removeBaseCharaterH(String stringNumber) 
private int characterToInteger(char digitChar)// 
switch statement private void guaranteeProperCharacterInputABCDEFG1234567890(String stringNumber) 
public String toString() 
private String integerDigitToStringDigit(int integerDigit)// switch statement 

 */
public class Heptadeca
{	
	private int num = 0;
	private String hexNum;
	public void heptadeca()
	{
		
	}
	public void heptadeca(String a)
	{
		//num = Integer.toHexString(a);
	}
	/*public void checkValidity()
	{
		
	}
	*/
	public Heptadeca(Heptadeca n)//heptadeca value
	{
		
	}
	public Heptadeca(int n)
	{
		
	}
	public Heptadeca add(int n)
	{
		return null;
		
	}
	public Heptadeca subtract(Heptadeca other)
	{
		return other;
	}
	public Heptadeca multiply(Heptadeca other)
	{
		return other;	
	}
	public Heptadeca divide(Heptadeca other)
	{
		return other;	
	}
	public Heptadeca add(String other)
	{	
		
		return null;
	}
	public Heptadeca subtract(String other) 
	{
		return null;	
	}
	public Heptadeca multiply(String other)
	{
		return null;	
	}
	public divide(String other)
	{	
		return null;	
	}
	/*public void setHeptadecaNumber(Heptadeca other)
	{
		
	}
	*/
	/*public void setHeptadecaNumber(int other)
	{
		
	}
	*/
	public void setHeptadecaNumber(String other)//Hepta to int
	{
		num = Integer.parseInt(other, 17);
	}
	public int getHeptadecaNumber()
	{
		return num;
		
	}
	public boolean equals(Heptadeca other) 
	{

		return false;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
