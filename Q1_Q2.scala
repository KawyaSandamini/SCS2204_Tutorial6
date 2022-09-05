import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

@main
def run()={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //a.-----------------
    //Function for encryption
    val E = (c:Char,key:Int,a:String)=>
        a((a.indexOf(c.toUpper)+key)%a.size)
    //Function for decryption
    val D = (c:Char,key:Int,a:String)=>
        a((a.indexOf(c.toUpper)-key)%a.size)
    //b. Function which takes encryption, decryption function to process the data
    val cipher = (algo:(Char,Int,String)=>
        Char,s:String,key:Int,a:String)=>
            s.map(algo(_,key,a))
    //code we want to encrypt and decrypt
    println("Secret Message: ")
    val inputText:String = readLine()
    //Shift by,
    println("Shift by: ")
    val key: Int = readInt()
    //Print Encrypted text
    val ct = cipher(E,inputText,key,alphabet)
    println(ct)
    //Print Decrypted text
    val pt = cipher(D,ct,key,alphabet)
    println(pt)
}



