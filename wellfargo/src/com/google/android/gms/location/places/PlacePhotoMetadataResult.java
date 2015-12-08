// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            i, b

public class PlacePhotoMetadataResult
    implements z, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    final int a;
    final DataHolder b;
    private final Status c;
    private final b d;

    PlacePhotoMetadataResult(int j, Status status, DataHolder dataholder)
    {
        a = j;
        c = status;
        b = dataholder;
        if (dataholder == null)
        {
            d = null;
            return;
        } else
        {
            d = new b(b);
            return;
        }
    }

    public Status a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
