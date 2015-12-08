// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.text.InputFilter;
import android.text.Spanned;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            TransferRxPrescriptionInfoPresenter

private static class <init>
    implements InputFilter
{

    private boolean isAsciiDigit(char c)
    {
        return c >= '0' && c <= '9';
    }

    private boolean isAsciiLetter(char c)
    {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    private boolean isRxAllowedChar(char c)
    {
        return isAsciiLetter(c) || isAsciiDigit(c) || c == '-' || c == '.' || c == ':';
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        for (k = i; k < j; k++)
        {
            if (!isRxAllowedChar(charsequence.charAt(k)))
            {
                spanned = new StringBuilder(j - i);
                for (; i < j; i++)
                {
                    char c = charsequence.charAt(i);
                    if (isRxAllowedChar(c))
                    {
                        spanned.append(c);
                    }
                }

                return spanned.toString();
            }
        }

        return null;
    }

    private i()
    {
    }

    i(i i)
    {
        this();
    }
}
