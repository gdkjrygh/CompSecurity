// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.helpers;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.wsi.android.framework.wxdata.geodata.helpers:
//            IWatchWarningBoxUtilService, RemoteDownloadingResult

private static class mRemote
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
        s = (RemoteDownloadingResult)RemoteDownloadingResult.CREATOR.CREATOR(parcel1);
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
