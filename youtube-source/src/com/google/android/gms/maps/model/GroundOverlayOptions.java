// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.a.bo;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, a, LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public static final float NO_DIMENSION = -1F;
    private float HD;
    private boolean HE;
    private a HG;
    private LatLng HH;
    private float HI;
    private float HJ;
    private LatLngBounds HK;
    private float HL;
    private float HM;
    private float HN;
    private float Hw;
    private final int jE;

    public GroundOverlayOptions()
    {
        HE = true;
        HL = 0.0F;
        HM = 0.5F;
        HN = 0.5F;
        jE = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        HE = true;
        HL = 0.0F;
        HM = 0.5F;
        HN = 0.5F;
        jE = i;
        HG = new a(l.a(ibinder));
        HH = latlng;
        HI = f1;
        HJ = f2;
        HK = latlngbounds;
        Hw = f3;
        HD = f4;
        HE = flag;
        HL = f5;
        HM = f6;
        HN = f7;
    }

    private GroundOverlayOptions a(LatLng latlng, float f1, float f2)
    {
        HH = latlng;
        HI = f1;
        HJ = f2;
        return this;
    }

    public final GroundOverlayOptions anchor(float f1, float f2)
    {
        HM = f1;
        HN = f2;
        return this;
    }

    public final GroundOverlayOptions bearing(float f1)
    {
        Hw = (f1 % 360F + 360F) % 360F;
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    final IBinder eC()
    {
        return HG.a().asBinder();
    }

    public final float getAnchorU()
    {
        return HM;
    }

    public final float getAnchorV()
    {
        return HN;
    }

    public final float getBearing()
    {
        return Hw;
    }

    public final LatLngBounds getBounds()
    {
        return HK;
    }

    public final float getHeight()
    {
        return HJ;
    }

    public final a getImage()
    {
        return HG;
    }

    public final LatLng getLocation()
    {
        return HH;
    }

    public final float getTransparency()
    {
        return HL;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final float getWidth()
    {
        return HI;
    }

    public final float getZIndex()
    {
        return HD;
    }

    public final GroundOverlayOptions image(a a1)
    {
        HG = a1;
        return this;
    }

    public final boolean isVisible()
    {
        return HE;
    }

    public final GroundOverlayOptions position(LatLng latlng, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (HK == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Width must be non-negative");
        return a(latlng, f1, -1F);
    }

    public final GroundOverlayOptions position(LatLng latlng, float f1, float f2)
    {
        boolean flag1 = true;
        boolean flag;
        if (HK == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Width must be non-negative");
        if (f2 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Height must be non-negative");
        return a(latlng, f1, f2);
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (HH == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.a(flag, (new StringBuilder("Position has already been set using position: ")).append(HH).toString());
        HK = latlngbounds;
        return this;
    }

    public final GroundOverlayOptions transparency(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Transparency must be in the range [0..1]");
        HL = f1;
        return this;
    }

    public final GroundOverlayOptions visible(boolean flag)
    {
        HE = flag;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int j = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, eC(), false);
            b.a(parcel, 3, getLocation(), i, false);
            b.a(parcel, 4, getWidth());
            b.a(parcel, 5, getHeight());
            b.a(parcel, 6, getBounds(), i, false);
            b.a(parcel, 7, getBearing());
            b.a(parcel, 8, getZIndex());
            b.a(parcel, 9, isVisible());
            b.a(parcel, 10, getTransparency());
            b.a(parcel, 11, getAnchorU());
            b.a(parcel, 12, getAnchorV());
            b.a(parcel, j);
            return;
        } else
        {
            f.a(this, parcel, i);
            return;
        }
    }

    public final GroundOverlayOptions zIndex(float f1)
    {
        HD = f1;
        return this;
    }

}
