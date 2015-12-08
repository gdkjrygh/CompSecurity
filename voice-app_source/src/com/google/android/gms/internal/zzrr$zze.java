// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrr, zzrl, zzrg, 
//            zzrf, zzrn

public static final class zzCb extends zzrh
{

    private static volatile zzF zzaWN[];
    public String value;
    public String zzaC;

    public static zzCb[] zzCa()
    {
        if (zzaWN == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zzaWN == null)
                {
                    zzaWN = new zzaWN[0];
                }
            }
        }
        return zzaWN;
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
        if (!(obj instanceof zzaWN)) goto _L4; else goto _L3
_L3:
        obj = (zzaWN)obj;
        if (zzaC != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((zzaC) (obj)).zzaC != null) goto _L4; else goto _L7
_L7:
        if (value != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((value) (obj)).value != null) goto _L4; else goto _L8
_L8:
        return zza(((zzrh) (obj)));
_L6:
        if (!zzaC.equals(((zzaC) (obj)).zzaC))
        {
            return false;
        }
          goto _L7
        if (!value.equals(((value) (obj)).value))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (zzaC == null)
        {
            i = 0;
        } else
        {
            i = zzaC.hashCode();
        }
        if (value != null)
        {
            j = value.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (!zzaC.equals(""))
        {
            i = j + zzrg.zzk(1, zzaC);
        }
        j = i;
        if (!value.equals(""))
        {
            j = i + zzrg.zzk(2, value);
        }
        return j;
    }

    public value zzCb()
    {
        zzaC = "";
        value = "";
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public zzaWf zzF(zzrf zzrf1)
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
                zzaC = zzrf1.readString();
                break;

            case 18: // '\022'
                value = zzrf1.readString();
                break;
            }
        } while (true);
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (!zzaC.equals(""))
        {
            zzrg1.zzb(1, zzaC);
        }
        if (!value.equals(""))
        {
            zzrg1.zzb(2, value);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzF(zzrf1);
    }

    public ()
    {
        zzCb();
    }
}
