const val COMISSION_PERCENT_MASTERCAR_MAESTRO = 0.006
const val COMISSION_PRECENT_VISA_WORLD = 0.0075
const val FIXED_COMISSION_MASTER_MAESTRO = 20.0
const val FIXED_COMISSION_VISA_WORLD = 35.0
const val NO_COMISSION_MAX_MASTERCARD_MAESTRO = 75000.00

fun comission(sumTransfer: Int, limTranfer: Int, typeCard: String): Int {
    val com = when (typeCard) {
        MAESTRO, MASTER_CARD ->
            if (NO_COMISSION_MAX_MASTERCARD_MAESTRO > sumTransfer + limTranfer) 0
            else
                (sumTransfer - limTranfer) * COMISSION_PERCENT_MASTERCAR_MAESTRO + FIXED_COMISSION_MASTER_MAESTRO

        VISA, WORLD -> if (FIXED_COMISSION_VISA_WORLD > sumTransfer * COMISSION_PRECENT_VISA_WORLD)
            FIXED_COMISSION_VISA_WORLD
        else sumTransfer * COMISSION_PRECENT_VISA_WORLD

        else -> 0
    }
    return com.toInt()
}

