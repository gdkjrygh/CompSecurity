// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            ICancelToken

public static abstract class zza.zznF extends Binder
    implements ICancelToken
{
    private static class zza
        implements ICancelToken
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void cancel()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
            zznF.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static ICancelToken zzaE(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
        if (iinterface != null && (iinterface instanceof ICancelToken))
        {
            return (ICancelToken)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.ICancelToken");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
            cancel();
            return true;
        }
    }
}
