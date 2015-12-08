// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzk

public class StreetViewPanoramaLink
    implements SafeParcelable
{

    public static final zzk CREATOR = new zzk();
    public final float bearing;
    private final int mVersionCode;
    public final String panoId;

    StreetViewPanoramaLink(int i, String s, float f)
    {
        mVersionCode = i;
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
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            panoId, Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("panoId", panoId).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

}
