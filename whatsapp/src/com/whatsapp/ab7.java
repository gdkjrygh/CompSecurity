// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.SpannableStringBuilder;

public final class ab7 extends SpannableStringBuilder
{

    public ab7(CharSequence charsequence)
    {
        super(charsequence);
    }

    public char charAt(int i)
    {
        while (i < 0 || i >= length()) 
        {
            return ' ';
        }
        return super.charAt(i);
    }

    public void getChars(int i, int j, char ac[], int k)
    {
        int l;
        if (j >= i)
        {
            if (i <= (l = length()) && j <= l && i >= 0 && j >= 0)
            {
                super.getChars(i, j, ac, k);
                return;
            }
        }
    }
}
