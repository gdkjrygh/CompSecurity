// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzv
{

    private final String separator;

    private zzv(String s)
    {
        separator = s;
    }

    public static zzv zzcr(String s)
    {
        return new zzv(s);
    }

    public final String zza(Iterable iterable)
    {
        return zza(new StringBuilder(), iterable).toString();
    }

    public final StringBuilder zza(StringBuilder stringbuilder, Iterable iterable)
    {
        iterable = iterable.iterator();
        if (iterable.hasNext())
        {
            stringbuilder.append(zzt(iterable.next()));
            for (; iterable.hasNext(); stringbuilder.append(zzt(iterable.next())))
            {
                stringbuilder.append(separator);
            }

        }
        return stringbuilder;
    }

    CharSequence zzt(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }
}
