// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.InputFilter;
import android.text.Spanned;

public final class etr
    implements InputFilter
{

    private final int a = 10000;
    private final int b = 0;

    public etr()
    {
    }

    private static boolean a(int i, int j, int k)
    {
        return k >= i && k <= j;
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        i = dug.a((new StringBuilder()).append(spanned.toString()).append(charsequence.toString()).toString(), 0);
        if (a(b, a, i))
        {
            return null;
        } else
        {
            return "";
        }
    }
}
