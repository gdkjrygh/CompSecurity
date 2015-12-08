// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrq, zzrp, 
//            zzrx

public static final class zzA extends zzrr
{

    public int level;
    public int zzhN;
    public int zzhO;

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
                    if (zzhN == ((zzhN) (obj)).zzhN)
                    {
                        flag = flag1;
                        if (zzhO == ((zzhO) (obj)).zzhO)
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
        return (((level + 527) * 31 + zzhN) * 31 + zzhO) * 31 + zzDk();
    }

    public zzDk zzA()
    {
        level = 1;
        zzhN = 0;
        zzhO = 0;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (level != 1)
        {
            i = j + zzrq.zzB(1, level);
        }
        j = i;
        if (zzhN != 0)
        {
            j = i + zzrq.zzB(2, zzhN);
        }
        i = j;
        if (zzhO != 0)
        {
            i = j + zzrq.zzB(3, zzhO);
        }
        return i;
    }

    public zzhO zza(zzrp zzrp1)
        throws IOException
    {
_L6:
        int i = zzrp1.zzCT();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zzrp1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zzrp1.zzCW();
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
        zzhN = zzrp1.zzCW();
        continue; /* Loop/switch isn't completed */
_L5:
        zzhO = zzrp1.zzCW();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (level != 1)
        {
            zzrq1.zzz(1, level);
        }
        if (zzhN != 0)
        {
            zzrq1.zzz(2, zzhN);
        }
        if (zzhO != 0)
        {
            zzrq1.zzz(3, zzhO);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zza(zzrp1);
    }

    public ()
    {
        zzA();
    }
}
