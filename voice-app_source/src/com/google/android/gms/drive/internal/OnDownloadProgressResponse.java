// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaw

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaw();
    final int zzCY;
    final long zzagg;
    final long zzagh;

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        zzCY = i;
        zzagg = l;
        zzagh = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaw.zza(this, parcel, i);
    }

    public long zzpM()
    {
        return zzagg;
    }

    public long zzpN()
    {
        return zzagh;
    }

}
