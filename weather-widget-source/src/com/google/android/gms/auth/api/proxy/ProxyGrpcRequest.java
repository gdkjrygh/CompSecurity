// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            zza

public class ProxyGrpcRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public final byte body[];
    public final String hostname;
    public final String method;
    public final int port;
    public final long timeoutMillis;
    final int versionCode;

    ProxyGrpcRequest(int i, String s, int j, long l, byte abyte0[], String s1)
    {
        versionCode = i;
        hostname = s;
        port = j;
        timeoutMillis = l;
        body = abyte0;
        method = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
