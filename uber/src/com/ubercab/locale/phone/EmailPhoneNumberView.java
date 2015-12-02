// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import bmr;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.locale.country.FloatingLabelCountryElement;
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import goh;
import goj;
import gok;
import gon;
import goq;
import gpa;
import gpb;
import gpc;
import gpd;
import gpe;
import gpf;
import gpg;
import gph;
import gpi;
import hrs;
import hse;
import hsf;
import java.util.Locale;

public class EmailPhoneNumberView extends LinearLayout
    implements goq, gpb, gpc, gpd, gpe, hse, hsf
{

    private final FloatingLabelCountryElement a;
    private int b;
    private int c;
    private int d;
    private gpa e;
    private AutoCompleteFloatingLabelEditText f;
    private gpi g;
    private String h;

    public EmailPhoneNumberView(Context context)
    {
        this(context, null);
        d = gpf.a;
    }

    public EmailPhoneNumberView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EmailPhoneNumberView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = gpg.a;
        setOrientation(0);
        inflate(context, gok.ub__locale_view_email_phone_number, this);
        a = (FloatingLabelCountryElement)findViewById(goj.ub__email_phone_number_flagbutton_country);
        f = (AutoCompleteFloatingLabelEditText)findViewById(goj.ub__email_phone_number_edittext);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        attributeset = context.obtainStyledAttributes(attributeset, gon.EmailPhoneNumberView);
        c(gpf.a()[attributeset.getInteger(gon.EmailPhoneNumberView_countryCodeAlignment, 0)]);
        b = gpg.a()[attributeset.getInteger(gon.EmailPhoneNumberView_inputMode, 0)];
        context = attributeset.getString(gon.EmailPhoneNumberView_floatingLabel);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        context = " ";
_L3:
        h = context;
        attributeset.recycle();
_L2:
        if (!isInEditMode())
        {
            a.setFocusable(false);
            a.d().a(this);
            e = new gpa(this);
            e.a(this);
            e.a(this);
            e.a(this);
            f.a(e);
            f.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final EmailPhoneNumberView a;

                public final void onFocusChange(View view, boolean flag)
                {
                    if (EmailPhoneNumberView.a(a) == gpf.a)
                    {
                        EmailPhoneNumberView.b(a).setActivated(flag);
                    }
                }

            
            {
                a = EmailPhoneNumberView.this;
                super();
            }
            });
            f.a(new android.widget.TextView.OnEditorActionListener() {

                final EmailPhoneNumberView a;

                public final boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
                {
                    return EmailPhoneNumberView.c(a) != null && EmailPhoneNumberView.c(a).a();
                }

            
            {
                a = EmailPhoneNumberView.this;
                super();
            }
            });
            c(Locale.getDefault().getCountry());
            b(b);
        }
        return;
        context = context.toString();
          goto _L3
        context;
        attributeset.recycle();
        throw context;
    }

    static int a(EmailPhoneNumberView emailphonenumberview)
    {
        return emailphonenumberview.d;
    }

    private void a(hrs hrs1)
    {
        f.a(hrs1);
    }

    static FloatingLabelCountryElement b(EmailPhoneNumberView emailphonenumberview)
    {
        return emailphonenumberview.a;
    }

    private void b(int j)
    {
        b = j;
        if (j == gpg.c)
        {
            f.c(3);
        }
        if (e != null)
        {
            e.a(j);
        }
    }

    static gpi c(EmailPhoneNumberView emailphonenumberview)
    {
        return emailphonenumberview.g;
    }

    private void c(int j)
    {
        boolean flag = false;
        if (j == d)
        {
            return;
        }
        d = j;
        removeView(a);
        int k = (int)getResources().getDimension(goh.ui__spacing_unit_2x);
        android.widget.LinearLayout.LayoutParams layoutparams;
        int l;
        if (j == gpf.b)
        {
            j = getChildCount();
            l = 0;
        } else
        {
            l = k;
            k = 0;
            j = ((flag) ? 1 : 0);
        }
        layoutparams = (android.widget.LinearLayout.LayoutParams)a.getLayoutParams();
        layoutparams.setMargins(k, layoutparams.topMargin, l, layoutparams.bottomMargin);
        a.setLayoutParams(layoutparams);
        addView(a, j);
    }

    private void c(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s.toUpperCase(Locale.US);
        }
        a.d().a(s1);
        e.b(s1);
    }

    private void d(int j)
    {
        if (j == c)
        {
            return;
        }
        if (j == gph.b)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        a.setVisibility(j);
        i();
    }

    private CountryButton g()
    {
        if (c == gph.b)
        {
            return a.d();
        } else
        {
            return null;
        }
    }

    private String h()
    {
        if (c != gph.b || e() == null)
        {
            return null;
        } else
        {
            return bmr.a(e());
        }
    }

    private void i()
    {
        if (d == gpf.a && c == gph.b)
        {
            f.c(" ");
            a.c(h);
            return;
        } else
        {
            f.c(h);
            a.c(" ");
            return;
        }
    }

    public final CharSequence a()
    {
        return f.a();
    }

    public final void a(int j)
    {
        d(j);
        c = j;
        i();
    }

    public final void a(ListAdapter listadapter)
    {
        f.a(listadapter);
    }

    public final volatile void a(Object obj)
    {
        a((hrs)obj);
    }

    public final void a(String s)
    {
        c(s);
    }

    public final Object b()
    {
        return a();
    }

    public final void b(String s)
    {
        c(s);
    }

    public final String c()
    {
        if (c == gph.b)
        {
            return a.d().a();
        } else
        {
            return null;
        }
    }

    public final int d()
    {
        return c;
    }

    public final String e()
    {
        if (TextUtils.isEmpty(f.i()) || c != gph.b)
        {
            return null;
        } else
        {
            return f.i().toString();
        }
    }

    public final String f()
    {
        if (c != gph.b || h() == null)
        {
            return null;
        }
        String s1 = g().b();
        StringBuilder stringbuilder = new StringBuilder();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return stringbuilder.append(s).append(h()).toString();
    }

    public boolean isEnabled()
    {
        return f.isEnabled();
    }

    public void setEnabled(boolean flag)
    {
        f.setEnabled(flag);
        a.setEnabled(flag);
    }
}
