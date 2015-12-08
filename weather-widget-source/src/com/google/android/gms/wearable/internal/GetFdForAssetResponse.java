// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzar

public class GetFdForAssetResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzar();
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzbaB;

    GetFdForAssetResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        versionCode = i;
        statusCode = j;
        zzbaB = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzar.zza(this, parcel, i | 1);
    }

}
