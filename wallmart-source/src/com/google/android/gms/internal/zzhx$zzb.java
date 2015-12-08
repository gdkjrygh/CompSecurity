// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx

public static class 
{

    private final List zzIc = new ArrayList();
    private final List zzId = new ArrayList();
    private final List zzIe = new ArrayList();

    static List zza( )
    {
        return .zzId;
    }

    static List zzb(zzId zzid)
    {
        return zzid.zzIc;
    }

    static List zzc(zzIc zzic)
    {
        return zzic.zzIe;
    }

    public zzIe zza(String s, double d, double d1)
    {
        int i = 0;
        do
        {
            double d2;
            double d3;
            if (i < zzIc.size())
            {
                d2 = ((Double)zzIe.get(i)).doubleValue();
                d3 = ((Double)zzId.get(i)).doubleValue();
                break MISSING_BLOCK_LABEL_55;
            }
            do
            {
                zzIc.add(i, s);
                zzIe.add(i, Double.valueOf(d));
                zzId.add(i, Double.valueOf(d1));
                return this;
            } while (d < d2 || d2 == d && d1 < d3);
            i++;
        } while (true);
    }

    public zzhx zzgz()
    {
        return new zzhx(this, null);
    }

    public ()
    {
    }
}
