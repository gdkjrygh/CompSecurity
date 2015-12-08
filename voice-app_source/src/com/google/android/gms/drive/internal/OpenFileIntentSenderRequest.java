// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbj

public class OpenFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbj();
    final int zzCY;
    final String zzadv;
    final String zzadw[];
    final DriveId zzady;
    final FilterHolder zzagt;

    OpenFileIntentSenderRequest(int i, String s, String as[], DriveId driveid, FilterHolder filterholder)
    {
        zzCY = i;
        zzadv = s;
        zzadw = as;
        zzady = driveid;
        zzagt = filterholder;
    }

    public OpenFileIntentSenderRequest(String s, String as[], DriveId driveid, FilterHolder filterholder)
    {
        this(1, s, as, driveid, filterholder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbj.zza(this, parcel, i);
    }

}
