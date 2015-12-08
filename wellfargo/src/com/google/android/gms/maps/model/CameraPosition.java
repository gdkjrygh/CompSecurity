// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.c;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            j, LatLng, c

public final class CameraPosition
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        au.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.b(flag, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[] {
            Float.valueOf(f1)
        });
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
        context = context.getResources().obtainAttributes(attributeset, c.MapAttrs);
        float f;
        float f1;
        com.google.android.gms.maps.model.c c1;
        if (context.hasValue(c.MapAttrs_cameraTargetLat))
        {
            f = context.getFloat(c.MapAttrs_cameraTargetLat, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(c.MapAttrs_cameraTargetLng))
        {
            f1 = context.getFloat(c.MapAttrs_cameraTargetLng, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        c1 = b();
        c1.a(attributeset);
        if (context.hasValue(c.MapAttrs_cameraZoom))
        {
            c1.a(context.getFloat(c.MapAttrs_cameraZoom, 0.0F));
        }
        if (context.hasValue(c.MapAttrs_cameraBearing))
        {
            c1.c(context.getFloat(c.MapAttrs_cameraBearing, 0.0F));
        }
        if (context.hasValue(c.MapAttrs_cameraTilt))
        {
            c1.b(context.getFloat(c.MapAttrs_cameraTilt, 0.0F));
        }
        return c1.a();
    }

    public static com.google.android.gms.maps.model.c b()
    {
        return new com.google.android.gms.maps.model.c();
    }

    int a()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return ar.a(new Object[] {
            a, Float.valueOf(b), Float.valueOf(c), Float.valueOf(d)
        });
    }

    public String toString()
    {
        return ar.a(this).a("target", a).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
