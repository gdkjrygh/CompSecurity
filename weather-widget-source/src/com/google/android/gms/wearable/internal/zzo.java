// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzl, zzt

public final class zzo extends InputStream
{

    private final InputStream zzaZY;
    private volatile zzl zzaZZ;

    public zzo(InputStream inputstream)
    {
        zzaZY = (InputStream)zzx.zzv(inputstream);
    }

    private int zzkF(int i)
        throws ChannelIOException
    {
        if (i == -1)
        {
            zzl zzl1 = zzaZZ;
            if (zzl1 != null)
            {
                throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzl1.zzaZP, zzl1.zzaZQ);
            }
        }
        return i;
    }

    public int available()
        throws IOException
    {
        return zzaZY.available();
    }

    public void close()
        throws IOException
    {
        zzaZY.close();
    }

    public void mark(int i)
    {
        zzaZY.mark(i);
    }

    public boolean markSupported()
    {
        return zzaZY.markSupported();
    }

    public int read()
        throws IOException
    {
        return zzkF(zzaZY.read());
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return zzkF(zzaZY.read(abyte0));
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        return zzkF(zzaZY.read(abyte0, i, j));
    }

    public void reset()
        throws IOException
    {
        zzaZY.reset();
    }

    public long skip(long l)
        throws IOException
    {
        return zzaZY.skip(l);
    }

    zzt zzCD()
    {
        return new zzt() {

            final zzo zzbaa;

            public void zzb(zzl zzl1)
            {
                zzbaa.zza(zzl1);
            }

            
            {
                zzbaa = zzo.this;
                super();
            }
        };
    }

    void zza(zzl zzl1)
    {
        zzaZZ = (zzl)zzx.zzv(zzl1);
    }
}
