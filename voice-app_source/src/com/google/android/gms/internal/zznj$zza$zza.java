// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zznj, zzrl, zzrg, 
//            zzrf, zzrn

public static final class zztW extends zzrh
{

    private static volatile zzaWf zzawl[];
    public int viewId;
    public String zzawm;
    public String zzawn;

    public static zztW[] zztV()
    {
        if (zzawl == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zzawl == null)
                {
                    zzawl = new zzawl[0];
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
        if (!(obj instanceof zzawl)) goto _L4; else goto _L3
_L3:
        obj = (zzawl)obj;
        if (zzawm != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((zzawm) (obj)).zzawm != null) goto _L4; else goto _L7
_L7:
        if (zzawn != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((zzawn) (obj)).zzawn != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (viewId == ((viewId) (obj)).viewId)
        {
            return zza(((zzrh) (obj)));
        }
          goto _L4
_L6:
        if (!zzawm.equals(((zzawm) (obj)).zzawm))
        {
            return false;
        }
          goto _L7
        if (!zzawn.equals(((zzawn) (obj)).zzawn))
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

    public zzq zzq(zzrf zzrf1)
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

    public viewId zztW()
    {
        zzawm = "";
        zzawn = "";
        viewId = 0;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public ()
    {
        zztW();
    }
}
