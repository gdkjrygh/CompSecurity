// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzc, BitmapDescriptor, LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public static final float NO_DIMENSION = -1F;
    private final int mVersionCode;
    private float zzaGS;
    private float zzaGZ;
    private boolean zzaHa;
    private BitmapDescriptor zzaHc;
    private LatLng zzaHd;
    private float zzaHe;
    private float zzaHf;
    private LatLngBounds zzaHg;
    private float zzaHh;
    private float zzaHi;
    private float zzaHj;

    public GroundOverlayOptions()
    {
        zzaHa = true;
        zzaHh = 0.0F;
        zzaHi = 0.5F;
        zzaHj = 0.5F;
        mVersionCode = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        zzaHa = true;
        zzaHh = 0.0F;
        zzaHi = 0.5F;
        zzaHj = 0.5F;
        mVersionCode = i;
        zzaHc = new BitmapDescriptor(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder));
        zzaHd = latlng;
        zzaHe = f;
        zzaHf = f1;
        zzaHg = latlngbounds;
        zzaGS = f2;
        zzaGZ = f3;
        zzaHa = flag;
        zzaHh = f4;
        zzaHi = f5;
        zzaHj = f6;
    }

    private GroundOverlayOptions zza(LatLng latlng, float f, float f1)
    {
        zzaHd = latlng;
        zzaHe = f;
        zzaHf = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        zzaHi = f;
        zzaHj = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        zzaGS = (f % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return zzaHi;
    }

    public float getAnchorV()
    {
        return zzaHj;
    }

    public float getBearing()
    {
        return zzaGS;
    }

    public LatLngBounds getBounds()
    {
        return zzaHg;
    }

    public float getHeight()
    {
        return zzaHf;
    }

    public BitmapDescriptor getImage()
    {
        return zzaHc;
    }

    public LatLng getLocation()
    {
        return zzaHd;
    }

    public float getTransparency()
    {
        return zzaHh;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public float getWidth()
    {
        return zzaHe;
    }

    public float getZIndex()
    {
        return zzaGZ;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        zzaHc = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return zzaHa;
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (zzaHg == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Width must be non-negative");
        return zza(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (zzaHg == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Width must be non-negative");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Height must be non-negative");
        return zza(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (zzaHd == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, (new StringBuilder()).append("Position has already been set using position: ").append(zzaHd).toString());
        zzaHg = latlngbounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f)
    {
        boolean flag;
        if (f >= 0.0F && f <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Transparency must be in the range [0..1]");
        zzaHh = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        zzaHa = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public GroundOverlayOptions zIndex(float f)
    {
        zzaGZ = f;
        return this;
    }

    IBinder zzxc()
    {
        return zzaHc.zzwB().asBinder();
    }

}
