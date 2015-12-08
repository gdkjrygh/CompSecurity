// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.iid:
//            zzb

private static class zznF
    implements zzb
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void send(Message message)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        message.writeToParcel(parcel, 0);
_L1:
        zznF.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        message;
        parcel.recycle();
        throw message;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
