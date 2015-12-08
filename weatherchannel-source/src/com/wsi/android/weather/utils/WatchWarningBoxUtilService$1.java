// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import android.os.RemoteException;
import com.wsi.android.framework.wxdata.geodata.helpers.RemoteDownloadingResult;

// Referenced classes of package com.wsi.android.weather.utils:
//            WatchWarningBoxUtilService

class ingBoxUtilService.Stub extends com.wsi.android.framework.wxdata.geodata.helpers.tub
{

    final WatchWarningBoxUtilService this$0;

    public RemoteDownloadingResult getWatchWarningBoxCollection(String s, int i, String s1, long l, boolean flag)
        throws RemoteException
    {
        return WatchWarningBoxUtilService.this.getWatchWarningBoxCollection(s, i, s1, l, flag);
    }

    loadingResult()
    {
        this$0 = WatchWarningBoxUtilService.this;
        super();
    }
}
