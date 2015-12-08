// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.utils.ConnectionManager;
import net.hockeyapp.android.utils.SimpleMultipartEntity;
import net.hockeyapp.android.utils.Util;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class SendFeedbackTask extends AsyncTask
{

    private List attachmentUris;
    private Context context;
    private String email;
    private Handler handler;
    private boolean isFetchMessages;
    private int lastMessageId;
    private String name;
    private ProgressDialog progressDialog;
    private boolean showProgressDialog;
    private String subject;
    private String text;
    private String token;
    private String urlString;

    public SendFeedbackTask(Context context1, String s, String s1, String s2, String s3, String s4, List list, 
            String s5, Handler handler1, boolean flag)
    {
        context = context1;
        urlString = s;
        name = s1;
        email = s2;
        subject = s3;
        text = s4;
        attachmentUris = list;
        token = s5;
        handler = handler1;
        isFetchMessages = flag;
        showProgressDialog = true;
        lastMessageId = -1;
        if (context1 != null)
        {
            Constants.loadFromContext(context1);
        }
    }

    private HashMap doGet(HttpClient httpclient)
    {
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append((new StringBuilder()).append(urlString).append(Util.encodeParam(token)).toString());
        if (lastMessageId != -1)
        {
            ((StringBuilder) (obj)).append((new StringBuilder()).append("?last_message_id=").append(lastMessageId).toString());
        }
        HttpGet httpget = new HttpGet(((StringBuilder) (obj)).toString());
        obj = new HashMap();
        ((HashMap) (obj)).put("type", "fetch");
        try
        {
            httpclient = httpclient.execute(httpget);
            ((HashMap) (obj)).put("response", EntityUtils.toString(httpclient.getEntity()));
            ((HashMap) (obj)).put("status", (new StringBuilder()).append("").append(httpclient.getStatusLine().getStatusCode()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient.printStackTrace();
            return ((HashMap) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient.printStackTrace();
            return ((HashMap) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient.printStackTrace();
            return ((HashMap) (obj));
        }
        return ((HashMap) (obj));
    }

    private HashMap doPostPut(HttpClient httpclient)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("type", "send");
        UrlEncodedFormEntity urlencodedformentity;
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("name", name));
        arraylist.add(new BasicNameValuePair("email", email));
        arraylist.add(new BasicNameValuePair("subject", subject));
        arraylist.add(new BasicNameValuePair("text", text));
        arraylist.add(new BasicNameValuePair("bundle_identifier", Constants.APP_PACKAGE));
        arraylist.add(new BasicNameValuePair("bundle_short_version", Constants.APP_VERSION_NAME));
        arraylist.add(new BasicNameValuePair("bundle_version", Constants.APP_VERSION));
        arraylist.add(new BasicNameValuePair("os_version", Constants.ANDROID_VERSION));
        arraylist.add(new BasicNameValuePair("oem", Constants.PHONE_MANUFACTURER));
        arraylist.add(new BasicNameValuePair("model", Constants.PHONE_MODEL));
        urlencodedformentity = new UrlEncodedFormEntity(arraylist, "UTF-8");
        urlencodedformentity.setContentEncoding("UTF-8");
        Object obj;
        HttpPost httppost;
        httppost = null;
        obj = null;
        if (token == null) goto _L2; else goto _L1
_L1:
        urlString = (new StringBuilder()).append(urlString).append(token).append("/").toString();
        obj = new HttpPut(urlString);
_L8:
        Object obj1 = null;
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((HttpPut) (obj)).setEntity(urlencodedformentity);
        obj = httpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
_L6:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        hashmap.put("response", EntityUtils.toString(((HttpResponse) (obj)).getEntity()));
        hashmap.put("status", (new StringBuilder()).append("").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        return hashmap;
_L2:
        try
        {
            httppost = new HttpPost(urlString);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient.printStackTrace();
            return hashmap;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient.printStackTrace();
            return hashmap;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient.printStackTrace();
        }
        break; /* Loop/switch isn't completed */
_L4:
        obj = obj1;
        if (httppost == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        httppost.setEntity(urlencodedformentity);
        obj = httpclient.execute(httppost);
        if (true) goto _L6; else goto _L5
_L5:
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private HashMap doPostPutWithAttachments(HttpClient httpclient)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("type", "send");
        SimpleMultipartEntity simplemultipartentity;
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("name", name));
        ((List) (obj)).add(new BasicNameValuePair("email", email));
        ((List) (obj)).add(new BasicNameValuePair("subject", subject));
        ((List) (obj)).add(new BasicNameValuePair("text", text));
        ((List) (obj)).add(new BasicNameValuePair("bundle_identifier", Constants.APP_PACKAGE));
        ((List) (obj)).add(new BasicNameValuePair("bundle_short_version", Constants.APP_VERSION_NAME));
        ((List) (obj)).add(new BasicNameValuePair("bundle_version", Constants.APP_VERSION));
        ((List) (obj)).add(new BasicNameValuePair("os_version", Constants.ANDROID_VERSION));
        ((List) (obj)).add(new BasicNameValuePair("oem", Constants.PHONE_MANUFACTURER));
        ((List) (obj)).add(new BasicNameValuePair("model", Constants.PHONE_MODEL));
        simplemultipartentity = new SimpleMultipartEntity();
        simplemultipartentity.writeFirstBoundaryIfNeeds();
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); simplemultipartentity.addPart(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        }

          goto _L1
        httpclient;
        httpclient.printStackTrace();
_L9:
        return hashmap;
_L1:
        int i = 0;
_L3:
        Object obj2;
        if (i >= attachmentUris.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Uri)attachmentUris.get(i);
        Object obj1;
        Object obj3;
        boolean flag;
        if (i == attachmentUris.size() - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = context.getContentResolver().openInputStream(((Uri) (obj2)));
        obj2 = ((Uri) (obj2)).getLastPathSegment();
        simplemultipartentity.addPart((new StringBuilder()).append("attachment").append(i).toString(), ((String) (obj2)), ((java.io.InputStream) (obj1)), flag);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        simplemultipartentity.writeLastBoundaryIfNeeds();
        obj2 = null;
        obj1 = null;
        if (token == null) goto _L5; else goto _L4
_L4:
        urlString = (new StringBuilder()).append(urlString).append(token).append("/").toString();
        obj1 = new HttpPut(urlString);
_L10:
        obj3 = null;
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        ((HttpPut) (obj1)).setHeader("Content-type", (new StringBuilder()).append("multipart/form-data; boundary=").append(simplemultipartentity.getBoundary()).toString());
        ((HttpPut) (obj1)).setEntity(simplemultipartentity);
        obj1 = httpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
_L12:
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        hashmap.put("response", EntityUtils.toString(((HttpResponse) (obj1)).getEntity()));
        hashmap.put("status", (new StringBuilder()).append("").append(((HttpResponse) (obj1)).getStatusLine().getStatusCode()).toString());
        return hashmap;
        httpclient;
        httpclient.printStackTrace();
        return hashmap;
_L5:
        obj2 = new HttpPost(urlString);
          goto _L10
_L7:
        obj1 = obj3;
        if (obj2 == null) goto _L12; else goto _L11
_L11:
        ((HttpPost) (obj2)).setHeader("Content-type", (new StringBuilder()).append("multipart/form-data; boundary=").append(simplemultipartentity.getBoundary()).toString());
        ((HttpPost) (obj2)).setEntity(simplemultipartentity);
        obj1 = httpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj2)));
          goto _L12
        httpclient;
        httpclient.printStackTrace();
        return hashmap;
          goto _L10
    }

    public void attach(Context context1)
    {
        context = context1;
    }

    public void detach()
    {
        context = null;
        progressDialog = null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient HashMap doInBackground(Void avoid[])
    {
        avoid = ConnectionManager.getInstance().getHttpClient();
        if (!isFetchMessages || token == null) goto _L2; else goto _L1
_L1:
        avoid = doGet(avoid);
_L4:
        return avoid;
_L2:
label0:
        {
            if (isFetchMessages)
            {
                break label0;
            }
            if (attachmentUris.isEmpty())
            {
                return doPostPut(avoid);
            }
            HashMap hashmap = doPostPutWithAttachments(avoid);
            String s = (String)hashmap.get("status");
            avoid = hashmap;
            if (s != null)
            {
                avoid = hashmap;
                if (s.startsWith("2"))
                {
                    avoid = hashmap;
                    if (context != null)
                    {
                        File file = new File(context.getCacheDir(), "HockeyApp");
                        avoid = hashmap;
                        if (file.exists())
                        {
                            File afile[] = file.listFiles();
                            int j = afile.length;
                            int i = 0;
                            do
                            {
                                avoid = hashmap;
                                if (i >= j)
                                {
                                    break;
                                }
                                afile[i].delete();
                                i++;
                            } while (true);
                        }
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((HashMap)obj);
    }

    protected void onPostExecute(HashMap hashmap)
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
            if (hashmap != null)
            {
                bundle.putString("request_type", (String)hashmap.get("type"));
                bundle.putString("feedback_response", (String)hashmap.get("response"));
                bundle.putString("feedback_status", (String)hashmap.get("status"));
            } else
            {
                bundle.putString("request_type", "unknown");
            }
            message.setData(bundle);
            handler.sendMessage(message);
        }
    }

    protected void onPreExecute()
    {
        String s = "Sending feedback..";
        if (isFetchMessages)
        {
            s = "Retrieving discussions...";
        }
        if ((progressDialog == null || !progressDialog.isShowing()) && showProgressDialog)
        {
            progressDialog = ProgressDialog.show(context, "", s, true, false);
        }
    }

    public void setLastMessageId(int i)
    {
        lastMessageId = i;
    }

    public void setShowProgressDialog(boolean flag)
    {
        showProgressDialog = flag;
    }
}
