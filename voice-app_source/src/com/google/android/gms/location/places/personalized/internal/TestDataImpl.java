// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.personalized.zzf;

// Referenced classes of package com.google.android.gms.location.places.personalized.internal:
//            zza

public class TestDataImpl extends zzf
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    final int zzCY;
    private final String zzaBm;

    TestDataImpl(int i, String s)
    {
        zzCY = i;
        zzaBm = s;
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
            return zzaBm.equals(((TestDataImpl) (obj)).zzaBm);
        }
    }

    public int hashCode()
    {
        return zzaBm.hashCode();
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("testName", zzaBm).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        zza.zza(this, parcel, i);
    }

    public String zzvf()
    {
        return zzaBm;
    }

}
