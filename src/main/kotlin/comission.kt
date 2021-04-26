const val COMISSION_PERCENT_MASTERCAR_MAESTRO = 0.006
const val COMISSION_PRECENT_VISA_WORLD = 0.0075
const val FIXED_COMISSION_MASTER_MAESTRO = 20*RUB_COP
const val FIXED_COMISSION_VISA_WORLD = 35*RUB_COP
const val NO_COMISSION_MAX_MASTERCARD_MAESTRO = 75_000*RUB_COP


fun comission(sumTransfer: Int, previousTransfer: Int, cardType: String,): Int {
    return when (cardType) {
        MAESTRO, MASTER_CARD ->
            if (NO_COMISSION_MAX_MASTERCARD_MAESTRO > (sumTransfer + previousTransfer))
                0
            else ((((sumTransfer + previousTransfer) - NO_COMISSION_MAX_MASTERCARD_MAESTRO)
                    * COMISSION_PERCENT_MASTERCAR_MAESTRO
                    + FIXED_COMISSION_MASTER_MAESTRO) / RUB_COP).toInt()

        VISA, WORLD -> if (FIXED_COMISSION_VISA_WORLD > ((sumTransfer * COMISSION_PRECENT_VISA_WORLD)))
            FIXED_COMISSION_VISA_WORLD/RUB_COP
        else ((sumTransfer * COMISSION_PRECENT_VISA_WORLD) / RUB_COP).toInt()

        else -> 0
    }
}
