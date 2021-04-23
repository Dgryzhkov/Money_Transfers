const val MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK = 600_000.00*RUB_COP
const val MAX_MONEY_TRANSFER_VKPAY = 40_000.00*RUB_COP

fun limit(sumTransfer: Int, limTranfer: Int, typeCard: String):Int{
   val lim = when (typeCard){
        MASTER_CARD,MAESTRO-> if((sumTransfer+limTranfer)<MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK) comission(sumTransfer, limTranfer,typeCard)
       else MAX_MONEY_TRANSFER_ALL_CARD_EXCEPT_VK
       else-> if((sumTransfer+limTranfer)<MAX_MONEY_TRANSFER_VKPAY) comission(sumTransfer, limTranfer, typeCard)
       else MAX_MONEY_TRANSFER_VKPAY

    }
    return lim.toInt()
}


