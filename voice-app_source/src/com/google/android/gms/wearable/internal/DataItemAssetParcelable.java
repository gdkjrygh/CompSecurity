// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzy

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new zzy();
    final int zzCY;
    private final String zzKI;
    private final String zztw;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        zzCY = i;
        zzKI = s;
        zztw = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        zzCY = 1;
        zzKI = (String)zzu.zzu(dataitemasset.getId());
        zztw = (String)zzu.zzu(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return zzBd();
    }

    public String getDataItemKey()
    {
        return zztw;
    }

    public String getId()
    {
        return zzKI;
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
        if (zzKI == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(zzKI);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(zztw);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzy.zza(this, parcel, i);
    }

    public DataItemAsset zzBd()
    {
        return this;
    }

}
