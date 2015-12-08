// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class zzGK
{

    public final Object zzGK;
    public final String zztw;

    public boolean equals(Object obj)
    {
        if (obj instanceof zzGK)
        {
            if (zztw.equals(((zztw) (obj = (zztw)obj)).zztw) && zzGK.equals(((zzGK) (obj)).zzGK))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(zztw.hashCode()), Integer.valueOf(zzGK.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(zztw).append(" value: ").append(zzGK.toString()).toString();
    }

    (String s, Object obj)
    {
        zztw = s;
        zzGK = obj;
    }
}
