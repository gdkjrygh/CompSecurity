// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class zzID
{

    public final Object zzID;
    public final String zztP;

    public boolean equals(Object obj)
    {
        if (obj instanceof zzID)
        {
            if (zztP.equals(((zztP) (obj = (zztP)obj)).zztP) && zzID.equals(((zzID) (obj)).zzID))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(zztP.hashCode()), Integer.valueOf(zzID.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(zztP).append(" value: ").append(zzID.toString()).toString();
    }

    (String s, Object obj)
    {
        zztP = s;
        zzID = obj;
    }
}
