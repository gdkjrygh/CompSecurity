// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzal

public class GetCloudSyncOptInStatusResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzal();
    public final int statusCode;
    public final int versionCode;
    public final boolean zzbav;
    public final boolean zzbaw;

    GetCloudSyncOptInStatusResponse(int i, int j, boolean flag, boolean flag1)
    {
        versionCode = i;
        statusCode = j;
        zzbav = flag;
        zzbaw = flag1;
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
