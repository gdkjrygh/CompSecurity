// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.devicecollector.DataCollection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.http.HttpException;

// Referenced classes of package com.devicecollector.collectors:
//            AbstractAsyncCollectorTask, CollectorEnum, SoftErrorCode, CollectorStatusListener

public final class WebCollectorTask extends AbstractAsyncCollectorTask
{

    private static final String ERROR_BODY = "<head></head><body></body>";
    private static final String MAGIC = "\u25CF\uFF5E*";
    private boolean loadedLogoHtm;
    private WebView webview;

    public WebCollectorTask(Activity activity, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, long l)
    {
        super(activity, collectorstatuslistener, datacollection, CollectorEnum.WEB, l);
    }

    private boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
label0:
        {
            debug("onConsoleMessage(%s)", new Object[] {
                consolemessage.message()
            });
            if (consolemessage.message().startsWith("\u25CF\uFF5E*"))
            {
                if (!consolemessage.message().substring("\u25CF\uFF5E*".length()).equals("<head></head><body></body>"))
                {
                    break label0;
                }
                endProcess(SoftErrorCode.SERVICE_UNAVAILABLE, new IllegalStateException("Error response received from Device Collector."));
            }
            return true;
        }
        if (!loadedLogoHtm)
        {
            endProcess(SoftErrorCode.SERVICE_UNAVAILABLE, new IllegalStateException("Never loaded logo.htm."));
            return true;
        } else
        {
            endProcess(null, null);
            return true;
        }
    }

    private void onLoadResource(WebView webview1, String s)
    {
        debug("onLoadResource(%s)", new Object[] {
            s
        });
        try
        {
            webview1 = new URL(s);
            if (webview1.getPath().endsWith("logo.htm") || webview1.getPath().endsWith("logo.php"))
            {
                loadedLogoHtm = true;
                dc.setServerUrl((new StringBuilder()).append("https://").append(webview1.getHost()).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview1)
        {
            debug("Unexpected URL problem [%s]", new Object[] {
                webview1.getMessage()
            });
        }
    }

    private void onPageFinished(WebView webview1, String s)
    {
        debug("onPageFinished(%s)", new Object[] {
            s
        });
        CookieSyncManager.getInstance().sync();
        webview1.loadUrl((new StringBuilder()).append("javascript:console.log(").append("'").append("\u25CF\uFF5E*").append("'").append("+").append("document.getElementsByTagName('html')[0].innerHTML").append(");").toString());
    }

    private void onReceivedError(WebView webview1, int i, String s, String s1)
    {
        debug("onReceivedError(code:%d, desc:%s, url:%s)", new Object[] {
            Integer.valueOf(i), s, s1
        });
        endProcess(SoftErrorCode.SERVICE_UNAVAILABLE, null);
    }

    private void onReceivedSslError(WebView webview1, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        debug("onReceivedSslError(%s)", new Object[] {
            sslerror
        });
        int i = sslerror.getPrimaryError();
        if (3 == i || 2 == i)
        {
            debug("Ignoring trust chain validation error.", new Object[0]);
            sslerrorhandler.proceed();
            return;
        } else
        {
            debug("Halting due to SSL error.", new Object[0]);
            endProcess(SoftErrorCode.SERVICE_UNAVAILABLE, new HttpException((new StringBuilder()).append("SSL ERROR:").append(sslerror.getPrimaryError()).toString()));
            sslerrorhandler.cancel();
            return;
        }
    }

    private boolean shouldOverrideUrlLoading(WebView webview1, String s)
    {
        debug("shouldOverrideUrlLoading(%s)", new Object[] {
            s
        });
        return false;
    }

    protected void run()
    {
        final String dcStartUrl = (new StringBuilder()).append(dc.getCollectorUrl()).append("?m=").append(dc.getMerchantId()).append("&s=").append(dc.getSessionId()).toString();
        debug("Calling URL: %s", new Object[] {
            dcStartUrl
        });
        activity.runOnUiThread(new Runnable() {

            final WebCollectorTask this$0;
            final String val$dcStartUrl;

            public void run()
            {
                WebCollectorTask webcollectortask = WebCollectorTask.this;
                webcollectortask.webview = new WebView(activity.getApplicationContext());
                WebSettings websettings = webcollectortask.webview.getSettings();
                websettings.setJavaScriptEnabled(true);
                websettings.setDomStorageEnabled(true);
                websettings.setPluginState(android.webkit.WebSettings.PluginState.ON);
                webcollectortask.webview.setWebViewClient(new WebViewClient() {

                    WebCollectorTask task;
                    final _cls1 this$1;

                    public void onLoadResource(WebView webview1, String s)
                    {
                        task.onLoadResource(webview1, s);
                    }

                    public void onPageFinished(WebView webview1, String s)
                    {
                        task.onPageFinished(webview1, s);
                    }

                    public void onReceivedError(WebView webview1, int i, String s, String s1)
                    {
                        task.onReceivedError(webview1, i, s, s1);
                    }

                    public void onReceivedSslError(WebView webview1, SslErrorHandler sslerrorhandler, SslError sslerror)
                    {
                        task.onReceivedSslError(webview1, sslerrorhandler, sslerror);
                    }

                    public boolean shouldOverrideUrlLoading(WebView webview1, String s)
                    {
                        return task.shouldOverrideUrlLoading(webview1, s);
                    }

            
            {
                this$1 = _cls1.this;
                super();
                task = _fld0;
            }
                });
                webcollectortask.webview.setWebChromeClient(new WebChromeClient() {

                    final _cls1 this$1;

                    public boolean onConsoleMessage(ConsoleMessage consolemessage)
                    {
                        return WebCollectorTask.this.onConsoleMessage(consolemessage);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                webcollectortask.webview.loadUrl(dcStartUrl);
            }

            
            {
                this$0 = WebCollectorTask.this;
                dcStartUrl = s;
                super();
            }
        });
        this;
        JVM INSTR monitorenter ;
        debug("Waiting on Collector for %d ms", new Object[] {
            Long.valueOf(getTimeoutMs())
        });
        wait(getTimeoutMs());
        debug("Wait finished", new Object[0]);
        if (isFinished()) goto _L2; else goto _L1
_L1:
        timeout();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        debug("Current Host: %s", new Object[] {
            dc.getServerUrl()
        });
        endProcess(null, null);
          goto _L3
        Object obj;
        obj;
        endProcess(SoftErrorCode.SERVICE_UNAVAILABLE, ((Exception) (obj)));
          goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }



/*
    static WebView access$002(WebCollectorTask webcollectortask, WebView webview1)
    {
        webcollectortask.webview = webview1;
        return webview1;
    }

*/






}
