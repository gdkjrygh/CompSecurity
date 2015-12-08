// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr

public static final class zzh extends zzns
{

    public zzaOe zzgp[];
    public zzaOe zzgq[];
    public zzaOe zzgr[];

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
            if (obj instanceof zzh)
            {
                obj = (zzh)obj;
                flag = flag1;
                if (zznw.equals(zzgp, ((zzgp) (obj)).zzgp))
                {
                    flag = flag1;
                    if (zznw.equals(zzgq, ((zzgq) (obj)).zzgq))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgr, ((zzgr) (obj)).zzgr))
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zznw.hashCode(zzgp) + 527) * 31 + zznw.hashCode(zzgq)) * 31 + zznw.hashCode(zzgr)) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzgp != null && zzgp.length > 0)
        {
            for (int i = 0; i < zzgp.length; i++)
            {
                zzzM zzzm = zzgp[i];
                if (zzzm != null)
                {
                    zznr1.zza(1, zzzm);
                }
            }

        }
        if (zzgq != null && zzgq.length > 0)
        {
            for (int j = 0; j < zzgq.length; j++)
            {
                zzzM zzzm1 = zzgq[j];
                if (zzzm1 != null)
                {
                    zznr1.zza(2, zzzm1);
                }
            }

        }
        if (zzgr != null && zzgr.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzgr.length; k++)
            {
                zzzM zzzm2 = zzgr[k];
                if (zzzm2 != null)
                {
                    zznr1.zza(3, zzzm2);
                }
            }

        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int i = super.zzc();
        int j = i;
        if (zzgp != null)
        {
            j = i;
            if (zzgp.length > 0)
            {
                for (j = 0; j < zzgp.length;)
                {
                      = zzgp[j];
                    int i1 = i;
                    if ( != null)
                    {
                        i1 = i + zznr.zzc(1, );
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (zzgq != null)
        {
            i = j;
            if (zzgq.length > 0)
            {
                i = j;
                for (int k = 0; k < zzgq.length;)
                {
                     1 = zzgq[k];
                    int j1 = i;
                    if (1 != null)
                    {
                        j1 = i + zznr.zzc(2, 1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (zzgr != null)
        {
            k1 = i;
            if (zzgr.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= zzgr.length)
                    {
                        break;
                    }
                     2 = zzgr[l];
                    k1 = i;
                    if (2 != null)
                    {
                        k1 = i + zznr.zzc(3, 2);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public  zzh()
    {
        zzgp = zzr();
        zzgq = zzr();
        zzgr = zzf();
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzh();
    }
}
