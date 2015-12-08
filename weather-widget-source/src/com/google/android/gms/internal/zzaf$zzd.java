// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrv, zzrq, 
//            zzrp, zzsa, zzrx

public static final class zzG extends zzrr
{

    public zzib zzhZ[];
    public zzib zzia[];
    public zzib zzib[];

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
                if (zzrv.equals(zzhZ, ((zzhZ) (obj)).zzhZ))
                {
                    flag = flag1;
                    if (zzrv.equals(zzia, ((zzia) (obj)).zzia))
                    {
                        flag = flag1;
                        if (zzrv.equals(zzib, ((zzib) (obj)).zzib))
                        {
                            return zza(((zzrr) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zzrv.hashCode(zzhZ) + 527) * 31 + zzrv.hashCode(zzia)) * 31 + zzrv.hashCode(zzib)) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int i = super.zzB();
        int j = i;
        if (zzhZ != null)
        {
            j = i;
            if (zzhZ.length > 0)
            {
                for (j = 0; j < zzhZ.length;)
                {
                    zzDk zzdk = zzhZ[j];
                    int i1 = i;
                    if (zzdk != null)
                    {
                        i1 = i + zzrq.zzc(1, zzdk);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (zzia != null)
        {
            i = j;
            if (zzia.length > 0)
            {
                i = j;
                for (int k = 0; k < zzia.length;)
                {
                    zzDk zzdk1 = zzia[k];
                    int j1 = i;
                    if (zzdk1 != null)
                    {
                        j1 = i + zzrq.zzc(2, zzdk1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (zzib != null)
        {
            k1 = i;
            if (zzib.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= zzib.length)
                    {
                        break;
                    }
                    zzDk zzdk2 = zzib[l];
                    k1 = i;
                    if (zzdk2 != null)
                    {
                        k1 = i + zzrq.zzc(3, zzdk2);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public zzib zzG()
    {
        zzhZ = zzQ();
        zzia = zzQ();
        zzib = zzE();
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zzhZ != null && zzhZ.length > 0)
        {
            for (int i = 0; i < zzhZ.length; i++)
            {
                zzbcl zzbcl = zzhZ[i];
                if (zzbcl != null)
                {
                    zzrq1.zza(1, zzbcl);
                }
            }

        }
        if (zzia != null && zzia.length > 0)
        {
            for (int j = 0; j < zzia.length; j++)
            {
                zzbcl zzbcl1 = zzia[j];
                if (zzbcl1 != null)
                {
                    zzrq1.zza(2, zzbcl1);
                }
            }

        }
        if (zzib != null && zzib.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzib.length; k++)
            {
                zzbcl zzbcl2 = zzib[k];
                if (zzbcl2 != null)
                {
                    zzrq1.zza(3, zzbcl2);
                }
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zze(zzrp1);
    }

    public zze zze(zzrp zzrp1)
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

            case 10: // '\n'
                int i1 = zzsa.zzb(zzrp1, 10);
                zze azze[];
                int j;
                if (zzhZ == null)
                {
                    j = 0;
                } else
                {
                    j = zzhZ.length;
                }
                azze = new zzhZ[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzhZ, 0, azze, 0, j);
                    i1 = j;
                }
                for (; i1 < azze.length - 1; i1++)
                {
                    azze[i1] = new <init>();
                    zzrp1.zza(azze[i1]);
                    zzrp1.zzCT();
                }

                azze[i1] = new <init>();
                zzrp1.zza(azze[i1]);
                zzhZ = azze;
                break;

            case 18: // '\022'
                int j1 = zzsa.zzb(zzrp1, 18);
                zze azze1[];
                int k;
                if (zzia == null)
                {
                    k = 0;
                } else
                {
                    k = zzia.length;
                }
                azze1 = new zzia[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzia, 0, azze1, 0, k);
                    j1 = k;
                }
                for (; j1 < azze1.length - 1; j1++)
                {
                    azze1[j1] = new <init>();
                    zzrp1.zza(azze1[j1]);
                    zzrp1.zzCT();
                }

                azze1[j1] = new <init>();
                zzrp1.zza(azze1[j1]);
                zzia = azze1;
                break;

            case 26: // '\032'
                int k1 = zzsa.zzb(zzrp1, 26);
                zze azze2[];
                int l;
                if (zzib == null)
                {
                    l = 0;
                } else
                {
                    l = zzib.length;
                }
                azze2 = new zzib[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzib, 0, azze2, 0, l);
                    k1 = l;
                }
                for (; k1 < azze2.length - 1; k1++)
                {
                    azze2[k1] = new <init>();
                    zzrp1.zza(azze2[k1]);
                    zzrp1.zzCT();
                }

                azze2[k1] = new <init>();
                zzrp1.zza(azze2[k1]);
                zzib = azze2;
                break;
            }
        } while (true);
    }

    public ()
    {
        zzG();
    }
}
