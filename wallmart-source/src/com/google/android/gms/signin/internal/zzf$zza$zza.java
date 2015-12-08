// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, zze, CheckServerAuthResult, RecordConsentRequest

private static class zznI
    implements zzf
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(int i, Account account, zze zze1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        parcel.writeInt(i);
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L3:
        if (zze1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        account = zze1.asBinder();
_L4:
        parcel.writeStrongBinder(account);
        zznI.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        account;
        parcel1.recycle();
        parcel.recycle();
        throw account;
        account = null;
          goto _L4
    }

    public void zza(AuthAccountRequest authaccountrequest, zze zze1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (authaccountrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        authaccountrequest.writeToParcel(parcel, 0);
_L3:
        if (zze1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        authaccountrequest = zze1.asBinder();
_L4:
        parcel.writeStrongBinder(authaccountrequest);
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        authaccountrequest;
        parcel1.recycle();
        parcel.recycle();
        throw authaccountrequest;
        authaccountrequest = null;
          goto _L4
    }

    public void zza(ResolveAccountRequest resolveaccountrequest, zzt zzt1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (resolveaccountrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        resolveaccountrequest.writeToParcel(parcel, 0);
_L3:
        if (zzt1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        resolveaccountrequest = zzt1.asBinder();
_L4:
        parcel.writeStrongBinder(resolveaccountrequest);
        zznI.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        resolveaccountrequest;
        parcel1.recycle();
        parcel.recycle();
        throw resolveaccountrequest;
        resolveaccountrequest = null;
          goto _L4
    }

    public void zza(zzp zzp1, int i, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (zzp1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        zzp1 = zzp1.asBinder();
_L1:
        parcel.writeStrongBinder(zzp1);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznI.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzp1 = null;
          goto _L1
        zzp1;
        parcel1.recycle();
        parcel.recycle();
        throw zzp1;
    }

    public void zza(CheckServerAuthResult checkserverauthresult)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (checkserverauthresult == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        checkserverauthresult.writeToParcel(parcel, 0);
_L1:
        zznI.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        checkserverauthresult;
        parcel1.recycle();
        parcel.recycle();
        throw checkserverauthresult;
    }

    public void zza(RecordConsentRequest recordconsentrequest, zze zze1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (recordconsentrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        recordconsentrequest.writeToParcel(parcel, 0);
_L3:
        if (zze1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        recordconsentrequest = zze1.asBinder();
_L4:
        parcel.writeStrongBinder(recordconsentrequest);
        zznI.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        recordconsentrequest;
        parcel1.recycle();
        parcel.recycle();
        throw recordconsentrequest;
        recordconsentrequest = null;
          goto _L4
    }

    public void zza(zze zze1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (zze1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zze1 = zze1.asBinder();
_L1:
        parcel.writeStrongBinder(zze1);
        zznI.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zze1 = null;
          goto _L1
        zze1;
        parcel1.recycle();
        parcel.recycle();
        throw zze1;
    }

    public void zzaq(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznI.transact(4, parcel, parcel1, 0);
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

    public void zzja(int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        parcel.writeInt(i);
        zznI.transact(7, parcel, parcel1, 0);
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

    tRequest(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
