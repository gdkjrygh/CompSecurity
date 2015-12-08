// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbd

public class OnMetadataResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbd();
    final int zzCY;
    final MetadataBundle zzaeA;

    OnMetadataResponse(int i, MetadataBundle metadatabundle)
    {
        zzCY = i;
        zzaeA = metadatabundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbd.zza(this, parcel, i);
    }

    public MetadataBundle zzpS()
    {
        return zzaeA;
    }

}
