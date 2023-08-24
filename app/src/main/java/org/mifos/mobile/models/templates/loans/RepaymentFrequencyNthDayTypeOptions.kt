package org.mifos.mobile.models.templates.loans

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by Rajan Maurya on 16/07/16.
 */

@Parcelize
data class RepaymentFrequencyNthDayTypeOptions(
    var id: Int? = null,

    var code: String? = null,

    var value: String? = null,
) : Parcelable
