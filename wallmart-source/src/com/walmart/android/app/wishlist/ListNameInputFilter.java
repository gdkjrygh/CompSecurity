// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

class ListNameInputFilter
    implements InputFilter
{

    ListNameInputFilter()
    {
    }

    private boolean isCharAllowed(char c)
    {
        return Character.isLetterOrDigit(c) || Character.isSpaceChar(c) || isPunctuation(c);
    }

    private boolean isPunctuation(char c)
    {
        return c == '.' || c == ',' || c == '-' || c == '\'' || c == '!';
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        l = 0;
        spanned = new StringBuilder(j - i);
        k = i;
        while (k < j) 
        {
            char c = charsequence.charAt(k);
            if (isCharAllowed(c))
            {
                spanned.append(c);
            } else
            {
                l = 1;
            }
            k++;
        }
        if (l != 0)
        {
            if (charsequence instanceof Spanned)
            {
                SpannableString spannablestring = new SpannableString(spanned);
                TextUtils.copySpansFrom((Spanned)charsequence, i, spanned.length(), null, spannablestring, 0);
                return spannablestring;
            } else
            {
                return spanned;
            }
        } else
        {
            return null;
        }
    }
}
