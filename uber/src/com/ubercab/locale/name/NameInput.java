// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.name;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ubercab.ui.FloatingLabelEditText;
import goj;
import gok;
import gom;
import gon;
import gou;
import gov;
import gow;
import gox;
import goy;
import hsa;
import hse;

public class NameInput extends LinearLayout
    implements hse
{

    private final hsa a;
    private FloatingLabelEditText b;
    private FloatingLabelEditText c;
    private gov d;
    private int e;

    public NameInput(Context context)
    {
        this(context, null);
    }

    public NameInput(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NameInput(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = goy.a;
        setOrientation(0);
        setVisibility(4);
        setFocusable(true);
        setFocusableInTouchMode(true);
        inflate(context, gok.ub__view_name_input, this);
        b = (FloatingLabelEditText)findViewById(goj.ub__name_input_first_field);
        c = (FloatingLabelEditText)findViewById(goj.ub__name_input_second_field);
        a = new hsa("");
        gox gox1 = new gox(this, (byte)0);
        b.a(gox1);
        c.a(gox1);
        if (e == goy.a)
        {
            c(goy.d);
        }
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        context = context.obtainStyledAttributes(attributeset, gon.NameInput);
        setEnabled(context.getBoolean(gon.NameInput_android_enabled, true));
        setFocusable(context.getBoolean(gon.NameInput_android_focusable, true));
        setFocusableInTouchMode(context.getBoolean(gon.NameInput_android_focusableInTouchMode, true));
        context.recycle();
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final NameInput a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (!a.isFocusable() || !a.isFocusableInTouchMode() || !flag)
                {
                    return;
                }
                if (NameInput.b(NameInput.a(a)) && NameInput.c(a).a(NameInput.b(a)) == null)
                {
                    NameInput.d(a).requestFocus();
                    return;
                } else
                {
                    NameInput.b(a).requestFocus();
                    return;
                }
            }

            
            {
                a = NameInput.this;
                super();
            }
        });
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public static int a(NameInput nameinput)
    {
        return nameinput.e;
    }

    public static void a(NameInput nameinput, int i)
    {
        nameinput.c(i);
    }

    public static FloatingLabelEditText b(NameInput nameinput)
    {
        return nameinput.b;
    }

    static boolean b(int i)
    {
        return d(i);
    }

    static hsa c(NameInput nameinput)
    {
        return nameinput.a;
    }

    private void c(int i)
    {
        if (e == i)
        {
            return;
        }
        if (d(i))
        {
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        if (d(i))
        {
            b.c(getResources().getString(gom.first_name));
        } else
        {
            b.c(getResources().getString(gom.full_name));
        }
        e = i;
    }

    public static FloatingLabelEditText d(NameInput nameinput)
    {
        return nameinput.c;
    }

    private static boolean d(int i)
    {
        return i != goy.b;
    }

    public static gov e(NameInput nameinput)
    {
        return nameinput.d;
    }

    public final void a(int i)
    {
        setVisibility(0);
        if (i == gow.b)
        {
            if (e == goy.c || e == goy.b)
            {
                return;
            } else
            {
                c(goy.b);
                return;
            }
        } else
        {
            c(goy.d);
            return;
        }
    }

    public void a(Pair pair)
    {
        if (pair == null)
        {
            b.a(null);
            c.a(null);
            return;
        }
        if (d(e))
        {
            b.a((CharSequence)pair.first);
            c.a((CharSequence)pair.second);
            return;
        }
        FloatingLabelEditText floatinglabeledittext = b;
        if (!TextUtils.isEmpty((CharSequence)pair.first))
        {
            pair = (CharSequence)pair.first;
        } else
        {
            pair = (CharSequence)pair.second;
        }
        floatinglabeledittext.a(pair);
    }

    public final void a(gov gov)
    {
        d = gov;
    }

    public final void a(CharSequence charsequence)
    {
        b.d(charsequence);
    }

    public volatile void a(Object obj)
    {
        a((Pair)obj);
    }

    public final void b(CharSequence charsequence)
    {
        c.d(charsequence);
        if (e == goy.b)
        {
            c(goy.c);
        }
    }

    public final String c()
    {
        CharSequence charsequence = b.i();
        if (TextUtils.isEmpty(charsequence))
        {
            return "";
        }
        if (e == goy.b)
        {
            return (new gou(charsequence.toString())).a();
        } else
        {
            return charsequence.toString();
        }
    }

    public final String d()
    {
        if (e == goy.b)
        {
            CharSequence charsequence = b.i();
            if (charsequence == null)
            {
                return "";
            } else
            {
                return (new gou(charsequence.toString())).b();
            }
        }
        CharSequence charsequence1 = c.i();
        if (TextUtils.isEmpty(charsequence1))
        {
            return "";
        } else
        {
            return charsequence1.toString();
        }
    }

    public void setEnabled(boolean flag)
    {
        setFocusable(flag);
        setFocusableInTouchMode(flag);
        b.setEnabled(flag);
        c.setEnabled(flag);
        if (!flag)
        {
            b.clearFocus();
            c.clearFocus();
        }
    }
}
