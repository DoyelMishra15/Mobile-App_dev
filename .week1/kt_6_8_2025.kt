
fun main(){
    println("Hello, Kotlin for the first time")
    
    var name= "DOyel"
    println(name)
    
    val num1= 100
    println(num1)

    println("--------------")
    
    val num1= 100
    println(num1)
    
    val num2= 120.11
    println(num2)
    
    val num3= 12000000.1100
    println(num3)
    
    val char1 = 'Z'
    println(char1)

    println("--------------")
    
    var a=10
    var b=2
    
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    //single line comment
    /*multi line comment*/

     println("--------------")

     var a=10
    
    a++
    println(a)
    
    a--
    println(a)

    println("--------------")

    var a=10
    
    a*=2
    println(a)
    
    a-=2
    println(a)
    
    a/=2
    println(a)
    
    a%=2
    println(a)
    

    println("--------------")

    var a=true
    var b=true
    
    println(a && b)
    println(a||b)
    println(!a)

    println("--------------")

    var age = 22
    if(age>=100){
        println("You are an old monster!!")
    }
    else if(age>=60){
        println("You are senior citizen")
    }
    else if(age>=18){
        println("You are barely an adult!!")
    }
    else{
        println("You are just a baby!!")
    }

    println("--------------")

     var season = 2
    when (season){
        1-> println("Summer Season")
        2-> println("Rainy Season")
        3-> println("Autumn Season")
        4-> println("Winter Season")
    }

     println("--------------")


     var season = 2
    when (season){
        1-> println("MERCURY")
        2-> println("VENUS")
        3-> println("EARTH")
        4-> println("MARS")
        5-> println("MARS")
        6-> println("JUPITER")
        7-> println("SATURN")
        8-> println("URANUS")
        9-> println("NEPTUNE")
    }

    println("--------------")

      var i=1
    while(i<=10){
        println(i)
        i++
    }
    println("--------------")

    var i=1
    
    do{
        println(i)
        i++
    }
    while(i<=10)
    
    println("--------------")

    var i=1
    
    for(i in 1..10){
        println(i)
    }

    println("--------------")

    var movies = listOf("The lord of rings","Avatar", "Nine Realms","XYZ","Aisha")
    
    for(mov in movies){
        println(mov)
    }

    println("--------------")





    println("--------------")
}
