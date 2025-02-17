package com.stripe.android.customersheet

import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod
import com.stripe.android.model.PaymentMethod
import com.stripe.android.model.StripeIntent
import com.stripe.android.paymentsheet.model.PaymentSelection
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility

@OptIn(ExperimentalCustomerSheetApi::class)
internal sealed interface CustomerSheetState {
    object Loading : CustomerSheetState

    data class Full(
        val config: CustomerSheet.Configuration?,
        val stripeIntent: StripeIntent?,
        val customerPaymentMethods: List<PaymentMethod>,
        val supportedPaymentMethods: List<SupportedPaymentMethod>,
        val isGooglePayReady: Boolean,
        val paymentSelection: PaymentSelection?,
        val cbcEligibility: CardBrandChoiceEligibility,
        val validationError: Throwable?,
    ) : CustomerSheetState
}
