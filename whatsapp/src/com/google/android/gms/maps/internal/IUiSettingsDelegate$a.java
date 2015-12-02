// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IUiSettingsDelegate

public abstract class a extends Binder
    implements IUiSettingsDelegate
{

    public static IUiSettingsDelegate bu(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        class a
            implements IUiSettingsDelegate
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public void setCompassEnabled(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = 0;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (flag)
                {
                    i = 1;
                }
                parcel.writeInt(i);
                le.transact(2, parcel, parcel1, 0);
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

            public void setMyLocationButtonEnabled(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = 0;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (flag)
                {
                    i = 1;
                }
                parcel.writeInt(i);
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

            public void setZoomControlsEnabled(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = 1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (!flag)
                {
                    i = 0;
                }
                parcel.writeInt(i);
                le.transact(1, parcel, parcel1, 0);
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

        if (iinterface != null && (iinterface instanceof IUiSettingsDelegate))
        {
            return (IUiSettingsDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
