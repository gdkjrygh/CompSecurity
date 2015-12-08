// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbe, DataItemParcelable

public class PutDataResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbe();
    public final int statusCode;
    public final int versionCode;
    public final DataItemParcelable zzbaA;

    PutDataResponse(int i, int j, DataItemParcelable dataitemparcelable)
    {
        versionCode = i;
        statusCode = j;
        zzbaA = dataitemparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbe.zza(this, parcel, i);
    }

}
