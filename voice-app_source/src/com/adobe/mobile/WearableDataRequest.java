// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, RemoteDownload, RequestHandler, ConfigSynchronizer

abstract class WearableDataRequest
{
    static class Cache extends WearableDataRequest
    {

        protected String fileName;
        protected String url;

        protected DataMap getDataMap()
        {
            DataMap datamap = new DataMap();
            datamap.putString("Type", "File");
            datamap.putString("ID", uuid);
            datamap.putString("URL", url);
            datamap.putString("FileName", fileName);
            return datamap;
        }

        protected DataMap handle(Context context)
        {
            context = new DataMap();
            context.putString("ID", uuid);
            context.putString("Type", "File");
            File file = RemoteDownload.getFileForCachedURL(url);
            if (file == null)
            {
                context.putBoolean("FileFound", false);
            } else
            {
                context.putBoolean("FileFound", true);
                if (file.getName().equals(fileName))
                {
                    context.putBoolean("Updated", false);
                    return context;
                }
                context.putBoolean("Updated", true);
                context.putString("FileName", file.getName());
                byte abyte0[] = WearableDataRequest.readFile(file);
                if (abyte0 != null && abyte0.length > 0)
                {
                    context.putAsset("FileContent", Asset.createFromBytes(abyte0));
                    return context;
                }
            }
            return context;
        }

        protected Cache(DataMap datamap)
        {
            uuid = datamap.getString("ID");
            fileName = datamap.getString("FileName");
            url = datamap.getString("URL");
        }

        protected Cache(String s, String s1, int i)
        {
            super(i);
            url = s;
            fileName = s1;
        }
    }

    static class Get extends WearableDataRequest
    {

        protected String url;

        protected DataMap getDataMap()
        {
            DataMap datamap = new DataMap();
            datamap.putString("ID", uuid);
            datamap.putString("Type", "GET");
            datamap.putString("URL", url);
            return datamap;
        }

        protected String getURL()
        {
            return url;
        }

        protected DataMap handle(Context context)
        {
            context = new DataMap();
            context.putByteArray("Result", RequestHandler.retrieveData(url, null, timeOut, "Wearable Request Forward"));
            context.putString("ID", uuid);
            context.putString("Type", "GET");
            return context;
        }

        protected Get(DataMap datamap)
        {
            url = datamap.getString("URL");
            uuid = datamap.getString("ID");
        }

        protected Get(String s, int i)
        {
            super(i);
            url = s;
        }
    }

    static class Post extends WearableDataRequest
    {

        private static final Object _userAgentMutex = new Object();
        private static String userAgent = null;
        protected String body;
        protected String url;

        protected static String getDefaultAcceptLanguage(Context context)
        {
            if (context != null)
            {
                if ((context = context.getResources()) != null && (context = context.getConfiguration()) != null && (context = ((Configuration) (context)).locale) != null)
                {
                    return context.toString().replace('_', '-');
                }
            }
            return null;
        }

        protected static String getDefaultUserAgent(Context context)
        {
            synchronized (_userAgentMutex)
            {
                if (userAgent == null)
                {
                    userAgent = (new StringBuilder()).append("Mozilla/5.0 (Linux; U; Android ").append(android.os.Build.VERSION.RELEASE).append("; ").append(getDefaultAcceptLanguage(context)).append("; ").append(Build.MODEL).append(" Build/").append(Build.ID).append(")").toString();
                }
                context = userAgent;
            }
            return context;
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
        }

        protected DataMap getDataMap()
        {
            DataMap datamap = new DataMap();
            datamap.putString("ID", uuid);
            datamap.putString("Type", "POST");
            datamap.putString("URL", url);
            datamap.putString("Body", body);
            return datamap;
        }

        protected String getURL()
        {
            return url;
        }

