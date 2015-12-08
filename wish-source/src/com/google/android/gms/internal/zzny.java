// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zznr, zznz

public abstract class zzny
{

    protected volatile int zzaOe;

    public zzny()
    {
        zzaOe = -1;
    }

    public static final void zza(zzny zzny1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = zznr.zzb(abyte0, i, j);
            zzny1.zza(((zznr) (abyte0)));
            abyte0.zzzL();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzny zzny1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", zzny1);
        }
    }

    public static final byte[] zzf(zzny zzny1)
    {
        byte abyte0[] = new byte[zzny1.zzzZ()];
        zza(zzny1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzO();
    }

    public String toString()
    {
        return zznz.zzg(this);
    }

    public void zza(zznr zznr1)
        throws IOException
    {
    }

    protected int zzc()
    {
        return 0;
    }

    public zzny zzzO()
        throws CloneNotSupportedException
    {
        return (zzny)super.clone();
    }

    public int zzzY()
    {
        if (zzaOe < 0)
        {
            zzzZ();
        }
        return zzaOe;
    }

    public int zzzZ()
    {
        int i = zzc();
        zzaOe = i;
        return i;
    }
}
