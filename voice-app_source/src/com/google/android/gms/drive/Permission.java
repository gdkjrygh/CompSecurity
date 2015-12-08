// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.drive:
//            zzh

public class Permission
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final int zzCY;
    private int zzadA;
    private String zzadB;
    private String zzadC;
    private int zzadD;
    private boolean zzadE;
    private String zzadz;

    Permission(int i, String s, int j, String s1, String s2, int k, boolean flag)
    {
        zzCY = i;
        zzadz = s;
        zzadA = j;
        zzadB = s1;
        zzadC = s2;
        zzadD = k;
        zzadE = flag;
    }

    public static boolean zzbZ(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 256: 
        case 257: 
        case 258: 
            return true;
        }
    }

    public static boolean zzca(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (Permission)obj;
        if (!zzt.equal(zzadz, ((Permission) (obj)).zzadz) || zzadA != ((Permission) (obj)).zzadA || zzadD != ((Permission) (obj)).zzadD)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzadE == ((Permission) (obj)).zzadE) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getRole()
    {
        if (!zzca(zzadD))
        {
            return -1;
        } else
        {
            return zzadD;
        }
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzadz, Integer.valueOf(zzadA), Integer.valueOf(zzadD), Boolean.valueOf(zzadE)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public String zzpo()
    {
        if (!zzbZ(zzadA))
        {
            return null;
        } else
        {
            return zzadz;
        }
    }

    public int zzpp()
    {
        if (!zzbZ(zzadA))
        {
            return -1;
        } else
        {
            return zzadA;
        }
    }

    public String zzpq()
    {
        return zzadB;
    }

    public String zzpr()
    {
        return zzadC;
    }

    public boolean zzps()
    {
        return zzadE;
    }

}
