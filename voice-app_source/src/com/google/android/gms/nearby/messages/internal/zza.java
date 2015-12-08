// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageWrapper, zze

public interface com.google.android.gms.nearby.messages.internal.zza
    extends IInterface
{
    public static abstract class zza extends Binder
        implements com.google.android.gms.nearby.messages.internal.zza
    {

        public static com.google.android.gms.nearby.messages.internal.zza zzdd(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.nearby.messages.internal.zza))
            {
                return (com.google.android.gms.nearby.messages.internal.zza)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            Object obj1 = null;
            MessageWrapper messagewrapper = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.nearby.messages.internal.IMessageListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                if (parcel.readInt() != 0)
                {
                    messagewrapper = MessageWrapper.CREATOR.zzft(parcel);
                }
                zza(messagewrapper);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                messagewrapper = obj;
                if (parcel.readInt() != 0)
                {
                    messagewrapper = MessageWrapper.CREATOR.zzft(parcel);
                }
                zzb(messagewrapper);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                messagewrapper = obj1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                messagewrapper = MessageWrapper.CREATOR.zzft(parcel);
            }
            zza(messagewrapper, parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements com.google.android.gms.nearby.messages.internal.zza
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(MessageWrapper messagewrapper)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (messagewrapper == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            messagewrapper.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messagewrapper;
            parcel1.recycle();
            parcel.recycle();
            throw messagewrapper;
        }

        public void zza(MessageWrapper messagewrapper, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (messagewrapper == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            parcel.writeInt(1);
            messagewrapper.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messagewrapper;
            parcel1.recycle();
            parcel.recycle();
            throw messagewrapper;
        }

        public void zzb(MessageWrapper messagewrapper)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (messagewrapper == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            messagewrapper.writeToParcel(parcel, 0);
_L1:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messagewrapper;
            parcel1.recycle();
            parcel.recycle();
            throw messagewrapper;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(MessageWrapper messagewrapper)
        throws RemoteException;

    public abstract void zza(MessageWrapper messagewrapper, int i)
        throws RemoteException;

    public abstract void zzb(MessageWrapper messagewrapper)
        throws RemoteException;
}
