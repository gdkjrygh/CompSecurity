// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            zzg

public final class LocationSettingsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final int zzCY;
    private final List zzamw;
    private final boolean zzayb;
    private final boolean zzayc;
    private final boolean zzayd;

    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1, boolean flag2)
    {
        zzCY = i;
        zzamw = list;
        zzayb = flag;
        zzayc = flag1;
        zzayd = flag2;
    }

    private LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2)
    {
        this(2, list, flag, flag1, flag2);
    }

    LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2, _cls1 _pcls1)
    {
        this(list, flag, flag1, flag2);
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
        zzg.zza(this, parcel, i);
    }

    public List zzrj()
    {
        return Collections.unmodifiableList(zzamw);
    }

    public boolean zzup()
    {
        return zzayb;
    }

    public boolean zzuq()
    {
        return zzayc;
    }

    public boolean zzur()
    {
        return zzayd;
    }


    // Unreferenced inner class com/google/android/gms/location/LocationSettingsRequest$Builder
    /* block-local class not found */
    class Builder {}

}
