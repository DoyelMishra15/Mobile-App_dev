fun main(){
    var num = 5
    var i = 1
    var count = 0
    for(i in 1..num){
        if(num%i==0){
            count++;
        }
    }
    if(count>2){
        println("Not Prime")
    }
    else{
        println("Prime number: ${num}")
    }
}
