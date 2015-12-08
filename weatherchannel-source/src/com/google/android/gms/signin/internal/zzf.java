// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzq;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zze, CheckServerAuthResult

public interface zzf
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzf
    {

        public static zzf zzdD(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        /* block-local class not found */
        class zza {}

            if (iinterface != null && (iinterface instanceof zzf))
            {
                return (zzf)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.signin.internal.ISignInService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                if (parcel.readInt() != 0)
                {
                    obj = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(parcel);
                }
                zza(((AuthAccountRequest) (obj)), zze.zza.zzdC(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(parcel);
                }
                zza(((CheckServerAuthResult) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzal(flag);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(parcel);
                }
                zza(((ResolveAccountRequest) (obj)), com.google.android.gms.common.internal.zzq.zza.zzaH(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                zziQ(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                i = parcel.readInt();
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Account)Account.CREATOR.createFromParcel(parcel);
                }
                zza(i, ((Account) (obj)), zze.zza.zzdC(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                obj = com.google.android.gms.common.internal.IAccountAccessor.zza.zzaD(parcel.readStrongBinder());
                i = parcel.readInt();
                break;
            }
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            zza(((IAccountAccessor) (obj)), i, flag);
            parcel1.writeNoException();
            return true;
        }
    }


    public abstract void zza(int i, Account account, zze zze)
        throws RemoteException;

    public abstract void zza(AuthAccountRequest authaccountrequest, zze zze)
        throws RemoteException;

    public abstract void zza(IAccountAccessor iaccountaccessor, int i, boolean flag)
        throws RemoteException;

    public abstract void zza(ResolveAccountRequest resolveaccountrequest, zzq zzq)
        throws RemoteException;

    public abstract void zza(CheckServerAuthResult checkserverauthresult)
        throws RemoteException;

    public abstract void zzal(boolean flag)
        throws RemoteException;

    public abstract void zziQ(int i)
        throws RemoteException;
}
