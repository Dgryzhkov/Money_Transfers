const val COMISSION_PERCENT_MASTERCAR_MAESTRO = 0.006
const val COMISSION_PRECENT_VISA_WORLD = 0.0075
const val FIXED_COMISSION_MASTER_MAESTRO = 20*RUB_COP
const val FIXED_COMISSION_VISA_WORLD = 35*RUB_COP
const val NO_COMISSION_MAX_MASTERCARD_MAESTRO = 75_000*RUB_COP


fun comission(sumTransfer: Int, previousTransfer: Int, typeCard: String): Int {
    return when (typeCard) {
        MAESTRO, MASTER_CARD ->
            if (NO_COMISSION_MAX_MASTERCARD_MAESTRO > (sumTransfer + previousTransfer))
                0
            else ((((sumTransfer + previousTransfer) - NO_COMISSION_MAX_MASTERCARD_MAESTRO)
                    * COMISSION_PERCENT_MASTERCAR_MAESTRO
                    + FIXED_COMISSION_MASTER_MAESTRO) / RUB_COP).toInt()

        VISA, WORLD -> if (FIXED_COMISSION_VISA_WORLD*RUB_COP > ((sumTransfer * COMISSION_PRECENT_VISA_WORLD) / RUB_COP))
            FIXED_COMISSION_VISA_WORLD
        else ((sumTransfer * COMISSION_PRECENT_VISA_WORLD) / RUB_COP).toInt()

        else -> 0
    }
}


//((sumTransfer+previousTransfer)-NO_COMISSION_MAX_MASTERCARD_MAESTRO)*COMISSION_PERCENT_MASTERCAR_MAESTRO)
//   +FIXED_COMISSION_MASTER_MAESTRO

/*  MAX_MONEY_TRANSFER_VKPAY.toInt() ->
  println("Первышены суммы перевода ${(MAX_MONEY_TRANSFER_VKPAY / RUB_COP).toInt()} рублей")
  MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK.toInt() ->
  println("Первышены суммы перевода ${(MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK / RUB_COP).toInt()} рублей")
  else -> println(" комиссия составляет ${(comision / RUB_COP)} рублей")
}
*/
