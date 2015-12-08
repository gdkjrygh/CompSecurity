// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrr, zzrg, zzrf, 
//            zzrn

public static final class zzBX extends zzrh
{

    public String version;
    public int zzaWt;
    public String zzaWu;

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
        if (!(obj instanceof zzBX)) goto _L4; else goto _L3
_L3:
        obj = (zzBX)obj;
        flag = flag1;
        if (zzaWt != ((zzaWt) (obj)).zzaWt) goto _L4; else goto _L5
_L5:
        if (zzaWu != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzaWu) (obj)).zzaWu != null) goto _L4; else goto _L8
_L8:
        if (version != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L9
_L9:
        return zza(((zzrh) (obj)));
_L7:
        if (!zzaWu.equals(((zzaWu) (obj)).zzaWu))
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
        int k = zzaWt;
        int i;
        if (zzaWu == null)
        {
            i = 0;
        } else
        {
            i = zzaWu.hashCode();
        }
        if (version != null)
        {
            j = version.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (zzaWt != 0)
        {
            i = j + zzrg.zzA(1, zzaWt);
        }
        j = i;
        if (!zzaWu.equals(""))
        {
            j = i + zzrg.zzk(2, zzaWu);
        }
        i = j;
        if (!version.equals(""))
        {
            i = j + zzrg.zzk(3, version);
        }
        return i;
    }

    public version zzBX()
    {
        zzaWt = 0;
        zzaWu = "";
        version = "";
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public zzaWf zzC(zzrf zzrf1)
        throws IOException
    {
_L6:
        int i = zzrf1.zzBr();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 199
    //                   26: 210;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zzrf1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zzrf1.zzBu();
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
            zzaWt = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zzaWu = zzrf1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        version = zzrf1.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzaWt != 0)
        {
            zzrg1.zzy(1, zzaWt);
        }
        if (!zzaWu.equals(""))
        {
            zzrg1.zzb(2, zzaWu);
        }
        if (!version.equals(""))
        {
            zzrg1.zzb(3, version);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzC(zzrf1);
    }

    public ()
    {
        zzBX();
    }
}
