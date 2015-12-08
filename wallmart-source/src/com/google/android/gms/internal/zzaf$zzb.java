// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrv, zzrq, 
//            zzsa, zzrp, zzrx

public static final class zzD extends zzrr
{

    private static volatile  zzhP[];
    public int name;
    public int zzhQ[];
    public int zzhR;
    public boolean zzhS;
    public boolean zzhT;

    public static zzD[] zzC()
    {
        if (zzhP == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zzhP == null)
                {
                    zzhP = new zzhP[0];
                }
            }
        }
        return zzhP;
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
            if (obj instanceof zzhP)
            {
                obj = (zzhP)obj;
                flag = flag1;
                if (zzrv.equals(zzhQ, ((zzhQ) (obj)).zzhQ))
                {
                    flag = flag1;
                    if (zzhR == ((zzhR) (obj)).zzhR)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (zzhS == ((zzhS) (obj)).zzhS)
                            {
                                flag = flag1;
                                if (zzhT == ((zzhT) (obj)).zzhT)
                                {
                                    return zza(((zzrr) (obj)));
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
        int i = zzrv.hashCode(zzhQ);
        int j = zzhR;
        int k = name;
        char c;
        if (zzhS)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!zzhT)
        {
            c1 = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzDk();
    }

    protected int zzB()
    {
        int j = 0;
        int k = super.zzB();
        int i = k;
        if (zzhT)
        {
            i = k + zzrq.zzc(1, zzhT);
        }
        k = zzrq.zzB(2, zzhR) + i;
        if (zzhQ != null && zzhQ.length > 0)
        {
            for (i = 0; i < zzhQ.length; i++)
            {
                j += zzrq.zzls(zzhQ[i]);
            }

            j = k + j + zzhQ.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + zzrq.zzB(4, name);
        }
        j = i;
        if (zzhS)
        {
            j = i + zzrq.zzc(6, zzhS);
        }
        return j;
    }

    public zzhS zzD()
    {
        zzhQ = zzsa.zzbcn;
        zzhR = 0;
        name = 0;
        zzhS = false;
        zzhT = false;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (zzhT)
        {
            zzrq1.zzb(1, zzhT);
        }
        zzrq1.zzz(2, zzhR);
        if (zzhQ != null && zzhQ.length > 0)
        {
            for (int i = 0; i < zzhQ.length; i++)
            {
                zzrq1.zzz(3, zzhQ[i]);
            }

        }
        if (name != 0)
        {
            zzrq1.zzz(4, name);
        }
        if (zzhS)
        {
            zzrq1.zzb(6, zzhS);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzc(zzrp1);
    }

    public zzc zzc(zzrp zzrp1)
        throws IOException
    {
        do
        {
            int i = zzrp1.zzCT();
            switch (i)
            {
            default:
                if (zza(zzrp1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                zzhT = zzrp1.zzCX();
                break;

            case 16: // '\020'
                zzhR = zzrp1.zzCW();
                break;

            case 24: // '\030'
                int l = zzsa.zzb(zzrp1, 24);
                int ai[];
                int j;
                if (zzhQ == null)
                {
                    j = 0;
                } else
                {
                    j = zzhQ.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(zzhQ, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai[l] = zzrp1.zzCW();
                zzhQ = ai;
                break;

            case 26: // '\032'
                int j1 = zzrp1.zzll(zzrp1.zzDa());
                int k = zzrp1.getPosition();
                int i1;
                for (i1 = 0; zzrp1.zzDf() > 0; i1++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k);
                int ai1[];
                if (zzhQ == null)
                {
                    k = 0;
                } else
                {
                    k = zzhQ.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzhQ, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = zzrp1.zzCW();
                }

                zzhQ = ai1;
                zzrp1.zzlm(j1);
                break;

            case 32: // ' '
                name = zzrp1.zzCW();
                break;

            case 48: // '0'
                zzhS = zzrp1.zzCX();
                break;
            }
        } while (true);
    }

    public ()
    {
        zzD();
    }
}
