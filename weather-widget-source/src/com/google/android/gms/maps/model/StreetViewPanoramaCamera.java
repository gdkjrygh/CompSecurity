// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzj, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements SafeParcelable
{
    public static final class Builder
    {

        public float bearing;
        public float tilt;
        public float zoom;

        public Builder bearing(float f)
        {
            bearing = f;
            return this;
        }

        public StreetViewPanoramaCamera build()
        {
            return new StreetViewPanoramaCamera(zoom, tilt, bearing);
        }

        public Builder orientation(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            tilt = streetviewpanoramaorientation.tilt;
            bearing = streetviewpanoramaorientation.bearing;
            return this;
        }

        public Builder tilt(float f)
        {
            tilt = f;
            return this;
        }

        public Builder zoom(float f)
        {
            zoom = f;
            return this;
        }

        public Builder()
        {
        }

        public Builder(StreetViewPanoramaCamera streetviewpanoramacamera)
        {
            zoom = streetviewpanoramacamera.zoom;
            bearing = streetviewpanoramacamera.bearing;
            tilt = streetviewpanoramacamera.tilt;
        }
    }


    public static final zzj CREATOR = new zzj();
    public final float bearing;
    private final int mVersionCode;
    public final float tilt;
    public final float zoom;
    private StreetViewPanoramaOrientation zzaHF;

    public StreetViewPanoramaCamera(float f, float f1, float f2)
    {
        this(1, f, f1, f2);
    }

    StreetViewPanoramaCamera(int i, float f, float f1, float f2)
    {
        float f3;
        boolean flag;
        if (-90F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
        mVersionCode = i;
        f3 = f;
        if ((double)f <= 0.0D)
        {
            f3 = 0.0F;
        }
        zoom = f3;
        tilt = f1 + 0.0F;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        } else
        {
            f = f2;
        }
        bearing = f % 360F;
        zzaHF = (new StreetViewPanoramaOrientation.Builder()).tilt(f1).bearing(f2).build();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        return new Builder(streetviewpanoramacamera);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaCamera))
            {
                return false;
            }
            obj = (StreetViewPanoramaCamera)obj;
            if (Float.floatToIntBits(zoom) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).zoom) || Float.floatToIntBits(tilt) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    public StreetViewPanoramaOrientation getOrientation()
    {
        return zzaHF;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("zoom", Float.valueOf(zoom)).zzg("tilt", Float.valueOf(tilt)).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

}
