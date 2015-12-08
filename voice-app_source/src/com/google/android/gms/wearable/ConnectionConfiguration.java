// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.wearable:
//            zze

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final String mName;
    final int zzCY;
    private boolean zzMq;
    private final int zzSq;
    private final boolean zzaSQ;
    private String zzaSR;
    private boolean zzaSS;
    private String zzaST;
    private final int zzadD;
    private final String zzajO;

    ConnectionConfiguration(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2, boolean flag2, String s3)
    {
        zzCY = i;
        mName = s;
        zzajO = s1;
        zzSq = j;
        zzadD = k;
        zzaSQ = flag;
        zzMq = flag1;
        zzaSR = s2;
        zzaSS = flag2;
        zzaST = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionConfiguration)
        {
            if (zzt.equal(Integer.valueOf(zzCY), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).zzCY)) && zzt.equal(mName, ((ConnectionConfiguration) (obj)).mName) && zzt.equal(zzajO, ((ConnectionConfiguration) (obj)).zzajO) && zzt.equal(Integer.valueOf(zzSq), Integer.valueOf(((ConnectionConfiguration) (obj)).zzSq)) && zzt.equal(Integer.valueOf(zzadD), Integer.valueOf(((ConnectionConfiguration) (obj)).zzadD)) && zzt.equal(Boolean.valueOf(zzaSQ), Boolean.valueOf(((ConnectionConfiguration) (obj)).zzaSQ)) && zzt.equal(Boolean.valueOf(zzaSS), Boolean.valueOf(((ConnectionConfiguration) (obj)).zzaSS)))
            {
                return true;
            }
        }
        return false;
    }

    public String getAddress()
    {
        return zzajO;
    }

    public String getName()
    {
        return mName;
    }

    public String getNodeId()
    {
        return zzaST;
    }

    public int getRole()
    {
        return zzadD;
    }

    public int getType()
    {
        return zzSq;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzCY), mName, zzajO, Integer.valueOf(zzSq), Integer.valueOf(zzadD), Boolean.valueOf(zzaSQ), Boolean.valueOf(zzaSS)
        });
    }

    public boolean isConnected()
    {
        return zzMq;
    }

    public boolean isEnabled()
    {
        return zzaSQ;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(mName).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(zzajO).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(zzSq).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(zzadD).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(zzaSQ).toString());
        stringbuilder.append((new StringBuilder()).append(", mIsConnected=").append(zzMq).toString());
        stringbuilder.append((new StringBuilder()).append(", mPeerNodeId=").append(zzaSR).toString());
        stringbuilder.append((new StringBuilder()).append(", mBtlePriority=").append(zzaSS).toString());
        stringbuilder.append((new StringBuilder()).append(", mNodeId=").append(zzaST).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public String zzAP()
    {
        return zzaSR;
    }

    public boolean zzAQ()
    {
        return zzaSS;
    }

}
