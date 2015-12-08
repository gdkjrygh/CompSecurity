// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            de, Request, dc, dl, 
//            cz, av, do, aw, 
//            c, dq, cd, ba, 
//            ch, cs, dj, b, 
//            e, cr, Result, ResultType, 
//            p, Protocol, n, PerformRequestStatus, 
//            RequestTarget, CheckoutRequest, PayPalOneTouchActivity, BrowserSwitchAdapter, 
//            db

public class PayPalOneTouchCore
{

    private static final String a = com/paypal/android/sdk/onetouch/core/PayPalOneTouchCore.getSimpleName();
    private static final ExecutorService b = Executors.newCachedThreadPool();
    private static aw c;
    private static cz d;
    private static b e;
    private static dj f;

    public PayPalOneTouchCore()
    {
    }

    private static Intent a(Context context, Request request)
    {
        Object obj = a(context);
        String s;
        Iterator iterator;
        s = request.getBrowserSwitchUrl(context, ((db) (obj)));
        request.persistRequiredFields(c(context));
        obj = request.getBrowserSwitchRecipe(((db) (obj)));
        iterator = ((dc) (obj)).c().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1 = (String)iterator.next();
        if (!dc.a(context, s, s1)) goto _L4; else goto _L3
_L3:
        request.trackFpti(context, dl.f, ((dc) (obj)).e());
        context = dc.a(s, s1);
        return context;
        context;
_L6:
        Log.e(a, "cannot create browser switch URL", context);
_L2:
        return null;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static db a(Context context)
    {
        b(context);
        return d.b();
    }

    static String a()
    {
        return a;
    }

    private static void b(Context context)
    {
        com/paypal/android/sdk/onetouch/core/PayPalOneTouchCore;
        JVM INSTR monitorenter ;
        av av1;
        if (c == null)
        {
            av1 = new av();
            av1.a("live");
            av1.a(new HashMap());
            if (!"https://api-m.paypal.com/v1/".startsWith("https://"))
            {
                throw new RuntimeException((new StringBuilder()).append("https://api-m.paypal.com/v1/").append(" does not start with 'https://', ignoring ").append("live").toString());
            }
            break MISSING_BLOCK_LABEL_83;
        }
          goto _L1
        context;
        com/paypal/android/sdk/onetouch/core/PayPalOneTouchCore;
        JVM INSTR monitorexit ;
        throw context;
        Object obj;
        if ("https://api-m.paypal.com/v1/".endsWith("/"))
        {
            break MISSING_BLOCK_LABEL_411;
        }
        Log.w(a, (new StringBuilder()).append("https://api-m.paypal.com/v1/").append(" does not end with a slash, adding one.").toString());
        obj = (new StringBuilder()).append("https://api-m.paypal.com/v1/").append("/").toString();
_L8:
        Iterator iterator = com.paypal.android.sdk.onetouch.core.do.e().iterator();
_L6:
        if (!iterator.hasNext()) goto _L3; else goto _L2
_L2:
        do do1 = (do)iterator.next();
        if (!do1.d()) goto _L5; else goto _L4
_L4:
        String s = do1.c();
_L7:
        av1.b().put(do1.a(), s);
          goto _L6
_L5:
        s = (new StringBuilder()).append(((String) (obj))).append(do1.c()).toString();
          goto _L7
_L3:
        c = new aw(c(context), av1, new c());
        d = new cz(c(context), c, new c());
        obj = new dq(1000, c);
        cd cd1 = new cd(c(context), "live", new c(), c, 0x15f90, (new c()).c(), ba.a(new c()), true);
        obj = new ch("live", c, ((cb) (obj)), cd1);
        c.a(((ch) (obj)));
        c.a(new cs(d));
        f = new dj(c, new c(), c(context));
_L1:
        d.a();
        com/paypal/android/sdk/onetouch/core/PayPalOneTouchCore;
        JVM INSTR monitorexit ;
        return;
        obj = "https://api-m.paypal.com/v1/";
          goto _L8
    }

    private static b c(Context context)
    {
        com/paypal/android/sdk/onetouch/core/PayPalOneTouchCore;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new b(context, (new c()).b());
        }
        context = e;
        com/paypal/android/sdk/onetouch/core/PayPalOneTouchCore;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static final String getClientMetadataId(Context context)
    {
        return com.paypal.android.sdk.onetouch.core.e.a(b, context, c(context), "2.1.1");
    }

    public static final String getClientMetadataId(Context context, String s)
    {
        return com.paypal.android.sdk.onetouch.core.e.a(b, context, c(context), "2.1.1", s);
    }

    public static dj getFptiManager(Context context)
    {
        b(context);
        return f;
    }

    public static String getLibraryVersion()
    {
        return "2.1.1";
    }

    public static Result handleBrowserResponse(Context context, Uri uri, Request request)
    {
        b(context);
        uri = request.parseBrowserResponse(c(context), uri);
        switch (cr.a[uri.getResultType().ordinal()])
        {
        default:
            return uri;

        case 1: // '\001'
            request.trackFpti(context, dl.j, null);
            return uri;

        case 2: // '\002'
            request.trackFpti(context, dl.h, null);
            return uri;

        case 3: // '\003'
            request.trackFpti(context, dl.i, null);
            break;
        }
        return uri;
    }

    public static boolean isWalletAppInstalled(Context context, boolean flag)
    {
label0:
        {
            boolean flag3 = false;
            b(context);
            Object obj = new p();
            boolean flag4 = ((p) (obj)).a(context, "com.paypal.android.lib.authenticator.activity.v2.TouchActivity", "com.paypal.android.lib.authenticator.activity.v2.TouchActivity");
            dj dj1;
            boolean flag1;
            boolean flag2;
            if (((p) (obj)).a(context, flag) && flag4)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            dj1 = f;
            if (flag2)
            {
                obj = dl.a;
            } else
            {
                obj = dl.b;
            }
            dj1.a(((dl) (obj)), "", Collections.emptyMap(), Protocol.v2);
            if (!flag2)
            {
                obj = new n();
                boolean flag5 = ((n) (obj)).a(context, "com.paypal.android.lib.authenticator.activity.v1.TouchActivity", "com.paypal.android.lib.authenticator.activity.v1.TouchActivity");
                if (((n) (obj)).a(context, flag) && flag5)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = f;
                if (flag1)
                {
                    context = dl.a;
                } else
                {
                    context = dl.b;
                }
                ((dj) (obj)).a(context, "", Collections.emptyMap(), Protocol.v1);
            } else
            {
                flag1 = false;
            }
            if (!flag2)
            {
                flag = flag3;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public static PerformRequestStatus performRequest(Activity activity, Request request, int i, boolean flag, BrowserSwitchAdapter browserswitchadapter)
    {
        b(activity);
        isWalletAppInstalled(activity, flag);
        dc dc1 = request.getRecipeToExecute(activity, a(activity), flag);
        if (dc1 == null)
        {
            return new PerformRequestStatus(false, null, null);
        }
        if (RequestTarget.wallet == dc1.d())
        {
            if (request.getClass() == com/paypal/android/sdk/onetouch/core/CheckoutRequest)
            {
                request.clientMetadataId(getClientMetadataId(activity));
            }
            request.trackFpti(activity, dl.g, dc1.e());
            PayPalOneTouchActivity.Start(activity, i, request, dc1.e());
            return new PerformRequestStatus(true, RequestTarget.wallet, request.getClientMetadataId());
        }
        if (request.getClass() == com/paypal/android/sdk/onetouch/core/CheckoutRequest)
        {
            request.clientMetadataId(getClientMetadataId(activity, ((CheckoutRequest)request).getPairingId()));
        }
        activity = a(activity, request);
        if (activity != null)
        {
            browserswitchadapter.handleBrowserSwitchIntent(activity);
            return new PerformRequestStatus(true, RequestTarget.browser, request.getClientMetadataId());
        } else
        {
            return new PerformRequestStatus(false, RequestTarget.browser, request.getClientMetadataId());
        }
    }

    public static RequestTarget preflightRequest(Context context, Request request, boolean flag)
    {
        dc dc1;
        b(context);
        isWalletAppInstalled(context, flag);
        dc1 = request.getRecipeToExecute(context, a(context), flag);
        if (dc1 == null) goto _L2; else goto _L1
_L1:
        (new StringBuilder("found recipe:")).append(dc1);
        if (RequestTarget.browser != dc1.d()) goto _L4; else goto _L3
_L3:
        request.trackFpti(context, dl.c, dc1.e());
_L5:
        return dc1.d();
_L4:
        if (RequestTarget.wallet == dc1.d())
        {
            request.trackFpti(context, dl.d, dc1.e());
        }
        if (true) goto _L5; else goto _L2
_L2:
        request.trackFpti(context, dl.e, null);
        return null;
    }

    public static void useHardcodedConfig(Context context, boolean flag)
    {
        b(context);
        d.a(flag);
    }

}
