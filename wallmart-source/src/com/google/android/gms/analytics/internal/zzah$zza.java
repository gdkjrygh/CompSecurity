// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzah, zzr, zzaf, zzab

private class zzOu
{

    private int zzOt;
    private ByteArrayOutputStream zzOu;
    final zzah zzOv;

    public byte[] getPayload()
    {
        return zzOu.toByteArray();
    }

    public boolean zzj(zzab zzab)
    {
        zzx.zzv(zzab);
        if (zzOt + 1 > zzOv.zzif().zzjw())
        {
            return false;
        }
        String s = zzOv.zza(zzab, false);
        if (s == null)
        {
            zzOv.zzie().zza(zzab, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > zzOv.zzif().zzjo())
        {
            zzOv.zzie().zza(zzab, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (zzOu.size() > 0)
        {
            i = j + 1;
        }
        if (i + zzOu.size() > zzOv.zzif().zzjq())
        {
            return false;
        }
        try
        {
            if (zzOu.size() > 0)
            {
                zzOu.write(zzah.zzkw());
            }
            zzOu.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab)
        {
            zzOv.zze("Failed to write payload when batching hits", zzab);
            return true;
        }
        zzOt = zzOt + 1;
        return true;
    }

    public int zzkx()
    {
        return zzOt;
    }

    public (zzah zzah1)
    {
        zzOv = zzah1;
        super();
        zzOu = new ByteArrayOutputStream();
    }
}
