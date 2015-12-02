// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import cgh;
import cgt;
import chc;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.ui.TextView;
import dfp;
import gel;

// Referenced classes of package com.ubercab.client.feature.payment:
//            BaseAddPaymentV2Fragment

public class b extends RelativeLayout
{

    public cgh a;
    final BaseAddPaymentV2Fragment b;
    private final chc c = new gel(getResources(), 0x7f0d0089);
    ImageView imageViewIcon;
    TextView textViewDescription;
    TextView textViewTitleNoPromo;
    TextView textViewTitlePromo;

    private void b()
    {
        inflate(getContext(), 0x7f030129, this);
        ButterKnife.inject(this);
        if (!isInEditMode())
        {
            ((RiderApplication)getContext().getApplicationContext()).b().a(this);
        }
    }

    public final void a()
    {
        imageViewIcon.setImageDrawable(getResources().getDrawable(0x7f02018a));
        textViewTitleNoPromo.setText(0x7f07021a);
        textViewTitlePromo.setText(null);
        textViewDescription.setText(null);
        textViewTitleNoPromo.setVisibility(0);
        textViewTitlePromo.setVisibility(8);
        textViewDescription.setVisibility(8);
    }

    public final void a(String s, String s1, String s2)
    {
        a.a(s).a().a(c).a(imageViewIcon);
        textViewTitleNoPromo.setText(null);
        textViewTitlePromo.setText(s1);
        textViewDescription.setText(s2);
        textViewTitleNoPromo.setVisibility(8);
        textViewTitlePromo.setVisibility(0);
        textViewDescription.setVisibility(0);
    }

    public Q(BaseAddPaymentV2Fragment baseaddpaymentv2fragment, Context context)
    {
        b = baseaddpaymentv2fragment;
        super(context);
        b();
    }
}
