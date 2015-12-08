// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.d.e;
import com.wf.wellsfargomobile.e.a;
import com.wf.wellsfargomobile.e.b;
import com.wf.wellsfargomobile.util.n;
import com.wf.wellsfargomobile.util.t;
import com.wf.wellsfargomobile.util.u;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile:
//            SignOnFragment, aw, MainActivity, WebViewActivity, 
//            WFApp

class av extends AsyncTask
{

    final SignOnFragment a;
    private final Context b;
    private final String c;
    private final String d;

    public av(SignOnFragment signonfragment, Context context, String s, String s1)
    {
        a = signonfragment;
        super();
        b = context;
        c = s;
        d = s1;
    }

    private void a(String s, int i)
    {
        com.wf.wellsfargomobile.SignOnFragment.c(a).runOnUiThread(new aw(this, s, i));
    }

    private void a(JSONObject jsonobject)
    {
        jsonobject = jsonobject.getString("url");
        Intent intent = new Intent(com.wf.wellsfargomobile.SignOnFragment.c(a), com/wf/wellsfargomobile/WebViewActivity);
        intent.putExtra("login_app_redirect", true);
        intent.putExtra("login_app_redirect_url", jsonobject);
        com.wf.wellsfargomobile.SignOnFragment.b(a).setText("");
        SignOnFragment.g(a).setText("");
        WFApp.E();
        a.startActivityForResult(intent, 5);
        com.wf.wellsfargomobile.SignOnFragment.c(a).overridePendingTransition(0x7f05000c, 0x7f050011);
    }

