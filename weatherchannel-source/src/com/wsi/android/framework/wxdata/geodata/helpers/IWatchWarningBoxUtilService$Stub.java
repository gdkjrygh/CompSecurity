// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.helpers;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.wsi.android.framework.wxdata.geodata.helpers:
//            IWatchWarningBoxUtilService, RemoteDownloadingResult

public static abstract class attachInterface extends Binder
    implements IWatchWarningBoxUtilService
{
    private static class Proxy
        implements IWatchWarningBoxUtilService
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService";
        }

        public RemoteDownloadingResult getWatchWarningBoxCollection(String s, int i, String s1, long l, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService");
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeString(s1);
            parcel.writeLong(l);
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (RemoteDownloadingResult)RemoteDownloadingResult.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService";
    static final int TRANSACTION_getWatchWarningBoxCollection = 1;

    public static IWatchWarningBoxUtilService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService");
        if (iinterface != null && (iinterface instanceof IWatchWarningBoxUtilService))
        {
            return (IWatchWarningBoxUtilService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        String s;
        String s1;
        long l;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService");
            s = parcel.readString();
            i = parcel.readInt();
            s1 = parcel.readString();
            l = parcel.readLong();
            break;
        }
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parcel = getWatchWarningBoxCollection(s, i, s1, l, flag);
        parcel1.writeNoException();
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService");
    }
}
