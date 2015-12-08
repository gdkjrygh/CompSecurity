// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznr

public static final class zzsu extends zzns
{

    public String zzUw;
    public boolean zzapf;
    public long zzapg;
    public double zzaph;
    public zzaOe zzapi;

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
        if (!(obj instanceof zzsu)) goto _L4; else goto _L3
_L3:
        obj = (zzsu)obj;
        flag = flag1;
        if (zzapf != ((zzapf) (obj)).zzapf) goto _L4; else goto _L5
_L5:
        if (zzUw != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzUw) (obj)).zzUw != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (zzapg != ((zzapg) (obj)).zzapg) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (Double.doubleToLongBits(zzaph) != Double.doubleToLongBits(((zzaph) (obj)).zzaph)) goto _L4; else goto _L10
_L10:
        if (zzapi != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = flag1;
        if (((zzapi) (obj)).zzapi != null) goto _L4; else goto _L11
_L11:
        return zza(((zzns) (obj)));
_L7:
        if (!zzUw.equals(((zzUw) (obj)).zzUw))
        {
            return false;
        }
          goto _L8
        if (!zzapi.equals(((equals) (obj)).zzapi))
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
        if (zzapf)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (zzUw == null)
        {
            i = 0;
        } else
        {
            i = zzUw.hashCode();
        }
        k = (int)(zzapg ^ zzapg >>> 32);
        l1 = Double.doubleToLongBits(zzaph);
        l = (int)(l1 ^ l1 >>> 32);
        if (zzapi != null)
        {
            j = zzapi.hashCode();
        }
        return ((((i + (c + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (zzapf)
        {
            zznr1.zzb(1, zzapf);
        }
        if (!zzUw.equals(""))
        {
            zznr1.zzb(2, zzUw);
        }
        if (zzapg != 0L)
        {
            zznr1.zzb(3, zzapg);
        }
        if (Double.doubleToLongBits(zzaph) != Double.doubleToLongBits(0.0D))
        {
            zznr1.zza(4, zzaph);
        }
        if (zzapi != null)
        {
            zznr1.zza(5, zzapi);
        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (zzapf)
        {
            i = j + zznr.zzc(1, zzapf);
        }
        j = i;
        if (!zzUw.equals(""))
        {
            j = i + zznr.zzj(2, zzUw);
        }
        i = j;
        if (zzapg != 0L)
        {
            i = j + zznr.zzd(3, zzapg);
        }
        j = i;
        if (Double.doubleToLongBits(zzaph) != Double.doubleToLongBits(0.0D))
        {
            j = i + zznr.zzb(4, zzaph);
        }
        i = j;
        if (zzapi != null)
        {
            i = j + zznr.zzc(5, zzapi);
        }
        return i;
    }

    public zzapi zzsu()
    {
        zzapf = false;
        zzUw = "";
        zzapg = 0L;
        zzaph = 0.0D;
        zzapi = null;
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzsu();
    }
}
