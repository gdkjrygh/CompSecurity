// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

public final class g1
    implements CharSequence, GetChars, Spannable
{

    private SpannableString a;

    public g1(CharSequence charsequence)
    {
        a = new SpannableString(charsequence);
    }

    public char charAt(int i)
    {
        while (i < 0 || i >= length()) 
        {
            return ' ';
        }
        return a.charAt(i);
    }

    public void getChars(int i, int j, char ac[], int k)
    {
        int l;
        if (j >= i)
        {
            if (i <= (l = length()) && j <= l && i >= 0 && j >= 0)
            {
                a.getChars(i, j, ac, k);
                return;
            }
        }
    }

    public int getSpanEnd(Object obj)
    {
        return a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj)
    {
        return a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj)
    {
        return a.getSpanStart(obj);
    }

    public Object[] getSpans(int i, int j, Class class1)
    {
        return a.getSpans(i, j, class1);
    }

    public int length()
    {
        return a.length();
    }

    public int nextSpanTransition(int i, int j, Class class1)
    {
        return a.nextSpanTransition(i, j, class1);
    }

    public void removeSpan(Object obj)
    {
        a.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int j, int k)
    {
        a.setSpan(obj, i, j, k);
    }

    public CharSequence subSequence(int i, int j)
    {
        return a.subSequence(i, j);
    }

    public final String toString()
    {
        return a.toString();
    }
}
