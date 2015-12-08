// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.a:
//            g, al, an

public abstract class h extends Binder
    implements g
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                if (iinterface != null && (iinterface instanceof al))
                {
                    parcel = (al)iinterface;
                } else
                {
                    parcel = new an(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            a();
            parcel1.writeNoException();
            return true;
        }
    }
}
