// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzas, NodeParcelable

public class GetLocalNodeResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzas();
    public final int statusCode;
    public final int versionCode;
    public final NodeParcelable zzbaC;

    GetLocalNodeResponse(int i, int j, NodeParcelable nodeparcelable)
    {
        versionCode = i;
        statusCode = j;
        zzbaC = nodeparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzas.zza(this, parcel, i);
    }

}
