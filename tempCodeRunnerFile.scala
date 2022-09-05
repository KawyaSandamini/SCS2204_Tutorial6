val ciper=(algo:(Char,Int,String)=>
        Char,s:String,shift:Int,alphabet:string)=>
            s.map(algo(_,shift,alphabet))
    val ct=cipher(E,s,5,alphabet)
    val pt=ciper(D,ct,5,alphabet)
    println(pt)