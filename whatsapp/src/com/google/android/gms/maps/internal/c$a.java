// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            c

public abstract class a extends Binder
    implements c
{

    public static c aS(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        class a
            implements c
        {

            private IBinder le;

            public IMapViewDelegate a(d d1, GoogleMapOptions googlemapoptions)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_97;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                if (googlemapoptions == null)
                {
                    break MISSING_BLOCK_LABEL_52;
                }
                parcel.writeInt(1);
                googlemapoptions.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                parcel.writeInt(0);
                le.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                d1 = IMapViewDelegate.a.aY(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d1;
                d1 = null;
                  goto _L1
                d1;
                parcel1.recycle();
                parcel.recycle();
                throw d1;
            }

            public IStreetViewPanoramaViewDelegate a(d d1, StreetViewPanoramaOptions streetviewpanoramaoptions)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                if (streetviewpanoramaoptions == null)
                {
                    break MISSING_BLOCK_LABEL_52;
                }
                parcel.writeInt(1);
                streetviewpanoramaoptions.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                parcel.writeInt(0);
                le.transact(7, parcel, parcel1, 0);
                parcel1.readException();
                d1 = IStreetViewPanoramaViewDelegate.a.bt(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d1;
                d1 = null;
                  goto _L1
                d1;
                parcel1.recycle();
                parcel.recycle();
                throw d1;
            }

            public void a(d d1, int i)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                parcel.writeInt(i);
                le.transact(6, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                d1 = null;
                  goto _L1
                d1;
                parcel1.recycle();
                parcel.recycle();
                throw d1;
            }

            public IBinder asBinder()
            {
                return le;
            }

            public IMapFragmentDelegate j(d d1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_66;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                le.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                d1 = IMapFragmentDelegate.a.aX(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d1;
                d1 = null;
                  goto _L1
                d1;
                parcel1.recycle();
                parcel.recycle();
                throw d1;
            }

            public IStreetViewPanoramaFragmentDelegate k(d d1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                le.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                d1 = IStreetViewPanoramaFragmentDelegate.a.bs(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d1;
                d1 = null;
                  goto _L1
                d1;
                parcel1.recycle();
                parcel.recycle();
                throw d1;
            }

            public ICameraUpdateFactoryDelegate nW()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                ICameraUpdateFactoryDelegate icameraupdatefactorydelegate;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                le.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                icameraupdatefactorydelegate = ICameraUpdateFactoryDelegate.a.aQ(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return icameraupdatefactorydelegate;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public g nX()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                g g;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                le.transact(5, parcel, parcel1, 0);
                parcel1.readException();
                g = com.google.android.gms.maps.model.internal.g.a.bv(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return g;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof c))
        {
            return (c)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
