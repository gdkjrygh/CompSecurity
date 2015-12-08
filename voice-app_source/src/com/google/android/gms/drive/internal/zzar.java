// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzrg;
import com.google.android.gms.internal.zzrh;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;
import java.io.IOException;

public final class zzar extends zzrh
{

    public int versionCode;
    public long zzafV;
    public String zzafX;
    public long zzafY;
    public int zzafZ;

    public zzar()
    {
        zzpH();
    }

    public static zzar zzl(byte abyte0[])
        throws zzrm
    {
        return (zzar)zzrn.zza(new zzar(), abyte0);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzar))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzar)obj;
        flag = flag1;
        if (versionCode != ((zzar) (obj)).versionCode)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (zzafX != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((zzar) (obj)).zzafX != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (zzafY == ((zzar) (obj)).zzafY)
        {
            flag = flag1;
            if (zzafV == ((zzar) (obj)).zzafV)
            {
                flag = flag1;
                if (zzafZ == ((zzar) (obj)).zzafZ)
                {
                    return zza(((zzrh) (obj)));
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!zzafX.equals(((zzar) (obj)).zzafX))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = versionCode;
        int i;
        if (zzafX == null)
        {
            i = 0;
        } else
        {
            i = zzafX.hashCode();
        }
        return ((((i + (j + 527) * 31) * 31 + (int)(zzafY ^ zzafY >>> 32)) * 31 + (int)(zzafV ^ zzafV >>> 32)) * 31 + zzafZ) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = super.zzB() + zzrg.zzA(1, versionCode) + zzrg.zzk(2, zzafX) + zzrg.zze(3, zzafY) + zzrg.zze(4, zzafV);
        int i = j;
        if (zzafZ != -1)
        {
            i = j + zzrg.zzA(5, zzafZ);
        }
        return i;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        zzrg1.zzy(1, versionCode);
        zzrg1.zzb(2, zzafX);
        zzrg1.zzc(3, zzafY);
        zzrg1.zzc(4, zzafV);
        if (zzafZ != -1)
        {
            zzrg1.zzy(5, zzafZ);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzn(zzrf1);
    }

    public zzar zzn(zzrf zzrf1)
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

            case 18: // '\022'
                zzafX = zzrf1.readString();
                break;

            case 24: // '\030'
                zzafY = zzrf1.zzBx();
                break;

            case 32: // ' '
                zzafV = zzrf1.zzBx();
                break;

            case 40: // '('
                zzafZ = zzrf1.zzBu();
                break;
            }
        } while (true);
    }

    public zzar zzpH()
    {
        versionCode = 1;
        zzafX = "";
        zzafY = -1L;
        zzafV = -1L;
        zzafZ = -1;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }
}
