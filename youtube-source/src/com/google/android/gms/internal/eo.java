// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.people.data.AudienceMember;

// Referenced classes of package com.google.android.gms.internal:
//            em, ep

final class eo
    implements em
{

    private IBinder a;

    eo(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
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

    public final void a(AudienceMember audiencemember)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
        if (audiencemember == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        audiencemember.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        audiencemember;
        parcel1.recycle();
        parcel.recycle();
        throw audiencemember;
    }

    public final void a(ep ep1, String s, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
        if (ep1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        ep1 = ep1.asBinder();
_L1:
        parcel.writeStrongBinder(ep1);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ep1 = null;
          goto _L1
        ep1;
        parcel1.recycle();
        parcel.recycle();
        throw ep1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
