// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr

public static final class zzp extends zzns
{

    private static volatile zzaOe zzhd[];
    public String name;
    public zzaOe zzhe;
    public zzaOe zzhf;

    public static zzp[] zzo()
    {
        if (zzhd == null)
        {
            synchronized (zznw.zzaOd)
            {
                if (zzhd == null)
                {
                    zzhd = new zzhd[0];
                }
            }
        }
        return zzhd;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        if (!(obj instanceof zzhd)) goto _L4; else goto _L3
_L3:
        obj = (zzhd)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zzhe != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((zzhe) (obj)).zzhe != null) goto _L4; else goto _L10
_L10:
        if (zzhf != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag = flag1;
        if (((zzhf) (obj)).zzhf != null) goto _L4; else goto _L11
_L11:
        return zza(((zzns) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!zzhe.equals(((equals) (obj)).zzhe))
        {
            return false;
        }
          goto _L10
        if (!zzhf.equals(((equals) (obj)).zzhf))
        {
            return false;
        }
          goto _L11
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (zzhe == null)
        {
            j = 0;
        } else
        {
            j = zzhe.hashCode();
        }
        if (zzhf != null)
        {
            k = zzhf.hashCode();
        }
        return ((j + (i + 527) * 31) * 31 + k) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!name.equals(""))
        {
            zznr1.zzb(1, name);
        }
        if (zzhe != null)
        {
            zznr1.zza(2, zzhe);
        }
        if (zzhf != null)
        {
            zznr1.zza(3, zzhf);
        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!name.equals(""))
        {
            i = j + zznr.zzj(1, name);
        }
        j = i;
        if (zzhe != null)
        {
            j = i + zznr.zzc(2, zzhe);
        }
        i = j;
        if (zzhf != null)
        {
            i = j + zznr.zzc(3, zzhf);
        }
        return i;
    }

    public zzhf zzp()
    {
        name = "";
        zzhe = null;
        zzhf = null;
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzp();
    }
}
