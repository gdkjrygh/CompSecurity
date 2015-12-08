// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzv, zzs

static class zzg
{

    public String key;
    public long zzaB;
    public String zzb;
    public long zzc;
    public long zzd;
    public long zze;
    public long zzf;
    public Map zzg;

    public static zzg zzf(InputStream inputstream)
        throws IOException
    {
        zzg zzg1 = new <init>();
        if (zzv.zzb(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        zzg1.key = zzv.zzd(inputstream);
        zzg1.zzb = zzv.zzd(inputstream);
        if (zzg1.zzb.equals(""))
        {
            zzg1.zzb = null;
        }
        zzg1.zzc = zzv.zzc(inputstream);
        zzg1.zzd = zzv.zzc(inputstream);
        zzg1.zze = zzv.zzc(inputstream);
        zzg1.zzf = zzv.zzc(inputstream);
        zzg1.zzg = zzv.zze(inputstream);
        return zzg1;
    }

    public boolean zza(OutputStream outputstream)
    {
        zzv.zza(outputstream, 0x20150306);
        zzv.zza(outputstream, key);
        if (zzb != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        String s = "";
_L1:
        try
        {
            zzv.zza(outputstream, s);
            zzv.zza(outputstream, zzc);
            zzv.zza(outputstream, zzd);
            zzv.zza(outputstream, zze);
            zzv.zza(outputstream, zzf);
            zzv.zza(zzg, outputstream);
            outputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            zzs.zzb("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        return true;
        s = zzb;
          goto _L1
    }

    public zzb zzb(byte abyte0[])
    {
        zzb zzb1 = new <init>();
        zzb1.data = abyte0;
        zzb1.zzb = zzb;
        zzb1.zzc = zzc;
        zzb1.zzd = zzd;
        zzb1.zze = zze;
        zzb1.zzf = zzf;
        zzb1.zzg = zzg;
        return zzb1;
    }

    private ()
    {
    }

    public (String s,  )
    {
        key = s;
        zzaB = .data.length;
        zzb = .zzb;
        zzc = .zzc;
        zzd = .zzd;
        zze = .zze;
        zzf = .zzf;
        zzg = .zzg;
    }
}
