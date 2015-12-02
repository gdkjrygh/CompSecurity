// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import gsa;

class 
{

    ImageView imageViewIcon;
    TextView textViewTitle;

    public final void a(gsa gsa1)
    {
        imageViewIcon.setImageDrawable(gsa1.c());
        textViewTitle.setText(gsa1.b());
    }

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
