// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzc, PublishRequest, SubscribeRequest, UnpublishRequest, 
//            UnsubscribeRequest

private static class zznF
    implements zzc
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(PublishRequest publishrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (publishrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        publishrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        publishrequest;
        parcel.recycle();
        throw publishrequest;
    }

    public void zza(SubscribeRequest subscriberequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (subscriberequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        subscriberequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        subscriberequest;
        parcel.recycle();
        throw subscriberequest;
    }

    public void zza(UnpublishRequest unpublishrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (unpublishrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        unpublishrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        unpublishrequest;
        parcel.recycle();
        throw unpublishrequest;
    }

    public void zza(UnsubscribeRequest unsubscriberequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (unsubscriberequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        unsubscriberequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        unsubscriberequest;
        parcel.recycle();
        throw unsubscriberequest;
    }

    public void zzdS(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        parcel.writeString(s);
        zznF.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    equest(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
