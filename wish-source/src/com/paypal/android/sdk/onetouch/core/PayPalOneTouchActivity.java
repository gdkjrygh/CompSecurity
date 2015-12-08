// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            Result, cv, ResponseType, ct, 
//            dl, Request, b, c, 
//            m, Protocol, n, AuthorizationRequest, 
//            p, CheckoutRequest, PayPalOneTouchCore

public class PayPalOneTouchActivity extends Activity
{

    public static final String EXTRA_ONE_TOUCH_RESULT = "com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT";
    private static final String a = com/paypal/android/sdk/onetouch/core/PayPalOneTouchActivity.getSimpleName();
    private boolean b;
    private b c;
    private Request d;

    public PayPalOneTouchActivity()
    {
    }

    public static void Start(Activity activity, int i, Request request, Protocol protocol)
    {
        Intent intent = new Intent(activity, com/paypal/android/sdk/onetouch/core/PayPalOneTouchActivity);
        intent.putExtras(activity.getIntent());
        intent.putExtra("com.paypal.android.sdk.onetouch.core.EXTRA_REQUEST", request);
        intent.putExtra("com.paypal.android.sdk.onetouch.core.EXTRA_PROTOCOL", protocol);
        activity.startActivityForResult(intent, i);
    }

    private static Result a(Bundle bundle)
    {
        Object obj;
        String s;
        obj = bundle.getString("error");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return new Result(new cv(((String) (obj))));
        }
        s = bundle.getString("environment");
        if ("code".equals(bundle.getString("response_type").toLowerCase(Locale.US)))
        {
            obj = ResponseType.authorization_code;
        } else
        {
            obj = ResponseType.web;
        }
        if (ResponseType.web != obj)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        bundle = bundle.getString("webURL");
        bundle = new Result(s, ((ResponseType) (obj)), (new JSONObject()).put("webURL", bundle), null);
        return bundle;
        try
        {
            String s1 = bundle.getString("authorization_code");
            bundle = bundle.getString("email");
            bundle = new Result(s, ((ResponseType) (obj)), (new JSONObject()).put("code", s1), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return new Result(new ct(bundle));
        }
        return bundle;
    }

    private static void b(Bundle bundle)
    {
        if (bundle != null)
        {
            for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                Object obj = bundle.get(s);
                if (obj == null)
                {
                    String.format("%s:null", new Object[] {
                        s
                    });
                } else
                {
                    String.format("%s:%s (%s)", new Object[] {
                        s, obj.toString(), obj.getClass().getName()
                    });
                }
            }

        }
    }

    private static void c(Bundle bundle)
    {
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            if (obj == null)
            {
                s = String.format("%s:null", new Object[] {
                    s
                });
            } else
            {
                s = String.format("%s:%s (%s)", new Object[] {
                    s, obj.toString(), obj.getClass().getName()
                });
            }
            Log.w("paypal.sdk", s);
        }
    }

    public void finish()
    {
        super.finish();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        (new StringBuilder("onActivityResult(")).append(i).append(",").append(j).append(",").append(intent).append(")");
        if (intent != null)
        {
            b(intent.getExtras());
        }
        i;
        JVM INSTR tableswitch 1 2: default 80
    //                   1 155
    //                   2 155;
           goto _L1 _L2 _L2
_L1:
        dl dl1;
        Log.wtf(a, (new StringBuilder("unexpected request code ")).append(i).append(" call it a cancel").toString());
        intent = new Result();
        dl1 = dl.h;
_L4:
        setResult(-1, (new Intent()).putExtra("com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT", intent));
        d.trackFpti(this, dl1, null);
        finish();
        return;
_L2:
        if (intent != null && intent.getExtras() != null && !intent.getExtras().isEmpty())
        {
            Object obj = intent.getExtras();
            boolean flag = d.validateV1V2Response(c, ((Bundle) (obj)));
            if (j == -1 && flag)
            {
                intent = a(((Bundle) (obj)));
                dl1 = dl.i;
            } else
            {
                if (((Bundle) (obj)).containsKey("error"))
                {
                    obj = new Result(new cv(((Bundle) (obj)).getString("error")));
                    dl1 = dl.j;
                } else
                if (!flag)
                {
                    obj = new Result(new ct("invalid wallet response"));
                    dl1 = dl.j;
                } else
                {
                    obj = new Result();
                    dl1 = dl.h;
                }
                c(intent.getExtras());
                intent = ((Intent) (obj));
            }
        } else
        {
            intent = new Result();
            dl1 = dl.h;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        int i = 1;
        super.onCreate(bundle);
        c = new b(getApplicationContext(), (new c()).b());
        if (bundle == null)
        {
            (new m(this)).a(com/paypal/android/sdk/onetouch/core/PayPalOneTouchActivity);
            b = true;
        } else
        {
            b = false;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setTheme(0x1030010);
        if (getIntent().getExtras() == null)
        {
            onBackPressed();
        } else
        {
            d = (Request)getIntent().getParcelableExtra("com.paypal.android.sdk.onetouch.core.EXTRA_REQUEST");
            bundle = (Protocol)getIntent().getSerializableExtra("com.paypal.android.sdk.onetouch.core.EXTRA_PROTOCOL");
            if (b)
            {
                Object obj = d;
                if (Protocol.v1 == bundle)
                {
                    bundle = (new n()).a();
                    bundle.putExtra("version", "1.0");
                } else
                {
                    bundle = (new p()).a();
                    bundle.putExtra("version", "2.0");
                    i = 2;
                }
                bundle.putExtra("app_guid", c.d());
                bundle.putExtra("client_metadata_id", ((Request) (obj)).getClientMetadataId());
                bundle.putExtra("client_id", ((Request) (obj)).getClientId());
                bundle.putExtra("app_name", c.b());
                bundle.putExtra("environment", ((Request) (obj)).getEnvironment());
                bundle.putExtra("environment_url", ((Request) (obj)).getEnvironmentUrl());
                if (obj instanceof AuthorizationRequest)
                {
                    obj = (AuthorizationRequest)obj;
                    bundle.putExtra("scope", ((AuthorizationRequest) (obj)).getScopeString());
                    bundle.putExtra("response_type", "code");
                    bundle.putExtra("privacy_url", ((AuthorizationRequest) (obj)).getPrivacyUrl());
                    bundle.putExtra("agreement_url", ((AuthorizationRequest) (obj)).getUserAgreementUrl());
                    Log.w("paypal.sdk", (new StringBuilder("requesting ")).append(bundle.getStringExtra("response_type")).append(" with scope:\"").append(bundle.getStringExtra("scope")).append("\" from Authenticator.").toString());
                } else
                {
                    obj = (CheckoutRequest)obj;
                    bundle.putExtra("response_type", "web");
                    bundle.putExtra("webURL", ((CheckoutRequest) (obj)).getBrowserSwitchUrl(getApplicationContext(), PayPalOneTouchCore.a(getApplicationContext())));
                    ((CheckoutRequest) (obj)).persistRequiredFields(c);
                    Log.w("paypal.sdk", (new StringBuilder("requesting ")).append(bundle.getStringExtra("response_type")).append(" with webURL\"").append(bundle.getStringExtra("webURL")).append("\" from Authenticator.").toString());
                }
                (new StringBuilder("startActivityForResult(")).append(bundle).append(", ").append(i).append(") extras: ").append(bundle.getExtras());
                startActivityForResult(bundle, i);
                return;
            }
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

}
