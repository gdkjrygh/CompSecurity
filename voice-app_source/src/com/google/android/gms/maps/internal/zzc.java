// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IMapViewDelegate, IStreetViewPanoramaViewDelegate, IMapFragmentDelegate, IStreetViewPanoramaFragmentDelegate, 
//            ICameraUpdateFactoryDelegate

public interface zzc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzc
    {

        public static zzc zzcg(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (iinterface != null && (iinterface instanceof zzc))
            {
                return (zzc)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj1 = null;
            Object obj5 = null;
            Object obj2 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                zzq(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = zzr(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = obj2;
                if (obj != null)
                {
                    parcel = ((IMapFragmentDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = GoogleMapOptions.CREATOR.zzeI(parcel);
                } else
                {
                    parcel = null;
                }
                obj1 = zza(((zzd) (obj1)), parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((IMapViewDelegate) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = zzvC();
                parcel1.writeNoException();
                parcel = obj3;
                if (obj != null)
                {
                    parcel = ((ICameraUpdateFactoryDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = zzvD();
                parcel1.writeNoException();
                parcel = obj4;
                if (obj != null)
                {
                    parcel = ((com.google.android.gms.maps.model.internal.zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                zzd(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = StreetViewPanoramaOptions.CREATOR.zzeJ(parcel);
                } else
                {
                    parcel = null;
                }
                obj = zza(((zzd) (obj)), parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj1));
                if (obj != null)
                {
                    parcel = ((IStreetViewPanoramaViewDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = zzs(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = obj5;
                break;
            }
            if (obj != null)
            {
                parcel = ((IStreetViewPanoramaFragmentDelegate) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzc
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public IMapViewDelegate zza(zzd zzd1, GoogleMapOptions googlemapoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            googlemapoptions.writeToParcel(parcel, 0);
_L6:
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = IMapViewDelegate.zza.zzcm(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        public IStreetViewPanoramaViewDelegate zza(zzd zzd1, StreetViewPanoramaOptions streetviewpanoramaoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
            zznF.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = IStreetViewPanoramaViewDelegate.zza.zzcI(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        public void zzd(zzd zzd1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void zzq(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public IMapFragmentDelegate zzr(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = IMapFragmentDelegate.zza.zzcl(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public IStreetViewPanoramaFragmentDelegate zzs(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = IStreetViewPanoramaFragmentDelegate.zza.zzcH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public ICameraUpdateFactoryDelegate zzvC()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            ICameraUpdateFactoryDelegate icameraupdatefactorydelegate;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            icameraupdatefactorydelegate = ICameraUpdateFactoryDelegate.zza.zzce(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return icameraupdatefactorydelegate;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public com.google.android.gms.maps.model.internal.zzd zzvD()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.model.internal.zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.maps.model.internal.zzd.zza.zzcK(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract IMapViewDelegate zza(zzd zzd1, GoogleMapOptions googlemapoptions)
        throws RemoteException;

    public abstract IStreetViewPanoramaViewDelegate zza(zzd zzd1, StreetViewPanoramaOptions streetviewpanoramaoptions)
        throws RemoteException;

    public abstract void zzd(zzd zzd1, int i)
        throws RemoteException;

    public abstract void zzq(zzd zzd1)
        throws RemoteException;

    public abstract IMapFragmentDelegate zzr(zzd zzd1)
        throws RemoteException;

    public abstract IStreetViewPanoramaFragmentDelegate zzs(zzd zzd1)
        throws RemoteException;

    public abstract ICameraUpdateFactoryDelegate zzvC()
        throws RemoteException;

    public abstract com.google.android.gms.maps.model.internal.zzd zzvD()
        throws RemoteException;
}
