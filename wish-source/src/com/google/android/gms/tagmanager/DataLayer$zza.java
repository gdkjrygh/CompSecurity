// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class zzCM
{

    public final Object zzCM;
    public final String zzra;

    public boolean equals(Object obj)
    {
        if (obj instanceof zzCM)
        {
            if (zzra.equals(((zzra) (obj = (zzra)obj)).zzra) && zzCM.equals(((zzCM) (obj)).zzCM))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(zzra.hashCode()), Integer.valueOf(zzCM.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(zzra).append(" value: ").append(zzCM.toString()).toString();
    }

    (String s, Object obj)
    {
        zzra = s;
        zzCM = obj;
    }
}
