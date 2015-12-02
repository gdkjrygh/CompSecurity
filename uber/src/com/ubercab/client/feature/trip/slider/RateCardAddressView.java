// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.ui.TextView;
import dsj;
import hoq;

public class RateCardAddressView extends LinearLayout
{

    private String a;
    private RiderLocation b;
    TextView mTextViewAddress;

    public RateCardAddressView(Context context)
    {
        this(context, null);
    }

    public RateCardAddressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RateCardAddressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private Spannable a(String s)
    {
        s = new SpannableString(s);
        s.setSpan(new dsj(hoq.a(getContext(), 0x7f070697)), 0, s.length(), 17);
        return s;
    }

    final void a(RiderLocation riderlocation)
    {
        b = riderlocation;
        if (b == null)
        {
            mTextViewAddress.setText("");
            mTextViewAddress.setHint(a);
            return;
        }
        String s = riderlocation.getNickname();
        riderlocation = riderlocation.getDisplayAddressDescription();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            spannablestringbuilder.append(a(s.trim()));
            spannablestringbuilder.append(" ");
        }
        if (TextUtils.isEmpty(s) || !riderlocation.startsWith(s))
        {
            spannablestringbuilder.append(riderlocation.trim());
        }
        mTextViewAddress.setHint("");
        mTextViewAddress.setText(spannablestringbuilder);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }
}
