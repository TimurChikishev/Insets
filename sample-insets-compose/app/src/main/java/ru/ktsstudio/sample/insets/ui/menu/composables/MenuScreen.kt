package ru.ktsstudio.sample.insets.ui.menu.composables

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.ktsstudio.sample.insets.R
import ru.ktsstudio.sample.insets.ui.common.composables.SampleTopBar
import ru.ktsstudio.sample.insets.ui.common.data.insetsSamples
import ru.ktsstudio.sample.insets.ui.menu.InsetsSample
import ru.ktsstudio.sample.insets.utils.navigationBarsInset

@Composable
fun MenuScreen(onItemClick: (InsetsSample) -> Unit) {
    Scaffold(
        topBar = {
            SampleTopBar(
                titleRes = R.string.compose_samples
            )
        }
    ) { contentPadding ->
        LazyColumn(
            modifier = Modifier.padding(navigationBarsInset),
            contentPadding = contentPadding
        ) {
            items(insetsSamples) { item ->
                ItemInsetSample(
                    item = item,
                    onItemClick = { onItemClick(item) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    MenuScreen(onItemClick = {})
}