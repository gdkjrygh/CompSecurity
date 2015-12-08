// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzad, DataItemAssetParcelable

public class DataItemParcelable
    implements SafeParcelable, DataItem
{

    public static final android.os.Parcelable.Creator CREATOR = new zzad();
    private final Uri mUri;
    final int mVersionCode;
    private byte zzayG[];
    private final Map zzbap;

    DataItemParcelable(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        mVersionCode = i;
        mUri = uri;
        uri = new HashMap();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); uri.put(s, (DataItemAssetParcelable)bundle.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        zzbap = uri;
        zzayG = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return zzCH();
    }

    public Map getAssets()
    {
        return zzbap;
    }

    public byte[] getData()
    {
        return zzayG;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItem setData(byte abyte0[])
    {
        return zzv(abyte0);
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        StringBuilder stringbuilder1 = (new StringBuilder()).append(",dataSz=");
        Object obj;
        if (zzayG == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(zzayG.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(zzbap.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = zzbap.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(zzbap.get(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzad.zza(this, parcel, i);
    }

    public DataItemParcelable zzCH()
    {
        return this;
    }

    public Bundle zzCr()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        java.util.Map.Entry entry;
        for (Iterator iterator = zzbap.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), new DataItemAssetParcelable((DataItemAsset)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return bundle;
    }

    public DataItemParcelable zzv(byte abyte0[])
    {
        zzayG = abyte0;
        return this;
    }

}
