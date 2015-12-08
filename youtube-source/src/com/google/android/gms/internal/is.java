// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ir, it, ju, iy, 
//            jq, iw

public abstract class is extends Binder
    implements ir
{

    public static ir a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
        if (iinterface != null && (iinterface instanceof ir))
        {
            return (ir)iinterface;
        } else
        {
            return new it(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel1 = ju.CREATOR;
                parcel1 = iy.a(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj = jq.CREATOR;
                obj = iw.a(parcel);
            }
            a(s, parcel1, ((jq) (obj)));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            obj = parcel.readString();
            parcel1 = s;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = ju.CREATOR;
            parcel1 = iy.a(parcel);
        }
        a(((String) (obj)), parcel1, parcel.createTypedArrayList(jq.CREATOR));
        return true;
    }
}
