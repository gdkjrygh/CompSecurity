// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            zzc

public class ProxyResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    public final byte body[];
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;
    final int versionCode;
    final Bundle zzRE;

    ProxyResponse(int i, int j, PendingIntent pendingintent, int k, Bundle bundle, byte abyte0[])
    {
        versionCode = i;
        googlePlayServicesStatusCode = j;
        statusCode = k;
        zzRE = bundle;
        body = abyte0;
        recoveryAction = pendingintent;
    }

    public ProxyResponse(int i, PendingIntent pendingintent, int j, Bundle bundle, byte abyte0[])
    {
        this(1, i, pendingintent, j, bundle, abyte0);
    }

    private ProxyResponse(int i, Bundle bundle, byte abyte0[])
    {
        this(1, 0, null, i, bundle, abyte0);
    }

    public ProxyResponse(int i, Map map, byte abyte0[])
    {
        this(i, zzC(map), abyte0);
    }

    public static ProxyResponse createErrorProxyResponse(int i, PendingIntent pendingintent, int j, Map map, byte abyte0[])
    {
        return new ProxyResponse(1, i, pendingintent, j, zzC(map), abyte0);
    }

    private static Bundle zzC(Map map)
    {
        Bundle bundle = new Bundle();
        if (map == null)
        {
            return bundle;
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); bundle.putString((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public Map getHeaders()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = zzRE.keySet().iterator(); iterator.hasNext(); hashmap.put(s, zzRE.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
