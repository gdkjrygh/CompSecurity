// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;

public final class eqp extends eqq
{

    final AddAlipayActivity a;

    private eqp(AddAlipayActivity addalipayactivity)
    {
        a = addalipayactivity;
        super(addalipayactivity, (byte)0);
    }

    public eqp(AddAlipayActivity addalipayactivity, byte byte0)
    {
        this(addalipayactivity);
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (a.mEditTextAccountId.getText().toString().contains("@"))
        {
            a.mLayoutAlipayPhoneLayout.setVisibility(0);
            return;
        } else
        {
            a.mLayoutAlipayPhoneLayout.setVisibility(8);
            return;
        }
    }
}
