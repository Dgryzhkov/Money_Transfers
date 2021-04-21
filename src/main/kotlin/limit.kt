fun limit(): Any {
    val lim = when (card_type) {
        MASTER_CARD, MAESTRO, VISA, WORLD -> if
                                                     (MAX_MONEY_TRANSFER_MASTERCARD_MAESTRO + 0.01 > previousTransfer
            && moneyTransfer < MAX_MONEY_TRANSFER_MASTERCARD_MAESTRO + 0.01
        )
            comission() else
            println("Превышен лимит $MAX_MONEY_TRANSFER_MASTERCARD_MAESTRO  рублей")

        else -> if
                        (MAX_MONEY_TRANSFER_VKPAY + 0.01 > previousTransfer && moneyTransfer < MAX_MONEY_TRANSFER_VKPAY + 0.01)
            comission() else
            println("Превышен лимит $MAX_MONEY_TRANSFER_VKPAY  рублей")
    }
    return lim
}