// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbh

public class StorageInfoResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbh();
    public final int statusCode;
    public final int versionCode;
    public final long zzaUN;
    public final List zzaUP;

    StorageInfoResponse(int i, int j, long l, List list)
    {
        versionCode = i;
        statusCode = j;
        zzaUN = l;
        zzaUP = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbh.zza(this, parcel, i);
    }

}
