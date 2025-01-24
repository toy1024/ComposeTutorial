package org.hypest.composetutorial

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performScrollToNode
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ConversationComposableTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun conversationHasCorrectNameAndMessage() {
        composeTestRule.setContent {
            Conversation(SampleData.conversationSample)
        }

        SampleData.conversationSample.forEach { message: Message ->
            composeTestRule.onNodeWithTag("Chatlist")
                .performScrollToNode(hasText(message.body))
                .assertIsDisplayed()
        }
    }
}
