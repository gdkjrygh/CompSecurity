// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaj

public class GetChannelOutputStreamResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaj();
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzbat;

    GetChannelOutputStreamResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        versionCode = i;
        statusCode = j;
        zzbat = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaj.zza(this, parcel, i);
    }

}
