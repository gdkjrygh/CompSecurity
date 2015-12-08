// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zznj, zzrg, zzrf, 
//            zzrn

public static final class zzua extends zzrh
{

    public String zzabE;
    public boolean zzawr;
    public long zzaws;
    public double zzawt;
    public zzaWf zzawu;

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
        if (!(obj instanceof zzua)) goto _L4; else goto _L3
_L3:
        obj = (zzua)obj;
        flag = flag1;
        if (zzawr != ((zzawr) (obj)).zzawr) goto _L4; else goto _L5
_L5:
        if (zzabE != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzabE) (obj)).zzabE != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (zzaws != ((zzaws) (obj)).zzaws) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (Double.doubleToLongBits(zzawt) != Double.doubleToLongBits(((zzawt) (obj)).zzawt)) goto _L4; else goto _L10
_L10:
        if (zzawu != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = flag1;
        if (((zzawu) (obj)).zzawu != null) goto _L4; else goto _L11
_L11:
        return zza(((zzrh) (obj)));
_L7:
        if (!zzabE.equals(((zzabE) (obj)).zzabE))
        {
            return false;
        }
          goto _L8
        if (!zzawu.equals(((equals) (obj)).zzawu))
        {
            return false;
        }
          goto _L11
    }

    public int hashCode()
    {
        int j = 0;
        char c;
        int i;
        int k;
        int l;
        long l1;
        if (zzawr)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (zzabE == null)
        {
            i = 0;
        } else
        {
            i = zzabE.hashCode();
        }
        k = (int)(zzaws ^ zzaws >>> 32);
        l1 = Double.doubleToLongBits(zzawt);
        l = (int)(l1 ^ l1 >>> 32);
        if (zzawu != null)
        {
            j = zzawu.hashCode();
        }
        return ((((i + (c + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (zzawr)
        {
            i = j + zzrg.zzc(1, zzawr);
        }
        j = i;
        if (!zzabE.equals(""))
        {
            j = i + zzrg.zzk(2, zzabE);
        }
        i = j;
        if (zzaws != 0L)
        {
            i = j + zzrg.zzd(3, zzaws);
        }
        j = i;
        if (Double.doubleToLongBits(zzawt) != Double.doubleToLongBits(0.0D))
        {
            j = i + zzrg.zzb(4, zzawt);
        }
        i = j;
        if (zzawu != null)
        {
            i = j + zzrg.zzc(5, zzawu);
        }
        return i;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzawr)
        {
            zzrg1.zzb(1, zzawr);
        }
        if (!zzabE.equals(""))
        {
            zzrg1.zzb(2, zzabE);
        }
        if (zzaws != 0L)
        {
            zzrg1.zzb(3, zzaws);
        }
        if (Double.doubleToLongBits(zzawt) != Double.doubleToLongBits(0.0D))
        {
            zzrg1.zza(4, zzawt);
        }
        if (zzawu != null)
        {
            zzrg1.zza(5, zzawu);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzt(zzrf1);
    }

    public zzt zzt(zzrf zzrf1)
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
                zzawr = zzrf1.zzBv();
                break;

            case 18: // '\022'
                zzabE = zzrf1.readString();
                break;

            case 24: // '\030'
                zzaws = zzrf1.zzBt();
                break;

            case 33: // '!'
                zzawt = zzrf1.readDouble();
                break;

            case 42: // '*'
                if (zzawu == null)
                {
                    zzawu = new <init>();
                }
                zzrf1.zza(zzawu);
                break;
            }
        } while (true);
    }

    public zzawu zzua()
    {
        zzawr = false;
        zzabE = "";
        zzaws = 0L;
        zzawt = 0.0D;
        zzawu = null;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public ()
    {
        zzua();
    }
}
