// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zzob

public static final class zze extends zzns
{

    private static volatile zzaOe zzge[];
    public int name;
    public int zzgf[];
    public int zzgg;
    public boolean zzgh;
    public boolean zzgi;

    public static zze[] zzd()
    {
        if (zzge == null)
        {
            synchronized (zznw.zzaOd)
            {
                if (zzge == null)
                {
                    zzge = new zzge[0];
                }
            }
        }
        return zzge;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            if (obj instanceof zzge)
            {
                obj = (zzge)obj;
                flag = flag1;
                if (zznw.equals(zzgf, ((zzgf) (obj)).zzgf))
                {
                    flag = flag1;
                    if (zzgg == ((zzgg) (obj)).zzgg)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (zzgh == ((zzgh) (obj)).zzgh)
                            {
                                flag = flag1;
                                if (zzgi == ((zzgi) (obj)).zzgi)
                                {
                                    return zza(((zzns) (obj)));
                                }
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
        char c1 = '\u04CF';
        int i = zznw.hashCode(zzgf);
        int j = zzgg;
        int k = name;
        char c;
        if (zzgh)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!zzgi)
        {
            c1 = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (zzgi)
        {
            zznr1.zzb(1, zzgi);
        }
        zznr1.zzx(2, zzgg);
        if (zzgf != null && zzgf.length > 0)
        {
            for (int i = 0; i < zzgf.length; i++)
            {
                zznr1.zzx(3, zzgf[i]);
            }

        }
        if (name != 0)
        {
            zznr1.zzx(4, name);
        }
        if (zzgh)
        {
            zznr1.zzb(6, zzgh);
        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        int j = 0;
        int k = super.zzc();
        int i = k;
        if (zzgi)
        {
            i = k + zznr.zzc(1, zzgi);
        }
        k = zznr.zzz(2, zzgg) + i;
        if (zzgf != null && zzgf.length > 0)
        {
            for (i = 0; i < zzgf.length; i++)
            {
                j += zznr.zzjv(zzgf[i]);
            }

            j = k + j + zzgf.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + zznr.zzz(4, name);
        }
        j = i;
        if (zzgh)
        {
            j = i + zznr.zzc(6, zzgh);
        }
        return j;
    }

    public zzgh zze()
    {
        zzgf = zzob.zzaOg;
        zzgg = 0;
        name = 0;
        zzgh = false;
        zzgi = false;
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zze();
    }
}
