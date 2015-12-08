// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.a.m;

// Referenced classes of package com.google.android.gms.maps.a:
//            ac

final class ae
    implements ac
{

    private IBinder a;

    ae(IBinder ibinder)
    {
        a = ibinder;
    }

    public final k a(m m1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        m1 = m1.asBinder();
_L1:
        parcel.writeStrongBinder(m1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        m1 = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return m1;
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

    public final k b(m m1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        m1 = m1.asBinder();
_L1:
        parcel.writeStrongBinder(m1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        m1 = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return m1;
        m1 = null;
          goto _L1
        m1;
        parcel1.recycle();
        parcel.recycle();
        throw m1;
    }
}