    private void a(JSONObject jsonobject, String s)
    {
        if (s == null || !"error".equals(s.trim())) goto _L2; else goto _L1
_L1:
        int i;
        jsonobject = jsonobject.getString("errorCode");
        i = -1;
        jsonobject.hashCode();
        JVM INSTR lookupswitch 9: default 112
    //                   -54533818: 295
    //                   -17784257: 253
    //                   50830: 281
    //                   776791145: 239
    //                   887433779: 310
    //                   920417052: 325
    //                   1389729431: 225
    //                   1448656824: 211
    //                   1753447045: 267;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        i;
        JVM INSTR tableswitch 0 8: default 164
    //                   0 340
    //                   1 356
    //                   2 372
    //                   3 388
    //                   4 404
    //                   5 420
    //                   6 436
    //                   7 452
    //                   8 478;
           goto _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L13:
        jsonobject = ((ConnectivityManager)b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (jsonobject != null && jsonobject.isConnected())
        {
            jsonobject = a.getString(0x7f080099);
            i = 0x7f0200f9;
        } else
        {
            jsonobject = a.getString(0x7f0800ae);
            i = 0x7f0200fb;
        }
_L23:
        a(((String) (jsonobject)), i);
        return;
_L11:
        if (jsonobject.equals("5873975"))
        {
            i = 0;
        }
          goto _L3
_L10:
        if (jsonobject.equals("39836504959399323305896"))
        {
            i = 1;
        }
          goto _L3
_L7:
        if (jsonobject.equals("39663355873975"))
        {
            i = 2;
        }
          goto _L3
_L5:
        if (jsonobject.equals("2297643484833"))
        {
            i = 3;
        }
          goto _L3
_L12:
        if (jsonobject.equals("396633589643235560334229"))
        {
            i = 4;
        }
          goto _L3
_L6:
        if (jsonobject.equals("394"))
        {
            i = 5;
        }
          goto _L3
_L4:
        if (jsonobject.equals("76869266925"))
        {
            i = 6;
        }
          goto _L3
_L8:
        if (jsonobject.equals("SYSTEM_UNAVAIABLE_WFA"))
        {
            i = 7;
        }
          goto _L3
_L9:
        if (jsonobject.equals("22961632618"))
        {
            i = 8;
        }
          goto _L3
_L14:
        jsonobject = a.getString(0x7f08009e);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L15:
        jsonobject = a.getString(0x7f08009a);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L16:
        jsonobject = a.getString(0x7f08009c);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L17:
        jsonobject = a.getString(0x7f08009f);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L18:
        jsonobject = a.getString(0x7f08009b);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L19:
        jsonobject = a.getString(0x7f08009d);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L20:
        jsonobject = a.getString(0x7f0800a0);
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L21:
        jsonobject = a.getString(0x7f080104, new Object[] {
            WFApp.ag()
        });
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L22:
        jsonobject = a.getString(0x7f080103, new Object[] {
            WFApp.ag()
        });
        i = 0x7f0200f9;
        break MISSING_BLOCK_LABEL_204;
_L2:
        jsonobject = a.getString(0x7f0800a1);
        i = 0x7f0200f9;
          goto _L23
    }

    private void b()
    {
        a a1 = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("DIALOG_ICON", 0x7f0200fe);
        bundle.putString("DIALOG_TITLE", a.getString(0x7f080060));
        bundle.putString("DIALOG_MESSAGE", a.getString(0x7f08005f));
        a1.setArguments(bundle);
        a1.show(a.getFragmentManager(), "ForcedUpgradeMessageDialogFragment");
    }

    private void b(JSONObject jsonobject)
    {
        String s = jsonobject.optString("errorText");
        if ("".equals(s))
        {
            a(jsonobject, jsonobject.optString("status"));
            return;
        } else
        {
            a(s, 0x7f0200fb);
            return;
        }
    }

    private void c()
    {
        b b1 = new b();
        Bundle bundle = new Bundle();
        bundle.putInt("DIALOG_ICON", 0x7f0200fe);
        bundle.putString("DIALOG_TITLE", a.getString(0x7f0800de));
        bundle.putString("DIALOG_MESSAGE", a.getString(0x7f0800dd));
        b1.setArguments(bundle);
        b1.show(a.getFragmentManager(), "RecommendedUpgradeMessageDialogFragment");
    }

    protected transient String a(Void avoid[])
    {
        Thread.currentThread().setName("LoginTask");
        Object obj1 = "";
        Object obj;
        java.util.List list;
        boolean flag;
        try
        {
            flag = t.a.equals(com.wf.wellsfargomobile.WFApp.n());
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            return null;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        avoid = Camera.open();
        obj = obj1;
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = avoid;
        list = avoid.getParameters().getSupportedFocusModes();
        obj = obj1;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = avoid;
        obj1 = list.toString();
        obj = obj1;
        if (avoid == null) goto _L4; else goto _L3
_L3:
        avoid.stopPreview();
        avoid.release();
          goto _L4
_L18:
        obj = new LinkedHashMap();
        obj1 = WFApp.L();
        if (!a.a.isChecked()) goto _L6; else goto _L5
_L5:
        if (((n) (obj1)).a() || !c.equals(((n) (obj1)).e())) goto _L8; else goto _L7
_L7:
        ((Map) (obj)).put("j_username", "");
_L13:
        ((Map) (obj)).put("save-username", "true");
_L14:
        ((Map) (obj)).put("j_password", d);
        ((Map) (obj)).put("WFAppId", com.wf.wellsfargomobile.a.a.i());
        ((Map) (obj)).put("nativeApp", WFApp.af());
        ((Map) (obj)).put("jsenabled", "true");
        ((Map) (obj)).put("origin", a.getString(0x7f0800a2));
        ((Map) (obj)).put("destination", a.getString(0x7f080142));
        ((Map) (obj)).put("WFAppVersion", (new StringBuilder()).append("4.6.108 ").append(com.wf.wellsfargomobile.a.a.g()).toString());
        ((Map) (obj)).put("appStore", com.wf.wellsfargomobile.a.a.h());
        ((Map) (obj)).put("nonce", WFApp.o());
        ((Map) (obj)).put("manufacturer", Build.MANUFACTURER);
        ((Map) (obj)).put("modelNumber", Build.MODEL);
        ((Map) (obj)).put("modelName", Build.DEVICE);
        ((Map) (obj)).put("carrier", Build.BRAND);
        ((Map) (obj)).put("osVersion", android.os.Build.VERSION.RELEASE);
        ((Map) (obj)).put("fingerprint", Build.FINGERPRINT);
        ((Map) (obj)).put("focusModes", avoid);
        ((Map) (obj)).put("mode", com.wf.wellsfargomobile.WFApp.e());
        ((Map) (obj)).put(com.wf.wellsfargomobile.WFApp.a, com.wf.wellsfargomobile.SignOnFragment.e(a));
        ((Map) (obj)).put("isDeviceEligibleForWallet", Boolean.toString(WFApp.ah()));
        if (!u.d()) goto _L10; else goto _L9
_L9:
        ((Map) (obj)).put("hasCamera", "FALSE");
_L15:
        ((Map) (obj)).put("userPrefs", WFApp.H());
        avoid = com.wf.wellsfargomobile.SignOnFragment.c(a).getSharedPreferences("WF_PREFERENCES", 0).getString("gcm_registration_id_pref", null);
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_521;
        }
        ((Map) (obj)).put("pnRegistrationId", avoid);
        ((Map) (obj)).put("pnProvider", "GCM");
        obj1 = a.getActivity().getIntent();
        avoid = ((Intent) (obj1)).getStringExtra("PNSTOKEN");
        obj1 = ((Intent) (obj1)).getStringExtra("PNSDEST");
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            Log.d("LoginTask", (new StringBuilder()).append("deepLinkDestination=").append(((String) (obj1))).toString());
            ((Map) (obj)).put("PNSDEST", obj1);
            if (!TextUtils.isEmpty(avoid))
            {
                Log.d("LoginTask", (new StringBuilder()).append("accountHash=").append(avoid).toString());
                ((Map) (obj)).put("PNSTOKEN", avoid);
            }
        }
        obj = (new com.wf.wellsfargomobile.d.a(c.b, (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.c()).append("/auth/login/do?channel=mobile").toString(), ((Map) (obj)), null, b)).b();
        avoid = ((e) (obj)).b().toString();
        try
        {
            obj1 = ((e) (obj)).c();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return avoid;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return avoid;
        }
        obj = avoid;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_725;
        }
        obj = avoid;
        if (((URL) (obj1)).getPath().contains(b.getString(0x7f080162)))
        {
            obj = "{\"status\":\"error\", \"errorCode\": \"SYSTEM_UNAVAIABLE_WFA\" }";
        }
        return ((String) (obj));
        avoid;
        avoid = null;
_L17:
        obj = avoid;
        com.wf.wellsfargomobile.WFApp.e(true);
        if (avoid == null) goto _L12; else goto _L11
_L11:
        avoid.stopPreview();
        avoid.release();
          goto _L12
_L16:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_763;
        }
        ((Camera) (obj)).stopPreview();
        ((Camera) (obj)).release();
        throw avoid;
