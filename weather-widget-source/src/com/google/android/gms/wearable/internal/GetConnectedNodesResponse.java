// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzap

public class GetConnectedNodesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzap();
    public final int statusCode;
    public final int versionCode;
    public final List zzbaz;

    GetConnectedNodesResponse(int i, int j, List list)
    {
        versionCode = i;
        statusCode = j;
        zzbaz = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzap.zza(this, parcel, i);
    }

}
