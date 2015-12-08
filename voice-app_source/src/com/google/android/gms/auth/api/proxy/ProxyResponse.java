// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            zzc

public class ProxyResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int versionCode;
    public final byte zzPs[];
    final Bundle zzPt;
    public final int zzPu;
    public final PendingIntent zzPv;
    public final int zzPw;

    ProxyResponse(int i, int j, PendingIntent pendingintent, int k, Bundle bundle, byte abyte0[])
    {
        versionCode = i;
        zzPu = j;
        zzPw = k;
        zzPt = bundle;
        zzPs = abyte0;
        zzPv = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
