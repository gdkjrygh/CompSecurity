// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            n

public class OpenContentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    final int jE;
    final int uM;
    final DriveId vy;

    OpenContentsRequest(int i, DriveId driveid, int j)
    {
        jE = i;
        vy = driveid;
        uM = j;
    }

    public OpenContentsRequest(DriveId driveid, int i)
    {
        this(1, driveid, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
