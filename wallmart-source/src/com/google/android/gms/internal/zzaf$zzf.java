// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrw, zzrx, 
//            zzrv, zzrq, zzsa, zzrp

public static final class zzJ extends zzrr
{

    public String version;
    public String zzid[];
    public String zzie[];
    public zzid zzif[];
    public zzid zzig[];
    public zzid zzih[];
    public zzid zzii[];
    public zzid zzij[];
    public zzid zzik[];
    public String zzil;
    public String zzim;
    public String zzin;
    public zzid zzio;
    public float zzip;
    public boolean zziq;
    public String zzir[];
    public int zzis;

    public static zzJ zzc(byte abyte0[])
        throws zzrw
    {
        return (zzJ)zzrx.zza(new <init>(), abyte0);
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
        if (!(obj instanceof <init>)) goto _L4; else goto _L3
_L3:
        obj = (<init>)obj;
        flag = flag1;
        if (!zzrv.equals(zzid, ((zzid) (obj)).zzid)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!zzrv.equals(zzie, ((zzie) (obj)).zzie)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!zzrv.equals(zzif, ((zzif) (obj)).zzif)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!zzrv.equals(zzig, ((zzig) (obj)).zzig)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zzrv.equals(zzih, ((zzih) (obj)).zzih)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zzrv.equals(zzii, ((zzii) (obj)).zzii)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zzrv.equals(zzij, ((zzij) (obj)).zzij)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!zzrv.equals(zzik, ((zzik) (obj)).zzik)) goto _L4; else goto _L12
_L12:
        if (zzil != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((zzil) (obj)).zzil != null) goto _L4; else goto _L15
_L15:
        if (zzim != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((zzim) (obj)).zzim != null) goto _L4; else goto _L18
_L18:
        if (zzin != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((zzin) (obj)).zzin != null) goto _L4; else goto _L21
_L21:
        if (version != null) goto _L23; else goto _L22
_L22:
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L24
_L24:
        if (zzio != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = flag1;
        if (((zzio) (obj)).zzio != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (Float.floatToIntBits(zzip) == Float.floatToIntBits(((zzip) (obj)).zzip))
        {
            flag = flag1;
            if (zziq == ((zziq) (obj)).zziq)
            {
                flag = flag1;
                if (zzrv.equals(zzir, ((zzir) (obj)).zzir))
                {
                    flag = flag1;
                    if (zzis == ((zzis) (obj)).zzis)
                    {
                        return zza(((zzrr) (obj)));
                    }
                }
            }
        }
          goto _L4
_L14:
        if (!zzil.equals(((zzil) (obj)).zzil))
        {
            return false;
        }
          goto _L15
_L17:
        if (!zzim.equals(((zzim) (obj)).zzim))
        {
            return false;
        }
          goto _L18
_L20:
        if (!zzin.equals(((zzin) (obj)).zzin))
        {
            return false;
        }
          goto _L21
_L23:
        if (!version.equals(((version) (obj)).version))
        {
            return false;
        }
          goto _L24
        if (!zzio.equals(((equals) (obj)).zzio))
        {
            return false;
        }
          goto _L25
    }

    public int hashCode()
    {
        int i1 = 0;
        int j1 = zzrv.hashCode(zzid);
        int k1 = zzrv.hashCode(zzie);
        int l1 = zzrv.hashCode(zzif);
        int i2 = zzrv.hashCode(zzig);
        int j2 = zzrv.hashCode(zzih);
        int k2 = zzrv.hashCode(zzii);
        int l2 = zzrv.hashCode(zzij);
        int i3 = zzrv.hashCode(zzik);
        int i;
        int j;
        int k;
        int l;
        char c;
        int j3;
        if (zzil == null)
        {
            i = 0;
        } else
        {
            i = zzil.hashCode();
        }
        if (zzim == null)
        {
            j = 0;
        } else
        {
            j = zzim.hashCode();
        }
        if (zzin == null)
        {
            k = 0;
        } else
        {
            k = zzin.hashCode();
        }
        if (version == null)
        {
            l = 0;
        } else
        {
            l = version.hashCode();
        }
        if (zzio != null)
        {
            i1 = zzio.hashCode();
        }
        j3 = Float.floatToIntBits(zzip);
        if (zziq)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zzrv.hashCode(zzir)) * 31 + zzis) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int k4 = super.zzB();
        int j;
        int k;
        int k2;
        if (zzie != null && zzie.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int i3;
            for (l = 0; i < zzie.length; l = i3)
            {
                String s = zzie[i];
                int l3 = k;
                i3 = l;
                if (s != null)
                {
                    i3 = l + 1;
                    l3 = k + zzrq.zzfy(s);
                }
                i++;
                k = l3;
            }

            k = k4 + k + l * 1;
        } else
        {
            k = k4;
        }
        j = k;
        if (zzif != null)
        {
            j = k;
            if (zzif.length > 0)
            {
                j = k;
                for (k = 0; k < zzif.length;)
                {
                    zzDk zzdk = zzif[k];
                    int i1 = j;
                    if (zzdk != null)
                    {
                        i1 = j + zzrq.zzc(2, zzdk);
                    }
                    k++;
                    j = i1;
                }

            }
        }
        k = j;
        if (zzig != null)
        {
            k = j;
            if (zzig.length > 0)
            {
                for (k = 0; k < zzig.length;)
                {
                    zzDk zzdk1 = zzig[k];
                    int j1 = j;
                    if (zzdk1 != null)
                    {
                        j1 = j + zzrq.zzc(3, zzdk1);
                    }
                    k++;
                    j = j1;
                }

                k = j;
            }
        }
        j = k;
        if (zzih != null)
        {
            j = k;
            if (zzih.length > 0)
            {
                j = k;
                for (k = 0; k < zzih.length;)
                {
                    zzDk zzdk2 = zzih[k];
                    int k1 = j;
                    if (zzdk2 != null)
                    {
                        k1 = j + zzrq.zzc(4, zzdk2);
                    }
                    k++;
                    j = k1;
                }

            }
        }
        k = j;
        if (zzii != null)
        {
            k = j;
            if (zzii.length > 0)
            {
                for (k = 0; k < zzii.length;)
                {
                    zzDk zzdk3 = zzii[k];
                    int l1 = j;
                    if (zzdk3 != null)
                    {
                        l1 = j + zzrq.zzc(5, zzdk3);
                    }
                    k++;
                    j = l1;
                }

                k = j;
            }
        }
        j = k;
        if (zzij != null)
        {
            j = k;
            if (zzij.length > 0)
            {
                j = k;
                for (k = 0; k < zzij.length;)
                {
                    zzDk zzdk4 = zzij[k];
                    int i2 = j;
                    if (zzdk4 != null)
                    {
                        i2 = j + zzrq.zzc(6, zzdk4);
                    }
                    k++;
                    j = i2;
                }

            }
        }
        k = j;
        if (zzik != null)
        {
            k = j;
            if (zzik.length > 0)
            {
                for (k = 0; k < zzik.length;)
                {
                    zzDk zzdk5 = zzik[k];
                    int j2 = j;
                    if (zzdk5 != null)
                    {
                        j2 = j + zzrq.zzc(7, zzdk5);
                    }
                    k++;
                    j = j2;
                }

                k = j;
            }
        }
        j = k;
        if (!zzil.equals(""))
        {
            j = k + zzrq.zzl(9, zzil);
        }
        k = j;
        if (!zzim.equals(""))
        {
            k = j + zzrq.zzl(10, zzim);
        }
        j = k;
        if (!zzin.equals("0"))
        {
            j = k + zzrq.zzl(12, zzin);
        }
        k = j;
        if (!version.equals(""))
        {
            k = j + zzrq.zzl(13, version);
        }
        k2 = k;
        if (zzio != null)
        {
            k2 = k + zzrq.zzc(14, zzio);
        }
        j = k2;
        if (Float.floatToIntBits(zzip) != Float.floatToIntBits(0.0F))
        {
            j = k2 + zzrq.zzc(15, zzip);
        }
        k = j;
        if (zzir != null)
        {
            k = j;
            if (zzir.length > 0)
            {
                k = 0;
                k2 = 0;
                int j3;
                int i4;
                for (j3 = 0; k < zzir.length; j3 = i4)
                {
                    String s1 = zzir[k];
                    k4 = k2;
                    i4 = j3;
                    if (s1 != null)
                    {
                        i4 = j3 + 1;
                        k4 = k2 + zzrq.zzfy(s1);
                    }
                    k++;
                    k2 = k4;
                }

                k = j + k2 + j3 * 2;
            }
        }
        k2 = k;
        if (zzis != 0)
        {
            k2 = k + zzrq.zzB(17, zzis);
        }
        j = k2;
        if (zziq)
        {
            j = k2 + zzrq.zzc(18, zziq);
        }
        k = j;
        if (zzid != null)
        {
            k = j;
            if (zzid.length > 0)
            {
                int l2 = 0;
                int k3 = 0;
                for (k = ((flag) ? 1 : 0); k < zzid.length;)
                {
                    String s2 = zzid[k];
                    k4 = l2;
                    int j4 = k3;
                    if (s2 != null)
                    {
                        j4 = k3 + 1;
                        k4 = l2 + zzrq.zzfy(s2);
                    }
                    k++;
                    l2 = k4;
                    k3 = j4;
                }

                k = j + l2 + k3 * 2;
            }
        }
        return k;
    }

