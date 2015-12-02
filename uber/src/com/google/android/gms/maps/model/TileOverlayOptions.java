// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import ayd;
import azf;
import azg;
import azw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final azw CREATOR = new azw();
    private final int a;
    private azf b;
    private ayd c;
    private boolean d;
    private float e;
    private boolean f;

    public TileOverlayOptions()
    {
        d = true;
        f = true;
        a = 1;
    }

    public TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        d = true;
        f = true;
        a = i;
        b = azg.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new ayd() {

                final TileOverlayOptions a;
                private final azf c;

            
            {
                a = TileOverlayOptions.this;
                super();
                c = TileOverlayOptions.a(a);
            }
            };
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    static azf a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    public final int a()
    {
        return a;
    }

    public final IBinder b()
    {
        return b.asBinder();
    }

    public final float c()
    {
        return e;
    }

    public final boolean d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return f;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azw.a(this, parcel);
    }

}
