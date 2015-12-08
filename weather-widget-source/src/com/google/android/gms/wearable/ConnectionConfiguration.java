// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.wearable:
//            zzg

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final String mName;
    final int mVersionCode;
    private boolean zzOq;
    private final int zzUS;
    private final boolean zzaYO;
    private String zzaYP;
    private boolean zzaYQ;
    private String zzaYR;
    private final int zzahc;
    private final String zzanu;

    ConnectionConfiguration(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2, boolean flag2, String s3)
    {
        mVersionCode = i;
        mName = s;
        zzanu = s1;
        zzUS = j;
        zzahc = k;
        zzaYO = flag;
        zzOq = flag1;
        zzaYP = s2;
        zzaYQ = flag2;
        zzaYR = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionConfiguration)
        {
            if (zzw.equal(Integer.valueOf(mVersionCode), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).mVersionCode)) && zzw.equal(mName, ((ConnectionConfiguration) (obj)).mName) && zzw.equal(zzanu, ((ConnectionConfiguration) (obj)).zzanu) && zzw.equal(Integer.valueOf(zzUS), Integer.valueOf(((ConnectionConfiguration) (obj)).zzUS)) && zzw.equal(Integer.valueOf(zzahc), Integer.valueOf(((ConnectionConfiguration) (obj)).zzahc)) && zzw.equal(Boolean.valueOf(zzaYO), Boolean.valueOf(((ConnectionConfiguration) (obj)).zzaYO)) && zzw.equal(Boolean.valueOf(zzaYQ), Boolean.valueOf(((ConnectionConfiguration) (obj)).zzaYQ)))
            {
                return true;
            }
        }
        return false;
    }

    public String getAddress()
    {
        return zzanu;
    }

    public String getName()
    {
        return mName;
    }

    public String getNodeId()
    {
        return zzaYR;
    }

    public int getRole()
    {
        return zzahc;
    }

    public int getType()
    {
        return zzUS;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), mName, zzanu, Integer.valueOf(zzUS), Integer.valueOf(zzahc), Boolean.valueOf(zzaYO), Boolean.valueOf(zzaYQ)
        });
    }

    public boolean isConnected()
    {
        return zzOq;
    }

    public boolean isEnabled()
    {
        return zzaYO;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(mName).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(zzanu).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(zzUS).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(zzahc).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(zzaYO).toString());
        stringbuilder.append((new StringBuilder()).append(", mIsConnected=").append(zzOq).toString());
        stringbuilder.append((new StringBuilder()).append(", mPeerNodeId=").append(zzaYP).toString());
        stringbuilder.append((new StringBuilder()).append(", mBtlePriority=").append(zzaYQ).toString());
        stringbuilder.append((new StringBuilder()).append(", mNodeId=").append(zzaYR).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public String zzCp()
    {
        return zzaYP;
    }

    public boolean zzCq()
    {
        return zzaYQ;
    }

}
