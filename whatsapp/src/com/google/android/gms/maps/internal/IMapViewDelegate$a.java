// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IMapViewDelegate

public abstract class a extends Binder
    implements IMapViewDelegate
{

    public static IMapViewDelegate aY(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        class a
            implements IMapViewDelegate
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public IGoogleMapDelegate getMap()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                IGoogleMapDelegate igooglemapdelegate;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                le.transact(1, parcel, parcel1, 0);
                parcel1.readException();
                igooglemapdelegate = IGoogleMapDelegate.a.aT(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return igooglemapdelegate;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void getMapAsync(m m1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (m1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                m1 = m1.asBinder();
_L1:
                parcel.writeStrongBinder(m1);
                le.transact(9, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                m1 = null;
                  goto _L1
                m1;
                parcel1.recycle();
                parcel.recycle();
                throw m1;
            }

            public d getView()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                d d;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                le.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                d = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void onCreate(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                bundle;
                parcel1.recycle();
                parcel.recycle();
                throw bundle;
            }

            public void onDestroy()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                le.transact(5, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void onLowMemory()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                le.transact(6, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void onPause()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                le.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void onResume()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                le.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void onSaveInstanceState(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(7, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() != 0)
                {
                    bundle.readFromParcel(parcel1);
                }
                parcel1.recycle();
                parcel.recycle();
                return;
                bundle;
                parcel1.recycle();
                parcel.recycle();
                throw bundle;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof IMapViewDelegate))
        {
            return (IMapViewDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
