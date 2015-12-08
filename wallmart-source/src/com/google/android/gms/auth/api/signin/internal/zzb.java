// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            zza, SignInConfiguration

public interface zzb
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzb
    {

        public static zzb zzay(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            if (iinterface != null && (iinterface instanceof zzb))
            {
                return (zzb)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            com.google.android.gms.auth.api.signin.internal.zza zza1 = null;
            Object obj = null;
            com.google.android.gms.auth.api.signin.internal.zza zza2;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                zza1 = com.google.android.gms.auth.api.signin.internal.zza.zza.zzax(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(parcel);
                }
                zza(zza1, ((SignInConfiguration) (obj)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                zza2 = com.google.android.gms.auth.api.signin.internal.zza.zza.zzax(parcel.readStrongBinder());
                obj = zza1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(parcel);
            }
            zzb(zza2, ((SignInConfiguration) (obj)));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zzb
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(com.google.android.gms.auth.api.signin.internal.zza zza1, SignInConfiguration signinconfiguration)
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

        public void zzb(com.google.android.gms.auth.api.signin.internal.zza zza1, SignInConfiguration signinconfiguration)
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

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(com.google.android.gms.auth.api.signin.internal.zza zza1, SignInConfiguration signinconfiguration)
        throws RemoteException;

    public abstract void zzb(com.google.android.gms.auth.api.signin.internal.zza zza1, SignInConfiguration signinconfiguration)
        throws RemoteException;
}
