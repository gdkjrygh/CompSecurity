// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrg, zzrf, 
//            zzrn

public static final class zzA extends zzrh
{

    public int level;
    public int zzhK;
    public int zzhL;

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
            if (obj instanceof zzA)
            {
                obj = (zzA)obj;
                flag = flag1;
                if (level == ((level) (obj)).level)
                {
                    flag = flag1;
                    if (zzhK == ((zzhK) (obj)).zzhK)
                    {
                        flag = flag1;
                        if (zzhL == ((zzhL) (obj)).zzhL)
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
        return (((level + 527) * 31 + zzhK) * 31 + zzhL) * 31 + zzBI();
    }

    public zzBI zzA()
    {
        level = 1;
        zzhK = 0;
        zzhL = 0;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (level != 1)
        {
            i = j + zzrg.zzA(1, level);
        }
        j = i;
        if (zzhK != 0)
        {
            j = i + zzrg.zzA(2, zzhK);
        }
        i = j;
        if (zzhL != 0)
        {
            i = j + zzrg.zzA(3, zzhL);
        }
        return i;
    }

    public zzhL zza(zzrf zzrf1)
        throws IOException
    {
_L6:
        int i = zzrf1.zzBr();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zzrf1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zzrf1.zzBu();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            level = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zzhK = zzrf1.zzBu();
        continue; /* Loop/switch isn't completed */
_L5:
        zzhL = zzrf1.zzBu();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (level != 1)
        {
            zzrg1.zzy(1, level);
        }
        if (zzhK != 0)
        {
            zzrg1.zzy(2, zzhK);
        }
        if (zzhL != 0)
        {
            zzrg1.zzy(3, zzhL);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zza(zzrf1);
    }

    public ()
    {
        zzA();
    }
}
