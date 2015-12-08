// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataStatsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzmr

public static abstract class zza.zznF extends Binder
    implements zzmr
{
    private static class zza
        implements zzmr
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(DataStatsResult datastatsresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IReadStatsCallback");
            if (datastatsresult == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            datastatsresult.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datastatsresult;
            parcel1.recycle();
            parcel.recycle();
            throw datastatsresult;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzmr zzbC(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
        if (iinterface != null && (iinterface instanceof zzmr))
        {
            return (zzmr)iinterface;
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
            parcel1.writeString("com.google.android.gms.fitness.internal.IReadStatsCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (DataStatsResult)DataStatsResult.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        zza(parcel);
        parcel1.writeNoException();
        return true;
    }
}
