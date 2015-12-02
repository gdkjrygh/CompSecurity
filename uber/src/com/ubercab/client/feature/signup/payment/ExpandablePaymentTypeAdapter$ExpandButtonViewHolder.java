// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;

class 
{

    TextView mTextViewExpandButtonType;

    public final void a(String s)
    {
        mTextViewExpandButtonType.setText(s);
    }

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
