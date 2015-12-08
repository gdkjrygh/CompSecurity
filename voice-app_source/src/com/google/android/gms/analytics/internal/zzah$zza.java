// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzah, zzr, zzaf, zzab

private class zzMu
{

    private int zzMt;
    private ByteArrayOutputStream zzMu;
    final zzah zzMv;

    public byte[] getPayload()
    {
        return zzMu.toByteArray();
    }

    public boolean zzj(zzab zzab)
    {
        zzu.zzu(zzab);
        if (zzMt + 1 > zzMv.zzhR().zzji())
        {
            return false;
        }
        String s = zzMv.zza(zzab, false);
        if (s == null)
        {
            zzMv.zzhQ().zza(zzab, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > zzMv.zzhR().zzja())
        {
            zzMv.zzhQ().zza(zzab, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (zzMu.size() > 0)
        {
            i = j + 1;
        }
        if (i + zzMu.size() > zzMv.zzhR().zzjc())
        {
            return false;
        }
        try
        {
            if (zzMu.size() > 0)
            {
                zzMu.write(zzah.zzki());
            }
            zzMu.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab)
        {
            zzMv.zze("Failed to write payload when batching hits", zzab);
            return true;
        }
        zzMt = zzMt + 1;
        return true;
    }

    public int zzkj()
    {
        return zzMt;
    }

    public (zzah zzah1)
    {
        zzMv = zzah1;
        super();
        zzMu = new ByteArrayOutputStream();
    }
}
