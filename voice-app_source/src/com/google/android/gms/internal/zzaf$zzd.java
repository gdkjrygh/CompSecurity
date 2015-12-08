// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg, 
//            zzrf, zzrq, zzrn

public static final class zzG extends zzrh
{

    public zzhY zzhW[];
    public zzhY zzhX[];
    public zzhY zzhY[];

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
            if (obj instanceof zzG)
            {
                obj = (zzG)obj;
                flag = flag1;
                if (zzrl.equals(zzhW, ((zzhW) (obj)).zzhW))
                {
                    flag = flag1;
                    if (zzrl.equals(zzhX, ((zzhX) (obj)).zzhX))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzhY, ((zzhY) (obj)).zzhY))
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zzrl.hashCode(zzhW) + 527) * 31 + zzrl.hashCode(zzhX)) * 31 + zzrl.hashCode(zzhY)) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int i = super.zzB();
        int j = i;
        if (zzhW != null)
        {
            j = i;
            if (zzhW.length > 0)
            {
                for (j = 0; j < zzhW.length;)
                {
                    zzBI zzbi = zzhW[j];
                    int i1 = i;
                    if (zzbi != null)
                    {
                        i1 = i + zzrg.zzc(1, zzbi);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (zzhX != null)
        {
            i = j;
            if (zzhX.length > 0)
            {
                i = j;
                for (int k = 0; k < zzhX.length;)
                {
                    zzBI zzbi1 = zzhX[k];
                    int j1 = i;
                    if (zzbi1 != null)
                    {
                        j1 = i + zzrg.zzc(2, zzbi1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (zzhY != null)
        {
            k1 = i;
            if (zzhY.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= zzhY.length)
                    {
                        break;
                    }
                    zzBI zzbi2 = zzhY[l];
                    k1 = i;
                    if (zzbi2 != null)
                    {
                        k1 = i + zzrg.zzc(3, zzbi2);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public zzhY zzG()
    {
        zzhW = zzQ();
        zzhX = zzQ();
        zzhY = zzE();
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zzhW != null && zzhW.length > 0)
        {
            for (int i = 0; i < zzhW.length; i++)
            {
                zzaWf zzawf = zzhW[i];
                if (zzawf != null)
                {
                    zzrg1.zza(1, zzawf);
                }
            }

        }
        if (zzhX != null && zzhX.length > 0)
        {
            for (int j = 0; j < zzhX.length; j++)
            {
                zzaWf zzawf1 = zzhX[j];
                if (zzawf1 != null)
                {
                    zzrg1.zza(2, zzawf1);
                }
            }

        }
        if (zzhY != null && zzhY.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzhY.length; k++)
            {
                zzaWf zzawf2 = zzhY[k];
                if (zzawf2 != null)
                {
                    zzrg1.zza(3, zzawf2);
                }
            }

        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zze(zzrf1);
    }

    public zze zze(zzrf zzrf1)
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

            case 10: // '\n'
                int i1 = zzrq.zzb(zzrf1, 10);
                zze azze[];
                int j;
                if (zzhW == null)
                {
                    j = 0;
                } else
                {
                    j = zzhW.length;
                }
                azze = new zzhW[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzhW, 0, azze, 0, j);
                    i1 = j;
                }
                for (; i1 < azze.length - 1; i1++)
                {
                    azze[i1] = new <init>();
                    zzrf1.zza(azze[i1]);
                    zzrf1.zzBr();
                }

                azze[i1] = new <init>();
                zzrf1.zza(azze[i1]);
                zzhW = azze;
                break;

            case 18: // '\022'
                int j1 = zzrq.zzb(zzrf1, 18);
                zze azze1[];
                int k;
                if (zzhX == null)
                {
                    k = 0;
                } else
                {
                    k = zzhX.length;
                }
                azze1 = new zzhX[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzhX, 0, azze1, 0, k);
                    j1 = k;
                }
                for (; j1 < azze1.length - 1; j1++)
                {
                    azze1[j1] = new <init>();
                    zzrf1.zza(azze1[j1]);
                    zzrf1.zzBr();
                }

                azze1[j1] = new <init>();
                zzrf1.zza(azze1[j1]);
                zzhX = azze1;
                break;

            case 26: // '\032'
                int k1 = zzrq.zzb(zzrf1, 26);
                zze azze2[];
                int l;
                if (zzhY == null)
                {
                    l = 0;
                } else
                {
                    l = zzhY.length;
                }
                azze2 = new zzhY[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzhY, 0, azze2, 0, l);
                    k1 = l;
                }
                for (; k1 < azze2.length - 1; k1++)
                {
                    azze2[k1] = new <init>();
                    zzrf1.zza(azze2[k1]);
                    zzrf1.zzBr();
                }

                azze2[k1] = new <init>();
                zzrf1.zza(azze2[k1]);
                zzhY = azze2;
                break;
            }
        } while (true);
    }

    public ()
    {
        zzG();
    }
}
