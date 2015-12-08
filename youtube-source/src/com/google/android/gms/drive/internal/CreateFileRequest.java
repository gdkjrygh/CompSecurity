// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.drive.internal:
//            e

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int jE;
    final Contents ve;
    final MetadataBundle vg;
    final DriveId vh;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents)
    {
        jE = i;
        vh = (DriveId)gi.a(driveid);
        vg = (MetadataBundle)gi.a(metadatabundle);
        ve = (Contents)gi.a(contents);
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, Contents contents)
    {
        this(1, driveid, metadatabundle, contents);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
