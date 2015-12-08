// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.places.personalized.zzf;

// Referenced classes of package com.google.android.gms.location.places.personalized.internal:
//            zza

public class TestDataImpl extends zzf
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    final int mVersionCode;
    private final String zzaFm;

    TestDataImpl(int i, String s)
    {
        mVersionCode = i;
        zzaFm = s;
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof TestDataImpl))
        {
            return false;
        } else
        {
            obj = (TestDataImpl)obj;
            return zzaFm.equals(((TestDataImpl) (obj)).zzaFm);
        }
    }

    public int hashCode()
    {
        return zzaFm.hashCode();
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("testName", zzaFm).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        zza.zza(this, parcel, i);
    }

    public String zzwA()
    {
        return zzaFm;
    }

}
