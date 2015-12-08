// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.bd;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            df

final class dh
    implements df
{

    private IBinder a;

    dh(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(bd bd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.ISurfaceTextureClient");
        if (bd1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        bd1 = bd1.asBinder();
_L1:
        parcel.writeStrongBinder(bd1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        bd1 = null;
          goto _L1
        bd1;
        parcel1.recycle();
        parcel.recycle();
        throw bd1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
