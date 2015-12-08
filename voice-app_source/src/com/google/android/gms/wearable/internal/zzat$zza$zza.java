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
//            zzat, zzar, AddListenerRequest, AncsNotificationParcelable, 
//            RemoveListenerRequest, zzaq

private static class zznF
    implements zzat
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeInt(i);
        zznF.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        zznF.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, Uri uri, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        zznF.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, Asset asset)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (asset == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        asset.writeToParcel(parcel, 0);
_L6:
        zznF.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, ConnectionConfiguration connectionconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        connectionconfiguration.writeToParcel(parcel, 0);
_L6:
        zznF.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (putdatarequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        putdatarequest.writeToParcel(parcel, 0);
_L6:
        zznF.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, AddListenerRequest addlistenerrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (addlistenerrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        addlistenerrequest.writeToParcel(parcel, 0);
_L6:
        zznF.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (ancsnotificationparcelable == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ancsnotificationparcelable.writeToParcel(parcel, 0);
_L6:
        zznF.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, RemoveListenerRequest removelistenerrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (removelistenerrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        removelistenerrequest.writeToParcel(parcel, 0);
_L6:
        zznF.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, zzaq zzaq1, String s)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zzar1 = obj;
        if (zzaq1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzar1 = zzaq1.asBinder();
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        parcel.writeInt(i);
        zznF.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, String s, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        zznF.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, String s, ParcelFileDescriptor parcelfiledescriptor, long l, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        parcel.writeLong(l);
        parcel.writeLong(l1);
        zznF.transact(39, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zza(zzar zzar1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        parcel.writeString(s1);
        zznF.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        zznF.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zza(zzar zzar1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznF.transact(48, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzb(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzb(zzar zzar1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeInt(i);
        zznF.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzb(zzar zzar1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        zznF.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zzb(zzar zzar1, Uri uri, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        zznF.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zzb(zzar zzar1, ConnectionConfiguration connectionconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        connectionconfiguration.writeToParcel(parcel, 0);
_L6:
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zzb(zzar zzar1, zzaq zzaq1, String s)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zzar1 = obj;
        if (zzaq1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzar1 = zzaq1.asBinder();
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzb(zzar zzar1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzb(zzar zzar1, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        parcel.writeInt(i);
        zznF.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzb(zzar zzar1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznF.transact(50, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzc(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzc(zzar zzar1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeInt(i);
        zznF.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzc(zzar zzar1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null) goto _L2; else goto _L1
_L1:
        zzar1 = zzar1.asBinder();
_L5:
        parcel.writeStrongBinder(zzar1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        zznF.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzar1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
          goto _L5
    }

    public void zzc(zzar zzar1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzd(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzd(zzar zzar1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zze(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zze(zzar zzar1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzf(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzf(zzar zzar1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        parcel.writeString(s);
        zznF.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzg(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzh(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzi(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzj(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzk(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(49, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzl(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(51, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzm(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzn(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    public void zzo(zzar zzar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (zzar1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzar1 = zzar1.asBinder();
_L1:
        parcel.writeStrongBinder(zzar1);
        zznF.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzar1 = null;
          goto _L1
        zzar1;
        parcel1.recycle();
        parcel.recycle();
        throw zzar1;
    }

    n(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
