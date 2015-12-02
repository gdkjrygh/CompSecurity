// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.ui;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import goq;
import gsd;
import gse;
import gtw;

// Referenced classes of package com.ubercab.payment.internal.ui:
//            CreditCardEditText

public final class CreditCardFieldsView extends LinearLayout
    implements goq
{

    private final Button a;
    private final CountryButton b;
    private final FloatingLabelEditText c;
    private final CreditCardEditText d;
    private final FloatingLabelEditText e;
    private final FloatingLabelEditText f;
    private final FloatingLabelEditText g;

    public CreditCardFieldsView(Context context)
    {
        this(context, null);
    }

    public CreditCardFieldsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CreditCardFieldsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setOrientation(1);
        LayoutInflater.from(context).inflate(gse.ub__payment_fields_credit_card_add, this, true);
        a = (Button)findViewById(gsd.ub__payment_button_scan_card);
        b = (CountryButton)findViewById(gsd.ub__payment_button_country);
        c = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_cardcode);
        d = (CreditCardEditText)findViewById(gsd.ub__payment_floatinglabeledittext_cardnumber);
        e = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_expirationmonth);
        f = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_expirationyear);
        g = (FloatingLabelEditText)findViewById(gsd.ub__payment_floatinglabeledittext_zip);
        b.a(this);
        e().addOnLayoutChangeListener(new _cls1());
        b(b.a());
    }

    private void b(String s)
    {
        if (!TextUtils.isEmpty(s) && gtw.a(s))
        {
            g.setVisibility(0);
            s = gtw.b(s);
            if (s != null)
            {
                g.c(2);
                g.a(new InputFilter[] {
                    new android.text.InputFilter.LengthFilter(s.intValue())
                });
                return;
            } else
            {
                g.c(1);
                g.a(new InputFilter[0]);
                return;
            }
        } else
        {
            g.setVisibility(8);
            b.setTranslationY(0.0F);
            return;
        }
    }

    public final FloatingLabelEditText a()
    {
        return c;
    }

    public final void a(String s)
    {
        b(s);
    }

    public final CreditCardEditText b()
    {
        return d;
    }

    public final FloatingLabelEditText c()
    {
        return e;
    }

    public final FloatingLabelEditText d()
    {
        return f;
    }

    public final FloatingLabelEditText e()
    {
        return g;
    }

    public final CountryButton f()
    {
        return b;
    }

    public final Button g()
    {
        return a;
    }

    /* member class not found */
    class _cls1 {}

}
