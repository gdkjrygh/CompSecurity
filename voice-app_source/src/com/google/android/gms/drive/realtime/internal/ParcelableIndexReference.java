// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zzq

public class ParcelableIndexReference
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    final int mIndex;
    final int zzCY;
    final String zzaiw;
    final boolean zzaix;
    final int zzaiy;

    ParcelableIndexReference(int i, String s, int j, boolean flag, int k)
    {
        zzCY = i;
        zzaiw = s;
        mIndex = j;
        zzaix = flag;
        zzaiy = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

}
