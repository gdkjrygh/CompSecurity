// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.InputFilter;
import android.text.Spanned;

public final class aka
    implements InputFilter
{

    private final int a;

    public aka(int i)
    {
        a = i;
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        spanned = spanned.toString();
        int i1 = spanned.codePointCount(0, spanned.length());
        k = spanned.codePointCount(k, l);
        j = charsequence.toString().codePointCount(i, j);
        k += a - i1;
        if (k <= 0)
        {
            return "";
        }
        if (k >= j)
        {
            return null;
        }
        k += i;
        j = k;
        if (Character.isHighSurrogate(charsequence.charAt(k - 1)))
        {
            k--;
            j = k;
            if (k == i)
            {
                return "";
            }
        }
        return charsequence.subSequence(i, j);
    }
}
