// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IGoogleMapDelegate

public abstract class a extends Binder
    implements IGoogleMapDelegate
{

    public static IGoogleMapDelegate aT(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        class a
            implements IGoogleMapDelegate
        {

            private IBinder le;

            public l addMarker(MarkerOptions markeroptions)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (markeroptions == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                markeroptions.writeToParcel(parcel, 0);
                if (com.google.android.gms.maps.internal.m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(11, parcel, parcel1, 0);
                parcel1.readException();
                markeroptions = com.google.android.gms.maps.model.internal.l.a.bA(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return markeroptions;
                markeroptions;
                parcel1.recycle();
                parcel.recycle();
                throw markeroptions;
            }

            public void animateCamera(d d1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                le.transact(5, parcel, parcel1, 0);
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

            public void clear()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                le.transact(14, parcel, parcel1, 0);
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

            public CameraPosition getCameraPosition()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                CameraPosition cameraposition;
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                le.transact(1, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() == 0)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                cameraposition = CameraPosition.CREATOR.da(parcel1);
                i = com.google.android.gms.maps.internal.m.a.a;
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                cameraposition = null;
                parcel1.recycle();
                parcel.recycle();
                return cameraposition;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public Location getMyLocation()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                Location location;
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                le.transact(23, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() == 0)
                {
                    break MISSING_BLOCK_LABEL_63;
                }
                location = (Location)Location.CREATOR.createFromParcel(parcel1);
                i = com.google.android.gms.maps.internal.m.a.a;
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                location = null;
                parcel1.recycle();
                parcel.recycle();
                return location;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public IProjectionDelegate getProjection()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                IProjectionDelegate iprojectiondelegate;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                le.transact(26, parcel, parcel1, 0);
                parcel1.readException();
                iprojectiondelegate = IProjectionDelegate.a.bp(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return iprojectiondelegate;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public IUiSettingsDelegate getUiSettings()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                IUiSettingsDelegate iuisettingsdelegate;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                le.transact(25, parcel, parcel1, 0);
                parcel1.readException();
                iuisettingsdelegate = IUiSettingsDelegate.a.bu(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return iuisettingsdelegate;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public boolean isTrafficEnabled()
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag;
                flag = false;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                le.transact(17, parcel, parcel1, 0);
                parcel1.readException();
                i = parcel1.readInt();
                if (i != 0)
                {
                    flag = true;
                }
                parcel1.recycle();
                parcel.recycle();
                return flag;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void moveCamera(d d1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                le.transact(4, parcel, parcel1, 0);
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

            public boolean setIndoorEnabled(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag1;
                flag1 = true;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel.writeInt(i);
                le.transact(20, parcel, parcel1, 0);
                parcel1.readException();
                i = parcel1.readInt();
                if (i != 0)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                parcel1.recycle();
                parcel.recycle();
                return flag;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void setMapType(int i)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                parcel.writeInt(i);
                le.transact(16, parcel, parcel1, 0);
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

            public void setMyLocationEnabled(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = 0;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (flag)
                {
                    i = 1;
                }
                parcel.writeInt(i);
                le.transact(22, parcel, parcel1, 0);
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

            public void setOnCameraChangeListener(f f1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (f1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                f1 = f1.asBinder();
_L1:
                parcel.writeStrongBinder(f1);
                le.transact(27, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                f1 = null;
                  goto _L1
                f1;
                parcel1.recycle();
                parcel.recycle();
                throw f1;
            }

            public void setOnInfoWindowClickListener(h h1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (h1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                h1 = h1.asBinder();
_L1:
                parcel.writeStrongBinder(h1);
                le.transact(32, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                h1 = null;
                  goto _L1
                h1;
                parcel1.recycle();
                parcel.recycle();
                throw h1;
            }

            public void setOnMapClickListener(j j1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (j1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                j1 = j1.asBinder();
_L1:
                parcel.writeStrongBinder(j1);
                le.transact(28, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                j1 = null;
                  goto _L1
                j1;
                parcel1.recycle();
                parcel.recycle();
                throw j1;
            }

            public void setOnMarkerClickListener(n n1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (n1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                n1 = n1.asBinder();
_L1:
                parcel.writeStrongBinder(n1);
                le.transact(30, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                n1 = null;
                  goto _L1
                n1;
                parcel1.recycle();
                parcel.recycle();
                throw n1;
            }

            public void setTrafficEnabled(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = 0;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (flag)
                {
                    i = 1;
                }
                parcel.writeInt(i);
                le.transact(18, parcel, parcel1, 0);
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

            public void stopAnimation()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof IGoogleMapDelegate))
        {
            return (IGoogleMapDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
