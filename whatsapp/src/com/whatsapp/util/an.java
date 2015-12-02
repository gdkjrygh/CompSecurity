// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.text.TextUtils;

public final class an
{

    public final CharSequence a;
    public final CharSequence b;

    public an(CharSequence charsequence, CharSequence charsequence1)
    {
        a = charsequence;
        b = charsequence1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (an)obj;
            if (!TextUtils.equals(a, ((an) (obj)).a) || !TextUtils.equals(b, ((an) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return (i + 0) * 31 + j;
    }
}
