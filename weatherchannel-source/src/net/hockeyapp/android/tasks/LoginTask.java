// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.utils.Base64;
import net.hockeyapp.android.utils.ConnectionManager;
import net.hockeyapp.android.utils.PrefsUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginTask extends AsyncTask
{

    private Context context;
    private Handler handler;
    private final int mode;
    private final Map params;
    private ProgressDialog progressDialog;
    private boolean showProgressDialog;
    private final String urlString;

    public LoginTask(Context context1, Handler handler1, String s, int i, Map map)
    {
        context = context1;
        handler = handler1;
        urlString = s;
        mode = i;
        params = map;
        showProgressDialog = true;
        if (context1 != null)
        {
            Constants.loadFromContext(context1);
        }
    }

    private boolean handleResponse(String s)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("net.hockeyapp.android.login", 0);
        String s1;
        s = new JSONObject(s);
        s1 = s.getString("status");
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        if (mode != 1)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (!s1.equals("identified"))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        s = s.getString("iuid");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        PrefsUtil.applyChanges(sharedpreferences.edit().putString("iuid", s));
        return true;
        if (mode != 2)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (!s1.equals("authorized"))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        s = s.getString("auid");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        PrefsUtil.applyChanges(sharedpreferences.edit().putString("auid", s));
        return true;
        if (mode == 3)
        {
            if (s1.equals("validated"))
            {
                return true;
            }
            try
            {
                PrefsUtil.applyChanges(sharedpreferences.edit().remove("iuid").remove("auid"));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return false;
            }
            return false;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Login mode ").append(mode).append(" not supported.").toString());
        return false;
    }

    private HttpUriRequest makeRequest(int i, Map map)
        throws UnsupportedEncodingException
    {
        if (i == 1)
        {
            Object obj = new ArrayList();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); ((List) (obj)).add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
            {
                entry = (java.util.Map.Entry)map.next();
            }

            map = new UrlEncodedFormEntity(((List) (obj)), "UTF-8");
            map.setContentEncoding("UTF-8");
            obj = new HttpPost(urlString);
            ((HttpPost) (obj)).setEntity(map);
            return ((HttpUriRequest) (obj));
        }
        if (i == 2)
        {
            Object obj1 = (String)map.get("email");
            map = (String)map.get("password");
            map = (new StringBuilder()).append("Basic ").append(Base64.encodeToString((new StringBuilder()).append(((String) (obj1))).append(":").append(map).toString().getBytes(), 2)).toString();
            obj1 = new HttpPost(urlString);
            ((HttpPost) (obj1)).setHeader("Authorization", map);
            return ((HttpUriRequest) (obj1));
        }
        if (i == 3)
        {
            String s = (String)map.get("type");
            map = (String)map.get("id");
            return new HttpGet((new StringBuilder()).append(urlString).append("?").append(s).append("=").append(map).toString());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Login mode ").append(i).append(" not supported.").toString());
        }
    }

    public void attach(Context context1, Handler handler1)
    {
        context = context1;
        handler = handler1;
    }

    public void detach()
    {
        context = null;
        handler = null;
        progressDialog = null;
    }

    protected transient Boolean doInBackground(Void avoid[])
    {
        avoid = ConnectionManager.getInstance().getHttpClient();
        avoid = avoid.execute(makeRequest(mode, params));
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        boolean flag;
        avoid = EntityUtils.toString(avoid.getEntity());
        if (TextUtils.isEmpty(avoid))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = handleResponse(avoid);
        return Boolean.valueOf(flag);
        avoid;
        avoid.printStackTrace();
_L2:
        return Boolean.valueOf(false);
        avoid;
        avoid.printStackTrace();
        continue; /* Loop/switch isn't completed */
        avoid;
        avoid.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (progressDialog != null)
        {
            try
            {
                progressDialog.dismiss();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (handler != null)
        {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putBoolean("success", boolean1.booleanValue());
            message.setData(bundle);
            handler.sendMessage(message);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected void onPreExecute()
    {
        if ((progressDialog == null || !progressDialog.isShowing()) && showProgressDialog)
        {
            progressDialog = ProgressDialog.show(context, "", "Please wait...", true, false);
        }
    }

    public void setShowProgressDialog(boolean flag)
    {
        showProgressDialog = flag;
    }
}
