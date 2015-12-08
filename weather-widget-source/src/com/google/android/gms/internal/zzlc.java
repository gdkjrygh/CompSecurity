// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzlb

public interface zzlc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzlc
    {

        public static zzlc zzaQ(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (iinterface != null && (iinterface instanceof zzlc))
            {
                return (zzlc)iinterface;
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
                parcel1.writeString("com.google.android.gms.common.internal.service.ICommonService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
                zza(zzlb.zza.zzaP(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzlc
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(zzlb zzlb1)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
            if (zzlb1 == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = zzlb1.asBinder();
            parcel.writeStrongBinder(ibinder);
            zznI.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            zzlb1;
            parcel.recycle();
            throw zzlb1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(zzlb zzlb)
        throws RemoteException;
}
