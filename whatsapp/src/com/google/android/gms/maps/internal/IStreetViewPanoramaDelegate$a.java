// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IStreetViewPanoramaDelegate

public abstract class a extends Binder
    implements IStreetViewPanoramaDelegate
{

    public static IStreetViewPanoramaDelegate br(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        class a
            implements IStreetViewPanoramaDelegate
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof IStreetViewPanoramaDelegate))
        {
            return (IStreetViewPanoramaDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
