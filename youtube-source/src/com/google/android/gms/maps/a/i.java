// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.a:
//            g, al

final class i
    implements g
{

    private IBinder a;

    i(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
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

    public final void a(al al1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        if (al1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        al1 = al1.asBinder();
_L1:
        parcel.writeStrongBinder(al1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        al1 = null;
          goto _L1
        al1;
        parcel1.recycle();
        parcel.recycle();
        throw al1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
