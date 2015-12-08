// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.a.bo;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            d, c, LatLng

public final class CameraPosition
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public final float bearing;
    private final int jE;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        gi.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "Tilt needs to be between 0 and 90 inclusive");
        jE = i;
        target = latlng;
        zoom = f;
        tilt = f1 + 0.0F;
        f = f2;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        }
        bearing = f % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static c builder()
    {
        return new c();
    }

    public static c builder(CameraPosition cameraposition)
    {
        return new c(cameraposition);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeset, e.q);
        float f;
        float f1;
        c c1;
        if (context.hasValue(2))
        {
            f = context.getFloat(2, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(3))
        {
            f1 = context.getFloat(3, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        c1 = builder();
        c1.a(attributeset);
        if (context.hasValue(5))
        {
            c1.a(context.getFloat(5, 0.0F));
        }
        if (context.hasValue(1))
        {
            c1.c(context.getFloat(1, 0.0F));
        }
        if (context.hasValue(4))
        {
            c1.b(context.getFloat(4, 0.0F));
        }
        return c1.a();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latlng, float f)
    {
        return new CameraPosition(latlng, f, 0.0F, 0.0F);
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
            if (!target.equals(((CameraPosition) (obj)).target) || Float.floatToIntBits(zoom) != Float.floatToIntBits(((CameraPosition) (obj)).zoom) || Float.floatToIntBits(tilt) != Float.floatToIntBits(((CameraPosition) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((CameraPosition) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            target, Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public final String toString()
    {
        return ge.a(this).a("target", target).a("zoom", Float.valueOf(zoom)).a("tilt", Float.valueOf(tilt)).a("bearing", Float.valueOf(bearing)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int j = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, target, i, false);
            b.a(parcel, 3, zoom);
            b.a(parcel, 4, tilt);
            b.a(parcel, 5, bearing);
            b.a(parcel, j);
            return;
        } else
        {
            d.a(this, parcel, i);
            return;
        }
    }

}
