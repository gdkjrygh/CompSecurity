// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.zzg;
import com.google.android.gms.common.api.Status;

public interface zzir
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzir
    {

        public static zzir zzae(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (iinterface != null && (iinterface instanceof zzir))
            {
                return (zzir)iinterface;
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
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(parcel1, parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zza(parcel1, flag);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                parcel1 = obj;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = com.google.android.gms.appdatasearch.GetRecentContextCall.Response.CREATOR.zzw(parcel);
            }
            zza(parcel1);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        }
    }

    private static class zza.zza
        implements zzir
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(com.google.android.gms.appdatasearch.GetRecentContextCall.Response response)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (response == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            response.writeToParcel(parcel, 0);
_L1:
            zznF.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            response;
            parcel.recycle();
            throw response;
        }

        public void zza(Status status)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel.recycle();
            throw status;
        }

        public void zza(Status status, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L3:
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L4:
            zznF.transact(2, parcel, null, 1);
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

        public void zza(Status status, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
              goto _L3
_L5:
            parcel.writeInt(i);
            zznF.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            break; /* Loop/switch isn't completed */
            status;
            parcel.recycle();
            throw status;
_L6:
            i = 0;
            if (true) goto _L4; else goto _L3
_L4:
            break; /* Loop/switch isn't completed */
_L3:
            if (!flag) goto _L6; else goto _L5
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(com.google.android.gms.appdatasearch.GetRecentContextCall.Response response)
        throws RemoteException;

    public abstract void zza(Status status)
        throws RemoteException;

    public abstract void zza(Status status, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;

    public abstract void zza(Status status, boolean flag)
        throws RemoteException;
}
