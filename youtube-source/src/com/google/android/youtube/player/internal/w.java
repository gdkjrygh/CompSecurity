// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            v, x, d, f

public abstract class w extends Binder
    implements v
{

    public w()
    {
        attachInterface(this, "com.google.android.youtube.player.internal.IServiceBroker");
    }

    public static v a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
        if (iinterface != null && (iinterface instanceof v))
        {
            return (v)iinterface;
        } else
        {
            return new x(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Bundle bundle = null;
        Object obj;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.youtube.player.internal.IServiceBroker");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IServiceBroker");
            obj = parcel.readStrongBinder();
            break;
        }
        String s;
        String s1;
        String s2;
        if (obj == null)
        {
            obj = null;
        } else
        {
            android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
            if (iinterface != null && (iinterface instanceof d))
            {
                obj = (d)iinterface;
            } else
            {
                obj = new f(((IBinder) (obj)));
            }
        }
        i = parcel.readInt();
        s = parcel.readString();
        s1 = parcel.readString();
        s2 = parcel.readString();
        if (parcel.readInt() != 0)
        {
            bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        }
        a(((d) (obj)), i, s, s1, s2, bundle);
        parcel1.writeNoException();
        return true;
    }
}
