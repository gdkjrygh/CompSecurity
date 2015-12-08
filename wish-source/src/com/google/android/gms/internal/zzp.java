// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzn, zznr

class zzp
    implements zzn
{

    private zznr zzlT;
    private byte zzlU[];
    private final int zzlV;

    public zzp(int i)
    {
        zzlV = i;
        reset();
    }

    public void reset()
    {
        zzlU = new byte[zzlV];
        zzlT = zznr.zzw(zzlU);
    }

    public byte[] zzD()
        throws IOException
    {
        int i = zzlT.zzzK();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return zzlU;
        } else
        {
            byte abyte0[] = new byte[zzlU.length - i];
            System.arraycopy(zzlU, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void zzb(int i, long l)
        throws IOException
    {
        zzlT.zzb(i, l);
    }

    public void zzb(int i, String s)
        throws IOException
    {
        zzlT.zzb(i, s);
    }
}
