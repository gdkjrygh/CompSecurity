// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrp

public final class zzsa
{

    public static final int zzbcn[] = new int[0];
    public static final long zzbco[] = new long[0];
    public static final float zzbcp[] = new float[0];
    public static final double zzbcq[] = new double[0];
    public static final boolean zzbcr[] = new boolean[0];
    public static final String zzbcs[] = new String[0];
    public static final byte zzbct[][] = new byte[0][];
    public static final byte zzbcu[] = new byte[0];

    static int zzE(int i, int j)
    {
        return i << 3 | j;
    }

    public static final int zzb(zzrp zzrp1, int i)
        throws IOException
    {
        int j = 1;
        int k = zzrp1.getPosition();
        zzrp1.zzlj(i);
        while (zzrp1.zzCT() == i) 
        {
            zzrp1.zzlj(i);
            j++;
        }
        zzrp1.zzln(k);
        return j;
    }

    static int zzlD(int i)
    {
        return i & 7;
    }

    public static int zzlE(int i)
    {
        return i >>> 3;
    }

}
