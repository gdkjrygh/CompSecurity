// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaw, zzau, AddListenerRequest, AncsNotificationParcelable, 
//            RemoveListenerRequest, zzat

private static class zznI
    implements zzaw
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, byte byte0)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeByte(byte0);
        zznI.transact(53, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeInt(i);
        zznI.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        zznI.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, Uri uri, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        zznI.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, Asset asset)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (asset == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        asset.writeToParcel(parcel, 0);
_L6:
        zznI.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, ConnectionConfiguration connectionconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        connectionconfiguration.writeToParcel(parcel, 0);
_L6:
        zznI.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (putdatarequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        putdatarequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, AddListenerRequest addlistenerrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (addlistenerrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        addlistenerrequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (ancsnotificationparcelable == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ancsnotificationparcelable.writeToParcel(parcel, 0);
_L6:
        zznI.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, RemoveListenerRequest removelistenerrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (removelistenerrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        removelistenerrequest.writeToParcel(parcel, 0);
_L6:
        zznI.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, zzat zzat1, String s)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zzau1 = obj;
        if (zzat1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzau1 = zzat1.asBinder();
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        parcel.writeInt(i);
        zznI.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, String s, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        zznI.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, String s, ParcelFileDescriptor parcelfiledescriptor, long l, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        parcel.writeLong(l);
        parcel.writeLong(l1);
        zznI.transact(39, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zza(zzau zzau1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        parcel.writeString(s1);
        zznI.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        zznI.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zza(zzau zzau1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznI.transact(48, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzb(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzb(zzau zzau1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeInt(i);
        zznI.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzb(zzau zzau1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        zznI.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zzb(zzau zzau1, Uri uri, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        zznI.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zzb(zzau zzau1, ConnectionConfiguration connectionconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        connectionconfiguration.writeToParcel(parcel, 0);
_L6:
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zzb(zzau zzau1, zzat zzat1, String s)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zzau1 = obj;
        if (zzat1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzau1 = zzat1.asBinder();
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzb(zzau zzau1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzb(zzau zzau1, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        parcel.writeInt(i);
        zznI.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzb(zzau zzau1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznI.transact(50, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzc(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzc(zzau zzau1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeInt(i);
        zznI.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzc(zzau zzau1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null) goto _L2; else goto _L1
_L1:
        zzau1 = zzau1.asBinder();
_L5:
        parcel.writeStrongBinder(zzau1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        zznI.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzau1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
          goto _L5
    }

    public void zzc(zzau zzau1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzd(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzd(zzau zzau1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zze(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zze(zzau zzau1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzf(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzf(zzau zzau1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        parcel.writeString(s);
        zznI.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzg(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzh(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzi(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzj(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzk(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(49, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzl(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(51, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzm(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(52, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzn(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzo(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    public void zzp(zzau zzau1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzau1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzau1 = zzau1.asBinder();
_L1:
        parcel.writeStrongBinder(zzau1);
        zznI.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzau1 = null;
          goto _L1
        zzau1;
        parcel1.recycle();
        parcel.recycle();
        throw zzau1;
    }

    n(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
