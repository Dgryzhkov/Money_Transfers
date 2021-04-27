
fun comission(sumTransfer: Int, previousTransfer: Int=0, cardType: String=VK_PAY ): Int {
    return when (cardType) {
        MAESTRO, MASTER_CARD ->
            if (NO_COMISSION_MAX_MASTERCARD_MAESTRO > (sumTransfer + previousTransfer))
                0
            else (((sumTransfer + previousTransfer) - NO_COMISSION_MAX_MASTERCARD_MAESTRO)
                    * COMISSION_PERCENT_MASTERCAR_MAESTRO
                    + FIXED_COMISSION_MASTER_MAESTRO).toInt()

        VISA, WORLD -> if (FIXED_COMISSION_VISA_WORLD > ((sumTransfer * COMISSION_PRECENT_VISA_WORLD)))
            FIXED_COMISSION_VISA_WORLD
        else (sumTransfer * COMISSION_PRECENT_VISA_WORLD).toInt()

        else -> 0
    }
}