        protected DataMap handle(Context context)
        {
            DataMap datamap = new DataMap();
            HashMap hashmap = new HashMap();
            hashmap.put("Accept-Language", getDefaultAcceptLanguage(context));
            hashmap.put("User-Agent", getDefaultUserAgent(context));
            datamap.putBoolean("Result", RequestHandler.sendAnalyticsRequest(url, body, hashmap, timeOut));
            datamap.putString("ID", uuid);
            datamap.putString("Type", "POST");
            return datamap;
        }


        protected Post(DataMap datamap)
        {
            url = datamap.getString("URL");
            body = datamap.getString("Body");
            uuid = datamap.getString("ID");
        }

        protected Post(String s, String s1, int i)
        {
            super(i);
            url = s;
            body = s1;
        }
    }

    static class ShareConfig extends WearableDataRequest
    {

        protected DataMap getDataMap()
        {
            DataMap datamap = new DataMap();
            datamap.putString("Type", "Config");
            datamap.putString("ID", uuid);
            return datamap;
        }

        protected DataMap handle(Context context)
        {
            context = new DataMap();
            context.putString("ID", uuid);
            context.putString("Type", "Config");
            context.putAll(ConfigSynchronizer.getSharedConfig());
            return context;
        }

        protected ShareConfig(int i)
        {
            super(i);
        }

        protected ShareConfig(DataMap datamap)
        {
            uuid = datamap.getString("ID");
        }
    }


    protected int timeOut;
    protected String uuid;

    protected WearableDataRequest()
    {
        uuid = UUID.randomUUID().toString();
    }

    protected WearableDataRequest(int i)
    {
        this();
        timeOut = i;
    }

    protected static WearableDataRequest createFileRequest(String s, String s1, int i)
    {
        return new Cache(s, s1, i);
    }

    protected static WearableDataRequest createGetRequest(String s, int i)
    {
        return new Get(s, i);
    }

    protected static WearableDataRequest createPostRequest(String s, String s1, int i)
    {
        return new Post(s, s1, i);
    }

    protected static WearableDataRequest createRequestFromDataMap(DataMap datamap)
    {
        if (datamap.getString("Type").equals("POST"))
        {
            return new Post(datamap);
        }
        if (datamap.getString("Type").equals("GET"))
        {
            return new Get(datamap);
        }
        if (datamap.getString("Type").equals("Config"))
        {
            return new ShareConfig(datamap);
        }
        if (datamap.getString("Type").equals("File"))
        {
            return new Cache(datamap);
        } else
        {
            return null;
        }
    }

    protected static WearableDataRequest createShareConfigRequest(int i)
    {
        return new ShareConfig(i);
    }

    private static byte[] readFile(File file)
    {
        Object obj;
        Object obj2;
        Object obj3;
        byte abyte0[];
        abyte0 = new byte[(int)file.length()];
        obj3 = null;
        obj = null;
        obj2 = null;
        file = new FileInputStream(file);
        int i = file.read(abyte0);
        if (i == -1)
        {
            if (file != null)
            {
                try
                {
                    file.close();
                }
                // Misplaced declaration of an exception variable
                catch (File file)
                {
                    StaticMethods.logDebugFormat("Wearable - Failed to close the file input stream", new Object[0]);
                }
            }
            return null;
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close the file input stream", new Object[0]);
            }
        }
        return abyte0;
        file;
        file = obj2;
_L6:
        obj = file;
        StaticMethods.logErrorFormat("Wearable - Failed to read cached file", new Object[0]);
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close the file input stream", new Object[0]);
            }
        }
        return null;
        file;
        file = obj3;
_L4:
        obj = file;
        StaticMethods.logErrorFormat("Wearable - Failed to read cached file", new Object[0]);
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close the file input stream", new Object[0]);
            }
        }
        return null;
        file;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logDebugFormat("Wearable - Failed to close the file input stream", new Object[0]);
            }
        }
        throw file;
        Exception exception;
        exception;
        obj = file;
        file = exception;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract DataMap getDataMap();

    protected int getTimeOut()
    {
        return timeOut;
    }

    protected String getUUID()
    {
        return uuid;
    }

    protected abstract DataMap handle(Context context);

}
