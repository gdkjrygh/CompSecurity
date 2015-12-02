// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import gci;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            CoachMarkPathView

public class AddPaymentOverlayView extends RelativeLayout
{

    private gci a;
    Button mButtonAddPayment;
    CoachMarkPathView mCoachMarkPathView;

    public AddPaymentOverlayView(Context context)
    {
        this(context, null);
    }

    public AddPaymentOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddPaymentOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mButtonAddPayment.getLayoutParams();
        layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.rightMargin, i);
    }

    public final void a(gci gci1)
    {
        a = gci1;
    }

    public void onClickAddPayment()
    {
        if (a != null)
        {
            a.b();
        }
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
            mCoachMarkPathView.b();
            mCoachMarkPathView.a();
            return;
        }
    }
}
