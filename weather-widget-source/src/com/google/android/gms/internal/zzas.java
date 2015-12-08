// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzaq, zzrq

class zzas
    implements zzaq
{

    private zzrq zznF;
    private byte zznG[];
    private final int zznH;

    public zzas(int i)
    {
        zznH = i;
        reset();
    }

    public void reset()
    {
        zznG = new byte[zznH];
        zznF = zzrq.zzA(zznG);
    }

    public byte[] zzac()
        throws IOException
    {
        int i = zznF.zzDi();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return zznG;
        } else
        {
            byte abyte0[] = new byte[zznG.length - i];
            System.arraycopy(zznG, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void zzb(int i, long l)
        throws IOException
    {
        zznF.zzb(i, l);
    }

    public void zzb(int i, String s)
        throws IOException
    {
        zznF.zzb(i, s);
    }
}
