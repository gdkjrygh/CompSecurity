// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrr, zzrl, zzrq, 
//            zzrg, zzrf, zzrn

public static final class zzBY extends zzrh
{

    public byte zzaWv[];
    public byte zzaWw[][];
    public boolean zzaWx;

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
            if (obj instanceof zzBY)
            {
                obj = (zzBY)obj;
                flag = flag1;
                if (Arrays.equals(zzaWv, ((zzaWv) (obj)).zzaWv))
                {
                    flag = flag1;
                    if (zzrl.zza(zzaWw, ((zzaWw) (obj)).zzaWw))
                    {
                        flag = flag1;
                        if (zzaWx == ((zzaWx) (obj)).zzaWx)
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
        int i = Arrays.hashCode(zzaWv);
        int j = zzrl.zza(zzaWw);
        char c;
        if (zzaWx)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (c + ((i + 527) * 31 + j) * 31) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int j = super.zzB();
        int i = j;
        if (!Arrays.equals(zzaWv, zzrq.zzaWo))
        {
            i = j + zzrg.zzb(1, zzaWv);
        }
        j = i;
        if (zzaWw != null)
        {
            j = i;
            if (zzaWw.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < zzaWw.length;)
                {
                    byte abyte0[] = zzaWw[j];
                    int j1 = k;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        i1 = l + 1;
                        j1 = k + zzrg.zzC(abyte0);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (zzaWx)
        {
            i = j + zzrg.zzc(3, zzaWx);
        }
        return i;
    }

    public zzaWx zzBY()
    {
        zzaWv = zzrq.zzaWo;
        zzaWw = zzrq.zzaWn;
        zzaWx = false;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public zzaWf zzD(zzrf zzrf1)
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
                zzaWv = zzrf1.readBytes();
                break;

            case 18: // '\022'
                int k = zzrq.zzb(zzrf1, 18);
                byte abyte0[][];
                int j;
                if (zzaWw == null)
                {
                    j = 0;
                } else
                {
                    j = zzaWw.length;
                }
                abyte0 = new byte[k + j][];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzaWw, 0, abyte0, 0, j);
                    k = j;
                }
                for (; k < abyte0.length - 1; k++)
                {
                    abyte0[k] = zzrf1.readBytes();
                    zzrf1.zzBr();
                }

                abyte0[k] = zzrf1.readBytes();
                zzaWw = abyte0;
                break;

            case 24: // '\030'
                zzaWx = zzrf1.zzBv();
                break;
            }
        } while (true);
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (!Arrays.equals(zzaWv, zzrq.zzaWo))
        {
            zzrg1.zza(1, zzaWv);
        }
        if (zzaWw != null && zzaWw.length > 0)
        {
            for (int i = 0; i < zzaWw.length; i++)
            {
                byte abyte0[] = zzaWw[i];
                if (abyte0 != null)
                {
                    zzrg1.zza(2, abyte0);
                }
            }

        }
        if (zzaWx)
        {
            zzrg1.zzb(3, zzaWx);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzD(zzrf1);
    }

    public ()
    {
        zzBY();
    }
}
