// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            zzb, zza, SignInConfiguration

private static class zznI
    implements zzb
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zza zza1, SignInConfiguration signinconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (zza1 == null) goto _L2; else goto _L1
_L1:
        zza1 = zza1.asBinder();
_L5:
        parcel.writeStrongBinder(zza1);
        if (signinconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        signinconfiguration.writeToParcel(parcel, 0);
_L6:
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zza1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zza1;
        parcel1.recycle();
        parcel.recycle();
        throw zza1;
          goto _L5
    }

    public void zzb(zza zza1, SignInConfiguration signinconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (zza1 == null) goto _L2; else goto _L1
_L1:
        zza1 = zza1.asBinder();
_L5:
        parcel.writeStrongBinder(zza1);
        if (signinconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        signinconfiguration.writeToParcel(parcel, 0);
_L6:
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zza1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zza1;
        parcel1.recycle();
        parcel.recycle();
        throw zza1;
          goto _L5
    }

    uration(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
