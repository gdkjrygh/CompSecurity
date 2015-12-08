// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzrg;
import com.google.android.gms.internal.zzrh;
import com.google.android.gms.internal.zzrn;
import java.io.IOException;

public final class zzas extends zzrh
{

    public long zzafV;
    public long zzafY;

    public zzas()
    {
        zzpI();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzas)
            {
                obj = (zzas)obj;
                flag = flag1;
                if (zzafY == ((zzas) (obj)).zzafY)
                {
                    flag = flag1;
                    if (zzafV == ((zzas) (obj)).zzafV)
                    {
                        return zza(((zzrh) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((int)(zzafY ^ zzafY >>> 32) + 527) * 31 + (int)(zzafV ^ zzafV >>> 32)) * 31 + zzBI();
    }

    protected int zzB()
    {
        return super.zzB() + zzrg.zze(1, zzafY) + zzrg.zze(2, zzafV);
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        zzrg1.zzc(1, zzafY);
        zzrg1.zzc(2, zzafV);
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzo(zzrf1);
    }

    public zzas zzo(zzrf zzrf1)
        throws IOException
    {
        do
        {
            int i = zzrf1.zzBr();
            switch (i)
            {
            default:
                if (zza(zzrf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                zzafY = zzrf1.zzBx();
                break;

            case 16: // '\020'
                zzafV = zzrf1.zzBx();
                break;
            }
        } while (true);
    }

    public zzas zzpI()
    {
        zzafY = -1L;
        zzafV = -1L;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }
}
