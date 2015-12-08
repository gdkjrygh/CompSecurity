// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaa

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaa();
    final int mVersionCode;
    private final String zztP;
    private final String zzwj;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        mVersionCode = i;
        zzwj = s;
        zztP = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        mVersionCode = 1;
        zzwj = (String)zzx.zzv(dataitemasset.getId());
        zztP = (String)zzx.zzv(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return zzCF();
    }

    public String getDataItemKey()
    {
        return zztP;
    }

    public String getId()
    {
        return zzwj;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (zzwj == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(zzwj);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(zztP);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaa.zza(this, parcel, i);
    }

    public DataItemAsset zzCF()
    {
        return this;
    }

}
