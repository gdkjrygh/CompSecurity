// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.ax;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cw

final class cy
    implements cw
{

    private IBinder a;

    cy(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(ax ax1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
        if (ax1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ax1 = ax1.asBinder();
_L1:
        parcel.writeStrongBinder(ax1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ax1 = null;
          goto _L1
        ax1;
        parcel1.recycle();
        parcel.recycle();
        throw ax1;
    }

    public final void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(2, parcel, parcel1, 0);
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

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(3, parcel, parcel1, 0);
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
}
