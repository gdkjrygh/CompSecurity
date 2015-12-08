// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzk

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final zzk CREATOR = new zzk();
    static final List zzaza = Collections.emptyList();
    final String mTag;
    private final int zzCY;
    LocationRequest zzamz;
    boolean zzazb;
    boolean zzazc;
    boolean zzazd;
    List zzaze;

    LocationRequestInternal(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        zzCY = i;
        zzamz = locationrequest;
        zzazb = flag;
        zzazc = flag1;
        zzazd = flag2;
        zzaze = list;
        mTag = s;
    }

    public static LocationRequestInternal zza(String s, LocationRequest locationrequest)
    {
        return new LocationRequestInternal(1, locationrequest, false, true, true, zzaza, s);
    }

    public static LocationRequestInternal zzb(LocationRequest locationrequest)
    {
        return zza(null, locationrequest);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestInternal)
        {
            if (zzt.equal(zzamz, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).zzamz) && zzazb == ((LocationRequestInternal) (obj)).zzazb && zzazc == ((LocationRequestInternal) (obj)).zzazc && zzazd == ((LocationRequestInternal) (obj)).zzazd && zzt.equal(zzaze, ((LocationRequestInternal) (obj)).zzaze))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzamz.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(zzamz.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(zzazb);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(zzazc);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(zzazd);
        stringbuilder.append(" clients=");
        stringbuilder.append(zzaze);
        if (mTag != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(mTag);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

}
