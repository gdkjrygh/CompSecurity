// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzrg;
import com.google.android.gms.internal.zzrh;
import com.google.android.gms.internal.zzrn;
import java.io.IOException;

public final class zzaq extends zzrh
{

    public int versionCode;
    public long zzafU;
    public long zzafV;
    public long zzafW;

    public zzaq()
    {
        zzpG();
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
            if (obj instanceof zzaq)
            {
                obj = (zzaq)obj;
                flag = flag1;
                if (versionCode == ((zzaq) (obj)).versionCode)
                {
                    flag = flag1;
                    if (zzafU == ((zzaq) (obj)).zzafU)
                    {
                        flag = flag1;
                        if (zzafV == ((zzaq) (obj)).zzafV)
                        {
                            flag = flag1;
                            if (zzafW == ((zzaq) (obj)).zzafW)
                            {
                                return zza(((zzrh) (obj)));
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((((versionCode + 527) * 31 + (int)(zzafU ^ zzafU >>> 32)) * 31 + (int)(zzafV ^ zzafV >>> 32)) * 31 + (int)(zzafW ^ zzafW >>> 32)) * 31 + zzBI();
    }

    protected int zzB()
    {
        return super.zzB() + zzrg.zzA(1, versionCode) + zzrg.zze(2, zzafU) + zzrg.zze(3, zzafV) + zzrg.zze(4, zzafW);
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        zzrg1.zzy(1, versionCode);
        zzrg1.zzc(2, zzafU);
        zzrg1.zzc(3, zzafV);
        zzrg1.zzc(4, zzafW);
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzm(zzrf1);
    }

    public zzaq zzm(zzrf zzrf1)
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
                versionCode = zzrf1.zzBu();
                break;

            case 16: // '\020'
                zzafU = zzrf1.zzBx();
                break;

            case 24: // '\030'
                zzafV = zzrf1.zzBx();
                break;

            case 32: // ' '
                zzafW = zzrf1.zzBx();
                break;
            }
        } while (true);
    }

    public zzaq zzpG()
    {
        versionCode = 1;
        zzafU = -1L;
        zzafV = -1L;
        zzafW = -1L;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }
}
