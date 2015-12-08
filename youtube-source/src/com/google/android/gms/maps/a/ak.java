// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.a.m;

// Referenced classes of package com.google.android.gms.maps.a:
//            ai

final class ak
    implements ai
{

    private IBinder a;

    ak(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(m m1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        m1 = m1.asBinder();
_L1:
        parcel.writeStrongBinder(m1);
        a.transact(1, parcel, parcel1, 0);
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

    public final IBinder asBinder()
    {
        return a;
    }
}
