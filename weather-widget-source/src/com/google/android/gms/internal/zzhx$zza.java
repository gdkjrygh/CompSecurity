// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx

public static class count
{

    public final int count;
    public final String name;
    public final double zzHZ;
    public final double zzIa;
    public final double zzIb;

    public boolean equals(Object obj)
    {
        if (obj instanceof count)
        {
            if (zzw.equal(name, ((name) (obj = (name)obj)).name) && zzHZ == ((zzHZ) (obj)).zzHZ && zzIa == ((zzIa) (obj)).zzIa && count == ((count) (obj)).count && Double.compare(zzIb, ((zzIb) (obj)).zzIb) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            name, Double.valueOf(zzHZ), Double.valueOf(zzIa), Double.valueOf(zzIb), Integer.valueOf(count)
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zg("name", name).zg("minBound", Double.valueOf(zzIa)).zg("maxBound", Double.valueOf(zzHZ)).zg("percent", Double.valueOf(zzIb)).zg("count", Integer.valueOf(count)).oString();
    }

    public w.zza(String s, double d, double d1, double d2, 
            int i)
    {
        name = s;
        zzIa = d;
        zzHZ = d1;
        zzIb = d2;
        count = i;
    }
}
