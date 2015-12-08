// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.a;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;

// Referenced classes of package com.google.android.gms.internal:
//            ej, el, em, eo

public abstract class ek extends Binder
    implements ej
{

    public ek()
    {
        attachInterface(this, "com.google.android.gms.common.audience.dynamite.IAudienceView");
    }

    public static ej a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (iinterface != null && (iinterface instanceof ej))
        {
            return (ej)iinterface;
        } else
        {
            return new el(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        k k1 = null;
        k k2 = null;
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.audience.dynamite.IAudienceView");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            k1 = l.a(parcel.readStrongBinder());
            k2 = l.a(parcel.readStrongBinder());
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = ((Parcel) (obj));
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
                if (obj != null && (obj instanceof em))
                {
                    parcel = (em)obj;
                } else
                {
                    parcel = new eo(parcel);
                }
            }
            a(k1, k2, parcel);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            obj = a();
            parcel1.writeNoException();
            parcel = k1;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            obj = k2;
            if (parcel.readInt() != 0)
            {
                obj = Audience.CREATOR;
                obj = com.google.android.gms.common.people.data.a.a(parcel);
            }
            a(((Audience) (obj)));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            parcel = b();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            obj = obj1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        }
        a(((Bundle) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
