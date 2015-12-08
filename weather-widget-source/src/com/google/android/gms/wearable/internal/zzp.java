// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzl, zzt

public final class zzp extends OutputStream
{

    private volatile zzl zzaZZ;
    private final OutputStream zzbab;

    public zzp(OutputStream outputstream)
    {
        zzbab = (OutputStream)zzx.zzv(outputstream);
    }

    private IOException zza(IOException ioexception)
    {
        zzl zzl1 = zzaZZ;
        Object obj = ioexception;
        if (zzl1 != null)
        {
            if (Log.isLoggable("ChannelOutputStream", 2))
            {
                Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", ioexception);
            }
            obj = new ChannelIOException("Channel closed unexpectedly before stream was finished", zzl1.zzaZP, zzl1.zzaZQ);
        }
        return ((IOException) (obj));
    }

    public void close()
        throws IOException
    {
        try
        {
            zzbab.close();
            return;
        }
        catch (IOException ioexception)
        {
            throw zza(ioexception);
        }
    }

    public void flush()
        throws IOException
    {
        try
        {
            zzbab.flush();
            return;
        }
        catch (IOException ioexception)
        {
            throw zza(ioexception);
        }
    }

    public void write(int i)
        throws IOException
    {
        try
        {
            zzbab.write(i);
            return;
        }
        catch (IOException ioexception)
        {
            throw zza(ioexception);
        }
    }

    public void write(byte abyte0[])
        throws IOException
    {
        try
        {
            zzbab.write(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw zza(abyte0);
        }
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        try
        {
            zzbab.write(abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw zza(abyte0);
        }
    }

    zzt zzCD()
    {
        return new zzt() {

            final zzp zzbac;

            public void zzb(zzl zzl1)
            {
                zzbac.zzc(zzl1);
            }

            
            {
                zzbac = zzp.this;
                super();
            }
        };
    }

    void zzc(zzl zzl1)
    {
        zzaZZ = zzl1;
    }
}
