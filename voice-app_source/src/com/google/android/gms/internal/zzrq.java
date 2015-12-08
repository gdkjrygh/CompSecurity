// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrf

public final class zzrq
{

    public static final int zzaWh[] = new int[0];
    public static final long zzaWi[] = new long[0];
    public static final float zzaWj[] = new float[0];
    public static final double zzaWk[] = new double[0];
    public static final boolean zzaWl[] = new boolean[0];
    public static final String zzaWm[] = new String[0];
    public static final byte zzaWn[][] = new byte[0][];
    public static final byte zzaWo[] = new byte[0];

    static int zzD(int i, int j)
    {
        return i << 3 | j;
    }

    public static final int zzb(zzrf zzrf1, int i)
        throws IOException
    {
        int j = 1;
        int k = zzrf1.getPosition();
        zzrf1.zzkA(i);
        while (zzrf1.zzBr() == i) 
        {
            zzrf1.zzkA(i);
            j++;
        }
        zzrf1.zzkE(k);
        return j;
    }

    static int zzkU(int i)
    {
        return i & 7;
    }

    public static int zzkV(int i)
    {
        return i >>> 3;
    }

}
