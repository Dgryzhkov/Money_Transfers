const val COMISSION_PERCENT = 0.0075
const val COMISSION_ZERO = 0.0
const val COMISSION = 35.0
const val NO_COMISSION_MIN = 300
const val NO_COMISSION_MAX = 75000

//const val MAX_MONEY_TRANSFER_DAY = 150_000
const val MAX_MONEY_TRANSFER_MONTH = 600_000
const val RUB_COP = 100
val moneyTransfer = 100_000
val amount_transfer = moneyTransfer * RUB_COP


fun main() {
    if (moneyTransfer in 0..MAX_MONEY_TRANSFER_MONTH) {
        val comission =
            if (moneyTransfer in NO_COMISSION_MIN..NO_COMISSION_MAX) COMISSION_ZERO else moneyTransfer * COMISSION_PERCENT
        if (comission in COMISSION_ZERO..COMISSION) COMISSION else comission
        val amount_comission = comission * RUB_COP

        println("Сумма покупок составила $moneyTransfer руб ($amount_transfer копеек) комиссия равна $amount_comission копеек")
    } else
        println("Сумма $moneyTransfer руб превышает лимит в $MAX_MONEY_TRANSFER_MONTH руб в месяц")
}