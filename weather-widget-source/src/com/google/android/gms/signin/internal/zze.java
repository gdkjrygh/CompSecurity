// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.GoogleSignInAccount;

// Referenced classes of package com.google.android.gms.signin.internal:
//            AuthAccountResult

public interface zze
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zze
    {

        public static zze zzdG(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (iinterface != null && (iinterface instanceof zze))
            {
                return (zze)iinterface;
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
                parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                ConnectionResult connectionresult;
                if (parcel.readInt() != 0)
                {
                    connectionresult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    connectionresult = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(connectionresult, parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzbe(parcel);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzbf(parcel);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                break;
            }
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
                parcel = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(status, parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }
    }

    private static class zza.zza
        implements zze
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (connectionresult == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            connectionresult.writeToParcel(parcel, 0);
_L3:
            if (authaccountresult == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            authaccountresult.writeToParcel(parcel, 0);
_L4:
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            connectionresult;
            parcel1.recycle();
            parcel.recycle();
            throw connectionresult;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(Status status, GoogleSignInAccount googlesigninaccount)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L3:
            if (googlesigninaccount == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            googlesigninaccount.writeToParcel(parcel, 0);
_L4:
            zznI.transact(7, parcel, parcel1, 0);
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

        public void zzbe(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zznI.transact(4, parcel, parcel1, 0);
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

        public void zzbf(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zznI.transact(6, parcel, parcel1, 0);
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


    public abstract void zza(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        throws RemoteException;

    public abstract void zza(Status status, GoogleSignInAccount googlesigninaccount)
        throws RemoteException;

    public abstract void zzbe(Status status)
        throws RemoteException;

    public abstract void zzbf(Status status)
        throws RemoteException;
}
