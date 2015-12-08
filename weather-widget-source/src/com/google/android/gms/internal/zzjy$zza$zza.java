// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzjy, zzjx

private static class zznI
    implements zzjy
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzjx zzjx1, ProxyGrpcRequest proxygrpcrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
        if (zzjx1 == null) goto _L2; else goto _L1
_L1:
        zzjx1 = zzjx1.asBinder();
_L5:
        parcel.writeStrongBinder(zzjx1);
        if (proxygrpcrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        proxygrpcrequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzjx1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzjx1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjx1;
          goto _L5
    }

    public void zza(zzjx zzjx1, ProxyRequest proxyrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
        if (zzjx1 == null) goto _L2; else goto _L1
_L1:
        zzjx1 = zzjx1.asBinder();
_L5:
        parcel.writeStrongBinder(zzjx1);
        if (proxyrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        proxyrequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzjx1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzjx1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjx1;
          goto _L5
    }

    quest(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
