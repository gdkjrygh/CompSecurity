// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ubercab.ui.FloatingLabelEditText;
import com.ubercab.ui.TextView;
import gsd;
import gse;
import gsg;
import gty;
import guh;
import guj;
import guk;
import gxj;
import hrr;
import hrs;
import hrz;
import hsb;
import hsj;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public final class MpinFieldsView extends LinearLayout
{

    private static final int a = Calendar.getInstance().get(1);
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
    private FloatingLabelEditText c;
    private FloatingLabelEditText d;
    private FloatingLabelEditText e;
    private FloatingLabelEditText f;
    private FloatingLabelEditText g;
    private TextView h;
    private gty i;
    private guj j;
    private hsb k;
    private guh l;
    private hrz m;
    private guk n;
    private gxj o;
    private hsj p;

    public MpinFieldsView(Context context)
    {
        this(context, null);
    }

    public MpinFieldsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MpinFieldsView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(context);
        d();
    }

    static FloatingLabelEditText a(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.c;
    }

    private void a(Context context)
    {
        setOrientation(1);
        inflate(context, gse.ub__payment_view_airtel_mpin_fields, this);
        c = (FloatingLabelEditText)findViewById(gsd.ub__payment_fields_mpin_edit_text_mpin_add);
        d = (FloatingLabelEditText)findViewById(gsd.ub__payment_fields_mpin_edit_text_mpin_confirmation);
        e = (FloatingLabelEditText)findViewById(gsd.ub__payment_fields_mpin_edit_text_day);
        f = (FloatingLabelEditText)findViewById(gsd.ub__payment_fields_mpin_edit_text_month);
        g = (FloatingLabelEditText)findViewById(gsd.ub__payment_fields_mpin_edit_text_year);
        h = (TextView)findViewById(gsd.ub__payment_fields_mpin_text_view_date_of_birth_error);
    }

    private void a(CharSequence charsequence)
    {
        h.setVisibility(0);
        h.setText(charsequence);
    }

    static hsj b(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.p;
    }

    static guj c(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.j;
    }

    static FloatingLabelEditText d(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.d;
    }

    private void d()
    {
        i = new gty(Integer.valueOf(18), Integer.valueOf(100), new hrs(gsg.ub__payment_invalid_date_of_birth));
        j = new guj(4, 4, new hrs(gsg.ub__payment_invalid_mpin_invalid_length));
        k = new hsb(c, new hrs(gsg.ub__payment_invalid_mpin_invalid_match));
        l = new guh(f, g, new hrs(gsg.ub__payment_invalid_day));
        m = new hrz(new hrs(gsg.ub__payment_invalid_month));
        n = new guk(Integer.valueOf(1900), Integer.valueOf(a), new hrs(gsg.ub__payment_invalid_year));
        o = new gxj(e, f, g);
        p = new hsj();
        p.a(c, j);
        p.a(d, j);
        p.a(d, k);
        p.a(e, l);
        p.a(f, m);
        p.a(g, n);
        c.setOnFocusChangeListener(new _cls1());
        c.a(new _cls3());
        d.setOnFocusChangeListener(new _cls4());
        d.a(new _cls5());
        e.setOnFocusChangeListener(new _cls6());
        e.a(new _cls7());
        f.setOnFocusChangeListener(new _cls8());
        f.a(new _cls9());
        g.setOnFocusChangeListener(new _cls10());
        g.a(new _cls2());
    }

    static hsb e(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.k;
    }

    private String e()
    {
        return e.i().toString();
    }

    static FloatingLabelEditText f(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.e;
    }

    private String f()
    {
        return f.i().toString();
    }

    static guh g(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.l;
    }

    private String g()
    {
        return g.i().toString();
    }

    private hrr h()
    {
        hrs hrs1 = (hrs)i.a(o);
        if (hrs1 != null)
        {
            a(hrs1.a(getResources()));
            return new hrr(h, hrs1);
        } else
        {
            i();
            return null;
        }
    }

    static void h(MpinFieldsView mpinfieldsview)
    {
        mpinfieldsview.i();
    }

    static FloatingLabelEditText i(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.f;
    }

    private void i()
    {
        h.setVisibility(8);
        h.setText(null);
    }

    static hrz j(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.m;
    }

    static FloatingLabelEditText k(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.g;
    }

    static guk l(MpinFieldsView mpinfieldsview)
    {
        return mpinfieldsview.n;
    }

    public final String a()
    {
        return c.i().toString();
    }

    public final List b()
    {
        List list = p.a();
        if (list.isEmpty())
        {
            hrr hrr1 = h();
            if (hrr1 != null)
            {
                list.add(hrr1);
            }
        }
        return list;
    }

    public final String c()
    {
        Object obj;
        try
        {
            obj = Calendar.getInstance();
            ((Calendar) (obj)).set(1, Integer.parseInt(g()));
            ((Calendar) (obj)).set(2, Integer.parseInt(f()) - 1);
            ((Calendar) (obj)).set(5, Integer.parseInt(e()));
            obj = b.format(((Calendar) (obj)).getTime());
        }
        catch (NumberFormatException numberformatexception)
        {
            return null;
        }
        return ((String) (obj));
    }


    /* member class not found */
    class _cls1 {}


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


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls2 {}

}
