// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.ui;

import android.content.Context;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;
import gsg;
import gtg;
import gti;
import hrf;

public final class CreditCardEditText extends EditText
    implements gtg, hrf
{

    private boolean a;
    private String b;
    private String c;

    public CreditCardEditText(Context context)
    {
        this(context, null);
    }

    public CreditCardEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public CreditCardEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setInputType(2);
        if (!isInEditMode())
        {
            setHint(gsg.ub__payment_credit_card_number);
        }
    }

    public final boolean B_()
    {
        return a;
    }

    public final String a()
    {
        return getText().toString();
    }

    public final void a(String s)
    {
        c = s;
    }

    public final boolean c()
    {
        String s = gti.a(b);
        String s1 = getText().toString().replaceAll("\\s", "");
        return !TextUtils.isEmpty(s) && s1.length() == gti.c(s) && B_();
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b = null;
        setText(getText());
    }

    protected final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        String s = charsequence.toString();
        if (s.equals(b))
        {
            return;
        }
        Object obj = c;
        charsequence = ((CharSequence) (obj));
        if (obj == null)
        {
            charsequence = gti.a(s);
        }
        b = gti.c(charsequence, s);
        a = gti.a(charsequence, b);
        obj = getContext();
        if (obj != null)
        {
            setCompoundDrawablesWithIntrinsicBounds(gti.a(((Context) (obj)), charsequence), null, null, null);
        }
        setText(b);
        if (j <= 0 || i > b.length())
        {
            i = b.length();
        }
        setSelection(i);
    }

    public final void setSelection(int i)
    {
        Selection.setSelection(getText(), i);
    }
}
