// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.legacy;

import android.content.Context;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;
import esi;
import esj;
import hrf;

public final class CreditCardEditText extends EditText
    implements hrf
{

    private boolean a;
    private String b;
    private esi c;
    private String d;

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
            setHint(0x7f070541);
        }
    }

    public final boolean B_()
    {
        return a;
    }

    public final void a(esi esi1)
    {
        c = esi1;
    }

    public final boolean c()
    {
        String s = esj.a(b);
        String s1 = getText().toString().replaceAll("\\s", "");
        return !TextUtils.isEmpty(s) && s1.length() == esj.d(s) && B_();
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
        Object obj = d;
        charsequence = ((CharSequence) (obj));
        if (obj == null)
        {
            charsequence = esj.a(s);
        }
        b = esj.c(charsequence, s);
        a = esj.a(charsequence, b);
        obj = getContext();
        if (obj != null)
        {
            setCompoundDrawablesWithIntrinsicBounds(esj.a(((Context) (obj)), charsequence), null, null, null);
        }
        if (c != null)
        {
            c.a(this, a, charsequence);
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
