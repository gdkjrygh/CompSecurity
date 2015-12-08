// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzh

public final class RewardedVideoAdRequestParcel
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    public final int versionCode;
    public final AdRequestParcel zzCm;
    public final String zzpG;

    public RewardedVideoAdRequestParcel(int i, AdRequestParcel adrequestparcel, String s)
    {
        versionCode = i;
        zzCm = adrequestparcel;
        zzpG = s;
    }

    public RewardedVideoAdRequestParcel(AdRequestParcel adrequestparcel, String s)
    {
        this(1, adrequestparcel, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

}
