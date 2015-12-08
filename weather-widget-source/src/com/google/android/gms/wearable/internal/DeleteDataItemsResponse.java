// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaf

public class DeleteDataItemsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaf();
    public final int statusCode;
    public final int versionCode;
    public final int zzbaq;

    DeleteDataItemsResponse(int i, int j, int k)
    {
        versionCode = i;
        statusCode = j;
        zzbaq = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaf.zza(this, parcel, i);
    }

}
