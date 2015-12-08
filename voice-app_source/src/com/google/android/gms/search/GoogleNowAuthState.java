// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.search;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.search:
//            zza

public class GoogleNowAuthState
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    String zzaJE;
    String zzaJF;
    long zzaJG;

    GoogleNowAuthState(int i, String s, String s1, long l)
    {
        zzCY = i;
        zzaJE = s;
        zzaJF = s1;
        zzaJG = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccessToken()
    {
        return zzaJF;
    }

    public String getAuthCode()
    {
        return zzaJE;
    }

    public long getNextAllowedTimeMillis()
    {
        return zzaJG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
