// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import avf;
import azy;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import kg;

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final azy CREATOR = new azy();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    public GoogleMapOptions(int i1, byte byte0, byte byte1, int j1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        d = -1;
        a = i1;
        b = avf.a(byte0);
        c = avf.a(byte1);
        d = j1;
        e = cameraposition;
        f = avf.a(byte2);
        g = avf.a(byte3);
        h = avf.a(byte4);
        i = avf.a(byte5);
        j = avf.a(byte6);
        k = avf.a(byte7);
        l = avf.a(byte8);
        m = avf.a(byte9);
    }

    private GoogleMapOptions a(int i1)
    {
        d = i1;
        return this;
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, kg.MapAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(kg.MapAttrs_mapType))
        {
            googlemapoptions.a(typedarray.getInt(kg.MapAttrs_mapType, -1));
        }
        if (typedarray.hasValue(kg.MapAttrs_zOrderOnTop))
        {
            googlemapoptions.f(typedarray.getBoolean(kg.MapAttrs_zOrderOnTop, false));
        }
        if (typedarray.hasValue(kg.MapAttrs_useViewLifecycle))
        {
            googlemapoptions.g(typedarray.getBoolean(kg.MapAttrs_useViewLifecycle, false));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiCompass))
        {
            googlemapoptions.b(typedarray.getBoolean(kg.MapAttrs_uiCompass, true));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiRotateGestures))
        {
            googlemapoptions.e(typedarray.getBoolean(kg.MapAttrs_uiRotateGestures, true));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiScrollGestures))
        {
            googlemapoptions.c(typedarray.getBoolean(kg.MapAttrs_uiScrollGestures, true));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiTiltGestures))
        {
            googlemapoptions.d(typedarray.getBoolean(kg.MapAttrs_uiTiltGestures, true));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiZoomGestures))
        {
            googlemapoptions.h(typedarray.getBoolean(kg.MapAttrs_uiZoomGestures, true));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiZoomControls))
        {
            googlemapoptions.a(typedarray.getBoolean(kg.MapAttrs_uiZoomControls, true));
        }
        if (typedarray.hasValue(kg.MapAttrs_liteMode))
        {
            googlemapoptions.i(typedarray.getBoolean(kg.MapAttrs_liteMode, false));
        }
        if (typedarray.hasValue(kg.MapAttrs_uiMapToolbar))
        {
            googlemapoptions.j(typedarray.getBoolean(kg.MapAttrs_uiMapToolbar, true));
        }
        googlemapoptions.a(CameraPosition.a(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    private GoogleMapOptions f(boolean flag)
    {
        b = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions g(boolean flag)
    {
        c = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions h(boolean flag)
    {
        i = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions i(boolean flag)
    {
        l = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions j(boolean flag)
    {
        m = Boolean.valueOf(flag);
        return this;
    }

    public final int a()
    {
        return a;
    }

    public final GoogleMapOptions a(CameraPosition cameraposition)
    {
        e = cameraposition;
        return this;
    }

    public final GoogleMapOptions a(boolean flag)
    {
        f = Boolean.valueOf(flag);
        return this;
    }

    public final byte b()
    {
        return avf.a(b);
    }

    public final GoogleMapOptions b(boolean flag)
    {
        g = Boolean.valueOf(flag);
        return this;
    }

    public final byte c()
    {
        return avf.a(c);
    }

    public final GoogleMapOptions c(boolean flag)
    {
        h = Boolean.valueOf(flag);
        return this;
    }

    public final byte d()
    {
        return avf.a(f);
    }

    public final GoogleMapOptions d(boolean flag)
    {
        j = Boolean.valueOf(flag);
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final byte e()
    {
        return avf.a(g);
    }

    public final GoogleMapOptions e(boolean flag)
    {
        k = Boolean.valueOf(flag);
        return this;
    }

    public final byte f()
    {
        return avf.a(h);
    }

    public final byte g()
    {
        return avf.a(i);
    }

    public final byte h()
    {
        return avf.a(j);
    }

    public final byte i()
    {
        return avf.a(k);
    }

    public final byte j()
    {
        return avf.a(l);
    }

    public final byte k()
    {
        return avf.a(m);
    }

    public final int l()
    {
        return d;
    }

    public final CameraPosition m()
    {
        return e;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        azy.a(this, parcel, i1);
    }

}
