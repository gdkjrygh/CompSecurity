// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.DataMap;
import java.io.File;

// Referenced classes of package com.adobe.mobile:
//            WearableDataResponse, RemoteDownload

static class ry extends WearableDataResponse
{

    final boolean result;

    protected boolean getResult()
    {
        return result;
    }

    protected _cls9(DataMap datamap, GoogleApiClient googleapiclient)
    {
        if (!datamap.getBoolean("FileFound"))
        {
            RemoteDownload.deleteFilesInDirectory("adbdownloadcache");
            result = false;
        } else
        {
            result = datamap.getBoolean("Updated");
            if (result)
            {
                RemoteDownload.deleteFilesInDirectory("adbdownloadcache");
                com.google.android.gms.wearable.Asset asset = datamap.getAsset("FileContent");
                datamap = datamap.getString("FileName");
                File file = RemoteDownload.getDownloadCacheDirectory("adbdownloadcache");
                if (file != null)
                {
                    RemoteDownload.deleteFilesInDirectory("adbdownloadcache");
                    WearableDataResponse.access$000(asset, (new StringBuilder()).append(file.getPath()).append(File.separator).append(datamap).toString(), googleapiclient);
                    return;
                }
            }
        }
    }
}
