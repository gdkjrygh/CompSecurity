// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.a.d;

// Referenced classes of package com.google.android.gms.maps.a:
//            z, ab, j, m, 
//            a

public abstract class aa extends Binder
    implements z
{

    public static z a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (iinterface != null && (iinterface instanceof z))
        {
            return (z)iinterface;
        } else
        {
            return new ab(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
    {
        j j1 = null;
        b b1 = null;
        Object obj2 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            j1 = b(l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj;
            if (j1 != null)
            {
                parcel = j1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            Object obj1 = l.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                b1 = GoogleMapOptions.CREATOR;
                parcel = b.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(((com.google.android.gms.dynamic.k) (obj1)), parcel);
            parcel1.writeNoException();
            parcel = j1;
            if (obj1 != null)
            {
                parcel = ((m) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a a1 = a();
            parcel1.writeNoException();
            parcel = b1;
            if (a1 != null)
            {
                parcel = a1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            d d1 = b();
            parcel1.writeNoException();
            parcel = obj2;
            if (d1 != null)
            {
                parcel = d1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(l.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
