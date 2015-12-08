// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            j

public class PlacePhotoResult
    implements z, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int a;
    final BitmapTeleporter b;
    private final Status c;
    private final Bitmap d;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapteleporter)
    {
        a = i;
        c = status;
        b = bitmapteleporter;
        if (b != null)
        {
            d = bitmapteleporter.a();
            return;
        } else
        {
            d = null;
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

    public String toString()
    {
        return ar.a(this).a("status", c).a("bitmap", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
