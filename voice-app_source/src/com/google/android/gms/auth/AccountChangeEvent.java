// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.auth:
//            zza

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int mVersion;
    final String zzOA;
    final long zzOw;
    final String zzOx;
    final int zzOy;
    final int zzOz;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        mVersion = i;
        zzOw = l;
        zzOx = (String)zzu.zzu(s);
        zzOy = j;
        zzOz = k;
        zzOA = s1;
    }

    public AccountChangeEvent(long l, String s, int i, int j, String s1)
    {
        mVersion = 1;
        zzOw = l;
        zzOx = (String)zzu.zzu(s);
        zzOy = i;
        zzOz = j;
        zzOA = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof AccountChangeEvent)
            {
                if (mVersion != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).mVersion || zzOw != ((AccountChangeEvent) (obj)).zzOw || !zzt.equal(zzOx, ((AccountChangeEvent) (obj)).zzOx) || zzOy != ((AccountChangeEvent) (obj)).zzOy || zzOz != ((AccountChangeEvent) (obj)).zzOz || !zzt.equal(zzOA, ((AccountChangeEvent) (obj)).zzOA))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getAccountName()
    {
        return zzOx;
    }

    public String getChangeData()
    {
        return zzOA;
    }

    public int getChangeType()
    {
        return zzOy;
    }

    public int getEventIndex()
    {
        return zzOz;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(mVersion), Long.valueOf(zzOw), zzOx, Integer.valueOf(zzOy), Integer.valueOf(zzOz), zzOA
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        zzOy;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 97
    //                   2 103
    //                   3 115
    //                   4 109;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder()).append("AccountChangeEvent {accountName = ").append(zzOx).append(", changeType = ").append(s).append(", changeData = ").append(zzOA).append(", eventIndex = ").append(zzOz).append("}").toString();
_L2:
        s = "ADDED";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "REMOVED";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "RENAMED_TO";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "RENAMED_FROM";
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
