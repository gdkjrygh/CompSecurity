// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import android.webkit.CookieManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONObject;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

public class HTTPTask extends AsyncTask
{

    private static int androidVersion;
    private static int webVersion;
    final String CST = "CST";
    final String EST = "EST";
    long currentTime;
    private int dns;
    private int eos;
    JSONObject json;
    MainActivity mainActivity;
    private String serverStatus;
    String url;

    public HTTPTask(MainActivity mainactivity)
    {
        serverStatus = "NONE";
        eos = 0;
        dns = 0;
        mainActivity = mainactivity;
    }

    private void checkDNS()
    {
        Object obj;
        Object obj2;
        Log.i("WebLog", "checkDNS()");
        if (!getConnectionStatus())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj2 = mainActivity.getString(0x7f08004f);
        obj = new DefaultHttpClient();
        obj2 = new HttpGet(((String) (obj2)));
        obj = ((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2)));
        Log.i("WebLog", (new StringBuilder("DNS Check Http response: ")).append(((HttpResponse) (obj)).getStatusLine().toString()).toString());
        eos = 1;
        return;
        Object obj1;
        obj1;
        Log.i("WebLog", (new StringBuilder("DNS Check UHE > no connection:")).append(obj1).toString());
        dns = 1;
        return;
        obj1;
        Log.i("WebLog", (new StringBuilder("DNS Check connect Exception: ")).append(obj1).toString());
        dns = 1;
        return;
    }

    private void connect()
    {
        Log.i("WebLog", "connect()");
        if (!getConnectionStatus()) goto _L2; else goto _L1
_L1:
        Object obj;
        HttpGet httpget;
        if (getTimeZone().equals("CST") || getTimeZone().equals("EST"))
        {
            url = mainActivity.getString(0x7f08004d);
        } else
        {
            url = mainActivity.getString(0x7f08004e);
        }
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 25000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 25000);
        obj = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
        httpget = new HttpGet((new StringBuilder(String.valueOf(url))).append("/api/1/gatekeeper/init?nocache=").append(System.currentTimeMillis()).toString());
        try
        {
            httpget.addHeader("Cookie", getCookieFromAppCookieManager(url));
        }
        catch (MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
        }
        obj = ((DefaultHttpClient) (obj)).execute(httpget);
        Log.i("WebLog", (new StringBuilder("Http response: ")).append(((HttpResponse) (obj)).getStatusLine().toString()).toString());
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() != 404) goto _L4; else goto _L3
_L3:
        checkDNS();
_L2:
        return;
_L4:
        obj = ((HttpResponse) (obj)).getEntity();
        if (obj != null)
        {
            try
            {
                obj = ((HttpEntity) (obj)).getContent();
                String s = convertStreamToString(((InputStream) (obj)));
                currentTime = System.currentTimeMillis();
                ((InputStream) (obj)).close();
                json = new JSONObject(s);
                obj = json.optJSONObject("clientMinimalVersion");
                androidVersion = ((JSONObject) (obj)).optInt("android");
                webVersion = ((JSONObject) (obj)).optInt("web");
                Log.d("WebLog", (new StringBuilder("AndroidVersion: ")).append(androidVersion).append(" WebVersion: ").append(webVersion).toString());
                serverStatus = json.optString("status");
                return;
            }
            catch (UnknownHostException unknownhostexception)
            {
                Log.i("WebLog", (new StringBuilder("UnknownHostException UHE ")).append(unknownhostexception).toString());
                checkDNS();
                return;
            }
            catch (Exception exception)
            {
                Log.i("WebLog", (new StringBuilder("connect Exception: ")).append(exception).toString());
            }
            dns = 1;
            return;
        }
          goto _L2
    }

    private static String convertStreamToString(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L2:
        String s = bufferedreader.readLine();
label0:
        {
            {
                if (s != null)
                {
                    break label0;
                }
                Exception exception;
                IOException ioexception;
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream)
                {
                    inputstream.printStackTrace();
                }
            }
            return stringbuilder.toString();
        }
        stringbuilder.append((new StringBuilder(String.valueOf(s))).append("\n").toString());
        continue; /* Loop/switch isn't completed */
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
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_37;
        }
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
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected transient Integer doInBackground(String as[])
    {
        connect();
        return Integer.valueOf(androidVersion);
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    boolean getConnectionStatus()
    {
        for (NetworkInfo networkinfo = ((ConnectivityManager)mainActivity.getSystemService("connectivity")).getActiveNetworkInfo(); networkinfo == null || !networkinfo.isConnected() || !networkinfo.isAvailable();)
        {
            return false;
        }

        return true;
    }

    public String getCookieFromAppCookieManager(String s)
        throws MalformedURLException
    {
        Object obj = CookieManager.getInstance();
        if (obj == null)
        {
            s = null;
        } else
        {
            obj = ((CookieManager) (obj)).getCookie((new URL(s)).getHost());
            s = ((String) (obj));
            if (obj == null)
            {
                return null;
            }
        }
        return s;
    }

    public String getTimeZone()
    {
        return TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
    }

    protected void onPostExecute(Integer integer)
    {
        if (json != null)
        {
            mainActivity.sendBackendData(url, json, currentTime, getTimeZone());
        }
        if (dns == 1)
        {
            mainActivity.showDNSDialog();
        }
        if (eos == 1)
        {
            mainActivity.showEndOfSeasonDialog();
            return;
        } else
        {
            mainActivity.checkVersion(androidVersion, serverStatus);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Integer)obj);
    }
}
