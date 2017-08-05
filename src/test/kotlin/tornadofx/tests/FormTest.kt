package tornadofx.tests

import javafx.stage.Stage
import org.junit.Test
import org.testfx.api.FxToolkit
import tornadofx.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FormTest {
    val primaryStage: Stage = FxToolkit.registerPrimaryStage()

    @Test fun formLegendVisible() {
        val form = Form().apply {
            fieldset("Hello world")
        }
        val fieldset = form.select<Fieldset>(Stylesheet.fieldset)
        assertEquals(fieldset.text, "Hello world")
        assertTrue(fieldset.isVisible, "Fieldset show be visible")
    }
}