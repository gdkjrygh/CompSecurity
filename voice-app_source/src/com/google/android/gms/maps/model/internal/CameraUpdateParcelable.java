// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzb

public final class CameraUpdateParcelable
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    private int type;
    private final int zzCY;
    private Bundle zzaDN;

    CameraUpdateParcelable(int i, int j, Bundle bundle)
    {
        zzCY = i;
        type = j;
        zzaDN = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public Bundle getParameters()
    {
        return zzaDN;
    }

    public int getType()
    {
        return type;
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
