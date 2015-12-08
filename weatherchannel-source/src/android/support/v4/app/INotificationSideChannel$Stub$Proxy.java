// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel

private static class mRemote
    implements INotificationSideChannel
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public void cancel(String s, int i, String s1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        mRemote.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void cancelAll(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(s);
        mRemote.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public String getInterfaceDescriptor()
    {
        return "android.support.v4.app.INotificationSideChannel";
    }

    public void notify(String s, int i, String s1, Notification notification)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        parcel.writeInt(1);
        notification.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