    public  zzJ()
    {
        zzid = zzsa.zzbcs;
        zzie = zzsa.zzbcs;
        zzif = zzQ();
        zzig = zzH();
        zzih = zzC();
        zzii = zzC();
        zzij = zzC();
        zzik = zzK();
        zzil = "";
        zzim = "";
        zzin = "0";
        version = "";
        zzio = null;
        zzip = 0.0F;
        zziq = false;
        zzir = zzsa.zzbcs;
        zzis = 0;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zzie != null && zzie.length > 0)
        {
            for (int i = 0; i < zzie.length; i++)
            {
                String s = zzie[i];
                if (s != null)
                {
                    zzrq1.zzb(1, s);
                }
            }

        }
        if (zzif != null && zzif.length > 0)
        {
            for (int j = 0; j < zzif.length; j++)
            {
                zzbcl zzbcl = zzif[j];
                if (zzbcl != null)
                {
                    zzrq1.zza(2, zzbcl);
                }
            }

        }
        if (zzig != null && zzig.length > 0)
        {
            for (int k = 0; k < zzig.length; k++)
            {
                zzbcl zzbcl1 = zzig[k];
                if (zzbcl1 != null)
                {
                    zzrq1.zza(3, zzbcl1);
                }
            }

        }
        if (zzih != null && zzih.length > 0)
        {
            for (int l = 0; l < zzih.length; l++)
            {
                zzbcl zzbcl2 = zzih[l];
                if (zzbcl2 != null)
                {
                    zzrq1.zza(4, zzbcl2);
                }
            }

        }
        if (zzii != null && zzii.length > 0)
        {
            for (int i1 = 0; i1 < zzii.length; i1++)
            {
                zzbcl zzbcl3 = zzii[i1];
                if (zzbcl3 != null)
                {
                    zzrq1.zza(5, zzbcl3);
                }
            }

        }
        if (zzij != null && zzij.length > 0)
        {
            for (int j1 = 0; j1 < zzij.length; j1++)
            {
                zzbcl zzbcl4 = zzij[j1];
                if (zzbcl4 != null)
                {
                    zzrq1.zza(6, zzbcl4);
                }
            }

        }
        if (zzik != null && zzik.length > 0)
        {
            for (int k1 = 0; k1 < zzik.length; k1++)
            {
                zzbcl zzbcl5 = zzik[k1];
                if (zzbcl5 != null)
                {
                    zzrq1.zza(7, zzbcl5);
                }
            }

        }
        if (!zzil.equals(""))
        {
            zzrq1.zzb(9, zzil);
        }
        if (!zzim.equals(""))
        {
            zzrq1.zzb(10, zzim);
        }
        if (!zzin.equals("0"))
        {
            zzrq1.zzb(12, zzin);
        }
        if (!version.equals(""))
        {
            zzrq1.zzb(13, version);
        }
        if (zzio != null)
        {
            zzrq1.zza(14, zzio);
        }
        if (Float.floatToIntBits(zzip) != Float.floatToIntBits(0.0F))
        {
            zzrq1.zzb(15, zzip);
        }
        if (zzir != null && zzir.length > 0)
        {
            for (int l1 = 0; l1 < zzir.length; l1++)
            {
                String s1 = zzir[l1];
                if (s1 != null)
                {
                    zzrq1.zzb(16, s1);
                }
            }

        }
        if (zzis != 0)
        {
            zzrq1.zzz(17, zzis);
        }
        if (zziq)
        {
            zzrq1.zzb(18, zziq);
        }
        if (zzid != null && zzid.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < zzid.length; i2++)
            {
                String s2 = zzid[i2];
                if (s2 != null)
                {
                    zzrq1.zzb(19, s2);
                }
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzg(zzrp1);
    }

