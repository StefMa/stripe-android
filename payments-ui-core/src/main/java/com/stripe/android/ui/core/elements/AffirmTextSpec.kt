package com.stripe.android.ui.core.elements

import com.stripe.android.uicore.elements.FormElement
import com.stripe.android.uicore.elements.IdentifierSpec
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Header that displays promo information about Affirm
 */
@Serializable
@Parcelize
internal data class AffirmTextSpec(
    @SerialName("api_path")
    override val apiPath: IdentifierSpec = IdentifierSpec.Generic("affirm_header")
) : FormItemSpec() {
    fun transform(): FormElement =
        AffirmHeaderElement(this.apiPath)
}
