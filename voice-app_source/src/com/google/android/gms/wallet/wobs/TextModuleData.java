// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzf

public final class TextModuleData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    String zzCI;
    private final int zzCY;
    String zzaSG;

    TextModuleData()
    {
        zzCY = 1;
    }

    TextModuleData(int i, String s, String s1)
    {
        zzCY = i;
        zzaSG = s;
        zzCI = s1;
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
        zzf.zza(this, parcel, i);
    }

}
