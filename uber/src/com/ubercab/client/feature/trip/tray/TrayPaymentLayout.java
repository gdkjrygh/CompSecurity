// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;
import czi;
import eyy;
import fqp;
import fsx;
import gey;
import gfn;
import gfp;

public class TrayPaymentLayout extends FrameLayout
{

    public eyy a;
    public gfn b;
    public fsx c;
    private PaymentProfile d;
    ImageView mPaymentImage;
    public TextView mPaymentText;

    public TrayPaymentLayout(Context context)
    {
        super(context);
    }

    public TrayPaymentLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrayPaymentLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static PaymentProfile a(TrayPaymentLayout traypaymentlayout)
    {
        return traypaymentlayout.d;
    }

    public static PaymentProfile a(TrayPaymentLayout traypaymentlayout, PaymentProfile paymentprofile)
    {
        traypaymentlayout.d = paymentprofile;
        return paymentprofile;
    }

    private void a(Drawable drawable)
    {
        mPaymentImage.setImageDrawable(drawable);
    }

    public static void a(TrayPaymentLayout traypaymentlayout, Drawable drawable)
    {
        traypaymentlayout.a(drawable);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ((fqp)((czi)getContext()).d()).a(this);
        }
        ButterKnife.inject(this);
        gfp.a(this, new gey(this, (byte)0));
        setOnClickListener(new android.view.View.OnClickListener() {

            final TrayPaymentLayout a;

            public final void onClick(View view)
            {
                a.b.b();
            }

            
            {
                a = TrayPaymentLayout.this;
                super();
            }
        });
    }
}
