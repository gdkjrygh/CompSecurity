// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IStreetViewPanoramaFragmentDelegate

public abstract class a extends Binder
    implements IStreetViewPanoramaFragmentDelegate
{

    public static IStreetViewPanoramaFragmentDelegate bs(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        class a
            implements IStreetViewPanoramaFragmentDelegate
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public void getStreetViewPanoramaAsync(u u1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (u1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                u1 = u1.asBinder();
_L1:
                parcel.writeStrongBinder(u1);
                le.transact(12, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                u1 = null;
                  goto _L1
                u1;
                parcel1.recycle();
                parcel.recycle();
                throw u1;
            }

            public void onCreate(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
                le.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                bundle;
                parcel1.recycle();
                parcel.recycle();
                throw bundle;
            }

            public d onCreateView(d d1, d d2, Bundle bundle)
            {
                Object obj;
                Parcel parcel;
                Parcel parcel1;
                int i;
                obj = null;
                i = m.a.a;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_145;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                d1 = obj;
                if (d2 == null)
                {
                    break MISSING_BLOCK_LABEL_56;
                }
                d1 = d2.asBinder();
                parcel.writeStrongBinder(d1);
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_84;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_90;
                }
                parcel.writeInt(0);
                le.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                if (GoogleMap.a)
                {
                    m.a.a = i + 1;
                }
                return d1;
                d1 = null;
                  goto _L1
                d1;
                parcel1.recycle();
                parcel.recycle();
                throw d1;
            }

            public void onDestroy()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                le.transact(8, parcel, parcel1, 0);
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

            public void onDestroyView()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                le.transact(7, parcel, parcel1, 0);
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

            public void onInflate(d d1, StreetViewPanoramaOptions streetviewpanoramaoptions, Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = m.a.a;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_127;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                if (streetviewpanoramaoptions == null)
                {
                    break MISSING_BLOCK_LABEL_61;
                }
                parcel.writeInt(1);
                streetviewpanoramaoptions.writeToParcel(parcel, 0);
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                parcel.writeInt(0);
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_89;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_95;
                }
                parcel.writeInt(0);
                le.transact(2, parcel, parcel1, 0);
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

            public void onLowMemory()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                le.transact(9, parcel, parcel1, 0);
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
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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

            public void onResume()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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

            public void onSaveInstanceState(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
                le.transact(10, parcel, parcel1, 0);
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

        if (iinterface != null && (iinterface instanceof IStreetViewPanoramaFragmentDelegate))
        {
            return (IStreetViewPanoramaFragmentDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
