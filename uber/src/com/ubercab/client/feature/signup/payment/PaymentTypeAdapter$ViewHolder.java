// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import gsa;

class a
{

    private final Resources a;
    TextView mTextViewType;

    public final void a(gsa gsa1, boolean flag)
    {
        if (flag && gsa1.a().equals("braintree"))
        {
            mTextViewType.setText(0x7f070281);
        } else
        {
            mTextViewType.setText(gsa1.b());
        }
        mTextViewType.setCompoundDrawablesWithIntrinsicBounds(gsa1.c(), null, null, null);
    }

    public (View view)
    {
        a = view.getResources();
        ButterKnife.inject(this, view);
    }
}
