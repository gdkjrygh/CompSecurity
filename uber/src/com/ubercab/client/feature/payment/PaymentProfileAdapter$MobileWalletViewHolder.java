// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;
import eqk;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentProfileAdapter

class b extends b
    implements eqk
{

    final PaymentProfileAdapter b;
    ProgressBar mProgressBarCurrentBalanceRequest;
    RadioButton mRadioButtonItem;
    TextView mTextViewCurrentBalanceValue;

    public final void a(PaymentProfile paymentprofile, List list, PaymentProfile paymentprofile1)
    {
        super.b(paymentprofile, list, paymentprofile1);
        if (PaymentProfileAdapter.c(b) != null)
        {
            mProgressBarCurrentBalanceRequest.setVisibility(8);
        } else
        {
            mProgressBarCurrentBalanceRequest.setVisibility(0);
        }
        mTextViewCurrentBalanceValue.setText(PaymentProfileAdapter.c(b));
        PaymentProfileAdapter.a(b, paymentprofile, mDefaultTextView);
    }

    (PaymentProfileAdapter paymentprofileadapter, View view, boolean flag, boolean flag1)
    {
        b = paymentprofileadapter;
        super(paymentprofileadapter, view, flag, flag1);
    }
}
