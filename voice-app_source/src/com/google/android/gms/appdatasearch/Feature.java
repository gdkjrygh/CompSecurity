// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zze

public class Feature
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    public final int id;
    final int zzCY;
    final Bundle zzNi;

    Feature(int i, int j, Bundle bundle)
    {
        zzCY = i;
        id = j;
        zzNi = bundle;
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

}
