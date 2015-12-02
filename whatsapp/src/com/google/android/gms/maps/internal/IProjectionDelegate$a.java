// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IProjectionDelegate

public abstract class a extends Binder
    implements IProjectionDelegate
{

    public static IProjectionDelegate bp(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        class a
            implements IProjectionDelegate
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public VisibleRegion getVisibleRegion()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                VisibleRegion visibleregion;
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                le.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() == 0)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                visibleregion = VisibleRegion.CREATOR._mthdo(parcel1);
                i = m.a.a;
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                visibleregion = null;
                parcel1.recycle();
                parcel.recycle();
                return visibleregion;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public d toScreenLocation(LatLng latlng)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (latlng == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                latlng.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                latlng = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlng;
                latlng;
                parcel1.recycle();
                parcel.recycle();
                throw latlng;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof IProjectionDelegate))
        {
            return (IProjectionDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
