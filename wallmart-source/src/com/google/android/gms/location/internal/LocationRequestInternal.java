// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzk

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final zzk CREATOR = new zzk();
    static final List zzaCT = Collections.emptyList();
    final String mTag;
    private final int mVersionCode;
    boolean zzaCU;
    boolean zzaCV;
    boolean zzaCW;
    List zzaCX;
    boolean zzaCY;
    LocationRequest zzaqq;

    LocationRequestInternal(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s, 
            boolean flag3)
    {
        mVersionCode = i;
        zzaqq = locationrequest;
        zzaCU = flag;
        zzaCV = flag1;
        zzaCW = flag2;
        zzaCX = list;
        mTag = s;
        zzaCY = flag3;
    }

    public static LocationRequestInternal zza(String s, LocationRequest locationrequest)
    {
        return new LocationRequestInternal(1, locationrequest, false, true, true, zzaCT, s, false);
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
            if (zzw.equal(zzaqq, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).zzaqq) && zzaCU == ((LocationRequestInternal) (obj)).zzaCU && zzaCV == ((LocationRequestInternal) (obj)).zzaCV && zzaCW == ((LocationRequestInternal) (obj)).zzaCW && zzaCY == ((LocationRequestInternal) (obj)).zzaCY && zzw.equal(zzaCX, ((LocationRequestInternal) (obj)).zzaCX))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzaqq.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(zzaqq.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(zzaCU);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(zzaCV);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(zzaCW);
        stringbuilder.append(" hideFromAppOps=");
        stringbuilder.append(zzaCY);
        stringbuilder.append(" clients=");
        stringbuilder.append(zzaCX);
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
