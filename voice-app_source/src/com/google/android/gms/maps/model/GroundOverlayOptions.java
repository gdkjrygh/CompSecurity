// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzc, BitmapDescriptor, LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public static final float NO_DIMENSION = -1F;
    private final int zzCY;
    private float zzaCT;
    private float zzaDa;
    private boolean zzaDb;
    private BitmapDescriptor zzaDd;
    private LatLng zzaDe;
    private float zzaDf;
    private float zzaDg;
    private LatLngBounds zzaDh;
    private float zzaDi;
    private float zzaDj;
    private float zzaDk;

    public GroundOverlayOptions()
    {
        zzaDb = true;
        zzaDi = 0.0F;
        zzaDj = 0.5F;
        zzaDk = 0.5F;
        zzCY = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        zzaDb = true;
        zzaDi = 0.0F;
        zzaDj = 0.5F;
        zzaDk = 0.5F;
        zzCY = i;
        zzaDd = new BitmapDescriptor(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder));
        zzaDe = latlng;
        zzaDf = f;
        zzaDg = f1;
        zzaDh = latlngbounds;
        zzaCT = f2;
        zzaDa = f3;
        zzaDb = flag;
        zzaDi = f4;
        zzaDj = f5;
        zzaDk = f6;
    }

    private GroundOverlayOptions zza(LatLng latlng, float f, float f1)
    {
        zzaDe = latlng;
        zzaDf = f;
        zzaDg = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        zzaDj = f;
        zzaDk = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        zzaCT = (f % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return zzaDj;
    }

    public float getAnchorV()
    {
        return zzaDk;
    }

    public float getBearing()
    {
        return zzaCT;
    }

    public LatLngBounds getBounds()
    {
        return zzaDh;
    }

    public float getHeight()
    {
        return zzaDg;
    }

    public BitmapDescriptor getImage()
    {
        return zzaDd;
    }

    public LatLng getLocation()
    {
        return zzaDe;
    }

    public float getTransparency()
    {
        return zzaDi;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public float getWidth()
    {
        return zzaDf;
    }

    public float getZIndex()
    {
        return zzaDa;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        zzaDd = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return zzaDb;
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (zzaDh == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Width must be non-negative");
        return zza(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (zzaDh == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Width must be non-negative");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Height must be non-negative");
        return zza(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (zzaDe == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, (new StringBuilder()).append("Position has already been set using position: ").append(zzaDe).toString());
        zzaDh = latlngbounds;
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
        zzu.zzb(flag, "Transparency must be in the range [0..1]");
        zzaDi = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        zzaDb = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public GroundOverlayOptions zIndex(float f)
    {
        zzaDa = f;
        return this;
    }

    IBinder zzvI()
    {
        return zzaDd.zzvg().asBinder();
    }

}
