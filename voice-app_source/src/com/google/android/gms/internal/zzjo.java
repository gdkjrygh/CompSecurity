// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzjo
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjo
    {

        public static zzjo zzau(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            if (iinterface != null && (iinterface instanceof zzjo))
            {
                return (zzjo)iinterface;
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
                parcel1.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
                break;
            }
            return true;
        }
    }

    private static class zza.zza
        implements zzjo
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }

}
