// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zznj, zzrl, zzrg, 
//            zzrf, zzrq, zzrn

public static final class zztU extends zzrh
{
    public static final class zza extends zzrh
    {

        private static volatile zza zzawl[];
        public int viewId;
        public String zzawm;
        public String zzawn;

        public static zza[] zztV()
        {
            if (zzawl == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzawl == null)
                    {
                        zzawl = new zza[0];
                    }
                }
            }
            return zzawl;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
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
            if (zzawm != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zza) (obj)).zzawm != null) goto _L4; else goto _L7
_L7:
            if (zzawn != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zza) (obj)).zzawn != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (viewId == ((zza) (obj)).viewId)
            {
                return zza(((zzrh) (obj)));
            }
              goto _L4
_L6:
            if (!zzawm.equals(((zza) (obj)).zzawm))
            {
                return false;
            }
              goto _L7
            if (!zzawn.equals(((zza) (obj)).zzawn))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (zzawm == null)
            {
                i = 0;
            } else
            {
                i = zzawm.hashCode();
            }
            if (zzawn != null)
            {
                j = zzawn.hashCode();
            }
            return (((i + 527) * 31 + j) * 31 + viewId) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!zzawm.equals(""))
            {
                i = j + zzrg.zzk(1, zzawm);
            }
            j = i;
            if (!zzawn.equals(""))
            {
                j = i + zzrg.zzk(2, zzawn);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + zzrg.zzA(3, viewId);
            }
            return i;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!zzawm.equals(""))
            {
                zzrg1.zzb(1, zzawm);
            }
            if (!zzawn.equals(""))
            {
                zzrg1.zzb(2, zzawn);
            }
            if (viewId != 0)
            {
                zzrg1.zzy(3, viewId);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzq(zzrf1);
        }

        public zza zzq(zzrf zzrf1)
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
                    zzawm = zzrf1.readString();
                    break;

                case 18: // '\022'
                    zzawn = zzrf1.readString();
                    break;

                case 24: // '\030'
                    viewId = zzrf1.zzBu();
                    break;
                }
            } while (true);
        }

        public zza zztW()
        {
            zzawm = "";
            zzawn = "";
            viewId = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zza()
        {
            zztW();
        }
    }


    public zza zzawk[];

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
            if (obj instanceof zza)
            {
                obj = (zza)obj;
                flag = flag1;
                if (zzrl.equals(zzawk, ((zzawk) (obj)).zzawk))
                {
                    return zza(((zzrh) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (zzrl.hashCode(zzawk) + 527) * 31 + zzBI();
    }

    protected int zzB()
    {
        int i = super.zzB();
        int k = i;
        if (zzawk != null)
        {
            k = i;
            if (zzawk.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= zzawk.length)
                    {
                        break;
                    }
                    zza zza1 = zzawk[j];
                    k = i;
                    if (zza1 != null)
                    {
                        k = i + zzrg.zzc(1, zza1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzawk != null && zzawk.length > 0)
        {
            for (int i = 0; i < zzawk.length; i++)
            {
                zza zza1 = zzawk[i];
                if (zza1 != null)
                {
                    zzrg1.zza(1, zza1);
                }
            }

        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzp(zzrf1);
    }

    public zzp zzp(zzrf zzrf1)
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
                int k = zzrq.zzb(zzrf1, 10);
                zza azza[];
                int j;
                if (zzawk == null)
                {
                    j = 0;
                } else
                {
                    j = zzawk.length;
                }
                azza = new zza[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzawk, 0, azza, 0, j);
                    k = j;
                }
                for (; k < azza.length - 1; k++)
                {
                    azza[k] = new zza();
                    zzrf1.zza(azza[k]);
                    zzrf1.zzBr();
                }

                azza[k] = new zza();
                zzrf1.zza(azza[k]);
                zzawk = azza;
                break;
            }
        } while (true);
    }

    public zzawk zztU()
    {
        zzawk = zza.zztV();
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public zza.zztW()
    {
        zztU();
    }
}
