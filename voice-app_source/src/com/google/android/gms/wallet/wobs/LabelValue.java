// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzb

public final class LabelValue
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    String label;
    String value;
    private final int zzCY;

    LabelValue()
    {
        zzCY = 1;
    }

    LabelValue(int i, String s, String s1)
    {
        zzCY = i;
        label = s;
        value = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
