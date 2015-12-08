// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            ICredentialsService, SaveRequest, DeleteRequest, ICredentialsCallbacks

public static abstract class zza.zznF extends Binder
    implements ICredentialsService
{
    private static class zza
        implements ICredentialsService
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void performCredentialsDeleteOperation(ICredentialsCallbacks icredentialscallbacks, DeleteRequest deleterequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (icredentialscallbacks == null) goto _L2; else goto _L1
_L1:
            icredentialscallbacks = icredentialscallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(icredentialscallbacks);
            if (deleterequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            deleterequest.writeToParcel(parcel, 0);
_L6:
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            icredentialscallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            icredentialscallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw icredentialscallbacks;
              goto _L5
        }

        public void performCredentialsRequestOperation(ICredentialsCallbacks icredentialscallbacks, CredentialRequest credentialrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (icredentialscallbacks == null) goto _L2; else goto _L1
_L1:
            icredentialscallbacks = icredentialscallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(icredentialscallbacks);
            if (credentialrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            credentialrequest.writeToParcel(parcel, 0);
_L6:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            icredentialscallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            icredentialscallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw icredentialscallbacks;
              goto _L5
        }

        public void performCredentialsSaveOperation(ICredentialsCallbacks icredentialscallbacks, SaveRequest saverequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (icredentialscallbacks == null) goto _L2; else goto _L1
_L1:
            icredentialscallbacks = icredentialscallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(icredentialscallbacks);
            if (saverequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            saverequest.writeToParcel(parcel, 0);
_L6:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            icredentialscallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            icredentialscallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw icredentialscallbacks;
              goto _L5
        }

        public void performDisableAutoSignInOperation(ICredentialsCallbacks icredentialscallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (icredentialscallbacks == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            icredentialscallbacks = icredentialscallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(icredentialscallbacks);
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            icredentialscallbacks = null;
              goto _L1
            icredentialscallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw icredentialscallbacks;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static ICredentialsService zzaq(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (iinterface != null && (iinterface instanceof ICredentialsService))
        {
            return (ICredentialsService)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        ICredentialsCallbacks icredentialscallbacks = null;
        ICredentialsCallbacks icredentialscallbacks2 = null;
        CredentialRequest credentialrequest = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            icredentialscallbacks = a.zzap(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                credentialrequest = (CredentialRequest)CredentialRequest.CREATOR.eFromParcel(parcel);
            }
            performCredentialsRequestOperation(icredentialscallbacks, credentialrequest);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            icredentialscallbacks2 = a.zzap(parcel.readStrongBinder());
            Object obj = icredentialscallbacks;
            if (parcel.readInt() != 0)
            {
                obj = (SaveRequest)SaveRequest.CREATOR.eFromParcel(parcel);
            }
            performCredentialsSaveOperation(icredentialscallbacks2, ((SaveRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            ICredentialsCallbacks icredentialscallbacks1 = a.zzap(parcel.readStrongBinder());
            Object obj1 = icredentialscallbacks2;
            if (parcel.readInt() != 0)
            {
                obj1 = (DeleteRequest)DeleteRequest.CREATOR.eFromParcel(parcel);
            }
            performCredentialsDeleteOperation(icredentialscallbacks1, ((DeleteRequest) (obj1)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            performDisableAutoSignInOperation(a.zzap(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
