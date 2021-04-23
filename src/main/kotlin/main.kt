const val MASTER_CARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "VISA"
const val WORLD = "Мир"
const val VK_PAY = "VK Pay"
const val RUB_COP = 100 // для перевода копеек в рубли

fun main() {
    val previousTransfer = 0
    val moneyTransfer =RUB_COP* 80_00 // введи сумму перевода в рублях
    val card_type = VK_PAY
    val comision = limit(moneyTransfer, previousTransfer, card_type)

    when (comision) {
        MAX_MONEY_TRANSFER_VKPAY.toInt() ->
            println("Первышены суммы перевода ${(MAX_MONEY_TRANSFER_VKPAY / RUB_COP).toInt()} рублей")
        MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK.toInt() ->
            println("Первышены суммы перевода ${(MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK / RUB_COP).toInt()} рублей")
        else -> println(" комиссия составляет ${(comision / RUB_COP)} рублей")
    }
}