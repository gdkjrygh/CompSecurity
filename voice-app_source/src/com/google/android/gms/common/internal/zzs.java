// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzs
{

    private final String separator;

    private zzs(String s)
    {
        separator = s;
    }

    public static zzs zzci(String s)
    {
        return new zzs(s);
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
            stringbuilder.append(zzs(iterable.next()));
            for (; iterable.hasNext(); stringbuilder.append(zzs(iterable.next())))
            {
                stringbuilder.append(separator);
            }

        }
        return stringbuilder;
    }

    CharSequence zzs(Object obj)
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
