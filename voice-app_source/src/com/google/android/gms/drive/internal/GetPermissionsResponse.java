// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaj

public class GetPermissionsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaj();
    final int zzCY;
    final List zzafO;
    final int zzws;

    GetPermissionsResponse(int i, List list, int j)
    {
        zzCY = i;
        zzafO = list;
        zzws = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaj.zza(this, parcel, i);
    }

}
