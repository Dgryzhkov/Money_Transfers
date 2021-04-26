import org.junit.Test

import org.junit.Assert.*

class ComissionKtTest {

    @Test
    //fun 'comission()'{
    fun comission_item() {
        //arrange
        val itemPreviousTransfer = 0
        val itemMoneyTransfer = 100 * 39000 // введи сумму перевода в рублях
        val itemTypeCardMasterMaestro = MASTER_CARD
        val itemTypeCardMaestro = MAESTRO
        val itemTypeCardVisa = VISA
        val itemTypeCardWorld = WORLD
        val itemTypeCardVKPay = VK_PAY

//act
        val resultMasterCardZero = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardMasterMaestro
        )
  /*      val resultMasterCardPercent = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer+itemMoneyTransfer,
            cardType = itemTypeCardMasterMaestro
        )*/
      /*  val resultMaestroZero = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer/2,
            cardType = itemTypeCardMaestro
        )*/
        val resultMaestroPercent = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer*3,
            cardType = itemTypeCardMaestro
        )

       /* val resultVisa = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer/10,
            cardType = itemTypeCardVisa
        )*/
        val resultVisaPercent = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardVisa
        )
        val resultWorld = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer/10,
            cardType = itemTypeCardWorld
        )
  /*      val resultWorldPercent = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardWorld
        )*/

        val resultVKpay = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardVKPay
        )


      //assert
        assertEquals(0,resultMasterCardZero)
        //assertEquals(38, resultMasterCardPercent)
        //assertEquals(0,resultMaestroZero)
        assertEquals(272, resultMaestroPercent)
       // assertEquals(35, resultVisa)
        assertEquals(292, resultVisaPercent)
        assertEquals(35, resultWorld)
        //assertEquals(292, resultWorldPercent)
        assertEquals(0,resultVKpay)
    }
}

