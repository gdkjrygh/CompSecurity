// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.a.n;

// Referenced classes of package com.google.android.gms.maps.a:
//            ac

public abstract class ad extends Binder
    implements ac
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        k k2 = null;
        k k1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            k2 = a(n.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = k1;
            if (k2 != null)
            {
                parcel = k2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            k1 = b(n.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = k2;
            break;
        }
        if (k1 != null)
        {
            parcel = k1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
