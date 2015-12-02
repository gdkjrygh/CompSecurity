// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.ui.EditText;
import dfp;
import dti;
import hrf;

public class YearEditText extends EditText
    implements hrf
{

    private boolean a;
    private String b;
    private dti c;

    public YearEditText(Context context)
    {
        this(context, null);
    }

    public YearEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public YearEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
        setInputType(2);
        setHint(context.getString(0x7f070338));
    }

    public final boolean B_()
    {
        return a;
    }

    public final void a(dti dti1)
    {
        c = dti1;
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
        boolean flag;
        if (Integer.parseInt(charsequence.toString()) > 0)
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
            c.b(a);
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
