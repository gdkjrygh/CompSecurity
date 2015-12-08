// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.Wearable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, RemoteDownload

class WearableDataResponse
{
    static class CacheResponse extends WearableDataResponse
    {

        final boolean result;

        protected boolean getResult()
        {
            return result;
        }

        protected CacheResponse(DataMap datamap, GoogleApiClient googleapiclient)
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
                    Asset asset = datamap.getAsset("FileContent");
                    datamap = datamap.getString("FileName");
                    File file = RemoteDownload.getDownloadCacheDirectory("adbdownloadcache");
                    if (file != null)
                    {
                        RemoteDownload.deleteFilesInDirectory("adbdownloadcache");
                        WearableDataResponse.saveFileFromAsset(asset, (new StringBuilder()).append(file.getPath()).append(File.separator).append(datamap).toString(), googleapiclient);
                        return;
                    }
                }
            }
        }
    }

    static class GetResponse extends WearableDataResponse
    {

        protected byte result[];

        protected byte[] getResult()
        {
            return result;
        }

        protected GetResponse(DataMap datamap)
        {
            result = datamap.getByteArray("Result");
            if (result != null)
            {
                success = true;
            }
        }
    }

    static class PostResponse extends WearableDataResponse
    {

        protected PostResponse(DataMap datamap)
        {
            success = datamap.getBoolean("Result");
        }
    }

    static class ShareConfigResponse extends WearableDataResponse
    {

        final DataMap result;

        protected DataMap getResult()
        {
            return result;
        }

        protected ShareConfigResponse(DataMap datamap)
        {
            result = datamap;
        }
    }


    protected boolean success;

    WearableDataResponse()
    {
        success = false;
    }

    protected static WearableDataResponse createResponseFromDataMap(DataMap datamap, GoogleApiClient googleapiclient)
    {
        if (datamap.getString("Type").equals("POST"))
        {
            return new PostResponse(datamap);
        }
        if (datamap.getString("Type").equals("GET"))
        {
            return new GetResponse(datamap);
        }
        if (datamap.getString("Type").equals("Config"))
        {
            return new ShareConfigResponse(datamap);
        }
        if (datamap.getString("Type").equals("File"))
        {
            return new CacheResponse(datamap, googleapiclient);
        } else
        {
            return null;
        }
    }

    private static void saveFileFromAsset(Asset asset, String s, GoogleApiClient googleapiclient)
    {
_L2:
        return;
        if (asset == null || !googleapiclient.blockingConnect(10L, TimeUnit.SECONDS).isSuccess()) goto _L2; else goto _L1
_L1:
        InputStream inputstream;
        inputstream = ((com.google.android.gms.wearable.DataApi.GetFdForAssetResult)Wearable.DataApi.getFdForAsset(googleapiclient, asset).await()).getInputStream();
        googleapiclient.disconnect();
        if (inputstream == null) goto _L2; else goto _L3
_L3:
        Object obj;
        s = new File(s);
        obj = null;
        asset = null;
        googleapiclient = null;
        s = new FileOutputStream(s);
        asset = new byte[8192];
_L6:
        int i = inputstream.read(asset);
        if (i == -1) goto _L5; else goto _L4
_L4:
        s.write(asset, 0, i);
          goto _L6
        asset;
_L11:
        asset = s;
        StaticMethods.logErrorFormat("Wearable - Failed to save cache file", new Object[0]);
        if (s != null)
        {
            try
            {
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Asset asset)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close file output stream", new Object[0]);
            }
            return;
        }
          goto _L2
_L5:
        if (s != null)
        {
            try
            {
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Asset asset)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close file output stream", new Object[0]);
            }
            return;
        } else
        {
            return;
        }
        asset;
        s = obj;
_L10:
        asset = s;
        StaticMethods.logErrorFormat("Wearable - Failed to save cache file", new Object[0]);
        if (s == null) goto _L2; else goto _L7
_L7:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Asset asset)
        {
            StaticMethods.logDebugFormat("Wearable - Failed to close file output stream", new Object[0]);
        }
        return;
        s;
_L9:
        if (asset != null)
        {
            try
            {
                asset.close();
            }
            // Misplaced declaration of an exception variable
            catch (Asset asset)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close file output stream", new Object[0]);
            }
        }
        throw s;
        googleapiclient;
        asset = s;
        s = googleapiclient;
        if (true) goto _L9; else goto _L8
_L8:
        asset;
          goto _L10
        asset;
        s = googleapiclient;
          goto _L11
    }

    protected boolean isSuccess()
    {
        return success;
    }

}
