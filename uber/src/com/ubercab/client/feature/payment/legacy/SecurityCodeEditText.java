// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.legacy;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import esj;
import esv;
import hrf;

public class SecurityCodeEditText extends EditText
    implements hrf
{

    private String a;
    private boolean b;
    private String c;
    private esv d;

    public SecurityCodeEditText(Context context)
    {
        this(context, null);
    }

    public SecurityCodeEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public SecurityCodeEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final boolean B_()
    {
        return b;
    }

    public final void a(esv esv1)
    {
        d = esv1;
    }

    public final void a(String s)
    {
        c = s;
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(esj.b(s))
        });
    }

    public final boolean c()
    {
        int i = esj.b(c);
        return B_() && length() == i;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setInputType(2);
        if (!isInEditMode())
        {
            setHint(0x7f07058a);
        }
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag)
        {
            setText(null);
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        String s = charsequence.toString();
        if (s.equals(a))
        {
            return;
        }
        k = esj.b(c);
        charsequence = s;
        if (s.length() > k)
        {
            charsequence = s.substring(0, k);
        }
        b = esj.b(c, charsequence);
        a = charsequence;
        if (d != null)
        {
            d.d(b);
        }
        setText(charsequence);
        if (j <= 0 || i > a.length())
        {
            i = a.length();
        }
        setSelection(i);
    }
}
