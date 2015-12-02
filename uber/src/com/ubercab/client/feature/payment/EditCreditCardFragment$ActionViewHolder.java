// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;

final class <init>
{

    View actionButtonCancel;
    View actionButtonConfirm;
    TextView textViewCancel;
    TextView textViewConfirm;

    private (View view)
    {
        ButterKnife.inject(this, view);
    }

    (View view, byte byte0)
    {
        this(view);
    }
}
