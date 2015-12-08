// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzm

public class StreetViewPanoramaOrientation
    implements SafeParcelable
{
    public static final class Builder
    {

        public float bearing;
        public float tilt;

        public Builder bearing(float f)
        {
            bearing = f;
            return this;
        }

        public StreetViewPanoramaOrientation build()
        {
            return new StreetViewPanoramaOrientation(tilt, bearing);
        }

        public Builder tilt(float f)
        {
            tilt = f;
            return this;
        }

        public Builder()
        {
        }

        public Builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            bearing = streetviewpanoramaorientation.bearing;
            tilt = streetviewpanoramaorientation.tilt;
        }
    }


    public static final zzm CREATOR = new zzm();
    public final float bearing;
    private final int mVersionCode;
    public final float tilt;

    public StreetViewPanoramaOrientation(float f, float f1)
    {
        this(1, f, f1);
    }

    StreetViewPanoramaOrientation(int i, float f, float f1)
    {
        boolean flag;
        if (-90F <= f && f <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
        mVersionCode = i;
        tilt = 0.0F + f;
        f = f1;
        if ((double)f1 <= 0.0D)
        {
            f = f1 % 360F + 360F;
        }
        bearing = f % 360F;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        return new Builder(streetviewpanoramaorientation);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaOrientation))
            {
                return false;
            }
            obj = (StreetViewPanoramaOrientation)obj;
            if (Float.floatToIntBits(tilt) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).bearing))
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
            Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("tilt", Float.valueOf(tilt)).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

}
