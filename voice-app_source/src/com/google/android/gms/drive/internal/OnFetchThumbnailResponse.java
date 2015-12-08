// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzba

public class OnFetchThumbnailResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzba();
    final int zzCY;
    final ParcelFileDescriptor zzago;

    OnFetchThumbnailResponse(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        zzCY = i;
        zzago = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzba.zza(this, parcel, i | 1);
    }

}
