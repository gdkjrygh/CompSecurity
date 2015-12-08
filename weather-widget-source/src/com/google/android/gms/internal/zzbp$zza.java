// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzbp

public static class zzsm
{

    final long value;
    final String zzsm;

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof zzsm) || ((zzsm)obj).value != value) 
        {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        return (int)value;
    }

    (long l, String s)
    {
        value = l;
        zzsm = s;
    }
}
