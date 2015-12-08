// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bolts:
//            AppLinkResolver, AppLink, Capture, Task, 
//            Continuation

public class WebViewAppLinkResolver
    implements AppLinkResolver
{

    private static final String KEY_AL_VALUE = "value";
    private static final String KEY_ANDROID = "android";
    private static final String KEY_APP_NAME = "app_name";
    private static final String KEY_CLASS = "class";
    private static final String KEY_PACKAGE = "package";
    private static final String KEY_SHOULD_FALLBACK = "should_fallback";
    private static final String KEY_URL = "url";
    private static final String KEY_WEB = "web";
    private static final String KEY_WEB_URL = "url";
    private static final String META_TAG_PREFIX = "al";
    private static final String PREFER_HEADER = "Prefer-Html-Meta-Tags";
    private static final String TAG_EXTRACTION_JAVASCRIPT = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";
    private final Context context;

    public WebViewAppLinkResolver(Context context1)
    {
        context = context1;
    }

    private static List getAlList(Map map, String s)
    {
        s = (List)map.get(s);
        map = s;
        if (s == null)
        {
            map = Collections.emptyList();
        }
        return map;
    }

    private static AppLink makeAppLinkFromAlData(Map map, Uri uri)
    {
        ArrayList arraylist = new ArrayList();
        Object obj1 = (List)map.get("android");
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = Collections.emptyList();
        }
        for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            obj = (Map)((Iterator) (obj1)).next();
            List list = getAlList(((Map) (obj)), "url");
            List list2 = getAlList(((Map) (obj)), "package");
            List list3 = getAlList(((Map) (obj)), "class");
            List list4 = getAlList(((Map) (obj)), "app_name");
            int j = Math.max(list.size(), Math.max(list2.size(), Math.max(list3.size(), list4.size())));
            int i = 0;
            while (i < j) 
            {
                Uri uri1;
                String s;
                String s1;
                if (list.size() > i)
                {
                    obj = ((Map)list.get(i)).get("value");
                } else
                {
                    obj = null;
                }
                uri1 = tryCreateUrl((String)(String)obj);
                if (list2.size() > i)
                {
                    obj = ((Map)list2.get(i)).get("value");
                } else
                {
                    obj = null;
                }
                s = (String)(String)obj;
                if (list3.size() > i)
                {
                    obj = ((Map)list3.get(i)).get("value");
                } else
                {
                    obj = null;
                }
                s1 = (String)(String)obj;
                if (list4.size() > i)
                {
                    obj = ((Map)list4.get(i)).get("value");
                } else
                {
                    obj = null;
                }
                arraylist.add(new AppLink.Target(s, s1, uri1, (String)(String)obj));
                i++;
            }
        }

        obj = uri;
        map = (List)map.get("web");
        obj1 = obj;
        if (map != null)
        {
            obj1 = obj;
            if (map.size() > 0)
            {
                map = (Map)map.get(0);
                List list1 = (List)map.get("url");
                obj1 = (List)map.get("should_fallback");
                map = ((Map) (obj));
                if (obj1 != null)
                {
                    map = ((Map) (obj));
                    if (((List) (obj1)).size() > 0)
                    {
                        obj1 = (String)((Map)((List) (obj1)).get(0)).get("value");
                        map = ((Map) (obj));
                        if (Arrays.asList(new String[] {
    "no", "false", "0"
}).contains(((String) (obj1)).toLowerCase()))
                        {
                            map = null;
                        }
                    }
                }
                obj1 = map;
                if (map != null)
                {
                    obj1 = map;
                    if (list1 != null)
                    {
                        obj1 = map;
                        if (list1.size() > 0)
                        {
                            obj1 = tryCreateUrl((String)((Map)list1.get(0)).get("value"));
                        }
                    }
                }
            }
        }
        return new AppLink(uri, arraylist, ((Uri) (obj1)));
    }

    private static Map parseAlData(JSONArray jsonarray)
        throws JSONException
    {
        HashMap hashmap = new HashMap();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            String as[] = jsonobject.getString("property").split(":");
            if (as[0].equals("al"))
            {
                Object obj = hashmap;
                int j = 1;
                while (j < as.length) 
                {
                    List list = (List)((Map) (obj)).get(as[j]);
                    Object obj1 = list;
                    if (list == null)
                    {
                        obj1 = new ArrayList();
                        ((Map) (obj)).put(as[j], obj1);
                    }
                    if (((List) (obj1)).size() > 0)
                    {
                        obj = (Map)((List) (obj1)).get(((List) (obj1)).size() - 1);
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null || j == as.length - 1)
                    {
                        obj = new HashMap();
                        ((List) (obj1)).add(obj);
                    }
                    j++;
                }
                if (jsonobject.has("content"))
                {
                    if (jsonobject.isNull("content"))
                    {
                        ((Map) (obj)).put("value", null);
                    } else
                    {
                        ((Map) (obj)).put("value", jsonobject.getString("content"));
                    }
                }
            }
            i++;
        }
        return hashmap;
    }

    private static String readFromConnection(URLConnection urlconnection)
        throws IOException
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        if (urlconnection instanceof HttpURLConnection)
        {
            byte abyte0[] = (HttpURLConnection)urlconnection;
            int i;
            try
            {
                obj = urlconnection.getInputStream();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = abyte0.getErrorStream();
            }
        } else
        {
            obj = urlconnection.getInputStream();
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L1:
        i = ((InputStream) (obj)).read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        urlconnection;
        ((InputStream) (obj)).close();
        throw urlconnection;
        String s = urlconnection.getContentEncoding();
        Object obj1 = s;
        if (s != null) goto _L3; else goto _L2
_L2:
        int k;
        obj1 = urlconnection.getContentType().split(";");
        k = obj1.length;
        int j = 0;
_L6:
        urlconnection = s;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_179;
        }
          goto _L4
