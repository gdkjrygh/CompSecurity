// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcj

public interface zzcr
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzcr
    {

        public static zzcr zzy(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            if (iinterface != null && (iinterface instanceof zzcr))
            {
                return (zzcr)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = zzS(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = zzT(parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = getAvailableAssetNames();
                parcel1.writeNoException();
                parcel1.writeStringList(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = getCustomTemplateId();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                performClick(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                recordImpression();
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        }
    }

    private static class zza.zza
        implements zzcr
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public List getAvailableAssetNames()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createStringArrayList();
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getCustomTemplateId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void performClick(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            parcel.writeString(s);
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void recordImpression()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zznI.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String zzS(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            parcel.writeString(s);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public zzcj zzT(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            parcel.writeString(s);
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            s = zzcj.zza.zzt(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract List getAvailableAssetNames()
        throws RemoteException;

    public abstract String getCustomTemplateId()
        throws RemoteException;

    public abstract void performClick(String s)
        throws RemoteException;

    public abstract void recordImpression()
        throws RemoteException;

    public abstract String zzS(String s)
        throws RemoteException;

    public abstract zzcj zzT(String s)
        throws RemoteException;
}
