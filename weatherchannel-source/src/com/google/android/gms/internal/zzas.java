// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzaq, zzrg

class zzas
    implements zzaq
{

    private zzrg zznC;
    private byte zznD[];
    private final int zznE;

    public zzas(int i)
    {
        zznE = i;
        reset();
    }

    public void reset()
    {
        zznD = new byte[zznE];
        zznC = zzrg.zzA(zznD);
    }

    public byte[] zzac()
        throws IOException
    {
        int i = zznC.zzBG();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return zznD;
        } else
        {
            byte abyte0[] = new byte[zznD.length - i];
            System.arraycopy(zznD, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void zzb(int i, long l)
        throws IOException
    {
        zznC.zzb(i, l);
    }

    public void zzb(int i, String s)
        throws IOException
    {
        zznC.zzb(i, s);
    }
}