    public zzg zzg(zzrp zzrp1)
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
                int k2 = zzsa.zzb(zzrp1, 10);
                String as[];
                int j;
                if (zzie == null)
                {
                    j = 0;
                } else
                {
                    j = zzie.length;
                }
                as = new String[k2 + j];
                k2 = j;
                if (j != 0)
                {
                    System.arraycopy(zzie, 0, as, 0, j);
                    k2 = j;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as[k2] = zzrp1.readString();
                zzie = as;
                break;

            case 18: // '\022'
                int l2 = zzsa.zzb(zzrp1, 18);
                zzg azzg[];
                int k;
                if (zzif == null)
                {
                    k = 0;
                } else
                {
                    k = zzif.length;
                }
                azzg = new zzif[l2 + k];
                l2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzif, 0, azzg, 0, k);
                    l2 = k;
                }
                for (; l2 < azzg.length - 1; l2++)
                {
                    azzg[l2] = new <init>();
                    zzrp1.zza(azzg[l2]);
                    zzrp1.zzCT();
                }

                azzg[l2] = new <init>();
                zzrp1.zza(azzg[l2]);
                zzif = azzg;
                break;

            case 26: // '\032'
                int i3 = zzsa.zzb(zzrp1, 26);
                zzg azzg1[];
                int l;
                if (zzig == null)
                {
                    l = 0;
                } else
                {
                    l = zzig.length;
                }
                azzg1 = new zzig[i3 + l];
                i3 = l;
                if (l != 0)
                {
                    System.arraycopy(zzig, 0, azzg1, 0, l);
                    i3 = l;
                }
                for (; i3 < azzg1.length - 1; i3++)
                {
                    azzg1[i3] = new <init>();
                    zzrp1.zza(azzg1[i3]);
                    zzrp1.zzCT();
                }

                azzg1[i3] = new <init>();
                zzrp1.zza(azzg1[i3]);
                zzig = azzg1;
                break;

            case 34: // '"'
                int j3 = zzsa.zzb(zzrp1, 34);
                zzg azzg2[];
                int i1;
                if (zzih == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzih.length;
                }
                azzg2 = new zzih[j3 + i1];
                j3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzih, 0, azzg2, 0, i1);
                    j3 = i1;
                }
                for (; j3 < azzg2.length - 1; j3++)
                {
                    azzg2[j3] = new <init>();
                    zzrp1.zza(azzg2[j3]);
                    zzrp1.zzCT();
                }

                azzg2[j3] = new <init>();
                zzrp1.zza(azzg2[j3]);
                zzih = azzg2;
                break;

            case 42: // '*'
                int k3 = zzsa.zzb(zzrp1, 42);
                zzg azzg3[];
                int j1;
                if (zzii == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzii.length;
                }
                azzg3 = new zzii[k3 + j1];
                k3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzii, 0, azzg3, 0, j1);
                    k3 = j1;
                }
                for (; k3 < azzg3.length - 1; k3++)
                {
                    azzg3[k3] = new <init>();
                    zzrp1.zza(azzg3[k3]);
                    zzrp1.zzCT();
                }

                azzg3[k3] = new <init>();
                zzrp1.zza(azzg3[k3]);
                zzii = azzg3;
                break;

            case 50: // '2'
                int l3 = zzsa.zzb(zzrp1, 50);
                zzg azzg4[];
                int k1;
                if (zzij == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzij.length;
                }
                azzg4 = new zzij[l3 + k1];
                l3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzij, 0, azzg4, 0, k1);
                    l3 = k1;
                }
                for (; l3 < azzg4.length - 1; l3++)
                {
                    azzg4[l3] = new <init>();
                    zzrp1.zza(azzg4[l3]);
                    zzrp1.zzCT();
                }

                azzg4[l3] = new <init>();
                zzrp1.zza(azzg4[l3]);
                zzij = azzg4;
                break;

            case 58: // ':'
                int i4 = zzsa.zzb(zzrp1, 58);
                zzg azzg5[];
                int l1;
                if (zzik == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzik.length;
                }
                azzg5 = new zzik[i4 + l1];
                i4 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzik, 0, azzg5, 0, l1);
                    i4 = l1;
                }
                for (; i4 < azzg5.length - 1; i4++)
                {
                    azzg5[i4] = new <init>();
                    zzrp1.zza(azzg5[i4]);
                    zzrp1.zzCT();
                }

                azzg5[i4] = new <init>();
                zzrp1.zza(azzg5[i4]);
                zzik = azzg5;
                break;

            case 74: // 'J'
                zzil = zzrp1.readString();
                break;

            case 82: // 'R'
                zzim = zzrp1.readString();
                break;

            case 98: // 'b'
                zzin = zzrp1.readString();
                break;

            case 106: // 'j'
                version = zzrp1.readString();
                break;

            case 114: // 'r'
                if (zzio == null)
                {
                    zzio = new <init>();
                }
                zzrp1.zza(zzio);
                break;

            case 125: // '}'
                zzip = zzrp1.readFloat();
                break;

            case 130: 
                int j4 = zzsa.zzb(zzrp1, 130);
                String as1[];
                int i2;
                if (zzir == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzir.length;
                }
                as1 = new String[j4 + i2];
                j4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzir, 0, as1, 0, i2);
                    j4 = i2;
                }
                for (; j4 < as1.length - 1; j4++)
                {
                    as1[j4] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as1[j4] = zzrp1.readString();
                zzir = as1;
                break;

            case 136: 
                zzis = zzrp1.zzCW();
                break;

            case 144: 
                zziq = zzrp1.zzCX();
                break;

            case 154: 
                int k4 = zzsa.zzb(zzrp1, 154);
                String as2[];
                int j2;
                if (zzid == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zzid.length;
                }
                as2 = new String[k4 + j2];
                k4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zzid, 0, as2, 0, j2);
                    k4 = j2;
                }
                for (; k4 < as2.length - 1; k4++)
                {
                    as2[k4] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as2[k4] = zzrp1.readString();
                zzid = as2;
                break;
            }
        } while (true);
    }

    public ()
    {
        zzJ();
    }
}
