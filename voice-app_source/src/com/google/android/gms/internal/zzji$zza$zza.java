// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzji, zzjh

private static class zznF
    implements zzji
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(Account account, int i, zzjh zzjh1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L3:
        parcel.writeInt(i);
        if (zzjh1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        account = zzjh1.asBinder();
_L4:
        parcel.writeStrongBinder(account);
        zznF.transact(1, parcel, parcel1, 0);
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

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
