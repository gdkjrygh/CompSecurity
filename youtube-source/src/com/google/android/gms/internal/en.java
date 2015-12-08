// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.people.data.b;

// Referenced classes of package com.google.android.gms.internal:
//            em, ep, er

public abstract class en extends Binder
    implements em
{

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        IBinder ibinder = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            ibinder = parcel.readStrongBinder();
            if (ibinder != null)
            {
                obj = ibinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewImageLoadedCallback");
                if (obj != null && (obj instanceof ep))
                {
                    obj = (ep)obj;
                } else
                {
                    obj = new er(ibinder);
                }
            }
            a(((ep) (obj)), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            Object obj1 = ibinder;
            if (parcel.readInt() != 0)
            {
                obj1 = AudienceMember.CREATOR;
                obj1 = b.a(parcel);
            }
            a(((AudienceMember) (obj1)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            a();
            parcel1.writeNoException();
            return true;
        }
    }
}
