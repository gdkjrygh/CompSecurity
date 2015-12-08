// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.auth:
//            zza

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int mVersion;
    final long zzQD;
    final String zzQE;
    final int zzQF;
    final int zzQG;
    final String zzQH;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        mVersion = i;
        zzQD = l;
        zzQE = (String)zzx.zzv(s);
        zzQF = j;
        zzQG = k;
        zzQH = s1;
    }

    public AccountChangeEvent(long l, String s, int i, int j, String s1)
    {
        mVersion = 1;
        zzQD = l;
        zzQE = (String)zzx.zzv(s);
        zzQF = i;
        zzQG = j;
        zzQH = s1;
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
                if (mVersion != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).mVersion || zzQD != ((AccountChangeEvent) (obj)).zzQD || !zzw.equal(zzQE, ((AccountChangeEvent) (obj)).zzQE) || zzQF != ((AccountChangeEvent) (obj)).zzQF || zzQG != ((AccountChangeEvent) (obj)).zzQG || !zzw.equal(zzQH, ((AccountChangeEvent) (obj)).zzQH))
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
        return zzQE;
    }

    public String getChangeData()
    {
        return zzQH;
    }

    public int getChangeType()
    {
        return zzQF;
    }

    public int getEventIndex()
    {
        return zzQG;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(mVersion), Long.valueOf(zzQD), zzQE, Integer.valueOf(zzQF), Integer.valueOf(zzQG), zzQH
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        zzQF;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 97
    //                   2 103
    //                   3 115
    //                   4 109;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder()).append("AccountChangeEvent {accountName = ").append(zzQE).append(", changeType = ").append(s).append(", changeData = ").append(zzQH).append(", eventIndex = ").append(zzQG).append("}").toString();
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
