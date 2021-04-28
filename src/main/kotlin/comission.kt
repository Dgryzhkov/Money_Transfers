import java.lang.Integer.max

fun comission(sumTransfer: Int, previousTransfer: Int = 0, cardType: String = VK_PAY): Int {
    return when (cardType) {
        MAESTRO, MASTER_CARD -> max(
            0, (((sumTransfer + previousTransfer) - NO_COMISSION_MAX_MASTERCARD_MAESTRO)
                    * COMISSION_PERCENT_MASTERCAR_MAESTRO
                    + FIXED_COMISSION_MASTER_MAESTRO).toInt()
        )

        VISA, WORLD -> max(
            FIXED_COMISSION_VISA_WORLD,
            (sumTransfer * COMISSION_PRECENT_VISA_WORLD).toInt()
        )

        else -> 0
    }
}
