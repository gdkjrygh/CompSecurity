// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            v, d

final class x
    implements v
{

    private IBinder a;

    x(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(d d1, int i, String s, String s1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
        if (d1 == null) goto _L2; else goto _L1
_L1:
        d1 = d1.asBinder();
_L5:
        parcel.writeStrongBinder(d1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        d1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
