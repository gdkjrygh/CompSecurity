// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrq

final class zzrz
{

    final int tag;
    final byte zzbcm[];

    zzrz(int i, byte abyte0[])
    {
        tag = i;
        zzbcm = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzrz))
            {
                return false;
            }
            obj = (zzrz)obj;
            if (tag != ((zzrz) (obj)).tag || !Arrays.equals(zzbcm, ((zzrz) (obj)).zzbcm))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(zzbcm);
    }

    int zzB()
    {
        return 0 + zzrq.zzlx(tag) + zzbcm.length;
    }

    void zza(zzrq zzrq1)
        throws IOException
    {
        zzrq1.zzlw(tag);
        zzrq1.zzD(zzbcm);
    }
}