_L3:
        urlconnection = new String(bytearrayoutputstream.toByteArray(), ((String) (obj1)));
        ((InputStream) (obj)).close();
        return urlconnection;
_L4:
        urlconnection = obj1[j].trim();
        if (urlconnection.startsWith("charset="))
        {
            urlconnection = urlconnection.substring("charset=".length());
            break MISSING_BLOCK_LABEL_179;
        }
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        obj1 = urlconnection;
        if (urlconnection == null)
        {
            obj1 = "UTF-8";
        }
          goto _L3
    }

    private static Uri tryCreateUrl(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public Task getAppLinkFromUrlInBackground(final Uri url)
    {
        final Capture content = new Capture();
        final Capture contentType = new Capture();
        return Task.callInBackground(new Callable() {

            final WebViewAppLinkResolver this$0;
            final Capture val$content;
            final Capture val$contentType;
            final Uri val$url;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                URLConnection urlconnection;
                URL url1 = new URL(url.toString());
                urlconnection = null;
                while (url1 != null) 
                {
                    urlconnection = url1.openConnection();
                    if (urlconnection instanceof HttpURLConnection)
                    {
                        ((HttpURLConnection)urlconnection).setInstanceFollowRedirects(true);
                    }
                    urlconnection.setRequestProperty("Prefer-Html-Meta-Tags", "al");
                    urlconnection.connect();
                    if (urlconnection instanceof HttpURLConnection)
                    {
                        HttpURLConnection httpurlconnection = (HttpURLConnection)urlconnection;
                        if (httpurlconnection.getResponseCode() >= 300 && httpurlconnection.getResponseCode() < 400)
                        {
                            url1 = new URL(httpurlconnection.getHeaderField("Location"));
                            httpurlconnection.disconnect();
                        } else
                        {
                            url1 = null;
                        }
                    } else
                    {
                        url1 = null;
                    }
                }
                content.set(WebViewAppLinkResolver.readFromConnection(urlconnection));
                contentType.set(urlconnection.getContentType());
                if (urlconnection instanceof HttpURLConnection)
                {
                    ((HttpURLConnection)urlconnection).disconnect();
                }
                return null;
                Exception exception;
                exception;
                if (urlconnection instanceof HttpURLConnection)
                {
                    ((HttpURLConnection)urlconnection).disconnect();
                }
                throw exception;
            }

            
            {
                this$0 = WebViewAppLinkResolver.this;
                url = uri;
                content = capture;
                contentType = capture1;
                super();
            }
        }).onSuccessTask(new Continuation() {

            final WebViewAppLinkResolver this$0;
            final Capture val$content;
            final Capture val$contentType;
            final Uri val$url;

            public Task then(Task task)
                throws Exception
            {
                Task.TaskCompletionSource taskcompletionsource = Task.create();
                WebView webview = new WebView(context);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.setNetworkAvailable(false);
                webview.setWebViewClient(new WebViewClient() {

                    private boolean loaded;
                    final _cls2 this$1;

                    private void runJavaScript(WebView webview)
                    {
                        if (!loaded)
                        {
                            loaded = true;
                            webview.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
                        }
                    }

                    public void onLoadResource(WebView webview, String s)
                    {
                        super.onLoadResource(webview, s);
                        runJavaScript(webview);
                    }

                    public void onPageFinished(WebView webview, String s)
                    {
                        super.onPageFinished(webview, s);
                        runJavaScript(webview);
                    }

            
            {
                this$1 = _cls2.this;
                super();
                loaded = false;
            }
                });
                webview.addJavascriptInterface(taskcompletionsource. new Object() {

                    final _cls2 this$1;
                    final Task.TaskCompletionSource val$tcs;

                    public void setValue(String s)
                    {
                        try
                        {
                            tcs.trySetResult(new JSONArray(s));
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            tcs.trySetError(s);
                        }
                    }

            
            {
                this$1 = final__pcls2;
                tcs = Task.TaskCompletionSource.this;
                super();
            }
                }, "boltsWebViewAppLinkResolverResult");
                task = null;
                if (contentType.get() != null)
                {
                    task = ((String)contentType.get()).split(";")[0];
                }
                webview.loadDataWithBaseURL(url.toString(), (String)content.get(), task, null, null);
                return taskcompletionsource.getTask();
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                this$0 = WebViewAppLinkResolver.this;
                contentType = capture;
                url = uri;
                content = capture1;
                super();
            }
        }, Task.UI_THREAD_EXECUTOR).onSuccess(new Continuation() {

            final WebViewAppLinkResolver this$0;
            final Uri val$url;

            public AppLink then(Task task)
                throws Exception
            {
                return WebViewAppLinkResolver.makeAppLinkFromAlData(WebViewAppLinkResolver.parseAlData((JSONArray)task.getResult()), url);
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                this$0 = WebViewAppLinkResolver.this;
                url = uri;
                super();
            }
        });
    }




}
