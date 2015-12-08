// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzag, zzq, zzae, zzaa

private class zzIy
{

    private int zzIx;
    private ByteArrayOutputStream zzIy;
    final zzag zzIz;

    public byte[] getPayload()
    {
        return zzIy.toByteArray();
    }

    public boolean zzj(zzaa zzaa)
    {
        zzv.zzr(zzaa);
        if (zzIx + 1 > zzIz.zzgI().zzia())
        {
            return false;
        }
        String s = zzIz.zza(zzaa, false);
        if (s == null)
        {
            zzIz.zzgH().zza(zzaa, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > zzIz.zzgI().zzhS())
        {
            zzIz.zzgH().zza(zzaa, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (zzIy.size() > 0)
        {
            i = j + 1;
        }
        if (i + zzIy.size() > zzIz.zzgI().zzhU())
        {
            return false;
        }
        try
        {
            if (zzIy.size() > 0)
            {
                zzIy.write(zzag.zzja());
            }
            zzIy.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa)
        {
            zzIz.zze("Failed to write payload when batching hits", zzaa);
            return true;
        }
        zzIx = zzIx + 1;
        return true;
    }

    public int zzjb()
    {
        return zzIx;
    }

    public (zzag zzag1)
    {
        zzIz = zzag1;
        super();
        zzIy = new ByteArrayOutputStream();
    }
}
