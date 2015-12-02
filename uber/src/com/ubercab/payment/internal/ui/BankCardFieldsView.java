// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.ui.FloatingLabelEditText;
import gsc;
import gsd;
import gse;
import gsg;
import gso;
import gsq;
import gtd;
import gte;
import gtg;
import gtw;
import gtx;
import gtz;
import gui;
import hrs;
import hsd;
import java.util.List;

// Referenced classes of package com.ubercab.payment.internal.ui:
//            ClickableFloatingLabelEditText

public class BankCardFieldsView extends LinearLayout
{

    private gtd a;
    private gte b;
    private gtg c;
    private String d;
    private Drawable e;
    private CountryButton f;
    private ViewGroup g;
    private ClickableFloatingLabelEditText h;
    private ClickableFloatingLabelEditText i;
    private ClickableFloatingLabelEditText j;
    private FloatingLabelEditText k;

    public BankCardFieldsView(Context context)
    {
        super(context);
        c = new _cls1();
        h();
    }

    public BankCardFieldsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new _cls1();
        h();
    }

    public BankCardFieldsView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new _cls1();
        h();
    }

    static String a(BankCardFieldsView bankcardfieldsview)
    {
        return bankcardfieldsview.d;
    }

    static void a(BankCardFieldsView bankcardfieldsview, String s)
    {
        bankcardfieldsview.c(s);
    }

    static Drawable b(BankCardFieldsView bankcardfieldsview)
    {
        return bankcardfieldsview.e;
    }

    static String b(BankCardFieldsView bankcardfieldsview, String s)
    {
        bankcardfieldsview.d = s;
        return s;
    }

    static ClickableFloatingLabelEditText c(BankCardFieldsView bankcardfieldsview)
    {
        return bankcardfieldsview.j;
    }

    private void c(String s)
    {
        if (!TextUtils.isEmpty(s) && gtw.a(s))
        {
            k.setVisibility(0);
            s = gtw.b(s);
            if (s != null)
            {
                k.c(2);
                k.a(new InputFilter[] {
                    new android.text.InputFilter.LengthFilter(s.intValue())
                });
                return;
            } else
            {
                k.c(1);
                k.a(new InputFilter[0]);
                return;
            }
        } else
        {
            k.setVisibility(8);
            f.setTranslationY(0.0F);
            return;
        }
    }

    static void d(BankCardFieldsView bankcardfieldsview)
    {
        bankcardfieldsview.k();
    }

    static void e(BankCardFieldsView bankcardfieldsview)
    {
        bankcardfieldsview.l();
    }

    static void f(BankCardFieldsView bankcardfieldsview)
    {
        bankcardfieldsview.m();
    }

    static FloatingLabelEditText g(BankCardFieldsView bankcardfieldsview)
    {
        return bankcardfieldsview.k;
    }

    static ViewGroup h(BankCardFieldsView bankcardfieldsview)
    {
        return bankcardfieldsview.g;
    }

    private void h()
    {
        inflate(getContext(), gse.ub__payment_view_bank_card_fields, this);
        j = (ClickableFloatingLabelEditText)findViewById(gsd.ub__payment_view_bank_card_fields_edit_text_card_number);
        h = (ClickableFloatingLabelEditText)findViewById(gsd.ub__payment_view_bank_card_fields_edit_text_card_code);
        i = (ClickableFloatingLabelEditText)findViewById(gsd.ub__payment_view_bank_card_fields_edit_text_card_expiration);
        f = (CountryButton)findViewById(gsd.ub__payment_view_bank_card_fields_button_country);
        k = (FloatingLabelEditText)findViewById(gsd.ub__payment_view_bank_card_fields_edit_text_card_zip);
        g = (ViewGroup)findViewById(gsd.ub__payment_view_bank_card_fields_button_country_container);
        f.a(new _cls2());
        j.a(new _cls3());
        i.a(new _cls4());
        h.a(new _cls5());
        j.a(new _cls6());
        k.addOnLayoutChangeListener(new _cls7());
        e = getResources().getDrawable(gsc.ub__payment_icon_camera);
        c(f.a());
        i();
    }

    private void i()
    {
        gso gso1 = new gso();
        gsq gsq1 = new gsq();
        gtx gtx1 = new gtx(new hrs(gsg.ub__payment_invalid_card_number));
        gtz gtz1 = new gtz(c, new hrs(gsg.ub__payment_invalid_card_code));
        hsd hsd1 = new hsd(f, new hrs(gsg.ub__payment_invalid_card_zip));
        gui gui1 = new gui(new hrs(gsg.ub__payment_invalid_expiration_date));
        a = new gtd(this, (byte)0);
        a.a(j, gtx1);
        a.a(i, gui1);
        a.a(h, gtz1);
        a.a(k, hsd1);
        a.a(j, gso1);
        a.a(i, gsq1);
        a.a(j, gtx1);
        a.a(i, gui1);
        a.a(h, gtz1);
    }

    public static void i(BankCardFieldsView bankcardfieldsview)
    {
        bankcardfieldsview.j();
    }

    private void j()
    {
        if (b != null)
        {
            b.a(g());
        }
    }

    private void k()
    {
        if (b != null)
        {
            b.C_();
        }
    }

    private void l()
    {
        if (b != null)
        {
            b.a(d);
        }
    }

    private void m()
    {
        if (b != null)
        {
            b.a();
        }
    }

    public final String a()
    {
        return h.i().toString();
    }

    public final void a(int i1, int j1)
    {
        i.d(String.format("%02d%s%02d", new Object[] {
            Integer.valueOf(i1), "/", Integer.valueOf(j1 % 100)
        }));
    }

    public final void a(gte gte1)
    {
        b = gte1;
    }

    public final void a(String s)
    {
        j.d(s);
    }

    public final String b()
    {
        return f.a();
    }

    public final void b(String s)
    {
        f.a(s);
    }

    public final String c()
    {
        String s;
        try
        {
            s = i.i().toString().substring(0, 2);
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

    public final String d()
    {
        String s;
        try
        {
            s = i.i().toString().substring(3);
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

    public final String e()
    {
        return j.i().toString();
    }

    public final String f()
    {
        return k.i().toString();
    }

    public final boolean g()
    {
        return a.b().isEmpty();
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

}
