// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg, 
//            zzrq, zzrf, zzrn

public static final class zzD extends zzrh
{

    private static volatile  zzhM[];
    public int name;
    public int zzhN[];
    public int zzhO;
    public boolean zzhP;
    public boolean zzhQ;

    public static zzD[] zzC()
    {
        if (zzhM == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zzhM == null)
                {
                    zzhM = new zzhM[0];
                }
            }
        }
        return zzhM;
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
            if (obj instanceof zzhM)
            {
                obj = (zzhM)obj;
                flag = flag1;
                if (zzrl.equals(zzhN, ((zzhN) (obj)).zzhN))
                {
                    flag = flag1;
                    if (zzhO == ((zzhO) (obj)).zzhO)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (zzhP == ((zzhP) (obj)).zzhP)
                            {
                                flag = flag1;
                                if (zzhQ == ((zzhQ) (obj)).zzhQ)
                                {
                                    return zza(((zzrh) (obj)));
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
        int i = zzrl.hashCode(zzhN);
        int j = zzhO;
        int k = name;
        char c;
        if (zzhP)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!zzhQ)
        {
            c1 = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = 0;
        int k = super.zzB();
        int i = k;
        if (zzhQ)
        {
            i = k + zzrg.zzc(1, zzhQ);
        }
        k = zzrg.zzA(2, zzhO) + i;
        if (zzhN != null && zzhN.length > 0)
        {
            for (i = 0; i < zzhN.length; i++)
            {
                j += zzrg.zzkJ(zzhN[i]);
            }

            j = k + j + zzhN.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + zzrg.zzA(4, name);
        }
        j = i;
        if (zzhP)
        {
            j = i + zzrg.zzc(6, zzhP);
        }
        return j;
    }

    public zzhP zzD()
    {
        zzhN = zzrq.zzaWh;
        zzhO = 0;
        name = 0;
        zzhP = false;
        zzhQ = false;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzhQ)
        {
            zzrg1.zzb(1, zzhQ);
        }
        zzrg1.zzy(2, zzhO);
        if (zzhN != null && zzhN.length > 0)
        {
            for (int i = 0; i < zzhN.length; i++)
            {
                zzrg1.zzy(3, zzhN[i]);
            }

        }
        if (name != 0)
        {
            zzrg1.zzy(4, name);
        }
        if (zzhP)
        {
            zzrg1.zzb(6, zzhP);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzc(zzrf1);
    }

    public zzc zzc(zzrf zzrf1)
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
                zzhQ = zzrf1.zzBv();
                break;

            case 16: // '\020'
                zzhO = zzrf1.zzBu();
                break;

            case 24: // '\030'
                int l = zzrq.zzb(zzrf1, 24);
                int ai[];
                int j;
                if (zzhN == null)
                {
                    j = 0;
                } else
                {
                    j = zzhN.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(zzhN, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai[l] = zzrf1.zzBu();
                zzhN = ai;
                break;

            case 26: // '\032'
                int j1 = zzrf1.zzkC(zzrf1.zzBy());
                int k = zzrf1.getPosition();
                int i1;
                for (i1 = 0; zzrf1.zzBD() > 0; i1++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k);
                int ai1[];
                if (zzhN == null)
                {
                    k = 0;
                } else
                {
                    k = zzhN.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzhN, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = zzrf1.zzBu();
                }

                zzhN = ai1;
                zzrf1.zzkD(j1);
                break;

            case 32: // ' '
                name = zzrf1.zzBu();
                break;

            case 48: // '0'
                zzhP = zzrf1.zzBv();
                break;
            }
        } while (true);
    }

    public ()
    {
        zzD();
    }
}
