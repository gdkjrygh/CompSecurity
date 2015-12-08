// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzau

public class OnContentsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzau();
    final int zzCY;
    final Contents zzafa;
    final boolean zzage;

    OnContentsResponse(int i, Contents contents, boolean flag)
    {
        zzCY = i;
        zzafa = contents;
        zzage = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzau.zza(this, parcel, i);
    }

    public Contents zzpJ()
    {
        return zzafa;
    }

    public boolean zzpK()
    {
        return zzage;
    }

}
