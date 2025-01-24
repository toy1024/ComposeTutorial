package org.hypest.composetutorial

import android.content.res.Configuration
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import org.hypest.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun Conversation(Messages: List<Message>) {
    LazyColumn(modifier = Modifier.testTag("Chatlist"))
    {
        items(Messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Preview
@Composable
fun PreviewConversation() {
    ComposeTutorialTheme {
        Surface {
            Conversation(SampleData.conversationSample)
        }
    }
}
