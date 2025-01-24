package org.hypest.composetutorial

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MessageComposableTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun messageHasCorrectNameAndMessage() {
        composeTestRule.setContent {
            MessageCard(Message("Name goes here", "This is a test message"))
        }
        composeTestRule.onNodeWithText("Name goes here").assertIsDisplayed()
        composeTestRule.onNodeWithText("This is a test message").assertIsDisplayed()
    }
}
