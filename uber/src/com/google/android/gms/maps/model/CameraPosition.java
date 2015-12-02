// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import axy;
import azj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kg;
import wl;
import wm;
import wn;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class CameraPosition
    implements SafeParcelable
{

    public static final azj CREATOR = new azj();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    public CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        wn.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Tilt needs to be between 0 and 90 inclusive");
        e = i;
        a = latlng;
        b = f;
        c = f1 + 0.0F;
        f = f2;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        }
        d = f % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static CameraPosition a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeset, kg.MapAttrs);
        float f;
        float f1;
        axy axy1;
        if (context.hasValue(kg.MapAttrs_cameraTargetLat))
        {
            f = context.getFloat(kg.MapAttrs_cameraTargetLat, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(kg.MapAttrs_cameraTargetLng))
        {
            f1 = context.getFloat(kg.MapAttrs_cameraTargetLng, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        axy1 = b();
        axy1.a(attributeset);
        if (context.hasValue(kg.MapAttrs_cameraZoom))
        {
            axy1.a(context.getFloat(kg.MapAttrs_cameraZoom, 0.0F));
        }
        if (context.hasValue(kg.MapAttrs_cameraBearing))
        {
            axy1.c(context.getFloat(kg.MapAttrs_cameraBearing, 0.0F));
        }
        if (context.hasValue(kg.MapAttrs_cameraTilt))
        {
            axy1.b(context.getFloat(kg.MapAttrs_cameraTilt, 0.0F));
        }
        return axy1.a();
    }

    private static axy b()
    {
        return new axy();
    }

    public final int a()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CameraPosition))
            {
                return false;
            }
            obj = (CameraPosition)obj;
            if (!a.equals(((CameraPosition) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((CameraPosition) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((CameraPosition) (obj)).c) || Float.floatToIntBits(d) != Float.floatToIntBits(((CameraPosition) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return wl.a(new Object[] {
            a, Float.valueOf(b), Float.valueOf(c), Float.valueOf(d)
        });
    }

    public final String toString()
    {
        return wl.a(this).a("target", a).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azj.a(this, parcel, i);
    }

}
