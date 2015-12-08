// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionary, zzb

public static class zzabU
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    final int versionCode;
    final String zzaC;
    final CREATOR zzabU;

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
        zzaC = s;
        zzabU = ;
    }

    zzabU(String s, zzabU zzabu)
    {
        versionCode = 1;
        zzaC = s;
        zzabU = zzabu;
    }
}
