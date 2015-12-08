// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.a.bo;
import com.google.android.gms.maps.model.a.v;
import com.google.android.gms.maps.model.a.w;

// Referenced classes of package com.google.android.gms.maps.model:
//            p, n, o, q

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final p CREATOR = new p();
    private float HD;
    private boolean HE;
    private v Ih;
    private q Ii;
    private boolean Ij;
    private final int jE;

    public TileOverlayOptions()
    {
        HE = true;
        Ij = true;
        jE = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        HE = true;
        Ij = true;
        jE = i;
        Ih = w.a(ibinder);
        if (Ih == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new n(this);
        }
        Ii = ibinder;
        HE = flag;
        HD = f;
        Ij = flag1;
    }

    static v a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.Ih;
    }

    public final int describeContents()
    {
        return 0;
    }

    final IBinder eF()
    {
        return Ih.asBinder();
    }

    public final TileOverlayOptions fadeIn(boolean flag)
    {
        Ij = flag;
        return this;
    }

    public final boolean getFadeIn()
    {
        return Ij;
    }

    public final q getTileProvider()
    {
        return Ii;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final float getZIndex()
    {
        return HD;
    }

    public final boolean isVisible()
    {
        return HE;
    }

    public final TileOverlayOptions tileProvider(q q)
    {
        Ii = q;
        if (Ii == null)
        {
            q = null;
        } else
        {
            q = new o(this, q);
        }
        Ih = q;
        return this;
    }

    public final TileOverlayOptions visible(boolean flag)
    {
        HE = flag;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            i = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, eF(), false);
            b.a(parcel, 3, isVisible());
            b.a(parcel, 4, getZIndex());
            b.a(parcel, i);
            return;
        } else
        {
            p.a(this, parcel);
            return;
        }
    }

    public final TileOverlayOptions zIndex(float f)
    {
        HD = f;
        return this;
    }

}
