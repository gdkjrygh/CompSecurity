// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ubercab.payment.internal.ui.CreditCardEditText;
import com.ubercab.payment.internal.ui.PopupTextView;
import com.ubercab.ui.FloatingLabelEditText;
import gsd;
import gse;
import gsg;
import gtz;
import gua;
import gub;
import gxh;
import gxi;
import hrs;
import hsj;
import java.util.List;

public final class AirtelCardFieldsView extends LinearLayout
{

    private CreditCardEditText a;
    private FloatingLabelEditText b;
    private FloatingLabelEditText c;
    private FloatingLabelEditText d;
    private PopupTextView e;
    private hsj f;
    private gxh g;
    private String h;

    public AirtelCardFieldsView(Context context)
    {
        super(context);
        f();
    }

    public AirtelCardFieldsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f();
    }

    public AirtelCardFieldsView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        f();
    }

    static CreditCardEditText a(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.a;
    }

    static String a(AirtelCardFieldsView airtelcardfieldsview, String s)
    {
        airtelcardfieldsview.h = s;
        return s;
    }

    static hsj b(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.f;
    }

    static void c(AirtelCardFieldsView airtelcardfieldsview)
    {
        airtelcardfieldsview.j();
    }

    static FloatingLabelEditText d(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.b;
    }

    static FloatingLabelEditText e(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.c;
    }

    static FloatingLabelEditText f(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.d;
    }

    private void f()
    {
        inflate(getContext(), gse.ub__payment_view_airtel_card_fields, this);
        g();
        h();
    }

    static gxh g(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.g;
    }

    private void g()
    {
        a = (CreditCardEditText)findViewById(gsd.ub__payment_floatinglabeledittext_cardnumber);
        b = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_cardcode);
        c = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_expirationmonth);
        d = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_expirationyear);
        e = (PopupTextView)findViewById(gsd.ub__payment_spinner_payment_mode);
    }

    static String h(AirtelCardFieldsView airtelcardfieldsview)
    {
        return airtelcardfieldsview.h;
    }

    private void h()
    {
        gxi gxi1 = new gxi(new hrs(gsg.ub__payment_invalid_card_number));
        gtz gtz1 = new gtz(a, new hrs(gsg.ub__payment_invalid_card_code));
        gua gua1 = new gua(new hrs(gsg.ub__payment_invalid_card_month));
        gub gub1 = new gub(new hrs(gsg.ub__payment_invalid_card_year));
        f = new hsj();
        f.a(b, gtz1);
        f.a(c, gua1);
        f.a(d, gub1);
        f.a(a, gxi1);
        a.setOnFocusChangeListener(new _cls1());
        b.setOnFocusChangeListener(new _cls2());
        b.a(new _cls3(gtz1));
        c.setOnFocusChangeListener(new _cls4());
        c.a(new _cls5(gua1));
        d.setOnFocusChangeListener(new _cls6());
        d.a(new _cls7(gub1));
        e.setOnClickListener(new _cls8());
        e.a(new _cls9());
    }

    private boolean i()
    {
        return f.b().size() == 0 && e.a() != null;
    }

    private void j()
    {
        if (g != null)
        {
            g.a(i());
        }
    }

    public final String a()
    {
        return b.i().toString();
    }

    public final void a(gxh gxh1)
    {
        g = gxh1;
    }

    public final String b()
    {
        return a.getText().toString();
    }

    public final String c()
    {
        return c.i().toString();
    }

    public final String d()
    {
        return d.i().toString();
    }

    public final String e()
    {
        return h;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}

}
