// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.nearby.connection:
//            zza

public final class AppIdentifier
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final int zzCY;
    private final String zzakL;

    AppIdentifier(int i, String s)
    {
        zzCY = i;
        zzakL = zzu.zzh(s, "Missing application identifier value");
    }

    public AppIdentifier(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getIdentifier()
    {
        return zzakL;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
