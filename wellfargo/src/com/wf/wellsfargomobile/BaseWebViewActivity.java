// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.service.WalletIntentService;
import com.wf.wellsfargomobile.mrdc.e;
import com.wf.wellsfargomobile.photobillpay.d;
import com.wf.wellsfargomobile.util.o;
import com.wf.wellsfargomobile.util.t;
import com.wf.wellsfargomobile.util.v;
import com.wf.wellsfargomobile.webview.a.b;
import com.wf.wellsfargomobile.webview.a.f;
import com.wf.wellsfargomobile.webview.a.g;
import com.wf.wellsfargomobile.webview.a.h;
import com.wf.wellsfargomobile.webview.javascriptinterface.a.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.UUID;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseActionBarActivity, e, f, WFApp, 
//            b, d, i, c, 
//            a, WebViewActivity, MainActivity, ai, 
//            g

public abstract class BaseWebViewActivity extends BaseActionBarActivity
    implements a
{

    private static Map b = new HashMap();
    private int c;
    private PriorityQueue d;
    private boolean e;
    protected View f;
    protected TextView g;
    protected boolean h;
    protected Dialog i;
    public Boolean inSession;
    protected int j;
    protected boolean k;
    protected String l;
    public RelativeLayout loading;
    protected long m;
    public com.wf.wellsfargomobile.b.a mbaNativeRequestManager;
    protected String n;
    transient boolean o;
    transient boolean p;
    private final BroadcastReceiver q = new com.wf.wellsfargomobile.e(this);
    private final BroadcastReceiver r = new com.wf.wellsfargomobile.f(this);
    public BroadcastReceiver receiver;
    public String walletCallbackViewID;
    public WebView webview;
    public ProgressBar webviewProgressDialog;

    public BaseWebViewActivity()
    {
        inSession = Boolean.valueOf(false);
        mbaNativeRequestManager = null;
        h = false;
        k = false;
        l = "";
        m = 0L;
        n = null;
        walletCallbackViewID = "SNC";
        o = false;
        p = false;
        c = 0;
        d = new PriorityQueue();
        e = false;
    }

    static void a(BaseWebViewActivity basewebviewactivity)
    {
        basewebviewactivity.k();
    }

    private boolean a(int ai1[], int i1)
    {
        boolean flag1 = false;
        int k1 = ai1.length;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (ai1[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    private void b(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder(150);
        stringbuilder.append(s1);
        stringbuilder.append(s);
        loadAbsoluteURL(stringbuilder);
    }

    static boolean b(BaseWebViewActivity basewebviewactivity)
    {
        return basewebviewactivity.j();
    }

    static void c(BaseWebViewActivity basewebviewactivity)
    {
        basewebviewactivity.i();
    }

    static void d(BaseWebViewActivity basewebviewactivity)
    {
        basewebviewactivity.FragmentActivity.onBackPressed();
    }

    private void f()
    {
        Object obj;
        Object obj1;
        obj1 = (CharSequence)com.wf.wellsfargomobile.util.o.a("username");
        obj = (CharSequence)com.wf.wellsfargomobile.util.o.a("password");
        if (TextUtils.isEmpty(((CharSequence) (obj1))) || TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Log.w("BaseWebViewActivity", "username and password are null");
            finish();
            return;
        }
        String s = ((CharSequence) (obj1)).toString();
        String s1 = ((CharSequence) (obj)).toString();
        obj = getSharedPreferences("WF_PREFERENCES", 0);
        String s2 = ((SharedPreferences) (obj)).getString("gcm_registration_id_pref", null);
        Object obj2;
        Object obj3;
        boolean flag;
        boolean flag1;
        if (!((SharedPreferences) (obj)).contains("gcm_first_time_experience_pref_v2"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WFApp.A();
        obj2 = "";
        try
        {
            flag1 = t.a.equals(WFApp.n());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            returnWithError(getString(0x7f0800f9), getString(0x7f080097));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            returnWithError(getString(0x7f0800f9), getString(0x7f080097));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            returnWithError(getString(0x7f0800f9), getString(0x7f080097));
            return;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        obj = Camera.open();
        obj1 = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj1 = obj;
        obj3 = ((Camera) (obj)).getParameters().getSupportedFocusModes();
        obj1 = obj2;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj1 = obj;
        obj2 = obj3.toString();
        obj1 = obj2;
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((Camera) (obj)).stopPreview();
        ((Camera) (obj)).release();
          goto _L4
_L12:
        h = true;
        g.setText(0x7f080089);
        obj3 = new ArrayList();
        ((List) (obj3)).add(new BasicNameValuePair("WFAppId", com.wf.wellsfargomobile.a.a.i()));
        ((List) (obj3)).add(new BasicNameValuePair("nativeApp", WFApp.af()));
        ((List) (obj3)).add(new BasicNameValuePair("disableBackLink", "x"));
        if (com.wf.wellsfargomobile.util.o.a("saveUsername") != Boolean.TRUE || !WFApp.G() || !s.equals(WFApp.M())) goto _L6; else goto _L5
_L5:
        ((List) (obj3)).add(new BasicNameValuePair("userId", ""));
_L9:
        ((List) (obj3)).add(new BasicNameValuePair("password", s1));
        com.wf.wellsfargomobile.util.o.b("username");
        com.wf.wellsfargomobile.util.o.b("password");
        ((List) (obj3)).add(new BasicNameValuePair("hasCamera", WFApp.n().toString()));
        ((List) (obj3)).add(new BasicNameValuePair("WFAppVersion", (new StringBuilder()).append("4.6.108 ").append(com.wf.wellsfargomobile.a.a.g()).toString()));
        ((List) (obj3)).add(new BasicNameValuePair("appStore", com.wf.wellsfargomobile.a.a.h()));
        ((List) (obj3)).add(new BasicNameValuePair("nonce", com.wf.wellsfargomobile.WFApp.o()));
        ((List) (obj3)).add(new BasicNameValuePair("manufacturer", Build.MANUFACTURER));
        ((List) (obj3)).add(new BasicNameValuePair("modelNumber", Build.MODEL));
        ((List) (obj3)).add(new BasicNameValuePair("modelName", Build.DEVICE));
        ((List) (obj3)).add(new BasicNameValuePair("carrier", Build.BRAND));
        ((List) (obj3)).add(new BasicNameValuePair("osVersion", android.os.Build.VERSION.RELEASE));
        ((List) (obj3)).add(new BasicNameValuePair("fingerprint", Build.FINGERPRINT));
        ((List) (obj3)).add(new BasicNameValuePair("focusModes", ((String) (obj))));
        ((List) (obj3)).add(new BasicNameValuePair("isDeviceEligibleForWallet", Boolean.toString(WFApp.ah())));
        ((List) (obj3)).add(new BasicNameValuePair("mode", com.wf.wellsfargomobile.WFApp.e()));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_698;
        }
        ((List) (obj3)).add(new BasicNameValuePair("pnRegistrationId", s2));
        ((List) (obj3)).add(new BasicNameValuePair("pnProvider", "GCM"));
        ((List) (obj3)).add(new BasicNameValuePair("pnFirstTimeExperience", Boolean.toString(flag)));
        if (g())
        {
            ((List) (obj3)).add(new BasicNameValuePair("c4cDialerCompatible", "true"));
        }
        runOnUiThread(new com.wf.wellsfargomobile.b(this));
        obj1 = getIntent();
        obj = ((Intent) (obj1)).getStringExtra("PNSTOKEN");
        obj1 = ((Intent) (obj1)).getStringExtra("PNSDEST");
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            Log.d("BaseWebViewActivity", (new StringBuilder()).append("deepLinkDestination=").append(((String) (obj1))).toString());
            ((List) (obj3)).add(new BasicNameValuePair("PNSDEST", ((String) (obj1))));
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                Log.d("BaseWebViewActivity", (new StringBuilder()).append("accountHash=").append(((String) (obj))).toString());
                ((List) (obj3)).add(new BasicNameValuePair("PNSTOKEN", ((String) (obj))));
            }
        }
        if (!WFApp.T())
        {
            WFApp.O();
            returnWithError(getString(0x7f0800f9), getString(0x7f080114));
        }
        obj = WFApp.H();
        if (obj == null)
        {
            obj = "";
        }
        obj2 = (Boolean)com.wf.wellsfargomobile.util.o.a("saveUsername");
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_921;
        }
        obj1 = Boolean.FALSE;
        ((List) (obj3)).add(new BasicNameValuePair("userPrefs", ((String) (obj))));
        ((List) (obj3)).add(new BasicNameValuePair("saveUserId", ((Boolean) (obj1)).toString()));
        ((List) (obj3)).add(new BasicNameValuePair("authenticationCapabilityIndicator", "AA"));
        obj = new UrlEncodedFormEntity(((List) (obj3)));
        webview.postUrl((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/signOn/appSignon.action").toString(), EntityUtils.toByteArray(((org.apache.http.HttpEntity) (obj))));
        return;
        obj;
        obj = null;
_L11:
        obj1 = obj;
        com.wf.wellsfargomobile.WFApp.e(true);
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((Camera) (obj)).stopPreview();
        ((Camera) (obj)).release();
          goto _L8
_L10:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1089;
        }
        ((Camera) (obj1)).stopPreview();
        ((Camera) (obj1)).release();
        throw obj;
_L6:
        ((List) (obj3)).add(new BasicNameValuePair("userId", s));
          goto _L9
        obj;
          goto _L10
        obj1;
          goto _L11
_L2:
        obj = "";
          goto _L12
_L4:
        obj = obj1;
          goto _L12
_L8:
        obj = "";
          goto _L12
        obj;
        obj1 = null;
          goto _L10
    }

    private boolean g()
    {
        TelephonyManager telephonymanager = (TelephonyManager)getSystemService("phone");
        if (telephonymanager != null)
        {
            switch (telephonymanager.getPhoneType())
            {
            default:
                return false;

            case 1: // '\001'
                return true;

            case 2: // '\002'
                return true;

            case 3: // '\003'
                return false;

            case 0: // '\0'
                return false;
            }
        } else
        {
            return false;
        }
    }

    private void h()
    {
        inSession = Boolean.valueOf(false);
        com.wf.wellsfargomobile.WFApp.i();
        com.wf.wellsfargomobile.WFApp.d(null);
        com.wf.wellsfargomobile.WFApp.e(false);
        WFApp.ac();
        com.wf.wellsfargomobile.mrdc.e.a();
        com.wf.wellsfargomobile.photobillpay.d.d();
        com.wf.wellsfargomobile.WFApp.a(inSession.booleanValue());
    }

    private void i()
    {
        webview.goBack();
    }

    private boolean j()
    {
        return webview.canGoBack();
    }

    private void k()
    {
        boolean flag = true;
        for (int i1 = 0; flag && i1 < 5;)
        {
            i1++;
            if (WFApp.F())
            {
                flag = false;
            } else
            {
                try
                {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedexception) { }
            }
        }

    }

    private void l()
    {
        o = true;
        f();
    }

    protected void a(String s, String s1)
    {
        s = getString(0x7f080124);
        s1 = getString(0x7f080125);
        d();
        returnWithErrorWithIcon(s1, s, 0x7f0200fb);
    }

    protected void b()
    {
        if (!WFApp.aa())
        {
            Log.d("BaseWebViewActivity", "Refreshing locale.");
            (new com.wf.wellsfargomobile.c.a(this)).a();
        }
    }

    protected void c()
    {
        if (f != null && f.getVisibility() == 0)
        {
            f.setVisibility(8);
        }
    }

    public void callJSBackImageShowSpinner(String s)
    {
        loadJavaScript((new StringBuilder()).append("mba.mrdc.setBackImageShowSpinner('").append(s).append("')").toString());
    }

    public void callJSFrontImageShowSpinner(String s)
    {
        loadJavaScript((new StringBuilder()).append("mba.mrdc.setFrontImageShowSpinner('").append(s).append("')").toString());
    }

    public void callJSHideBackBtnSpinner()
    {
        loadJavaScript("mba.mrdc.hidebackBtnSpinner()");
    }

    public void callJSHideFrontBtnSpinner()
    {
        loadJavaScript("mba.mrdc.hidefrontBtnSpinner()");
    }

    public void callJSShowbackBtnError(String s)
    {
        loadJavaScript((new StringBuilder()).append("mba.mrdc.showbackBtnError('").append(s).append("')").toString());
    }

    public void callJSShowfrontBtnError(String s)
    {
        loadJavaScript((new StringBuilder()).append("mba.mrdc.showfrontBtnError('").append(s).append("')").toString());
    }

    public void closeWebViewAsDialog(View view)
    {
        if (n != null && !"".equals(n))
        {
            view = new Intent();
            view.putExtra("returnToUrl", n);
            setResult(15, view);
        }
        finish();
        overridePendingTransition(0x7f05000d, 0x7f05000f);
    }

    protected void d()
    {
        c = c + 1;
    }

    public void defaultOnBackPressed()
    {
        runOnUiThread(new com.wf.wellsfargomobile.d(this));
    }

    public void depositCheck()
    {
        Object obj;
        Object obj1;
        StringBuffer stringbuffer;
        StringBuffer stringbuffer1;
        stringbuffer1 = (new StringBuffer("/deposit/depositCheck.action")).append("?");
        stringbuffer = new StringBuffer(com.wf.wellsfargomobile.a.a.a());
        obj1 = webview.getUrl();
        obj = stringbuffer;
        URL url = new URL(((String) (obj1)));
        obj = stringbuffer;
        String s = url.getPath();
        obj = stringbuffer;
        if (s.contains(com.wf.wellsfargomobile.WFApp.d)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj1 = stringbuffer;
        obj2 = stringbuffer1;
        obj = stringbuffer;
        if (!s.contains(com.wf.wellsfargomobile.WFApp.e)) goto _L3; else goto _L2
_L2:
        obj = stringbuffer;
        obj1 = url.getProtocol();
        obj = stringbuffer;
        obj2 = url.getHost();
        obj = stringbuffer;
        int i1 = url.getPort();
        obj = stringbuffer;
        obj1 = (new StringBuffer(((String) (obj1)))).append("://").append(((String) (obj2)));
        if (i1 == 80 || i1 == 443 || i1 == -1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj = obj1;
        ((StringBuffer) (obj1)).append(":").append(i1);
        obj = obj1;
        if (!s.contains(com.wf.wellsfargomobile.WFApp.d)) goto _L5; else goto _L4
_L4:
        obj = obj1;
        try
        {
            obj2 = (new StringBuffer(getResources().getString(0x7f080130))).append(getResources().getString(0x7f08015c));
        }
        catch (MalformedURLException malformedurlexception)
        {
            malformedurlexception = ((MalformedURLException) (obj));
            obj2 = stringbuffer1;
        }
_L3:
        b(((StringBuffer) (obj2)).toString(), ((StringBuffer) (obj1)).toString());
        return;
_L5:
        obj = obj1;
        obj2 = (new StringBuffer(getResources().getString(0x7f080170))).append(getResources().getString(0x7f080161));
          goto _L3
    }

    protected int e()
    {
        return c;
    }

    public com.wf.wellsfargomobile.b.a getMBANativeRequestManager()
    {
        return mbaNativeRequestManager;
    }

    public void handleSignoffRequestFromWallet(boolean flag)
    {
        if (inSession.booleanValue())
        {
            if (flag)
            {
                showCurtain();
            }
            String s = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(getString(0x7f080178)).toString();
            s = (new StringBuilder()).append(s).append("?nbw=true").toString();
            h();
            WFApp.I();
            loadAbsoluteURL(s);
            return;
        } else
        {
            setResult(3);
            signOff(webview.getUrl());
            return;
        }
    }

    public void hideProgressDialog()
    {
        if (loading != null && loading.getVisibility() == 0)
        {
            loading.setVisibility(8);
        }
    }

    public final boolean isInSession()
    {
        return inSession.booleanValue();
    }

    public boolean isLoginFirstLoad()
    {
        return h;
    }

    public boolean isWalletSignOn()
    {
        boolean flag = false;
        if (o)
        {
            o = false;
            flag = true;
        }
        return flag;
    }

    public void loadAbsoluteURL(CharSequence charsequence)
    {
        StringBuilder stringbuilder = new StringBuilder(150);
        stringbuilder.append(charsequence);
        if (stringbuilder.indexOf("?") == -1)
        {
            stringbuilder.append("?");
        }
        stringbuilder.append("&WFAppId=");
        stringbuilder.append(com.wf.wellsfargomobile.a.a.i());
        stringbuilder.append("&disableBackLink=x");
        stringbuilder.append("&mode=").append(com.wf.wellsfargomobile.WFApp.e());
        String as[] = com.wf.wellsfargomobile.a.a.l();
        String as1[] = getResources().getStringArray(0x7f0d0001);
        String as2[] = getResources().getStringArray(0x7f0d0000);
        String as3[] = com.wf.wellsfargomobile.a.a.n();
        if (!v.a(charsequence.toString(), com.wf.wellsfargomobile.WFApp.e(), as, false, as1, as2, as3))
        {
            webview.loadUrl(stringbuilder.toString(), b);
            return;
        } else
        {
            charsequence = new com.wf.wellsfargomobile.i();
            charsequence.a(stringbuilder.toString());
            charsequence.show(getSupportFragmentManager(), "Open Url in Browser Confirmation");
            return;
        }
    }

    public void loadJavaScript(String s)
    {
        webview.post(new c(this, s));
    }

    public void loadURL(String s)
    {
        b(s, com.wf.wellsfargomobile.a.a.a());
    }

    public void logToJsConsole(String s)
    {
        loadJavaScript(s);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        Iterator iterator = d.iterator();
        com.wf.wellsfargomobile.webview.a.a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a1 = (com.wf.wellsfargomobile.webview.a.a)iterator.next();
        } while (a1.c().length != 0 && !a(a1.c(), i1) || a1.b().length != 0 && !a(a1.b(), j1) || a1.a(i1, j1, intent, this).a());
    }

    public void onBackPressed()
    {
        loadJavaScript("try{onDeviceBackPress();}catch(err){if(typeof Common != 'undefined') {Common.doDeviceBack('214356');}}");
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        super.onCreate(bundle);
        if (a != null)
        {
            a.b();
        }
        b.put("nativeApp", WFApp.af());
        d.add(new f());
        d.add(new com.wf.wellsfargomobile.webview.a.e());
        d.add(new com.wf.wellsfargomobile.webview.a.d());
        d.add(new g());
        d.add(new h());
        d.add(new d());
        d.add(new com.wf.wellsfargomobile.hcewallet.d.b());
        mbaNativeRequestManager = new com.wf.wellsfargomobile.b.a(this);
        bundle = getIntent().getExtras();
        if (bundle != null && bundle.getBoolean("USE_AS_DIALOG") && android.os.Build.VERSION.SDK_INT >= 11)
        {
            setFinishOnTouchOutside(false);
        }
        setContentView(j);
        FrameLayout framelayout = (FrameLayout)findViewById(0x7f0f0107);
        webview = com.wf.wellsfargomobile.webview.a.a(this);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        webview.setLayoutParams(layoutparams);
        framelayout.addView(webview, 0);
        i = new Dialog(this, 0x7f0a0112);
        i.setTitle(getString(0x7f080045));
        i.setContentView(0x7f040058);
        i.setCancelable(false);
        i.setCanceledOnTouchOutside(false);
        f = findViewById(0x7f0f0110);
        g = (TextView)findViewById(0x7f0f0095);
        loading = (RelativeLayout)findViewById(0x7f0f0084);
        loading.setVisibility(8);
        loading.setOnTouchListener(new com.wf.wellsfargomobile.a(this));
        webviewProgressDialog = (ProgressBar)loading.findViewById(0x7f0f0085);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        if (!bundle.containsKey("login_request")) goto _L4; else goto _L3
_L3:
        inSession = Boolean.valueOf(true);
        f();
_L2:
        com.wf.wellsfargomobile.WFApp.a(inSession.booleanValue());
        return;
_L4:
        if (bundle.containsKey("wallet_login_request"))
        {
            inSession = Boolean.valueOf(true);
            if (bundle.containsKey("cvid"))
            {
                walletCallbackViewID = bundle.getString("cvid");
            }
            l();
        } else
        if (bundle.containsKey("login_app_redirect"))
        {
            bundle = bundle.getString("login_app_redirect_url");
            inSession = Boolean.valueOf(true);
            loadAbsoluteURL(bundle);
        } else
        if (bundle.containsKey("affiliateUrl"))
        {
            String s = bundle.getString("affiliateUrl");
            String s1 = bundle.getString("keepAliveUrl");
            if (s1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!"".equals(s1))
            {
                flag1 = true;
            }
            if (flag & flag1)
            {
                k = true;
                l = s1;
                m = 0L;
            }
            n = bundle.getString("returnToUrl");
            inSession = Boolean.valueOf(true);
            loadAbsoluteURL(s);
        } else
        if (bundle.containsKey("security_request"))
        {
            inSession = Boolean.valueOf(false);
            loadAbsoluteURL(com.wf.wellsfargomobile.a.a.p());
        } else
        if (bundle.containsKey("qguide_request"))
        {
            inSession = Boolean.valueOf(false);
            loadAbsoluteURL(com.wf.wellsfargomobile.a.a.r());
        } else
        if (bundle.containsKey("webatmloc_request"))
        {
            inSession = Boolean.valueOf(false);
            loadAbsoluteURL(com.wf.wellsfargomobile.a.a.f());
        } else
        if (bundle.containsKey("privacy_policy_request"))
        {
            inSession = Boolean.valueOf(false);
            loadAbsoluteURL(com.wf.wellsfargomobile.a.a.q());
        } else
        if (bundle.containsKey("whats_new"))
        {
            inSession = Boolean.valueOf(false);
            loadAbsoluteURL(com.wf.wellsfargomobile.a.a.o());
        } else
        if (bundle.containsKey("unauth_browse"))
        {
            inSession = Boolean.valueOf(false);
            bundle = bundle.getString("unauth_browse_goto");
            if (bundle != null)
            {
                if (bundle.startsWith("https://") || bundle.startsWith("http://"))
                {
                    flag = true;
                }
                if (flag)
                {
                    loadAbsoluteURL(bundle);
                } else
                {
                    loadURL(bundle);
                }
            }
        } else
        if (bundle.containsKey("username_password"))
        {
            inSession = Boolean.valueOf(false);
            loadAbsoluteURL(getString(0x7f080179));
        } else
        if (bundle.containsKey("atm_locations"))
        {
            inSession = Boolean.valueOf(false);
            loadURL(getString(0x7f080159));
        } else
        if (bundle.containsKey("deposit"))
        {
            inSession = Boolean.valueOf(true);
            depositCheck();
        } else
        if (bundle.containsKey("push_notification_indicator"))
        {
            inSession = Boolean.valueOf(false);
            setResult(4, null);
            finish();
        } else
        if (bundle.containsKey("HCE_WALLET_VIEW"))
        {
            inSession = Boolean.valueOf(false);
            walletHCEShowView(bundle.getString("HCE_WALLET_VIEW_ID"), bundle.getString("HCE_WALLET_ERR_CD"), bundle.containsKey("HCE_WALLET_AUTH_SESSION"));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onDestroy()
    {
        if (webview != null)
        {
            ViewGroup viewgroup = (ViewGroup)webview.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(webview);
            }
            webview.stopLoading();
            webview.removeAllViews();
            webview.clearHistory();
            webview.destroy();
        }
        unregisterReceiver(receiver);
        com.wf.wellsfargomobile.WFApp.a(false);
        WFApp.p = false;
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return super.onKeyDown(i1, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        setIntent(intent);
        super.onNewIntent(intent);
    }

    protected void onPause()
    {
        v.a(this);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(q);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(r);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        com.wf.wellsfargomobile.hcewallet.d.i.processWalletOnResume(this);
        LocalBroadcastManager.getInstance(this).registerReceiver(q, new IntentFilter("WALLET_SIGN_OFF_COMPLETE"));
        LocalBroadcastManager.getInstance(this).registerReceiver(r, new IntentFilter("WALLET_ACTIVE_SESSION_CHECK_COMPLETE"));
        WFApp.p = true;
    }

    protected void onStop()
    {
        webview.stopLoading();
        super.onStop();
    }

    public void returnWithError(String s, String s1)
    {
        returnWithError(s, s1, 1, -1);
    }

    public void returnWithError(String s, String s1, int i1)
    {
        returnWithError(s, s1, i1, -1);
    }

    public void returnWithError(String s, String s1, int i1, int j1)
    {
        Bundle bundle = new Bundle();
        if (s != null)
        {
            bundle.putString("error_title", s);
        }
        bundle.putString("error_msg", s1);
        bundle.putInt("message_type", j1);
        s = new Intent();
        s.putExtras(bundle);
        setResult(i1, s);
        if (this instanceof WebViewActivity)
        {
            WFApp.A();
        }
        finish();
    }

    public void returnWithErrorWithIcon(String s, String s1, int i1)
    {
        returnWithError(s, s1, 1, i1);
    }

    public void setKeepAliveFlag(boolean flag)
    {
        if (flag)
        {
            WFApp.k = 1;
            return;
        } else
        {
            WFApp.k = 2;
            return;
        }
    }

    public void setLoadingText(int i1)
    {
        g.setText(i1);
    }

    public void setMBANativeRequestManager(com.wf.wellsfargomobile.b.a a1)
    {
        mbaNativeRequestManager = a1;
    }

    public void setWalletSignOff(String s)
    {
        if (s != null && s.contains("WAC"))
        {
            setResult(3);
            h();
            WFApp.A();
            s = new Intent(this, com/wf/wellsfargomobile/MainActivity);
            s.addFlags(0x14000000);
            startActivity(s);
            finish();
            return;
        } else
        {
            s = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(getString(0x7f080178)).toString();
            s = (new StringBuilder()).append(s).append("?nbw=true").toString();
            h();
            WFApp.I();
            loadAbsoluteURL(s);
            return;
        }
    }

    public void showCurtain()
    {
        if (f != null && f.getVisibility() != 0)
        {
            f.setVisibility(0);
        }
    }

    public void showDialogBox(String s, String s1)
    {
        showDialogBox(s, s1, 0x7f0200f9);
    }

    public void showDialogBox(String s, String s1, int i1)
    {
        if (s1 != null)
        {
            ai ai1 = new ai();
            Bundle bundle = new Bundle();
            bundle.putInt("DIALOG_ICON", i1);
            bundle.putString("DIALOG_TITLE", s);
            bundle.putString("DIALOG_MESSAGE", s1);
            ai1.setArguments(bundle);
            ai1.show(getSupportFragmentManager(), "MessageDialogFragment");
        }
    }

    public void showProgressDialog()
    {
        if (loading != null && loading.getVisibility() != 0)
        {
            loading.setVisibility(0);
        }
    }

    public void showTimeOutDialogBox(String s, String s1, int i1)
    {
        if (s1 != null)
        {
            com.wf.wellsfargomobile.g g1 = new com.wf.wellsfargomobile.g(this);
            Bundle bundle = new Bundle();
            bundle.putInt("DIALOG_ICON", i1);
            bundle.putString("DIALOG_TITLE", s);
            bundle.putString("DIALOG_MESSAGE", s1);
            g1.setArguments(bundle);
            g1.show(getSupportFragmentManager(), "MessageDialogFragment");
        }
    }

    public void signOff()
    {
        Object obj;
        Object obj1;
        StringBuffer stringbuffer;
        stringbuffer = (new StringBuffer(100)).append(com.wf.wellsfargomobile.a.a.a()).append(getString(0x7f080178));
        obj1 = webview.getUrl();
        obj = stringbuffer;
        URL url = new URL(((String) (obj1)));
        obj = stringbuffer;
        String s = url.getPath();
        obj = stringbuffer;
        if (s.contains(com.wf.wellsfargomobile.WFApp.d)) goto _L2; else goto _L1
_L1:
        obj1 = stringbuffer;
        obj = stringbuffer;
        if (!s.contains(com.wf.wellsfargomobile.WFApp.e)) goto _L3; else goto _L2
_L2:
        obj = stringbuffer;
        obj1 = url.getProtocol();
        obj = stringbuffer;
        String s1 = url.getHost();
        obj = stringbuffer;
        int i1 = url.getPort();
        obj = stringbuffer;
        obj1 = (new StringBuffer(((String) (obj1)))).append("://").append(s1);
        if (i1 == 80 || i1 == 443 || i1 == -1)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj = obj1;
        ((StringBuffer) (obj1)).append(":").append(i1);
        obj = obj1;
        if (!s.contains(com.wf.wellsfargomobile.WFApp.d)) goto _L5; else goto _L4
_L4:
        obj = obj1;
        try
        {
            ((StringBuffer) (obj1)).append(getString(0x7f080130)).append("gotoMLogoff");
        }
        catch (MalformedURLException malformedurlexception)
        {
            malformedurlexception = ((MalformedURLException) (obj));
        }
_L3:
        h();
        WFApp.I();
        loadAbsoluteURL(((StringBuffer) (obj1)).toString());
        return;
_L5:
        obj = obj1;
        ((StringBuffer) (obj1)).append(getResources().getString(0x7f080170)).append("gotoLogout");
          goto _L3
    }

    public void signOff(String s)
    {
        h();
        WFApp.A();
        finish();
    }

    public void stopLoading()
    {
        if (webview != null)
        {
            webview.stopLoading();
        }
    }

    public boolean validNonce(String s)
    {
        return com.wf.wellsfargomobile.WFApp.e(s);
    }

    public void walletHCEShowView(String s, String s1, boolean flag)
    {
        showCurtain();
        webview.loadUrl("about:blank");
        g.setText(0x7f080088);
        if (s != null && s.equals("LOG_OUT"))
        {
            s = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(getString(0x7f080178)).toString();
            s = (new StringBuilder()).append(s).append("?nbw=true").toString();
            h();
            WFApp.I();
            loadAbsoluteURL(s);
            return;
        }
        if (s != null && !s.equals("WH"))
        {
            e = true;
        }
        String s2;
        String s3;
        Object obj;
        if (!flag)
        {
            s2 = com.wf.wellsfargomobile.hcewallet.d.i.getWalletURL(com.wf.wellsfargomobile.hcewallet.d.g.b, this);
        } else
        {
            s2 = com.wf.wellsfargomobile.hcewallet.d.i.getWalletURL(com.wf.wellsfargomobile.hcewallet.d.g.a, this);
        }
        obj = com.wf.wellsfargomobile.WFApp.o();
        s3 = ((String) (obj));
        if (obj == null)
        {
            com.wf.wellsfargomobile.WFApp.d(UUID.randomUUID().toString());
            s3 = com.wf.wellsfargomobile.WFApp.o();
        }
        try
        {
            obj = new ArrayList();
            ((List) (obj)).add(new BasicNameValuePair("nonce", s3));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            returnWithError(getString(0x7f080120), getString(0x7f08011f), 1, 0x7f0200fb);
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (!s.equals(""))
        {
            ((List) (obj)).add(new BasicNameValuePair("vid", s));
        }
        if (e)
        {
            ((List) (obj)).add(new BasicNameValuePair("cvid", "PAY_NOW"));
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (!s1.equals(""))
        {
            ((List) (obj)).add(new BasicNameValuePair("ec", s1));
        }
        s = new UrlEncodedFormEntity(((List) (obj)));
        webview.postUrl(s2, EntityUtils.toByteArray(s));
        return;
    }

    public void walletSignOff(String s)
    {
        inSession = Boolean.valueOf(false);
        com.wf.wellsfargomobile.WFApp.a(inSession.booleanValue());
        String s1 = com.wf.wellsfargomobile.hcewallet.d.i.getWalletURL(com.wf.wellsfargomobile.hcewallet.d.g.f, getApplicationContext());
        if (s1 != null && !s1.equals("") && com.wf.wellsfargomobile.hcewallet.d.i.isConnected(getApplicationContext()))
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
            intent.putExtra("WALLET_INTENT_SERVICE_CD", 1004);
            intent.putExtra("nonce", s);
            startService(intent);
            return;
        } else
        {
            setWalletSignOff("WAC");
            return;
        }
    }

}
