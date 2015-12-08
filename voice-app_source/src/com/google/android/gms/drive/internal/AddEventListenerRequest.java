// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zza

public class AddEventListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    final DriveId zzacT;
    final int zzaca;
    final ChangesAvailableOptions zzadO;

    AddEventListenerRequest(int i, DriveId driveid, int j, ChangesAvailableOptions changesavailableoptions)
    {
        zzCY = i;
        zzacT = driveid;
        zzaca = j;
        zzadO = changesavailableoptions;
    }

    public AddEventListenerRequest(DriveId driveid, int i, ChangesAvailableOptions changesavailableoptions)
    {
        this(1, driveid, i, changesavailableoptions);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
