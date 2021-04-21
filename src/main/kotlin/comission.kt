fun comission(): Any {
    val com = when (card_type) {
        MAESTRO, MASTER_CARD -> if
                (NO_COMISSION_MAX_MASTERCARD_MAESTRO>previousTransfer && moneyTransfer<NO_COMISSION_MAX_MASTERCARD_MAESTRO) 0
        else
            ((moneyTransfer - previousTransfer) * COMISSION_PERCENT_MASTERCAR_MAESTRO + FIXED_COMISSION_MASTER_MAESTRO)*
                    RUB_COP

        VISA, WORLD -> if (FIXED_COMISSION_VISA_WORLD > moneyTransfer * COMISSION_PRECENT_VISA_WORLD)
            FIXED_COMISSION_VISA_WORLD*RUB_COP
        else moneyTransfer*COMISSION_PRECENT_VISA_WORLD*RUB_COP

        else -> moneyTransfer

       /*else -> if (moneyTransfer<MAX_MONEY_TRANSFER_VKPAY+0.01) moneyTransfer else
            println ("Сумма перевода превышает лимит, максимальная сумма перевода составляет: $MAX_MONEY_TRANSFER_VKPAY")*/

    }
    return println(" комиссия составила $com копеек")
}

