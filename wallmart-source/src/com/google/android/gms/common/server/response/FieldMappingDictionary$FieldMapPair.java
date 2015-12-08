// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionary, zzb

public static class zzafe
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    final String key;
    final int versionCode;
    final CREATOR zzafe;

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }


    (int i, String s,  )
    {
        versionCode = i;
        key = s;
        zzafe = ;
    }

    zzafe(String s, zzafe zzafe1)
    {
        versionCode = 1;
        key = s;
        zzafe = zzafe1;
    }
}
