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
import com.google.android.gms.maps.a.bo;

// Referenced classes of package com.google.android.gms.maps.model:
//            j, a, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    private boolean HE;
    private float HM;
    private float HN;
    private LatLng HT;
    private String HU;
    private a HV;
    private boolean HW;
    private boolean HX;
    private float HY;
    private float HZ;
    private float Ia;
    private final int jE;
    private float mAlpha;
    private String uS;

    public MarkerOptions()
    {
        HM = 0.5F;
        HN = 1.0F;
        HE = true;
        HX = false;
        HY = 0.0F;
        HZ = 0.5F;
        Ia = 0.0F;
        mAlpha = 1.0F;
        jE = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        HM = 0.5F;
        HN = 1.0F;
        HE = true;
        HX = false;
        HY = 0.0F;
        HZ = 0.5F;
        Ia = 0.0F;
        mAlpha = 1.0F;
        jE = i;
        HT = latlng;
        uS = s;
        HU = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new a(l.a(ibinder));
        }
        HV = latlng;
        HM = f;
        HN = f1;
        HW = flag;
        HE = flag1;
        HX = flag2;
        HY = f2;
        HZ = f3;
        Ia = f4;
        mAlpha = f5;
    }

    public final MarkerOptions alpha(float f)
    {
        mAlpha = f;
        return this;
    }

    public final MarkerOptions anchor(float f, float f1)
    {
        HM = f;
        HN = f1;
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final MarkerOptions draggable(boolean flag)
    {
        HW = flag;
        return this;
    }

    final IBinder eD()
    {
        if (HV == null)
        {
            return null;
        } else
        {
            return HV.a().asBinder();
        }
    }

    public final MarkerOptions flat(boolean flag)
    {
        HX = flag;
        return this;
    }

    public final float getAlpha()
    {
        return mAlpha;
    }

    public final float getAnchorU()
    {
        return HM;
    }

    public final float getAnchorV()
    {
        return HN;
    }

    public final a getIcon()
    {
        return HV;
    }

    public final float getInfoWindowAnchorU()
    {
        return HZ;
    }

    public final float getInfoWindowAnchorV()
    {
        return Ia;
    }

    public final LatLng getPosition()
    {
        return HT;
    }

    public final float getRotation()
    {
        return HY;
    }

    public final String getSnippet()
    {
        return HU;
    }

    public final String getTitle()
    {
        return uS;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final MarkerOptions icon(a a1)
    {
        HV = a1;
        return this;
    }

    public final MarkerOptions infoWindowAnchor(float f, float f1)
    {
        HZ = f;
        Ia = f1;
        return this;
    }

    public final boolean isDraggable()
    {
        return HW;
    }

    public final boolean isFlat()
    {
        return HX;
    }

    public final boolean isVisible()
    {
        return HE;
    }

    public final MarkerOptions position(LatLng latlng)
    {
        HT = latlng;
        return this;
    }

    public final MarkerOptions rotation(float f)
    {
        HY = f;
        return this;
    }

    public final MarkerOptions snippet(String s)
    {
        HU = s;
        return this;
    }

    public final MarkerOptions title(String s)
    {
        uS = s;
        return this;
    }

    public final MarkerOptions visible(boolean flag)
    {
        HE = flag;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int i1 = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, getPosition(), i, false);
            b.a(parcel, 3, getTitle(), false);
            b.a(parcel, 4, getSnippet(), false);
            b.a(parcel, 5, eD(), false);
            b.a(parcel, 6, getAnchorU());
            b.a(parcel, 7, getAnchorV());
            b.a(parcel, 8, isDraggable());
            b.a(parcel, 9, isVisible());
            b.a(parcel, i1);
            return;
        } else
        {
            j.a(this, parcel, i);
            return;
        }
    }

}
