// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;

// Referenced classes of package com.google.android.gms.internal:
//            ej, em

final class el
    implements ej
{

    private IBinder a;

    el(IBinder ibinder)
    {
        a = ibinder;
    }

    public final k a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k1;
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        k1 = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
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

    public final void a(Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel1.recycle();
        parcel.recycle();
        throw bundle;
    }

    public final void a(Audience audience)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (audience == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        audience.writeToParcel(parcel, 0);
_L1:
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        audience;
        parcel1.recycle();
        parcel.recycle();
        throw audience;
    }

    public final void a(k k1, k k2, em em1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        if (k2 == null) goto _L4; else goto _L3
_L3:
        k1 = k2.asBinder();
_L6:
        parcel.writeStrongBinder(k1);
        k1 = obj;
        if (em1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        k1 = em1.asBinder();
        parcel.writeStrongBinder(k1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        k1 = null;
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public final void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(4, parcel, parcel1, 0);
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

    public final Bundle b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        bundle = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
