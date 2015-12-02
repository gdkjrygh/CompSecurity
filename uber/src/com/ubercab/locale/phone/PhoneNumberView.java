// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bmr;
import bms;
import bmt;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.locale.country.FloatingLabelCountryElement;
import com.ubercab.ui.FloatingLabelEditText;
import goj;
import gok;
import gon;
import goq;
import gpj;
import gpk;
import gpm;
import hpb;
import hrs;
import hse;
import hsf;
import java.util.Locale;

public class PhoneNumberView extends LinearLayout
    implements goq, gpk, hse, hsf
{

    private FloatingLabelCountryElement a;
    private FloatingLabelEditText b;
    private gpm c;
    private gpj d;
    private boolean e;

    public PhoneNumberView(Context context)
    {
        this(context, null);
    }

    public PhoneNumberView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PhoneNumberView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setOrientation(0);
        inflate(context, gok.ub__locale_view_phone_number, this);
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        context = context.obtainStyledAttributes(attributeset, gon.PhoneNumberView);
        e = context.getBoolean(gon.PhoneNumberView_exampleNumberAsHint, true);
        context.recycle();
        if (!isInEditMode())
        {
            d = new gpj();
            d.a(this);
            a = (FloatingLabelCountryElement)findViewById(goj.ub__phone_number_flagbutton_country);
            b = (FloatingLabelEditText)findViewById(goj.ub__phone_number_edittext_phone);
            b.a(new android.widget.TextView.OnEditorActionListener() {

                final PhoneNumberView a;

                public final boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
                {
                    return PhoneNumberView.a(a) != null && PhoneNumberView.a(a).a(k);
                }

            
            {
                a = PhoneNumberView.this;
                super();
            }
            });
            b.a(new hpb() {

                final PhoneNumberView a;

                public final void onTextChanged(CharSequence charsequence, int k, int l, int i1)
                {
                    if (PhoneNumberView.a(a) != null)
                    {
                        PhoneNumberView.a(a).a(charsequence.subSequence(k, k + i1).toString());
                    }
                }

            
            {
                a = PhoneNumberView.this;
                super();
            }
            });
            b.a(d);
            b.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final PhoneNumberView a;

                public final void onFocusChange(View view, boolean flag)
                {
                    PhoneNumberView.b(a).setActivated(flag);
                    if (PhoneNumberView.a(a) != null)
                    {
                        PhoneNumberView.a(a).a(flag);
                    }
                }

            
            {
                a = PhoneNumberView.this;
                super();
            }
            });
            a.setFocusable(false);
            a.d().a(this);
            c(Locale.getDefault().getCountry());
        }
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    static gpm a(PhoneNumberView phonenumberview)
    {
        return phonenumberview.c;
    }

    static FloatingLabelCountryElement b(PhoneNumberView phonenumberview)
    {
        return phonenumberview.a;
    }

    private void c(String s)
    {
label0:
        {
            Object obj = s;
            if (s != null)
            {
                obj = s.toUpperCase(Locale.US);
            }
            a.d().a(((String) (obj)));
            d.a(((String) (obj)));
            if (c != null)
            {
                c.g_();
            }
            if (e)
            {
                s = bmr.a();
                obj = s.a(((String) (obj)), bmt.b);
                if (obj == null)
                {
                    break label0;
                }
                b.e(s.a(((bnb) (obj)), bms.c));
            }
            return;
        }
        b.e(null);
    }

    public final CharSequence a()
    {
        return g();
    }

    public final void a(gpm gpm1)
    {
        c = gpm1;
    }

    public final void a(hrs hrs1)
    {
        b.a(hrs1);
    }

    public final void a(CharSequence charsequence)
    {
        b.b(charsequence);
    }

    public final volatile void a(Object obj)
    {
        a((hrs)obj);
    }

    public final void a(String s)
    {
        c(s);
    }

    public final void a(String s, String s1)
    {
        a(s, s1, false);
    }

    public final void a(String s, String s1, boolean flag)
    {
        if (TextUtils.isEmpty(s1))
        {
            s1 = Locale.getDefault().getCountry();
        }
        c(s1);
        b.d(s);
        b.setSelected(flag);
    }

    public final Object b()
    {
        return a();
    }

    public final void b(String s)
    {
        a.c(s);
    }

    public final void b_(String s)
    {
        c(s);
    }

    public final CountryButton c()
    {
        return a.d();
    }

    public final String d()
    {
        return a.d().a();
    }

    public final CharSequence e()
    {
        return b.h();
    }

    public final CharSequence f()
    {
        return b.g();
    }

    public final String g()
    {
        if (b.i() == null)
        {
            return null;
        } else
        {
            return b.i().toString();
        }
    }

    public final String h()
    {
        if (g() == null)
        {
            return null;
        } else
        {
            return bmr.a(g());
        }
    }

    public final String i()
    {
        if (h() == null)
        {
            return null;
        }
        String s1 = c().b();
        StringBuilder stringbuilder = new StringBuilder();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return stringbuilder.append(s).append(h()).toString();
    }

    public void setEnabled(boolean flag)
    {
        b.setEnabled(flag);
        a.setEnabled(flag);
    }
}
