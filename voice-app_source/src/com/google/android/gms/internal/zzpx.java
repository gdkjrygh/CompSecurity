// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrm, zzrn, zzrg, 
//            zzrf

public interface zzpx
{
    public static final class zza extends zzrh
    {

        public long zzaOZ;
        public zzaf.zzj zzaPa;
        public zzaf.zzf zziO;

        public static zza zzs(byte abyte0[])
            throws zzrm
        {
            return (zza)zzrn.zza(new zza(), abyte0);
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
            if (zzaOZ != ((zza) (obj)).zzaOZ) goto _L4; else goto _L5
_L5:
            if (zziO != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zza) (obj)).zziO != null) goto _L4; else goto _L8
_L8:
            if (zzaPa != null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            flag = flag1;
            if (((zza) (obj)).zzaPa != null) goto _L4; else goto _L9
_L9:
            return zza(((zzrh) (obj)));
_L7:
            if (!zziO.equals(((zza) (obj)).zziO))
            {
                return false;
            }
              goto _L8
            if (!zzaPa.equals(((zza) (obj)).zzaPa))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = (int)(zzaOZ ^ zzaOZ >>> 32);
            int i;
            if (zziO == null)
            {
                i = 0;
            } else
            {
                i = zziO.hashCode();
            }
            if (zzaPa != null)
            {
                j = zzaPa.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB() + zzrg.zzd(1, zzaOZ);
            int i = j;
            if (zziO != null)
            {
                i = j + zzrg.zzc(2, zziO);
            }
            j = i;
            if (zzaPa != null)
            {
                j = i + zzrg.zzc(3, zzaPa);
            }
            return j;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            zzrg1.zzb(1, zzaOZ);
            if (zziO != null)
            {
                zzrg1.zza(2, zziO);
            }
            if (zzaPa != null)
            {
                zzrg1.zza(3, zzaPa);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzu(zzrf1);
        }

        public zza zzu(zzrf zzrf1)
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
                    zzaOZ = zzrf1.zzBt();
                    break;

                case 18: // '\022'
                    if (zziO == null)
                    {
                        zziO = new zzaf.zzf();
                    }
                    zzrf1.zza(zziO);
                    break;

                case 26: // '\032'
                    if (zzaPa == null)
                    {
                        zzaPa = new zzaf.zzj();
                    }
                    zzrf1.zza(zzaPa);
                    break;
                }
            } while (true);
        }

        public zza zzzY()
        {
            zzaOZ = 0L;
            zziO = null;
            zzaPa = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zza()
        {
            zzzY();
        }
    }

}
