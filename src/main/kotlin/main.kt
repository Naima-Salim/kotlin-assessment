
fun main(){
    var money=Current(234567745,"Mima Yusuf",1234.57)
    println(money.deposit(67894.78))
    println(money.withdraw(567.56))
    println(money.details())

    var save=SavingsAccount(3455677,"Mohamed Salim",13245.23)
    println(save.withdrawals(6789))

    var vegetables=Products("cabbage",45.67,60,"grocery")
    var deoderant=Products("RoyaleBlue",10.01,350,"hygiene")
    var wood=Products("table",56.89,8900,
        "others")
    var b= mutableListOf(vegetables,deoderant,wood)
    println(vegetables)

  var a= fruits("banana")
 println(a)
}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the
//amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is operated by  "z"

open class  Current(var accountNumber:Int, var accountName:String, var balance:Double){

    fun deposit (amount:Double){
        var x = amount+balance
        x++
        println(x)
    }

open   fun withdraw(amount:Double){
        var x = balance-amount
        x--
        println(x)

    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
 class SavingsAccount(var accountNumber: Int, var accountName: String, var balance: Double){
    fun withdrawals(amount:Int){
        var a=amount
        if (amount>4)
            println(amount)
    }
    fun withdrawals(){
        var a = balance
        a++
        println(a)

    }
}

//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)

data class Products(var name:String,var weight:Double,var price:Int,var category:String){


}
//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return "bnn"
fun fruits(name: String):String{
    var fruit=""
    for (n in name){
        if (name.indexOf(n)%2==0){
            fruit+=n
        }

    }
    return fruit

}



