// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            zzf, LocationRequest

public final class LocationSettingsRequest
    implements SafeParcelable
{
    public static final class Builder
    {

        private boolean zzaCd;
        private boolean zzaCe;
        private boolean zzaCf;
        private final ArrayList zzaCg = new ArrayList();

        public Builder addAllLocationRequests(Collection collection)
        {
            zzaCg.addAll(collection);
            return this;
        }

        public Builder addLocationRequest(LocationRequest locationrequest)
        {
            zzaCg.add(locationrequest);
            return this;
        }

        public LocationSettingsRequest build()
        {
            return new LocationSettingsRequest(zzaCg, zzaCd, zzaCe, zzaCf);
        }

        public Builder setAlwaysShow(boolean flag)
        {
            zzaCd = flag;
            return this;
        }

        public Builder setNeedBle(boolean flag)
        {
            zzaCe = flag;
            return this;
        }

        public Builder()
        {
            zzaCd = false;
            zzaCe = false;
            zzaCf = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    private final int mVersionCode;
    private final boolean zzaCd;
    private final boolean zzaCe;
    private final boolean zzaCf;
    private final List zzaqn;

    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1, boolean flag2)
    {
        mVersionCode = i;
        zzaqn = list;
        zzaCd = flag;
        zzaCe = flag1;
        zzaCf = flag2;
    }

    private LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2)
    {
        this(2, list, flag, flag1, flag2);
    }


    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public List zzsr()
    {
        return Collections.unmodifiableList(zzaqn);
    }

    public boolean zzvJ()
    {
        return zzaCd;
    }

    public boolean zzvK()
    {
        return zzaCe;
    }

    public boolean zzvL()
    {
        return zzaCf;
    }

}
