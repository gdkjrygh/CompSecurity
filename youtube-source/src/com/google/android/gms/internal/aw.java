// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;

// Referenced classes of package com.google.android.gms.internal:
//            av, ac, b, aa, 
//            a, ay

public abstract class aw extends Binder
    implements av
{

    public aw()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            k k1 = l.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = ac.CREATOR;
                obj = b.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = aa.CREATOR;
                obj1 = a.a(parcel);
            } else
            {
                obj1 = null;
            }
            a(k1, ((ac) (obj)), ((aa) (obj1)), parcel.readString(), ay.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj1 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((k) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            k k2 = l.a(parcel.readStrongBinder());
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = aa.CREATOR;
                obj = a.a(parcel);
            }
            a(k2, ((aa) (obj)), parcel.readString(), ay.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            b();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            k k3 = l.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = ac.CREATOR;
                obj = b.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = aa.CREATOR;
                obj1 = a.a(parcel);
            } else
            {
                obj1 = null;
            }
            a(k3, ((ac) (obj)), ((aa) (obj1)), parcel.readString(), parcel.readString(), ay.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj1 = l.a(parcel.readStrongBinder());
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = aa.CREATOR;
            obj = a.a(parcel);
        } else
        {
            obj = null;
        }
        a(((k) (obj1)), ((aa) (obj)), parcel.readString(), parcel.readString(), ay.a(parcel.readStrongBinder()));
        parcel1.writeNoException();
        return true;
    }
}
