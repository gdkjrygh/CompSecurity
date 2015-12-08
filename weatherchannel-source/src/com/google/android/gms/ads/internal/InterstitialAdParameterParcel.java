// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzk

public final class InterstitialAdParameterParcel
    implements SafeParcelable
{

    public static final zzk CREATOR = new zzk();
    public final int versionCode;
    public final boolean zzoU;
    public final boolean zzoV;

    InterstitialAdParameterParcel(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        zzoU = flag;
        zzoV = flag1;
    }

    public InterstitialAdParameterParcel(boolean flag, boolean flag1)
    {
        versionCode = 1;
        zzoU = flag;
        zzoV = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

}
