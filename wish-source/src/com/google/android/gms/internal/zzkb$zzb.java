// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznw, zznr

public static final class zzss extends zzns
{

    private static volatile zzaOe zzapc[];
    public String name;
    public zzaOe zzapd;

    public static zzss[] zzsr()
    {
        if (zzapc == null)
        {
            synchronized (zznw.zzaOd)
            {
                if (zzapc == null)
                {
                    zzapc = new zzapc[0];
                }
            }
        }
        return zzapc;
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
        if (!(obj instanceof zzapc)) goto _L4; else goto _L3
_L3:
        obj = (zzapc)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zzapd != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((zzapd) (obj)).zzapd != null) goto _L4; else goto _L8
_L8:
        return zza(((zzns) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
        if (!zzapd.equals(((equals) (obj)).zzapd))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (zzapd != null)
        {
            j = zzapd.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!name.equals(""))
        {
            zznr1.zzb(1, name);
        }
        if (zzapd != null)
        {
            zznr1.zza(2, zzapd);
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
        if (zzapd != null)
        {
            j = i + zznr.zzc(2, zzapd);
        }
        return j;
    }

    public zzapd zzss()
    {
        name = "";
        zzapd = null;
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzss();
    }
}
