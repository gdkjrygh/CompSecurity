// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrm, zzrg, zzrf, zzro

public abstract class zzrn
{

    protected volatile int zzaWf;

    public zzrn()
    {
        zzaWf = -1;
    }

    public static final zzrn zza(zzrn zzrn1, byte abyte0[])
        throws zzrm
    {
        return zzb(zzrn1, abyte0, 0, abyte0.length);
    }

    public static final void zza(zzrn zzrn1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = zzrg.zzb(abyte0, i, j);
            zzrn1.zza(((zzrg) (abyte0)));
            abyte0.zzBH();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", zzrn1);
        }
    }

    public static final zzrn zzb(zzrn zzrn1, byte abyte0[], int i, int j)
        throws zzrm
    {
        try
        {
            abyte0 = zzrf.zza(abyte0, i, j);
            zzrn1.zzb(((zzrf) (abyte0)));
            abyte0.zzkz(0);
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            throw zzrn1;
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return zzrn1;
    }

    public static final byte[] zzf(zzrn zzrn1)
    {
        byte abyte0[] = new byte[zzrn1.zzBV()];
        zza(zzrn1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzBK();
    }

    public String toString()
    {
        return zzro.zzg(this);
    }

    protected int zzB()
    {
        return 0;
    }

    public zzrn zzBK()
        throws CloneNotSupportedException
    {
        return (zzrn)super.clone();
    }

    public int zzBU()
    {
        if (zzaWf < 0)
        {
            zzBV();
        }
        return zzaWf;
    }

    public int zzBV()
    {
        int i = zzB();
        zzaWf = i;
        return i;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
    }

    public abstract zzrn zzb(zzrf zzrf1)
        throws IOException;
}
