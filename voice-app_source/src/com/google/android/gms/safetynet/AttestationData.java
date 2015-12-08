// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.safetynet:
//            zza

public class AttestationData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public final int zzCY;
    private String zzaJx;

    AttestationData(int i, String s)
    {
        zzCY = i;
        zzaJx = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getJwsResult()
    {
        return zzaJx;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
