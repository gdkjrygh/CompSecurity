// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.twcpresents.provider;

import android.app.IntentService;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.collect.Lists;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.util.config.ConfigException;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import org.json.JSONException;

// Referenced classes of package com.weather.twcpresents.provider:
//            TwcPresentsPojo, TwcPresentsContract

public class TwcPresentsDownloadService extends IntentService
{

    private static final String AUTHORITY_KEY = "authority";
    static final String CONTENT_URI_KEY = "CONTENT_URI";
    static final String FORCE_REFRESH = "force_refresh";
    private static final long MIN_FORCED_REFRESH_INTERVAL_MS = 30000L;
    private static final long MIN_REFRESH_INTERVAL_MS = 0x36ee80L;
    private static final String TAG = "TwcPresentsDownload";
    private static final int TIMEOUT = 15000;
    private static final String TWC_PRESENT_URL = "https://s3.amazonaws.com/mobile.prod.twc/presents/presents.json";
    private static final String URL_KEY = "url";
    private static Semaphore semaphore;

    public TwcPresentsDownloadService()
    {
        super("TwcPresentsDownload");
    }

    static boolean allowDownload(boolean flag)
    {
        for (long l = System.currentTimeMillis() - TwcPrefs.getInstance().getLong(com.weather.util.prefs.TwcPrefs.Keys.TWC_PRESENTS_REFRESH_TIME, 0L); flag && l > 30000L || l > 0x36ee80L;)
        {
            return true;
        }

        return false;
    }

    private void deleteItems(Uri uri)
    {
        ContentResolver contentresolver = getContentResolver();
        try
        {
            contentresolver.delete(uri, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return;
        }
    }

    private void disconnect(HttpRequest httprequest)
    {
        if (httprequest == null)
        {
            break MISSING_BLOCK_LABEL_9;
        }
        httprequest.disconnect();
        return;
        httprequest;
    }

    public static Intent getIntent(Context context, String s, Uri uri, String s1, boolean flag)
    {
        context = new Intent(context, com/weather/twcpresents/provider/TwcPresentsDownloadService);
        context.putExtra("url", s1);
        context.putExtra("authority", s);
        context.putExtra("CONTENT_URI", uri);
        context.putExtra("force_refresh", flag);
        return context;
    }

    public static Semaphore getSemaphore()
    {
        return semaphore;
    }

    public static Intent getTwcPresentsIntent(Context context, boolean flag)
    {
        String s = "https://s3.amazonaws.com/mobile.prod.twc/presents/presents.json";
        String s1 = ConfigurationManagers.getInstance().getFlagshipConfig().twcPresents;
        s = s1;
_L2:
        return getIntent(context, "com.weather.weather.provider.twcpresents", TwcPresentsContract.TWCPresentsItem.TWC_PRESENTS_CONTENT_URI, s, flag);
        ConfigException configexception;
        configexception;
        Log.e("TwcPresentsDownload", configexception.toString(), configexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void initSemaphore()
        throws InterruptedException
    {
        semaphore = new Semaphore(1);
        semaphore.acquire();
    }

    private void insertItems(List list, String s, Uri uri)
        throws RemoteException, OperationApplicationException
    {
        ArrayList arraylist = Lists.newArrayList();
        ContentResolver contentresolver = getContentResolver();
        ContentValues contentvalues;
        for (list = list.iterator(); list.hasNext(); arraylist.add(ContentProviderOperation.newInsert(uri).withValues(contentvalues).build()))
        {
            contentvalues = TwcPresentsContract.makeContentValues((TwcPresentsPojo)list.next());
            contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
        }

        contentresolver.applyBatch(s, arraylist);
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Uri uri;
        String s;
        boolean flag;
        uri = (Uri)intent.getParcelableExtra("CONTENT_URI");
        flag = intent.getBooleanExtra("force_refresh", false);
        s = intent.getStringExtra("authority");
        intent = intent.getStringExtra("url");
        if (s == null || uri == null || intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = allowDownload(flag);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (semaphore == null) goto _L1; else goto _L3
_L3:
        semaphore.release();
        return;
        if (!uri.equals(TwcPresentsContract.TWCPresentsItem.TWC_PRESENTS_CONTENT_URI))
        {
            break MISSING_BLOCK_LABEL_261;
        }
        Object obj;
        Object obj1;
        Intent intent1;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        obj1 = null;
        intent1 = null;
        intent2 = null;
        intent3 = null;
        intent4 = null;
        obj = null;
        TrafficStats.setThreadStatsTag(61441);
        intent = HttpRequest.get(intent).useCaches(true).header("Cache-Control", "no-cache").acceptJson().acceptGzipEncoding().readTimeout(15000).connectTimeout(15000).uncompress(true);
        obj = intent;
        obj1 = intent;
        intent1 = intent;
        intent2 = intent;
        intent3 = intent;
        intent4 = intent;
        List list = TwcPresentsPojo.parseTwcPresents(intent.body());
        obj = intent;
        obj1 = intent;
        intent1 = intent;
        intent2 = intent;
        intent3 = intent;
        intent4 = intent;
        deleteItems(uri);
        obj = intent;
        obj1 = intent;
        intent1 = intent;
        intent2 = intent;
        intent3 = intent;
        intent4 = intent;
        insertItems(list, s, uri);
        obj = intent;
        obj1 = intent;
        intent1 = intent;
        intent2 = intent;
        intent3 = intent;
        intent4 = intent;
        TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.TWC_PRESENTS_REFRESH_TIME, System.currentTimeMillis());
        disconnect(intent);
        TrafficStats.clearThreadStatsTag();
_L5:
        if (semaphore != null)
        {
            semaphore.release();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj1;
        intent = ((Intent) (obj));
        obj = obj1;
_L6:
        obj1 = intent;
        Log.e("TwcPresentsDownload", ((Exception) (obj)).toString(), ((Throwable) (obj)));
        disconnect(intent);
        TrafficStats.clearThreadStatsTag();
          goto _L5
        intent;
        if (semaphore != null)
        {
            semaphore.release();
        }
        throw intent;
        intent;
        disconnect(((HttpRequest) (obj1)));
        TrafficStats.clearThreadStatsTag();
        throw intent;
        obj;
        intent = intent1;
          goto _L6
        obj;
        intent = intent2;
          goto _L6
        obj;
        intent = intent3;
          goto _L6
        obj;
        intent = intent4;
          goto _L6
    }
}
