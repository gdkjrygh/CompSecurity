// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface com.google.android.gms.auth.api.signin.internal.zza
    extends IInterface
{
    public static abstract class zza extends Binder
        implements com.google.android.gms.auth.api.signin.internal.zza
    {

        public static com.google.android.gms.auth.api.signin.internal.zza zzax(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.auth.api.signin.internal.zza))
            {
                return (com.google.android.gms.auth.api.signin.internal.zza)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                Status status;
                if (parcel.readInt() != 0)
                {
                    status = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    status = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Intent)Intent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(status, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzp(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements com.google.android.gms.auth.api.signin.internal.zza
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(Status status, Intent intent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L3:
            if (intent == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L4:
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
            parcel.writeInt(0);
              goto _L4
        }

        public void zzp(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(Status status, Intent intent)
        throws RemoteException;

    public abstract void zzp(Status status)
        throws RemoteException;
}
