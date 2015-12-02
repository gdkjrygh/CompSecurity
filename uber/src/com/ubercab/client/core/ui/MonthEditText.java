// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;
import dsp;
import hrf;

public class MonthEditText extends EditText
    implements hrf
{

    private boolean a;
    private String b;
    private dsp c;

    public MonthEditText(Context context)
    {
        this(context, null);
    }

    public MonthEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public MonthEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setInputType(2);
        setHint(context.getString(0x7f070336));
    }

    public final boolean B_()
    {
        return a;
    }

    public final void a(dsp dsp1)
    {
        c = dsp1;
    }

    public final boolean c()
    {
        return B_() && length() > 1;
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        String s;
        super.onTextChanged(charsequence, i, j, k);
        s = charsequence.toString();
        if (s.equals(b))
        {
            return;
        }
        if (s.length() > 2)
        {
            s = s.substring(0, 2);
        }
        k = Integer.parseInt(charsequence.toString());
        boolean flag;
        if (k > 0 && k <= 12)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            a = flag;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            a = false;
        }
        b = s;
        if (c != null)
        {
            c.a(a);
        }
        setText(s);
        if (j <= 0 || i > b.length())
        {
            i = b.length();
        }
        setSelection(i);
        return;
    }
}
