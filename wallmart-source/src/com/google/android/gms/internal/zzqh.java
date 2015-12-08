// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzrw, zzrx, zzrq, 
//            zzrp

public interface zzqh
{
    public static final class zza extends zzrr
    {

        public long zzaTt;
        public zzaf.zzj zzaTu;
        public zzaf.zzf zziR;

        public static zza zzs(byte abyte0[])
            throws zzrw
        {
            return (zza)zzrx.zza(new zza(), abyte0);
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
            if (!(obj instanceof zza)) goto _L4; else goto _L3
_L3:
            obj = (zza)obj;
            flag = flag1;
            if (zzaTt != ((zza) (obj)).zzaTt) goto _L4; else goto _L5
_L5:
            if (zziR != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zza) (obj)).zziR != null) goto _L4; else goto _L8
_L8:
            if (zzaTu != null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            flag = flag1;
            if (((zza) (obj)).zzaTu != null) goto _L4; else goto _L9
_L9:
            return zza(((zzrr) (obj)));
_L7:
            if (!zziR.equals(((zza) (obj)).zziR))
            {
                return false;
            }
              goto _L8
            if (!zzaTu.equals(((zza) (obj)).zzaTu))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = (int)(zzaTt ^ zzaTt >>> 32);
            int i;
            if (zziR == null)
            {
                i = 0;
            } else
            {
                i = zziR.hashCode();
            }
            if (zzaTu != null)
            {
                j = zzaTu.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzDk();
        }

        protected int zzB()
        {
            int j = super.zzB() + zzrq.zzd(1, zzaTt);
            int i = j;
            if (zziR != null)
            {
                i = j + zzrq.zzc(2, zziR);
            }
            j = i;
            if (zzaTu != null)
            {
                j = i + zzrq.zzc(3, zzaTu);
            }
            return j;
        }

        public zza zzBo()
        {
            zzaTt = 0L;
            zziR = null;
            zzaTu = null;
            zzbca = null;
            zzbcl = -1;
            return this;
        }

        public void zza(zzrq zzrq1)
            throws IOException
        {
            zzrq1.zzb(1, zzaTt);
            if (zziR != null)
            {
                zzrq1.zza(2, zziR);
            }
            if (zzaTu != null)
            {
                zzrq1.zza(3, zzaTu);
            }
            super.zza(zzrq1);
        }

        public zzrx zzb(zzrp zzrp1)
            throws IOException
        {
            return zzu(zzrp1);
        }

        public zza zzu(zzrp zzrp1)
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
                    zzaTt = zzrp1.zzCV();
                    break;

                case 18: // '\022'
                    if (zziR == null)
                    {
                        zziR = new zzaf.zzf();
                    }
                    zzrp1.zza(zziR);
                    break;

                case 26: // '\032'
                    if (zzaTu == null)
                    {
                        zzaTu = new zzaf.zzj();
                    }
                    zzrp1.zza(zzaTu);
                    break;
                }
            } while (true);
        }

        public zza()
        {
            zzBo();
        }
    }

}
