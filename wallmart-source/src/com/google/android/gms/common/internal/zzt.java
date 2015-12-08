// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponse

public interface zzt
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzt
    {

        public static zzt zzaL(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (iinterface != null && (iinterface instanceof zzt))
            {
                return (zzt)iinterface;
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
                parcel1.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (ResolveAccountResponse)ResolveAccountResponse.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzb(parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }
    }

    private static class zza.zza
        implements zzt
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zzb(ResolveAccountResponse resolveaccountresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (resolveaccountresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            resolveaccountresponse.writeToParcel(parcel, 0);
_L1:
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            resolveaccountresponse;
            parcel1.recycle();
            parcel.recycle();
            throw resolveaccountresponse;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zzb(ResolveAccountResponse resolveaccountresponse)
        throws RemoteException;
}
