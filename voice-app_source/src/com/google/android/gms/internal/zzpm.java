// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

public interface zzpm
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzpm
    {

        public static zzpm zzdz(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
            if (iinterface != null && (iinterface instanceof zzpm))
            {
                return (zzpm)iinterface;
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
                parcel1.writeString("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (GoogleNowAuthState)GoogleNowAuthState.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(parcel1, parcel);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
        }
    }

    private static class zza.zza
        implements zzpm
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(Status status, GoogleNowAuthState googlenowauthstate)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L3:
            if (googlenowauthstate == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            parcel.writeInt(1);
            googlenowauthstate.writeToParcel(parcel, 0);
_L4:
            zznF.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            status;
            parcel.recycle();
            throw status;
            parcel.writeInt(0);
              goto _L4
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(Status status, GoogleNowAuthState googlenowauthstate)
        throws RemoteException;
}
