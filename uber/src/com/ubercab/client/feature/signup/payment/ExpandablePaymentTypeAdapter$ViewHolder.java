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

    public final void a(gsa gsa1)
    {
        mTextViewType.setText(gsa1.b());
        mTextViewType.setCompoundDrawablesWithIntrinsicBounds(gsa1.c(), null, null, null);
    }

    public (View view)
    {
        a = view.getResources();
        ButterKnife.inject(this, view);
    }
}
