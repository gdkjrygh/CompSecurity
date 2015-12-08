// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrn, zzrj, zzrk, zzrl, 
//            zzri, zzrq, zzrf, zzrp, 
//            zzrg

public abstract class zzrh extends zzrn
{

    protected zzrj zzaVU;

    public zzrh()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzBJ();
    }

    protected int zzB()
    {
        int j = 0;
        int k;
        if (zzaVU != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= zzaVU.size())
                {
                    break;
                }
                i += zzaVU.zzkS(j).zzB();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int zzBI()
    {
        if (zzaVU == null || zzaVU.isEmpty())
        {
            return 0;
        } else
        {
            return zzaVU.hashCode();
        }
    }

    public zzrh zzBJ()
        throws CloneNotSupportedException
    {
        zzrh zzrh1 = (zzrh)super.zzBK();
        zzrl.zza(this, zzrh1);
        return zzrh1;
    }

    public zzrn zzBK()
        throws CloneNotSupportedException
    {
        return zzBJ();
    }

    public final Object zza(zzri zzri1)
    {
        zzrk zzrk1;
        if (zzaVU != null)
        {
            if ((zzrk1 = zzaVU.zzkR(zzrq.zzkV(zzri1.tag))) != null)
            {
                return zzrk1.zzb(zzri1);
            }
        }
        return null;
    }

    public void zza(zzrg zzrg)
        throws IOException
    {
        if (zzaVU != null)
        {
            int i = 0;
            while (i < zzaVU.size()) 
            {
                zzaVU.zzkS(i).zza(zzrg);
                i++;
            }
        }
    }

    protected final boolean zza(zzrf zzrf1, int i)
        throws IOException
    {
        int j = zzrf1.getPosition();
        if (!zzrf1.zzkA(i))
        {
            return false;
        }
        int k = zzrq.zzkV(i);
        zzrp zzrp1 = new zzrp(i, zzrf1.zzx(j, zzrf1.getPosition() - j));
        zzrf1 = null;
        Object obj;
        if (zzaVU == null)
        {
            zzaVU = new zzrj();
        } else
        {
            zzrf1 = zzaVU.zzkR(k);
        }
        obj = zzrf1;
        if (zzrf1 == null)
        {
            obj = new zzrk();
            zzaVU.zza(k, ((zzrk) (obj)));
        }
        ((zzrk) (obj)).zza(zzrp1);
        return true;
    }

    protected final boolean zza(zzrh zzrh1)
    {
        if (zzaVU == null || zzaVU.isEmpty())
        {
            return zzrh1.zzaVU == null || zzrh1.zzaVU.isEmpty();
        } else
        {
            return zzaVU.equals(zzrh1.zzaVU);
        }
    }
}
