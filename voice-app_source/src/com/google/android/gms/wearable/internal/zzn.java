// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzj, zzr

public final class zzn extends OutputStream
{

    private volatile zzj zzaTY;
    private final OutputStream zzaUa;

    public zzn(OutputStream outputstream)
    {
        zzaUa = (OutputStream)zzu.zzu(outputstream);
    }

    private IOException zza(IOException ioexception)
    {
        zzj zzj1 = zzaTY;
        Object obj = ioexception;
        if (zzj1 != null)
        {
            if (Log.isLoggable("ChannelOutputStream", 2))
            {
                Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", ioexception);
            }
            obj = new ChannelIOException("Channel closed unexpectedly before stream was finished", zzj1.zzaTN, zzj1.zzaTO);
        }
        return ((IOException) (obj));
    }

    public void close()
        throws IOException
    {
        try
        {
            zzaUa.close();
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
            zzaUa.flush();
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
            zzaUa.write(i);
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
            zzaUa.write(abyte0);
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
            zzaUa.write(abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw zza(abyte0);
        }
    }

    zzr zzBb()
    {
        return new zzr() {

            final zzn zzaUb;

            public void zzb(zzj zzj1)
            {
                zzaUb.zzc(zzj1);
            }

            
            {
                zzaUb = zzn.this;
                super();
            }
        };
    }

    void zzc(zzj zzj1)
    {
        zzaTY = zzj1;
    }
}
