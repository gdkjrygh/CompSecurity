// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzal

public class GetConfigsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzal();
    public final int statusCode;
    public final int versionCode;
    public final ConnectionConfiguration zzaUv[];

    GetConfigsResponse(int i, int j, ConnectionConfiguration aconnectionconfiguration[])
    {
        versionCode = i;
        statusCode = j;
        zzaUv = aconnectionconfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzal.zza(this, parcel, i);
    }

}
