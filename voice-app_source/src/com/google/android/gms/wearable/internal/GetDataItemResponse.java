// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzan, DataItemParcelable

public class GetDataItemResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzan();
    public final int statusCode;
    public final int versionCode;
    public final DataItemParcelable zzaUx;

    GetDataItemResponse(int i, int j, DataItemParcelable dataitemparcelable)
    {
        versionCode = i;
        statusCode = j;
        zzaUx = dataitemparcelable;
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