_L8:
        ((Map) (obj)).put("j_username", c);
          goto _L13
_L6:
        ((Map) (obj)).put("j_username", c);
          goto _L14
_L10:
        ((Map) (obj)).put("hasCamera", com.wf.wellsfargomobile.WFApp.n().toString());
          goto _L15
        avoid;
          goto _L16
        obj;
          goto _L17
_L2:
        avoid = "";
          goto _L18
_L4:
        avoid = ((Void []) (obj));
          goto _L18
_L12:
        avoid = "";
          goto _L18
        avoid;
        obj = null;
          goto _L16
    }

    public void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            execute(new Void[0]);
            return;
        }
    }

    protected void a(String s)
    {
        if (com.wf.wellsfargomobile.SignOnFragment.c(a).c().isShowing())
        {
            com.wf.wellsfargomobile.SignOnFragment.c(a).c().dismiss();
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        String s1;
        s = new JSONObject(s);
        s1 = s.getString("status");
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 5: default 262
    //                   -2035813260: 136
    //                   -1316092554: 151
    //                   -776144932: 121
    //                   96784904: 166
    //                   1934244635: 180;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L10:
        a(((JSONObject) (s)), s1);
_L9:
        WFApp.J();
        SignOnFragment.f(a);
        return;
_L6:
        if (s1.equals("redirect"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (s1.equals("forcedAppUpgrade"))
        {
            byte0 = 1;
        }
          goto _L3
_L5:
        if (s1.equals("recommendedAppUpgrade"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        if (s1.equals("error"))
        {
            byte0 = 3;
        }
          goto _L3
_L8:
        if (s1.equals("showLoginPage"))
        {
            byte0 = 4;
        }
          goto _L3
_L11:
        try
        {
            a(((JSONObject) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(a.getString(0x7f080099), 0x7f0200f9);
        }
          goto _L9
_L12:
        b();
          goto _L9
_L13:
        c();
          goto _L9
_L14:
        b(s);
          goto _L9
_L2:
        a(a.getString(0x7f0800a1), 0x7f0200f9);
          goto _L9
_L3:
        byte0;
        JVM INSTR tableswitch 0 4: default 296
    //                   0 195
    //                   1 222
    //                   2 229
    //                   3 236
    //                   4 236;
           goto _L10 _L11 _L12 _L13 _L14 _L14
    }

    protected void b(String s)
    {
        super.onCancelled(s);
    }

    protected transient void b(Void avoid[])
    {
        super.onProgressUpdate(avoid);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onCancelled()
    {
        super.onCancelled();
    }

    protected void onCancelled(Object obj)
    {
        b((String)obj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    protected void onPreExecute()
    {
        com.wf.wellsfargomobile.SignOnFragment.c(a).c().show();
        ((InputMethodManager)b.getSystemService("input_method")).hideSoftInputFromWindow(SignOnFragment.d(a).getWindowToken(), 2);
        WFApp.A();
    }

    protected void onProgressUpdate(Object aobj[])
    {
        b((Void[])aobj);
    }
}
