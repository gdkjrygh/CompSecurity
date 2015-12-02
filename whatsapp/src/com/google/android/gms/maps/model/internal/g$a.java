// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            g

public abstract class a extends Binder
    implements g
{

    public static g bv(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        class a
            implements g
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public d b(Bitmap bitmap)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = l.a.a;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                if (bitmap == null)
                {
                    break MISSING_BLOCK_LABEL_39;
                }
                parcel.writeInt(1);
                bitmap.writeToParcel(parcel, 0);
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_44;
                }
                parcel.writeInt(0);
                le.transact(6, parcel, parcel1, 0);
                parcel1.readException();
                bitmap = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                if (GoogleMap.a)
                {
                    l.a.a = i + 1;
                }
                return bitmap;
                bitmap;
                parcel1.recycle();
                parcel.recycle();
                throw bitmap;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof g))
        {
            return (g)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
