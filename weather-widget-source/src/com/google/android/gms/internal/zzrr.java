// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrx, zzrt, zzru, zzrv, 
//            zzrs, zzsa, zzrp, zzrz, 
//            zzrq

public abstract class zzrr extends zzrx
{

    protected zzrt zzbca;

    public zzrr()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzDl();
    }

    protected int zzB()
    {
        int j = 0;
        int k;
        if (zzbca != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= zzbca.size())
                {
                    break;
                }
                i += zzbca.zzlB(j).zzB();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int zzDk()
    {
        if (zzbca == null || zzbca.isEmpty())
        {
            return 0;
        } else
        {
            return zzbca.hashCode();
        }
    }

    public zzrr zzDl()
        throws CloneNotSupportedException
    {
        zzrr zzrr1 = (zzrr)super.zzDm();
        zzrv.zza(this, zzrr1);
        return zzrr1;
    }

    public zzrx zzDm()
        throws CloneNotSupportedException
    {
        return zzDl();
    }

    public final Object zza(zzrs zzrs1)
    {
        zzru zzru1;
        if (zzbca != null)
        {
            if ((zzru1 = zzbca.zzlA(zzsa.zzlE(zzrs1.tag))) != null)
            {
                return zzru1.zzb(zzrs1);
            }
        }
        return null;
    }

    public void zza(zzrq zzrq)
        throws IOException
    {
        if (zzbca != null)
        {
            int i = 0;
            while (i < zzbca.size()) 
            {
                zzbca.zzlB(i).zza(zzrq);
                i++;
            }
        }
    }

    protected final boolean zza(zzrp zzrp1, int i)
        throws IOException
    {
        int j = zzrp1.getPosition();
        if (!zzrp1.zzlj(i))
        {
            return false;
        }
        int k = zzsa.zzlE(i);
        zzrz zzrz1 = new zzrz(i, zzrp1.zzy(j, zzrp1.getPosition() - j));
        zzrp1 = null;
        Object obj;
        if (zzbca == null)
        {
            zzbca = new zzrt();
        } else
        {
            zzrp1 = zzbca.zzlA(k);
        }
        obj = zzrp1;
        if (zzrp1 == null)
        {
            obj = new zzru();
            zzbca.zza(k, ((zzru) (obj)));
        }
        ((zzru) (obj)).zza(zzrz1);
        return true;
    }

    protected final boolean zza(zzrr zzrr1)
    {
        if (zzbca == null || zzbca.isEmpty())
        {
            return zzrr1.zzbca == null || zzrr1.zzbca.isEmpty();
        } else
        {
            return zzbca.equals(zzrr1.zzbca);
        }
    }
}
