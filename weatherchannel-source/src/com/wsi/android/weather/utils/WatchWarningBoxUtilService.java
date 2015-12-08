// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.wxdata.exceptions.ConnectionException;
import com.wsi.android.framework.wxdata.exceptions.DataRequestException;
import com.wsi.android.framework.wxdata.exceptions.WrongResourceTypeException;
import com.wsi.android.framework.wxdata.exceptions.XmlParseException;
import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.framework.wxdata.geodata.helpers.RemoteDownloadingResult;
import com.wsi.android.framework.wxdata.geodata.items.ww.WatchWarningBoxCollection;
import com.wsi.android.framework.wxdata.geodata.parsers.WatchWarningDataParser;
import com.wsi.android.framework.wxdata.utils.ServiceUtils;
import com.wsi.android.framework.wxdata.ws.WSIServerConnector;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class WatchWarningBoxUtilService extends Service
{

    private static final char SEPARATOR = 95;
    private static final String TAG = com/wsi/android/weather/utils/WatchWarningBoxUtilService.getSimpleName();
    private final com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService.Stub binder = new com.wsi.android.framework.wxdata.geodata.helpers.IWatchWarningBoxUtilService.Stub() {

        final WatchWarningBoxUtilService this$0;

        public RemoteDownloadingResult getWatchWarningBoxCollection(String s, int i, String s1, long l, boolean flag)
            throws RemoteException
        {
            return WatchWarningBoxUtilService.this.getWatchWarningBoxCollection(s, i, s1, l, flag);
        }

            
            {
                this$0 = WatchWarningBoxUtilService.this;
                super();
            }
    };
    private String featureId;
    private GeoDataType geoDataType;
    private long pollingInterval;
    private File wwCacheDir;

    public WatchWarningBoxUtilService()
    {
    }

    private File getWWCacheDir(Context context)
    {
        if (wwCacheDir == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                stringbuilder.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                stringbuilder.append(File.separatorChar).append("Android");
                stringbuilder.append(File.separatorChar).append("data");
                stringbuilder.append(File.separatorChar).append(context.getPackageName());
                stringbuilder.append(File.separatorChar).append("cache");
            } else
            {
                stringbuilder.append(context.getCacheDir().getAbsolutePath());
            }
            stringbuilder.append(File.separatorChar).append("ww_cache");
            wwCacheDir = new File(stringbuilder.toString());
        }
        return wwCacheDir;
    }

    private String persistWWCollection(WatchWarningBoxCollection watchwarningboxcollection)
        throws IOException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeParcelable(watchwarningboxcollection, 0);
        watchwarningboxcollection = parcel.marshall();
        parcel.recycle();
        return writeMarshalledDataToCache(watchwarningboxcollection, System.currentTimeMillis());
    }

    private String processCachedData(Context context, boolean flag)
    {
        context = getWWCacheDir(context);
        if (!context.exists())
        {
            return null;
        }
        FileFilter filefilter = new FileFilter() {

            String prefix;
            final WatchWarningBoxUtilService this$0;

            public boolean accept(File file1)
            {
                return file1.getName().startsWith(prefix);
            }

            
            {
                this$0 = WatchWarningBoxUtilService.this;
                super();
                prefix = getFileNamePrefix().toString();
            }
        };
        long l = System.currentTimeMillis();
        context = context.listFiles(filefilter);
        int j = context.length;
        for (int i = 0; i < j;)
        {
            File file = context[i];
            String s = file.getName();
            long l1 = Long.parseLong(s.substring(s.lastIndexOf('_') + 1));
            long l2 = pollingInterval;
            if (flag || l1 + l2 < l)
            {
                if (!file.delete() && ConfigInfo.DEBUG)
                {
                    Log.d(TAG, (new StringBuilder()).append("processCachedData: unable to delete cached file: ").append(s).toString());
                }
                i++;
            } else
            {
                return file.getAbsolutePath();
            }
        }

        return null;
    }

    private void processException(Exception exception, int i, String s)
        throws Exception
    {
        if (i > 5)
        {
            throw exception;
        }
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, s);
        }
    }

    private WatchWarningBoxCollection retrieveGeoData(String s, WatchWarningDataParser watchwarningdataparser)
        throws ConnectionException, XmlParseException, NullPointerException, WrongResourceTypeException, DataRequestException
    {
        int i;
        if (s == null || "".equals(s))
        {
            throw new DataRequestException("The request URL is not specified.");
        }
        i = 0;
_L2:
        if (ConfigInfo.DEBUG)
        {
            Log.i(TAG, (new StringBuilder()).append("Requesting update of weather alerts for feature ID '").append(featureId).append("' using URL [").append(s).append("].").toString());
        }
        WatchWarningBoxCollection watchwarningboxcollection;
        WSIServerConnector.getConnector().loadAndParseXml(s, watchwarningdataparser, geoDataType.isGmlGZipped());
        watchwarningboxcollection = (WatchWarningBoxCollection)watchwarningdataparser.getGeoDataCollection();
        return watchwarningboxcollection;
        Object obj;
        obj;
        if (((ConnectionException) (obj)).getCause() instanceof FileNotFoundException)
        {
            throw obj;
        }
        i++;
        processException(((Exception) (obj)), i, "Failed to get the geo object data from the server. Retrying...");
        continue; /* Loop/switch isn't completed */
        obj;
        i++;
        processException(((Exception) (obj)), i, "Failed to parse the geo data server response. Re-requesting data...");
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String writeMarshalledDataToCache(byte abyte0[], long l)
        throws IOException
    {
        File file = getWWCacheDir(getApplicationContext());
        if (!file.exists() && !file.mkdirs())
        {
            Log.e(TAG, (new StringBuilder()).append("saveMarshalledData: unable to create cache dir: [").append(file.getAbsolutePath()).append("]").toString());
            throw new IOException((new StringBuilder()).append("unable to create cache dir: [").append(file.getAbsolutePath()).append("]").toString());
        } else
        {
            file = new File(file, getFileNamePrefix().append(l).toString());
            ServiceUtils.writeBytes(file, abyte0);
            return file.getAbsolutePath();
        }
    }

    StringBuilder getFileNamePrefix()
    {
        return (new StringBuilder(String.valueOf(featureId))).append('_');
    }

    protected RemoteDownloadingResult getWatchWarningBoxCollection(String s, int i, String s1, long l, boolean flag)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "starting download on dedicated process");
        }
        geoDataType = GeoDataType.getGeoDataTypeForId(i);
        featureId = s1;
        pollingInterval = l;
        s1 = processCachedData(getApplicationContext(), flag);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = new WatchWarningDataParser();
        s = retrieveGeoData(s, s1);
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("finished. returning results: number of items = ").append(s.getData().size()).toString());
        }
        s = persistWWCollection(s);
_L4:
        try
        {
            if (ConfigInfo.DEBUG)
            {
                Log.d(TAG, (new StringBuilder()).append("getWatchWarningBoxCollection :: fileName = ").append(s).toString());
            }
            return new RemoteDownloadingResult(0, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_179;
_L2:
        s = s1;
        if (!ConfigInfo.DEBUG) goto _L4; else goto _L3
_L3:
        Log.d(TAG, "finished. returning cached results");
        s = s1;
          goto _L4
_L6:
        if (s instanceof OutOfMemoryError)
        {
            System.gc();
            System.gc();
            System.gc();
        }
        Log.e(TAG, "Failed to get the geo object data from the server", s);
        return new RemoteDownloadingResult(1, s);
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public IBinder onBind(Intent intent)
    {
        return binder;
    }

}
