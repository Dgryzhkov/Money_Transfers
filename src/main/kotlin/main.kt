const val MASTER_CARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "VISA"
const val WORLD = "Мир"
const val VK_PAY = "VK Pay"
const val RUB_COP = 100 // для перевода копеек в рубли
//const val LIMIT_TRANSFER = 600_000*RUB_COP
//const val LIMIT_VKPAY_TRANSFER =40_000*RUB_COP


fun main() {
    val previousTransfer = 0
    val moneyTransfer =RUB_COP* 39000*3 // введи сумму перевода в рублях
    val cardType =MASTER_CARD


println("""Комиссия составлет ${comission(moneyTransfer, previousTransfer, cardType)} руб""")
}