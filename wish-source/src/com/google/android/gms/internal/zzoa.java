// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zznr

final class zzoa
{

    final int tag;
    final byte zzaOf[];

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzoa))
            {
                return false;
            }
            obj = (zzoa)obj;
            if (tag != ((zzoa) (obj)).tag || !Arrays.equals(zzaOf, ((zzoa) (obj)).zzaOf))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(zzaOf);
    }

    void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzjz(tag);
        zznr1.zzz(zzaOf);
    }

    int zzc()
    {
        return 0 + zznr.zzjA(tag) + zzaOf.length;
    }
}
