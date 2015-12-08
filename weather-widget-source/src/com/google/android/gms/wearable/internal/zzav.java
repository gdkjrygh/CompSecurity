// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, ChannelEventParcelable, 
//            MessageEventParcelable, NodeParcelable

public interface zzav
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzav
    {

        public static zzav zzdZ(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (iinterface != null && (iinterface instanceof zzav))
            {
                return (zzav)iinterface;
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
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = DataHolder.CREATOR.zzaa(parcel);
                }
                zzad(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (MessageEventParcelable)MessageEventParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj3;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                zzb(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                onConnectedNodes(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj4;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj5;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj6;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj7;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (AmsEntityUpdateParcelable)AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
            }
            zza(parcel1);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }
    }

    private static class zza.zza
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

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void onConnectedNodes(List list)
        throws RemoteException;

    public abstract void zza(AmsEntityUpdateParcelable amsentityupdateparcelable)
        throws RemoteException;

    public abstract void zza(AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException;

    public abstract void zza(CapabilityInfoParcelable capabilityinfoparcelable)
        throws RemoteException;

    public abstract void zza(ChannelEventParcelable channeleventparcelable)
        throws RemoteException;

    public abstract void zza(MessageEventParcelable messageeventparcelable)
        throws RemoteException;

    public abstract void zza(NodeParcelable nodeparcelable)
        throws RemoteException;

    public abstract void zzad(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzb(NodeParcelable nodeparcelable)
        throws RemoteException;
}
