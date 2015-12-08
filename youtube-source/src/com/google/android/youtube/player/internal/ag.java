// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            ae, y, ac, ab

final class ag
    implements ae
{

    private IBinder a;

    ag(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IBinder ibinder;
        parcel.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        ibinder = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return ibinder;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final ab a(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        y1 = y1.asBinder();
_L1:
        parcel.writeStrongBinder(y1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        y1 = ac.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return y1;
        y1 = null;
          goto _L1
        y1;
        parcel1.recycle();
        parcel.recycle();
        throw y1;
    }

    public final void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
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

    public final IBinder asBinder()
    {
        return a;
    }
}
