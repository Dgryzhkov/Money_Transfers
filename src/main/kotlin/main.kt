const val MASTER_CARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "VISA"
const val WORLD = "Мир"
const val VK_PAY = "VK Pay"
const val RUB_COP = 100 // для перевода копеек в рубли
// суммы комисии в копейках
const val COMISSION_PERCENT_MASTERCAR_MAESTRO = 0.006
const val COMISSION_PRECENT_VISA_WORLD = 0.0075
const val FIXED_COMISSION_MASTER_MAESTRO = 20*RUB_COP
const val FIXED_COMISSION_VISA_WORLD = 35*RUB_COP
const val NO_COMISSION_MAX_MASTERCARD_MAESTRO = 75_000*RUB_COP




fun main() {
   // val previousTransfer = 0
    val moneyTransfer =RUB_COP* 70000 // введи сумму перевода в рублях
    //val cardType=VISA


/*
println("Комиссия составлет ${comission(moneyTransfer, previousTransfer, cardType)} " +
        "коп (${(comission(moneyTransfer, previousTransfer, cardType))/RUB_COP} руб)")
*/


}