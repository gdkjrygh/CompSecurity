// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzf, BitmapDescriptor, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    private float mAlpha;
    private final int mVersionCode;
    private LatLng zzaGx;
    private boolean zzaHa;
    private float zzaHi;
    private float zzaHj;
    private String zzaHr;
    private BitmapDescriptor zzaHs;
    private boolean zzaHt;
    private boolean zzaHu;
    private float zzaHv;
    private float zzaHw;
    private float zzaHx;
    private String zzagU;

    public MarkerOptions()
    {
        zzaHi = 0.5F;
        zzaHj = 1.0F;
        zzaHa = true;
        zzaHu = false;
        zzaHv = 0.0F;
        zzaHw = 0.5F;
        zzaHx = 0.0F;
        mAlpha = 1.0F;
        mVersionCode = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        zzaHi = 0.5F;
        zzaHj = 1.0F;
        zzaHa = true;
        zzaHu = false;
        zzaHv = 0.0F;
        zzaHw = 0.5F;
        zzaHx = 0.0F;
        mAlpha = 1.0F;
        mVersionCode = i;
        zzaGx = latlng;
        zzagU = s;
        zzaHr = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder));
        }
        zzaHs = latlng;
        zzaHi = f;
        zzaHj = f1;
        zzaHt = flag;
        zzaHa = flag1;
        zzaHu = flag2;
        zzaHv = f2;
        zzaHw = f3;
        zzaHx = f4;
        mAlpha = f5;
    }

    public MarkerOptions alpha(float f)
    {
        mAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f1)
    {
        zzaHi = f;
        zzaHj = f1;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        zzaHt = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        zzaHu = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return zzaHi;
    }

    public float getAnchorV()
    {
        return zzaHj;
    }

    public BitmapDescriptor getIcon()
    {
        return zzaHs;
    }

    public float getInfoWindowAnchorU()
    {
        return zzaHw;
    }

    public float getInfoWindowAnchorV()
    {
        return zzaHx;
    }

    public LatLng getPosition()
    {
        return zzaGx;
    }

    public float getRotation()
    {
        return zzaHv;
    }

    public String getSnippet()
    {
        return zzaHr;
    }

    public String getTitle()
    {
        return zzagU;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        zzaHs = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f1)
    {
        zzaHw = f;
        zzaHx = f1;
        return this;
    }

    public boolean isDraggable()
    {
        return zzaHt;
    }

    public boolean isFlat()
    {
        return zzaHu;
    }

    public boolean isVisible()
    {
        return zzaHa;
    }

    public MarkerOptions position(LatLng latlng)
    {
        zzaGx = latlng;
        return this;
    }

    public MarkerOptions rotation(float f)
    {
        zzaHv = f;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        zzaHr = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        zzagU = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        zzaHa = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    IBinder zzxd()
    {
        if (zzaHs == null)
        {
            return null;
        } else
        {
            return zzaHs.zzwB().asBinder();
        }
    }

}
