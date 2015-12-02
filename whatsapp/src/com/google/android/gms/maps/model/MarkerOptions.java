// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            k, LatLng, BitmapDescriptor, l

public final class MarkerOptions
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    private final int CK;
    private String OH;
    private boolean alY;
    private LatLng alt;
    private float amg;
    private float amh;
    private String amp;
    private BitmapDescriptor amq;
    private boolean amr;
    private boolean ams;
    private float amt;
    private float amu;
    private float amv;
    private float mAlpha;

    public MarkerOptions()
    {
        amg = 0.5F;
        amh = 1.0F;
        alY = true;
        ams = false;
        amt = 0.0F;
        amu = 0.5F;
        amv = 0.0F;
        mAlpha = 1.0F;
        CK = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        int j = LatLng.a;
        super();
        amg = 0.5F;
        amh = 1.0F;
        alY = true;
        ams = false;
        amt = 0.0F;
        amu = 0.5F;
        amv = 0.0F;
        mAlpha = 1.0F;
        CK = i;
        alt = latlng;
        OH = s;
        amp = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.ap(ibinder));
        }
        amq = latlng;
        amg = f;
        amh = f1;
        amr = flag;
        alY = flag1;
        ams = flag2;
        amt = f2;
        amu = f3;
        amv = f4;
        mAlpha = f5;
        if (GoogleMap.a)
        {
            LatLng.a = j + 1;
        }
    }

    public MarkerOptions anchor(float f, float f1)
    {
        amg = f;
        amh = f1;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return amg;
    }

    public float getAnchorV()
    {
        return amh;
    }

    public float getInfoWindowAnchorU()
    {
        return amu;
    }

    public float getInfoWindowAnchorV()
    {
        return amv;
    }

    public LatLng getPosition()
    {
        return alt;
    }

    public float getRotation()
    {
        return amt;
    }

    public String getSnippet()
    {
        return amp;
    }

    public String getTitle()
    {
        return OH;
    }

    int getVersionCode()
    {
        return CK;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        amq = bitmapdescriptor;
        return this;
    }

    public boolean isDraggable()
    {
        return amr;
    }

    public boolean isFlat()
    {
        return ams;
    }

    public boolean isVisible()
    {
        return alY;
    }

    IBinder oe()
    {
        if (amq == null)
        {
            return null;
        } else
        {
            return amq.nA().asBinder();
        }
    }

    public MarkerOptions position(LatLng latlng)
    {
        alt = latlng;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        amp = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        OH = s;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
label0:
        {
            if (aa.ob())
            {
                l.a(this, parcel, i);
                if (LatLng.a == 0)
                {
                    break label0;
                }
            }
            k.a(this, parcel, i);
        }
    }

}
