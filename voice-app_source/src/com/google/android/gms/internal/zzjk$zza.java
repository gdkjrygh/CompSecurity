// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

// Referenced classes of package com.google.android.gms.internal:
//            zzjk

public static abstract class zza.zznF extends Binder
    implements zzjk
{
    private static class zza
        implements zzjk
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(ProxyResponse proxyresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthCallbacks");
            if (proxyresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            proxyresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            proxyresponse;
            parcel1.recycle();
            parcel.recycle();
            throw proxyresponse;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzjk zzas(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
        if (iinterface != null && (iinterface instanceof zzjk))
        {
            return (zzjk)iinterface;
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
            parcel1.writeString("com.google.android.gms.auth.api.internal.IAuthCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (ProxyResponse)ProxyResponse.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        zza(parcel);
        parcel1.writeNoException();
        return true;
    }
}
