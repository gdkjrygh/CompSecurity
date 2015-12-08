// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzav, AmsEntityUpdateParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, 
//            ChannelEventParcelable, MessageEventParcelable, NodeParcelable

private static class zznI
    implements zzav
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void onConnectedNodes(List list)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        parcel.writeTypedList(list);
        zznI.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        list;
        parcel.recycle();
        throw list;
    }

    public void zza(AmsEntityUpdateParcelable amsentityupdateparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (amsentityupdateparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        amsentityupdateparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(9, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        amsentityupdateparcelable;
        parcel.recycle();
        throw amsentityupdateparcelable;
    }

    public void zza(AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (ancsnotificationparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        ancsnotificationparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ancsnotificationparcelable;
        parcel.recycle();
        throw ancsnotificationparcelable;
    }

    public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (capabilityinfoparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        capabilityinfoparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        capabilityinfoparcelable;
        parcel.recycle();
        throw capabilityinfoparcelable;
    }

    public void zza(ChannelEventParcelable channeleventparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (channeleventparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        channeleventparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        channeleventparcelable;
        parcel.recycle();
        throw channeleventparcelable;
    }

    public void zza(MessageEventParcelable messageeventparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (messageeventparcelable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        messageeventparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        messageeventparcelable;
        parcel.recycle();
        throw messageeventparcelable;
    }

    public void zza(NodeParcelable nodeparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (nodeparcelable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        nodeparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nodeparcelable;
        parcel.recycle();
        throw nodeparcelable;
    }

    public void zzad(DataHolder dataholder)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (dataholder == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L1:
        zznI.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        dataholder;
        parcel.recycle();
        throw dataholder;
    }

    public void zzb(NodeParcelable nodeparcelable)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (nodeparcelable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        nodeparcelable.writeToParcel(parcel, 0);
_L1:
        zznI.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nodeparcelable;
        parcel.recycle();
        throw nodeparcelable;
    }

    e(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
