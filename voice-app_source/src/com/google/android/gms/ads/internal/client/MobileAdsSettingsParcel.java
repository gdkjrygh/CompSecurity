// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzad, zzab

public final class MobileAdsSettingsParcel
    implements SafeParcelable
{

    public static final zzad CREATOR = new zzad();
    public final int versionCode;
    public final boolean zztf;
    public final String zztg;

    public MobileAdsSettingsParcel(int i, boolean flag, String s)
    {
        versionCode = i;
        zztf = flag;
        zztg = s;
    }

    public MobileAdsSettingsParcel(zzab zzab1)
    {
        this(1, zzab1.isGoogleAnalyticsEnabled(), zzab1.getTrackingId());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzad.zza(this, parcel, i);
    }

}
