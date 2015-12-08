// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zzob

public static final class zzm extends zzns
{

    private static volatile zzaOe zzgJ[];
    public int zzgK[];
    public int zzgL[];
    public int zzgM[];
    public int zzgN[];
    public int zzgO[];
    public int zzgP[];
    public int zzgQ[];
    public int zzgR[];
    public int zzgS[];
    public int zzgT[];

    public static zzm[] zzl()
    {
        if (zzgJ == null)
        {
            synchronized (zznw.zzaOd)
            {
                if (zzgJ == null)
                {
                    zzgJ = new zzgJ[0];
                }
            }
        }
        return zzgJ;
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
            if (obj instanceof zzgJ)
            {
                obj = (zzgJ)obj;
                flag = flag1;
                if (zznw.equals(zzgK, ((zzgK) (obj)).zzgK))
                {
                    flag = flag1;
                    if (zznw.equals(zzgL, ((zzgL) (obj)).zzgL))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgM, ((zzgM) (obj)).zzgM))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgN, ((zzgN) (obj)).zzgN))
                            {
                                flag = flag1;
                                if (zznw.equals(zzgO, ((zzgO) (obj)).zzgO))
                                {
                                    flag = flag1;
                                    if (zznw.equals(zzgP, ((zzgP) (obj)).zzgP))
                                    {
                                        flag = flag1;
                                        if (zznw.equals(zzgQ, ((zzgQ) (obj)).zzgQ))
                                        {
                                            flag = flag1;
                                            if (zznw.equals(zzgR, ((zzgR) (obj)).zzgR))
                                            {
                                                flag = flag1;
                                                if (zznw.equals(zzgS, ((zzgS) (obj)).zzgS))
                                                {
                                                    flag = flag1;
                                                    if (zznw.equals(zzgT, ((zzgT) (obj)).zzgT))
                                                    {
                                                        return zza(((zzns) (obj)));
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        return ((((((((((zznw.hashCode(zzgK) + 527) * 31 + zznw.hashCode(zzgL)) * 31 + zznw.hashCode(zzgM)) * 31 + zznw.hashCode(zzgN)) * 31 + zznw.hashCode(zzgO)) * 31 + zznw.hashCode(zzgP)) * 31 + zznw.hashCode(zzgQ)) * 31 + zznw.hashCode(zzgR)) * 31 + zznw.hashCode(zzgS)) * 31 + zznw.hashCode(zzgT)) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzgK != null && zzgK.length > 0)
        {
            for (int i = 0; i < zzgK.length; i++)
            {
                zznr1.zzx(1, zzgK[i]);
            }

        }
        if (zzgL != null && zzgL.length > 0)
        {
            for (int j = 0; j < zzgL.length; j++)
            {
                zznr1.zzx(2, zzgL[j]);
            }

        }
        if (zzgM != null && zzgM.length > 0)
        {
            for (int k = 0; k < zzgM.length; k++)
            {
                zznr1.zzx(3, zzgM[k]);
            }

        }
        if (zzgN != null && zzgN.length > 0)
        {
            for (int l = 0; l < zzgN.length; l++)
            {
                zznr1.zzx(4, zzgN[l]);
            }

        }
        if (zzgO != null && zzgO.length > 0)
        {
            for (int i1 = 0; i1 < zzgO.length; i1++)
            {
                zznr1.zzx(5, zzgO[i1]);
            }

        }
        if (zzgP != null && zzgP.length > 0)
        {
            for (int j1 = 0; j1 < zzgP.length; j1++)
            {
                zznr1.zzx(6, zzgP[j1]);
            }

        }
        if (zzgQ != null && zzgQ.length > 0)
        {
            for (int k1 = 0; k1 < zzgQ.length; k1++)
            {
                zznr1.zzx(7, zzgQ[k1]);
            }

        }
        if (zzgR != null && zzgR.length > 0)
        {
            for (int l1 = 0; l1 < zzgR.length; l1++)
            {
                zznr1.zzx(8, zzgR[l1]);
            }

        }
        if (zzgS != null && zzgS.length > 0)
        {
            for (int i2 = 0; i2 < zzgS.length; i2++)
            {
                zznr1.zzx(9, zzgS[i2]);
            }

        }
        if (zzgT != null && zzgT.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < zzgT.length; j2++)
            {
                zznr1.zzx(10, zzgT[j2]);
            }

        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int l = super.zzc();
        int j;
        int k;
        if (zzgK != null && zzgK.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zzgK.length; i++)
            {
                k += zznr.zzjv(zzgK[i]);
            }

            k = l + k + zzgK.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zzgL != null)
        {
            j = k;
            if (zzgL.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgL.length; j++)
                {
                    l += zznr.zzjv(zzgL[j]);
                }

                j = k + l + zzgL.length * 1;
            }
        }
        k = j;
        if (zzgM != null)
        {
            k = j;
            if (zzgM.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgM.length; k++)
                {
                    l += zznr.zzjv(zzgM[k]);
                }

                k = j + l + zzgM.length * 1;
            }
        }
        j = k;
        if (zzgN != null)
        {
            j = k;
            if (zzgN.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgN.length; j++)
                {
                    l += zznr.zzjv(zzgN[j]);
                }

                j = k + l + zzgN.length * 1;
            }
        }
        k = j;
        if (zzgO != null)
        {
            k = j;
            if (zzgO.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgO.length; k++)
                {
                    l += zznr.zzjv(zzgO[k]);
                }

                k = j + l + zzgO.length * 1;
            }
        }
        j = k;
        if (zzgP != null)
        {
            j = k;
            if (zzgP.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgP.length; j++)
                {
                    l += zznr.zzjv(zzgP[j]);
                }

                j = k + l + zzgP.length * 1;
            }
        }
        k = j;
        if (zzgQ != null)
        {
            k = j;
            if (zzgQ.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgQ.length; k++)
                {
                    l += zznr.zzjv(zzgQ[k]);
                }

                k = j + l + zzgQ.length * 1;
            }
        }
        j = k;
        if (zzgR != null)
        {
            j = k;
            if (zzgR.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgR.length; j++)
                {
                    l += zznr.zzjv(zzgR[j]);
                }

                j = k + l + zzgR.length * 1;
            }
        }
        k = j;
        if (zzgS != null)
        {
            k = j;
            if (zzgS.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgS.length; k++)
                {
                    l += zznr.zzjv(zzgS[k]);
                }

                k = j + l + zzgS.length * 1;
            }
        }
        j = k;
        if (zzgT != null)
        {
            j = k;
            if (zzgT.length > 0)
            {
                l = 0;
                for (j = ((flag) ? 1 : 0); j < zzgT.length; j++)
                {
                    l += zznr.zzjv(zzgT[j]);
                }

                j = k + l + zzgT.length * 1;
            }
        }
        return j;
    }

    public zzgT zzm()
    {
        zzgK = zzob.zzaOg;
        zzgL = zzob.zzaOg;
        zzgM = zzob.zzaOg;
        zzgN = zzob.zzaOg;
        zzgO = zzob.zzaOg;
        zzgP = zzob.zzaOg;
        zzgQ = zzob.zzaOg;
        zzgR = zzob.zzaOg;
        zzgS = zzob.zzaOg;
        zzgT = zzob.zzaOg;
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzm();
    }
}
