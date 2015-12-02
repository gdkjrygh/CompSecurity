// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            l

public abstract class a extends Binder
    implements l
{

    public static int a;

    public static l bA(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        class a
            implements l
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public String getId()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                String s;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                le.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                s = parcel1.readString();
                parcel1.recycle();
                parcel.recycle();
                return s;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public LatLng getPosition()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                LatLng latlng;
                int j;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                le.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() == 0)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                latlng = LatLng.CREATOR.de(parcel1);
                j = l.a.a;
                if (j == 0)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                latlng = null;
                parcel1.recycle();
                parcel.recycle();
                return latlng;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public boolean h(l l1)
            {
                Parcel parcel;
                Parcel parcel1;
                int j;
                boolean flag1;
                flag1 = false;
                j = l.a.a;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (l1 == null)
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                l1 = l1.asBinder();
_L1:
                int k;
                parcel.writeStrongBinder(l1);
                le.transact(16, parcel, parcel1, 0);
                parcel1.readException();
                k = parcel1.readInt();
                boolean flag;
                if (k != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                parcel1.recycle();
                parcel.recycle();
                if (j != 0)
                {
                    if (!GoogleMap.a)
                    {
                        flag1 = true;
                    }
                    GoogleMap.a = flag1;
                }
                return flag;
                l1 = null;
                  goto _L1
                l1;
                parcel1.recycle();
                parcel.recycle();
                throw l1;
            }

            public int hashCodeRemote()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int j;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                le.transact(17, parcel, parcel1, 0);
                parcel1.readException();
                j = parcel1.readInt();
                parcel1.recycle();
                parcel.recycle();
                return j;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void hideInfoWindow()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                le.transact(12, parcel, parcel1, 0);
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

            public void n(d d1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                d1 = d1.asBinder();
_L1:
                parcel.writeStrongBinder(d1);
                le.transact(18, parcel, parcel1, 0);
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

            public void setPosition(LatLng latlng)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (latlng == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                latlng.writeToParcel(parcel, 0);
                if (l.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                latlng;
                parcel1.recycle();
                parcel.recycle();
                throw latlng;
            }

            public void setVisible(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int j;
                j = 0;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (flag)
                {
                    j = 1;
                }
                parcel.writeInt(j);
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

            public void showInfoWindow()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                le.transact(11, parcel, parcel1, 0);
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

        if (iinterface != null && (iinterface instanceof l))
        {
            return (l)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
