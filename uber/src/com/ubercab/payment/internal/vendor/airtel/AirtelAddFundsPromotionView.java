// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import chp;
import cic;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import e;
import f;
import gmg;
import gpp;
import gsd;
import gsg;
import gsn;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsView

public class AirtelAddFundsPromotionView extends AirtelAddFundsView
{

    private TextView c;
    private Button d;
    private TextView e;
    private double f;

    public AirtelAddFundsPromotionView(Context context)
    {
        super(context);
    }

    public AirtelAddFundsPromotionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AirtelAddFundsPromotionView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static double a(AirtelAddFundsPromotionView airteladdfundspromotionview)
    {
        return airteladdfundspromotionview.f;
    }

    protected final void b()
    {
        a.a(f.o);
        super.b();
    }

    protected final void b(double d1)
    {
        a.a(f.p);
        super.b(d1);
    }

    protected final cic c()
    {
        return e.p;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        e = (TextView)getRootView().findViewById(gsd.ub__payment_airtel_add_funds_promotion_text_message);
        d = (Button)getRootView().findViewById(gsd.ub__payment_airtel_add_funds_promotion_button_add_suggested);
        c = (TextView)getRootView().findViewById(gsd.ub__payment_airtel_add_funds_promotion_text_add_custom);
        d.setOnClickListener(new _cls1());
        c.setOnClickListener(new _cls2());
        f = b.a(gsn.d, "promotion_up_to_amount", 500D);
        String s = gpp.a(getContext(), f);
        e.setText(getContext().getString(gsg.ub__payment_airtel_add_funds_promotion_message, new Object[] {
            s
        }));
        d.setText(getContext().getString(gsg.ub__payment_airtel_add_funds_promotion_button, new Object[] {
            s
        }));
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
