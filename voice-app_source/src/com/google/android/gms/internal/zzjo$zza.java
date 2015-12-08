// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzjo

public static abstract class zza.zznF extends Binder
    implements zzjo
{
    private static class zza
        implements zzjo
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzjo zzau(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
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
