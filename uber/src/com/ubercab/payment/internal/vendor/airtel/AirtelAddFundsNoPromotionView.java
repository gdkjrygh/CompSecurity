// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.Context;
import android.util.AttributeSet;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import e;
import f;
import gkg;
import gmg;
import gpp;
import gsd;
import gsg;
import gsn;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsView

public class AirtelAddFundsNoPromotionView extends AirtelAddFundsView
{

    private TextView c;
    private Button d;
    private Button e;
    private Button f;
    private TextView g;
    private double h;
    private double i;
    private double j;

    public AirtelAddFundsNoPromotionView(Context context)
    {
        super(context);
    }

    public AirtelAddFundsNoPromotionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AirtelAddFundsNoPromotionView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
    }

    static double a(AirtelAddFundsNoPromotionView airteladdfundsnopromotionview)
    {
        return airteladdfundsnopromotionview.h;
    }

    static double b(AirtelAddFundsNoPromotionView airteladdfundsnopromotionview)
    {
        return airteladdfundsnopromotionview.i;
    }

    static double c(AirtelAddFundsNoPromotionView airteladdfundsnopromotionview)
    {
        return airteladdfundsnopromotionview.j;
    }

    public final void a()
    {
        g.setVisibility(4);
        g.setText("");
    }

    public final void a(double d1)
    {
        g.setText(gpp.a(getContext(), d1));
        g.setVisibility(0);
    }

    protected final void b()
    {
        a.a(f.h);
        super.b();
    }

    protected final void b(double d1)
    {
        a.a(AnalyticsEvent.create("tap").setName(f.m).setCustomValues(gkg.a("amount", Double.valueOf(d1))));
        super.b(d1);
    }

    protected final cic c()
    {
        return e.l;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (TextView)findViewById(gsd.ub__payment_airtel_add_funds_no_promotion_text_add_custom);
        d = (Button)findViewById(gsd.ub__payment_airtel_add_funds_no_promotion_button_add_first);
        e = (Button)findViewById(gsd.ub__payment_airtel_add_funds_no_promotion_button_add_second);
        f = (Button)findViewById(gsd.ub__payment_airtel_add_funds_no_promotion_button_add_third);
        g = (TextView)findViewById(gsd.ub__payment_airtel_add_funds_no_promotion_text_balance);
        c.setOnClickListener(new _cls1());
        d.setOnClickListener(new _cls2());
        e.setOnClickListener(new _cls3());
        f.setOnClickListener(new _cls4());
        h = b.a(gsn.c, "add_funds_amount_1", 200D);
        i = b.a(gsn.c, "add_funds_amount_2", 400D);
        j = b.a(gsn.c, "add_funds_amount_3", 600D);
        d.setText(getContext().getString(gsg.ub__payment_add_value, new Object[] {
            gpp.a(getContext(), h)
        }));
        e.setText(getContext().getString(gsg.ub__payment_add_value, new Object[] {
            gpp.a(getContext(), i)
        }));
        f.setText(getContext().getString(gsg.ub__payment_add_value, new Object[] {
            gpp.a(getContext(), j)
        }));
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
