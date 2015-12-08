// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            d

public class CreateFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int jE;
    final int uL;
    final String uS;
    final DriveId uT;
    final MetadataBundle vg;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadatabundle, int j, String s, DriveId driveid)
    {
        jE = i;
        vg = metadatabundle;
        uL = j;
        uS = s;
        uT = driveid;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadatabundle, int i, String s, DriveId driveid)
    {
        this(1, metadatabundle, i, s, driveid);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
