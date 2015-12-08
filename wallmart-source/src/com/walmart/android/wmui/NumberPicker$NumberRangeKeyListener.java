// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.text.Spanned;
import android.text.method.NumberKeyListener;

// Referenced classes of package com.walmart.android.wmui:
//            NumberPicker

private class <init> extends NumberKeyListener
{

    final NumberPicker this$0;

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        CharSequence charsequence2 = super.filter(charsequence, i, j, spanned, k, l);
        CharSequence charsequence1 = charsequence2;
        if (charsequence2 == null)
        {
            charsequence1 = charsequence.subSequence(i, j);
        }
        charsequence = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(charsequence1).append(spanned.subSequence(l, spanned.length())).toString();
        if ("".equals(charsequence))
        {
            return charsequence;
        }
        if (NumberPicker.access$400(NumberPicker.this, charsequence) > mEnd)
        {
            return "";
        } else
        {
            return charsequence1;
        }
    }

    protected char[] getAcceptedChars()
    {
        return NumberPicker.access$1000();
    }

    public int getInputType()
    {
        return 2;
    }

    private ()
    {
        this$0 = NumberPicker.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
