// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;
import com.google.android.gms.maps.a.bo;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            b

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.b CREATOR = new com.google.android.gms.maps.b();
    private Boolean GR;
    private Boolean GS;
    private int GT;
    private CameraPosition GU;
    private Boolean GV;
    private Boolean GW;
    private Boolean GX;
    private Boolean GY;
    private Boolean GZ;
    private Boolean Ha;
    private final int jE;

    public GoogleMapOptions()
    {
        GT = -1;
        jE = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        GT = -1;
        jE = i;
        GR = v.a(byte0);
        GS = v.a(byte1);
        GT = j;
        GU = cameraposition;
        GV = v.a(byte2);
        GW = v.a(byte3);
        GX = v.a(byte4);
        GY = v.a(byte5);
        GZ = v.a(byte6);
        Ha = v.a(byte7);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, e.q);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(0))
        {
            googlemapoptions.mapType(typedarray.getInt(0, -1));
        }
        if (typedarray.hasValue(13))
        {
            googlemapoptions.zOrderOnTop(typedarray.getBoolean(13, false));
        }
        if (typedarray.hasValue(12))
        {
            googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(12, false));
        }
        if (typedarray.hasValue(6))
        {
            googlemapoptions.compassEnabled(typedarray.getBoolean(6, true));
        }
        if (typedarray.hasValue(7))
        {
            googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(7, true));
        }
        if (typedarray.hasValue(8))
        {
            googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(8, true));
        }
        if (typedarray.hasValue(9))
        {
            googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(9, true));
        }
        if (typedarray.hasValue(11))
        {
            googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(11, true));
        }
        if (typedarray.hasValue(10))
        {
            googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(10, true));
        }
        googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    public final GoogleMapOptions camera(CameraPosition cameraposition)
    {
        GU = cameraposition;
        return this;
    }

    public final GoogleMapOptions compassEnabled(boolean flag)
    {
        GW = Boolean.valueOf(flag);
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    final byte el()
    {
        return v.a(GR);
    }

    final byte em()
    {
        return v.a(GS);
    }

    final byte en()
    {
        return v.a(GV);
    }

    final byte eo()
    {
        return v.a(GW);
    }

    final byte ep()
    {
        return v.a(GX);
    }

    final byte eq()
    {
        return v.a(GY);
    }

    final byte er()
    {
        return v.a(GZ);
    }

    final byte es()
    {
        return v.a(Ha);
    }

    public final CameraPosition getCamera()
    {
        return GU;
    }

    public final Boolean getCompassEnabled()
    {
        return GW;
    }

    public final int getMapType()
    {
        return GT;
    }

    public final Boolean getRotateGesturesEnabled()
    {
        return Ha;
    }

    public final Boolean getScrollGesturesEnabled()
    {
        return GX;
    }

    public final Boolean getTiltGesturesEnabled()
    {
        return GZ;
    }

    public final Boolean getUseViewLifecycleInFragment()
    {
        return GS;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final Boolean getZOrderOnTop()
    {
        return GR;
    }

    public final Boolean getZoomControlsEnabled()
    {
        return GV;
    }

    public final Boolean getZoomGesturesEnabled()
    {
        return GY;
    }

    public final GoogleMapOptions mapType(int i)
    {
        GT = i;
        return this;
    }

    public final GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        Ha = Boolean.valueOf(flag);
        return this;
    }

    public final GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        GX = Boolean.valueOf(flag);
        return this;
    }

    public final GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        GZ = Boolean.valueOf(flag);
        return this;
    }

    public final GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        GS = Boolean.valueOf(flag);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int j = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, el());
            b.a(parcel, 3, em());
            b.a(parcel, 4, getMapType());
            b.a(parcel, 5, getCamera(), i, false);
            b.a(parcel, 6, en());
            b.a(parcel, 7, eo());
            b.a(parcel, 8, ep());
            b.a(parcel, 9, eq());
            b.a(parcel, 10, er());
            b.a(parcel, 11, es());
            b.a(parcel, j);
            return;
        } else
        {
            b.a(this, parcel, i);
            return;
        }
    }

    public final GoogleMapOptions zOrderOnTop(boolean flag)
    {
        GR = Boolean.valueOf(flag);
        return this;
    }

    public final GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        GV = Boolean.valueOf(flag);
        return this;
    }

    public final GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        GY = Boolean.valueOf(flag);
        return this;
    }

}
