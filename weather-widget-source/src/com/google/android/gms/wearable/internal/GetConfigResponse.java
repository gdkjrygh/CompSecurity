// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzan

public class GetConfigResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzan();
    public final int statusCode;
    public final int versionCode;
    public final ConnectionConfiguration zzbax;

    GetConfigResponse(int i, int j, ConnectionConfiguration connectionconfiguration)
    {
        versionCode = i;
        statusCode = j;
        zzbax = connectionconfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzan.zza(this, parcel, i);
    }

}
