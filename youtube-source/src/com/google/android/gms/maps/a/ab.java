// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.a.d;
import com.google.android.gms.maps.model.a.e;

// Referenced classes of package com.google.android.gms.maps.a:
//            z, b, n, k, 
//            a, m, j

final class ab
    implements z
{

    private IBinder a;

    ab(IBinder ibinder)
    {
        a = ibinder;
    }

    public final a a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        a a1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        a1 = com.google.android.gms.maps.a.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final m a(k k1, GoogleMapOptions googlemapoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        googlemapoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        k1 = n.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k1;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public final void a(k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final void a(k k1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final j b(k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        k1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k1;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final d b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        d d;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        d = e.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return d;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
