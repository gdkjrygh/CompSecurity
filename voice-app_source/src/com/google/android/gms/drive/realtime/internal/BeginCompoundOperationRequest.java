// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zza

public class BeginCompoundOperationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final String mName;
    final int zzCY;
    final boolean zzaiq;
    final boolean zzair;

    BeginCompoundOperationRequest(int i, boolean flag, String s, boolean flag1)
    {
        zzCY = i;
        zzaiq = flag;
        mName = s;
        zzair = flag1;
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
