// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrw, zzrq, zzrp, zzry

public abstract class zzrx
{

    protected volatile int zzbcl;

    public zzrx()
    {
        zzbcl = -1;
    }

    public static final zzrx zza(zzrx zzrx1, byte abyte0[])
        throws zzrw
    {
        return zzb(zzrx1, abyte0, 0, abyte0.length);
    }

    public static final void zza(zzrx zzrx1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = zzrq.zzb(abyte0, i, j);
            zzrx1.zza(((zzrq) (abyte0)));
            abyte0.zzDj();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzrx zzrx1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", zzrx1);
        }
    }

    public static final zzrx zzb(zzrx zzrx1, byte abyte0[], int i, int j)
        throws zzrw
    {
        try
        {
            abyte0 = zzrp.zza(abyte0, i, j);
            zzrx1.zzb(((zzrp) (abyte0)));
            abyte0.zzli(0);
        }
        // Misplaced declaration of an exception variable
        catch (zzrx zzrx1)
        {
            throw zzrx1;
        }
        // Misplaced declaration of an exception variable
        catch (zzrx zzrx1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return zzrx1;
    }

    public static final byte[] zzf(zzrx zzrx1)
    {
        byte abyte0[] = new byte[zzrx1.zzDx()];
        zza(zzrx1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzDm();
    }

    public String toString()
    {
        return zzry.zzg(this);
    }

    protected int zzB()
    {
        return 0;
    }

    public zzrx zzDm()
        throws CloneNotSupportedException
    {
        return (zzrx)super.clone();
    }

    public int zzDw()
    {
        if (zzbcl < 0)
        {
            zzDx();
        }
        return zzbcl;
    }

    public int zzDx()
    {
        int i = zzB();
        zzbcl = i;
        return i;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
    }

    public abstract zzrx zzb(zzrp zzrp1)
        throws IOException;
}
