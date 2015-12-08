// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzj, zzr

public final class zzm extends InputStream
{

    private final InputStream zzaTX;
    private volatile zzj zzaTY;

    public zzm(InputStream inputstream)
    {
        zzaTX = (InputStream)zzu.zzu(inputstream);
    }

    private int zzjX(int i)
        throws ChannelIOException
    {
        if (i == -1)
        {
            zzj zzj1 = zzaTY;
            if (zzj1 != null)
            {
                throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzj1.zzaTN, zzj1.zzaTO);
            }
        }
        return i;
    }

    public int available()
        throws IOException
    {
        return zzaTX.available();
    }

    public void close()
        throws IOException
    {
        zzaTX.close();
    }

    public void mark(int i)
    {
        zzaTX.mark(i);
    }

    public boolean markSupported()
    {
        return zzaTX.markSupported();
    }

    public int read()
        throws IOException
    {
        return zzjX(zzaTX.read());
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return zzjX(zzaTX.read(abyte0));
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        return zzjX(zzaTX.read(abyte0, i, j));
    }

    public void reset()
        throws IOException
    {
        zzaTX.reset();
    }

    public long skip(long l)
        throws IOException
    {
        return zzaTX.skip(l);
    }

    zzr zzBb()
    {
        return new zzr() {

            final zzm zzaTZ;

            public void zzb(zzj zzj1)
            {
                zzaTZ.zza(zzj1);
            }

            
            {
                zzaTZ = zzm.this;
                super();
            }
        };
    }

    void zza(zzj zzj1)
    {
        zzaTY = (zzj)zzu.zzu(zzj1);
    }
}
