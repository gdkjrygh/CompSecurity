// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzsb, zzrq, zzrp, 
//            zzrx

public static final class zzDz extends zzrr
{

    public String version;
    public String zzbcA;
    public int zzbcz;

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
        if (!(obj instanceof zzDz)) goto _L4; else goto _L3
_L3:
        obj = (zzDz)obj;
        flag = flag1;
        if (zzbcz != ((zzbcz) (obj)).zzbcz) goto _L4; else goto _L5
_L5:
        if (zzbcA != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzbcA) (obj)).zzbcA != null) goto _L4; else goto _L8
_L8:
        if (version != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L9
_L9:
        return zza(((zzrr) (obj)));
_L7:
        if (!zzbcA.equals(((zzbcA) (obj)).zzbcA))
        {
            return false;
        }
          goto _L8
        if (!version.equals(((version) (obj)).version))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = zzbcz;
        int i;
        if (zzbcA == null)
        {
            i = 0;
        } else
        {
            i = zzbcA.hashCode();
        }
        if (version != null)
        {
            j = version.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzDk();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (zzbcz != 0)
        {
            i = j + zzrq.zzB(1, zzbcz);
        }
        j = i;
        if (!zzbcA.equals(""))
        {
            j = i + zzrq.zzl(2, zzbcA);
        }
        i = j;
        if (!version.equals(""))
        {
            i = j + zzrq.zzl(3, version);
        }
        return i;
    }

    public version zzC(zzrp zzrp1)
        throws IOException
    {
_L6:
        int i = zzrp1.zzCT();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 199
    //                   26: 210;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zzrp1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zzrp1.zzCW();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            zzbcz = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zzbcA = zzrp1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        version = zzrp1.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public String zzDz()
    {
        zzbcz = 0;
        zzbcA = "";
        version = "";
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (zzbcz != 0)
        {
            zzrq1.zzz(1, zzbcz);
        }
        if (!zzbcA.equals(""))
        {
            zzrq1.zzb(2, zzbcA);
        }
        if (!version.equals(""))
        {
            zzrq1.zzb(3, version);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzC(zzrp1);
    }

    public ()
    {
        zzDz();
    }
}
