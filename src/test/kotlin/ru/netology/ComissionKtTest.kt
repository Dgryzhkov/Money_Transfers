package ru.netology

import MAESTRO
import MASTER_CARD
import VISA
import VK_PAY
import WORLD
import comission


import org.junit.Test

import org.junit.Assert.*

class ComissionKtTest {
    //arrange
    val itemPreviousTransfer = 0
    val itemMoneyTransfer = 100 * 700000 // введи сумму перевода в рублях
    val itemTypeCardMaster = MASTER_CARD
    val itemTypeCardMaestro = MAESTRO
    val itemTypeCardVisa = VISA
    val itemTypeCardWorld = WORLD
    val itemTypeCardVKPay = VK_PAY

    @Test
    fun comission_Maestro_Percent() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardMaestro
        )
        //assert
        assertEquals(377000, result)
    }

    @Test
    fun comission_Maestro_Fixed() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer / 10,
            cardType = itemTypeCardMaestro
        )
        //assert
        assertEquals(0, result)
    }

    @Test
    fun comission_MasterCard_Percent() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardMaster
        )
        //assert
        assertEquals(377000, result)
    }

    @Test
    fun comission_MasterCard_Fixed() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer / 10,
            cardType = itemTypeCardMaster
        )
        //assert
        assertEquals(0, result)

    }


    @Test
    fun comission_VISA_Percent() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardVisa
        )
        //assert
        assertEquals(525000, result)
    }

    @Test
    fun comission_VISA_Fixed() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer / 1000,
            cardType = itemTypeCardVisa
        )
        //assert
        assertEquals(3500, result)

    }

    @Test
    fun comission_World_Percent() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer,
            cardType = itemTypeCardWorld
        )
        //assert
        assertEquals(525000, result)
    }

    @Test
    fun comission_World_Fixed() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer / 1000,
            cardType = itemTypeCardWorld
        )
        //assert
        assertEquals(3500, result)
    }

    @Test
    fun comission_VKPay_Percent() {
        //act
        val result = comission(
            previousTransfer = itemPreviousTransfer,
            sumTransfer = itemMoneyTransfer / 10,
            cardType = itemTypeCardVKPay
        )
        //assert
        assertEquals(0, result)
    }

    @Test
    fun comission_default() {

        //act
        val result = comission(
            sumTransfer = itemMoneyTransfer/1000
        )
        //assert
            assertEquals(0, result)
    }

@Test
fun when_test(){
    //act
    val result=comission(
        sumTransfer = itemMoneyTransfer/1000,
        cardType = itemTypeCardMaster

    )
    assertEquals(0, result)

}


}