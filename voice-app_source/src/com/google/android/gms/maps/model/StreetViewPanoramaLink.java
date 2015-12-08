// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzj

public class StreetViewPanoramaLink
    implements SafeParcelable
{

    public static final zzj CREATOR = new zzj();
    public final float bearing;
    public final String panoId;
    private final int zzCY;

    StreetViewPanoramaLink(int i, String s, float f)
    {
        zzCY = i;
        panoId = s;
        float f1 = f;
        if ((double)f <= 0.0D)
        {
            f1 = f % 360F + 360F;
        }
        bearing = f1 % 360F;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaLink))
            {
                return false;
            }
            obj = (StreetViewPanoramaLink)obj;
            if (!panoId.equals(((StreetViewPanoramaLink) (obj)).panoId) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaLink) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            panoId, Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("panoId", panoId).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

}
