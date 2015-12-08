// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.Tracking;
import net.hockeyapp.android.UpdateManagerListener;
import net.hockeyapp.android.utils.VersionCache;
import net.hockeyapp.android.utils.VersionHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CheckUpdateTask extends AsyncTask
{

    protected static final String APK = "apk";
    protected static final String INTENT_EXTRA_JSON = "json";
    protected static final String INTENT_EXTRA_URL = "url";
    private static final int MAX_NUMBER_OF_VERSIONS = 25;
    protected String appIdentifier;
    private Context context;
    protected UpdateManagerListener listener;
    protected Boolean mandatory;
    protected String urlString;
    private long usageTime;

    public CheckUpdateTask(WeakReference weakreference, String s)
    {
        this(weakreference, s, null);
    }

    public CheckUpdateTask(WeakReference weakreference, String s, String s1)
    {
        this(weakreference, s, s1, null);
    }

    public CheckUpdateTask(WeakReference weakreference, String s, String s1, UpdateManagerListener updatemanagerlistener)
    {
        urlString = null;
        appIdentifier = null;
        context = null;
        mandatory = Boolean.valueOf(false);
        usageTime = 0L;
        appIdentifier = s1;
        urlString = s;
        listener = updatemanagerlistener;
        s = null;
        if (weakreference != null)
        {
            s = (Context)weakreference.get();
        }
        if (s != null)
        {
            context = s.getApplicationContext();
            usageTime = Tracking.getUsageTime(s);
            Constants.loadFromContext(s);
        }
    }

    private static String convertStreamToString(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 1024);
        stringbuilder = new StringBuilder();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        stringbuilder.append((new StringBuilder()).append(s).append("\n").toString());
          goto _L1
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return stringbuilder.toString();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        throw exception;
    }

    private String encodeParam(String s)
    {
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    private boolean findNewVersion(JSONArray jsonarray, int i)
    {
        int j = 0;
_L4:
        if (j >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = jsonarray.getJSONObject(j);
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (jsonobject.getInt("version") > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (jsonobject.getInt("version") == i && VersionHelper.isNewerThanLastUpdateTime(context, jsonobject.getLong("timestamp")))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (VersionHelper.compareVersionStrings(jsonobject.getString("minimum_os_version"), VersionHelper.mapGoogleVersion(android.os.Build.VERSION.RELEASE)) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
          goto _L3
_L5:
        if (flag2)
        {
            try
            {
                if (jsonobject.has("mandatory"))
                {
                    mandatory = Boolean.valueOf(jsonobject.getBoolean("mandatory"));
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                return false;
            }
            return true;
        }
_L6:
        j++;
          goto _L4
_L2:
        return false;
_L3:
        if (!flag && !flag1) goto _L6; else goto _L5
    }

    private JSONArray limitResponseSize(JSONArray jsonarray)
    {
        JSONArray jsonarray1 = new JSONArray();
        int i = 0;
        while (i < Math.min(jsonarray.length(), 25)) 
        {
            try
            {
                jsonarray1.put(jsonarray.get(i));
            }
            catch (JSONException jsonexception) { }
            i++;
        }
        return jsonarray1;
    }

    public void attach(WeakReference weakreference)
    {
        Context context1 = null;
        if (weakreference != null)
        {
            context1 = (Context)weakreference.get();
        }
        if (context1 != null)
        {
            context = context1.getApplicationContext();
            Constants.loadFromContext(context1);
        }
    }

    protected void cleanUp()
    {
        urlString = null;
        appIdentifier = null;
    }

    protected URLConnection createConnection(URL url)
        throws IOException
    {
        url = url.openConnection();
        url.addRequestProperty("User-Agent", "HockeySDK/Android");
        if (android.os.Build.VERSION.SDK_INT <= 9)
        {
            url.setRequestProperty("connection", "close");
        }
        return url;
    }

    public void detach()
    {
        context = null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient JSONArray doInBackground(Void avoid[])
    {
        int i;
        i = getVersionCode();
        avoid = new JSONArray(VersionCache.getVersionInfo(context));
        if (getCachingEnabled() && findNewVersion(avoid, i))
        {
            return avoid;
        }
        avoid = createConnection(new URL(getURLString("json")));
        avoid.connect();
        avoid = new BufferedInputStream(avoid.getInputStream());
        String s = convertStreamToString(avoid);
        avoid.close();
        avoid = new JSONArray(s);
        if (!findNewVersion(avoid, i))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        avoid = limitResponseSize(avoid);
        return avoid;
        avoid;
        avoid.printStackTrace();
        return null;
    }

    protected boolean getCachingEnabled()
    {
        return true;
    }

    protected String getURLString(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(urlString);
        stringbuilder.append("api/2/apps/");
        String s1;
        if (appIdentifier != null)
        {
            s1 = appIdentifier;
        } else
        {
            s1 = context.getPackageName();
        }
        stringbuilder.append(s1);
        stringbuilder.append((new StringBuilder()).append("?format=").append(s).toString());
        if (android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id") != null)
        {
            stringbuilder.append((new StringBuilder()).append("&udid=").append(encodeParam(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"))).toString());
        }
        stringbuilder.append("&os=Android");
        stringbuilder.append((new StringBuilder()).append("&os_version=").append(encodeParam(Constants.ANDROID_VERSION)).toString());
        stringbuilder.append((new StringBuilder()).append("&device=").append(encodeParam(Constants.PHONE_MODEL)).toString());
        stringbuilder.append((new StringBuilder()).append("&oem=").append(encodeParam(Constants.PHONE_MANUFACTURER)).toString());
        stringbuilder.append((new StringBuilder()).append("&app_version=").append(encodeParam(Constants.APP_VERSION)).toString());
        stringbuilder.append((new StringBuilder()).append("&sdk=").append(encodeParam("HockeySDK")).toString());
        stringbuilder.append((new StringBuilder()).append("&sdk_version=").append(encodeParam("3.5.0")).toString());
        stringbuilder.append((new StringBuilder()).append("&lang=").append(encodeParam(Locale.getDefault().getLanguage())).toString());
        stringbuilder.append((new StringBuilder()).append("&usage_time=").append(usageTime).toString());
        return stringbuilder.toString();
    }

    protected int getVersionCode()
    {
        return Integer.parseInt(Constants.APP_VERSION);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONArray)obj);
    }

    protected void onPostExecute(JSONArray jsonarray)
    {
        if (jsonarray != null)
        {
            if (listener != null)
            {
                listener.onUpdateAvailable(jsonarray, getURLString("apk"));
            }
        } else
        if (listener != null)
        {
            listener.onNoUpdateAvailable();
            return;
        }
    }
}
