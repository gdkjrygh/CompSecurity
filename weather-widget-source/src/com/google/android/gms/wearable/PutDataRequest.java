// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable:
//            zzh, DataItem, DataItemAsset, Asset

public class PutDataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    public static final String WEAR_URI_SCHEME = "wear";
    private static final Random zzaYV = new SecureRandom();
    private final Uri mUri;
    final int mVersionCode;
    private final Bundle zzaYW;
    private byte zzayG[];

    private PutDataRequest(int i, Uri uri)
    {
        this(i, uri, new Bundle(), null);
    }

    PutDataRequest(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        mVersionCode = i;
        mUri = uri;
        zzaYW = bundle;
        zzaYW.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        zzayG = abyte0;
    }

    public static PutDataRequest create(String s)
    {
        return zzo(zzfv(s));
    }

    public static PutDataRequest createFromDataItem(DataItem dataitem)
    {
        PutDataRequest putdatarequest = zzo(dataitem.getUri());
        java.util.Map.Entry entry;
        for (Iterator iterator = dataitem.getAssets().entrySet().iterator(); iterator.hasNext(); putdatarequest.putAsset((String)entry.getKey(), Asset.createFromRef(((DataItemAsset)entry.getValue()).getId())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (((DataItemAsset)entry.getValue()).getId() == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("Cannot create an asset for a put request without a digest: ").append((String)entry.getKey()).toString());
            }
        }

        putdatarequest.setData(dataitem.getData());
        return putdatarequest;
    }

    public static PutDataRequest createWithAutoAppendedId(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s);
        if (!s.endsWith("/"))
        {
            stringbuilder.append("/");
        }
        stringbuilder.append("PN").append(zzaYV.nextLong());
        return new PutDataRequest(1, zzfv(stringbuilder.toString()));
    }

    private static Uri zzfv(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!s.startsWith("/"))
        {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (s.startsWith("//"))
        {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else
        {
            return (new android.net.Uri.Builder()).scheme("wear").path(s).build();
        }
    }

    public static PutDataRequest zzo(Uri uri)
    {
        return new PutDataRequest(1, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public Asset getAsset(String s)
    {
        return (Asset)zzaYW.getParcelable(s);
    }

    public Map getAssets()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = zzaYW.keySet().iterator(); iterator.hasNext(); hashmap.put(s, (Asset)zzaYW.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }

    public byte[] getData()
    {
        return zzayG;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean hasAsset(String s)
    {
        return zzaYW.containsKey(s);
    }

    public PutDataRequest putAsset(String s, Asset asset)
    {
        zzx.zzv(s);
        zzx.zzv(asset);
        zzaYW.putParcelable(s, asset);
        return this;
    }

    public PutDataRequest removeAsset(String s)
    {
        zzaYW.remove(s);
        return this;
    }

    public PutDataRequest setData(byte abyte0[])
    {
        zzayG = abyte0;
        return this;
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataMap", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("PutDataRequest[");
        StringBuilder stringbuilder1 = (new StringBuilder()).append("dataSz=");
        Object obj;
        if (zzayG == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(zzayG.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(zzaYW.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = zzaYW.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(zzaYW.getParcelable(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public Bundle zzCr()
    {
        return zzaYW;
    }

}
