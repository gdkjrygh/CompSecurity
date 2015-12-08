// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zzh, zzg, DeleteRequest, SaveRequest

private static class zznI
    implements zzh
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzg zzg1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (zzg1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzg1 = zzg1.asBinder();
_L1:
        parcel.writeStrongBinder(zzg1);
        zznI.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzg1 = null;
          goto _L1
        zzg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzg1;
    }

    public void zza(zzg zzg1, CredentialRequest credentialrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (zzg1 == null) goto _L2; else goto _L1
_L1:
        zzg1 = zzg1.asBinder();
_L5:
        parcel.writeStrongBinder(zzg1);
        if (credentialrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        credentialrequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzg1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzg1;
          goto _L5
    }

    public void zza(zzg zzg1, DeleteRequest deleterequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (zzg1 == null) goto _L2; else goto _L1
_L1:
        zzg1 = zzg1.asBinder();
_L5:
        parcel.writeStrongBinder(zzg1);
        if (deleterequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        deleterequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzg1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzg1;
          goto _L5
    }

    public void zza(zzg zzg1, SaveRequest saverequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (zzg1 == null) goto _L2; else goto _L1
_L1:
        zzg1 = zzg1.asBinder();
_L5:
        parcel.writeStrongBinder(zzg1);
        if (saverequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        saverequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzg1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzg1;
          goto _L5
    }

    t(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
