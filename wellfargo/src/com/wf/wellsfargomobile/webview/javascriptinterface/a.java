// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.ModalDialogLargeWebViewActivity;
import com.wf.wellsfargomobile.ModalDialogWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.i;
import com.wf.wellsfargomobile.locations.LocationListActivity;
import com.wf.wellsfargomobile.util.OfferDownloadService;
import com.wf.wellsfargomobile.util.v;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandlerFactory;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface:
//            g, c, f, h, 
//            b

public class a
{

    private final BaseWebViewActivity a;

    public a(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
    }

    static BaseWebViewActivity a(a a1)
    {
        return a1.a;
    }

    private void a(String s, String s1, String s2, String s3, Class class1)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new Intent(a, class1);
            s.putExtra("USE_AS_DIALOG", true);
            s.putExtra("affiliateUrl", s1);
            s.putExtra("keepAliveUrl", s2);
            s.putExtra("returnToUrl", s3);
            a.startActivityForResult(s, 10);
            a.overridePendingTransition(0x7f050010, 0x7f05000d);
            return;
        }
    }

    public void atm(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        }
        if (WFApp.q())
        {
            a.startActivityForResult(new Intent(a, com/wf/wellsfargomobile/locations/LocationListActivity), 7);
        } else
        {
            a.runOnUiThread(new g(this));
        }
        a.overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void confirmSignOut(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            (new c(this)).show(a.getSupportFragmentManager(), "Sign Off Confirmation");
            return;
        }
    }

    public void doDeviceBack(String s)
    {
        a.defaultOnBackPressed();
    }

    public String execute(String s, String s1, String s2)
    {
        s = BridgeExecuteHandlerFactory.getInstance(s1, a);
        if (s != null)
        {
            return s.execute(s2);
        } else
        {
            Log.e("CommonJavaScrInt", (new StringBuilder()).append("no handler found for commandKey ").append(s1).toString());
            return "";
        }
    }

    public String getDeviceInfo(String s)
    {
        if (!a.validNonce(s))
        {
            return "";
        } else
        {
            return v.b();
        }
    }

    public void goSignOn(String s)
    {
        a.inSession = Boolean.valueOf(false);
        WFApp.i();
        WFApp.d(null);
        a.runOnUiThread(new f(this));
        s = new Intent(a, com/wf/wellsfargomobile/MainActivity);
        s.setFlags(0x4000000);
        a.startActivity(s);
        a.finish();
    }

    public void hasCookie(String s, String s1, String s2, String s3)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            a.runOnUiThread(new h(this, s1, s2, s3));
            return;
        }
    }

    public void openUrlInBrowser(String s, String s1)
    {
        openUrlInBrowser(s, s1, "true");
    }

    public void openUrlInBrowser(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.isInSession()) goto _L2; else goto _L1
_L1:
        boolean flag = a.validNonce(s);
        if (flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!Boolean.parseBoolean(s2))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        s = new i();
        s.a(s1);
        s.show(a.getSupportFragmentManager(), "Open Url in Browser Confirmation");
          goto _L3
        s;
        throw s;
        a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
          goto _L3
    }

    public void openUrlInModalDialog(String s, String s1, String s2, String s3)
    {
        a(s, s1, s2, s3, com/wf/wellsfargomobile/ModalDialogWebViewActivity);
    }

    public void openUrlInModalDialogLarge(String s, String s1, String s2, String s3)
    {
        a(s, s1, s2, s3, com/wf/wellsfargomobile/ModalDialogLargeWebViewActivity);
    }

    public void privacyPolicy(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new Intent(a, com/wf/wellsfargomobile/ModalDialogWebViewActivity);
            s.putExtra("privacy_policy_request", true);
            a.startActivityForResult(s, 10);
            a.overridePendingTransition(0x7f050010, 0x7f05000d);
            return;
        }
    }

    public void quickGuide(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new Intent(a, com/wf/wellsfargomobile/ModalDialogWebViewActivity);
            s.putExtra("qguide_request", true);
            a.startActivityForResult(s, 10);
            a.overridePendingTransition(0x7f050010, 0x7f05000d);
            return;
        }
    }

    public void saveOffersOnDevice(String s, String s1)
    {
        while (!a.validNonce(s) || s1 == null || s1.trim().length() <= 0) 
        {
            return;
        }
        WFApp.j = 0L;
        s = new Intent(a, com/wf/wellsfargomobile/util/OfferDownloadService);
        s.putExtra("offerDownloadJson", s1);
        a.startService(s);
    }

    public void securityGuarantee(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new Intent(a, com/wf/wellsfargomobile/ModalDialogWebViewActivity);
            s.putExtra("security_request", true);
            a.startActivityForResult(s, 10);
            a.overridePendingTransition(0x7f050010, 0x7f05000d);
            return;
        }
    }

    public void signOut(String s)
    {
        if (WFApp.e(s))
        {
            a.runOnUiThread(new b(this, s));
            return;
        } else
        {
            signOut(s, null);
            return;
        }
    }

    public void signOut(String s, String s1)
    {
label0:
        {
            a.inSession = Boolean.valueOf(false);
            WFApp.d(null);
            WFApp.a(false);
            WFApp.i();
            if (WFApp.d())
            {
                WFApp.i = System.currentTimeMillis() + 0x493e0L;
                if (s1 == null)
                {
                    break label0;
                }
                a.returnWithErrorWithIcon(null, s1, 0x7f0200fe);
            }
            return;
        }
        a.finish();
    }

    public void signonError(String s)
    {
        a.returnWithError(a.getString(0x7f0800f9), s);
    }
}
