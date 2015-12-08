// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.a.a.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.golauncher.a.a.a:
//            a, d, b, e, 
//            f, h, g

public class c extends a
{

    private IInAppBillingService a;
    private String b;
    private String c;
    private b d;
    private b e;
    private e f;
    private ServiceConnection g;

    public c(Activity activity, String s, e e1)
    {
        super(activity);
        g = new d(this);
        c = s;
        f = e1;
        b = activity.getApplicationContext().getPackageName();
        d = new b(activity, ".products.cache.v2_6");
        e = new b(activity, ".subscriptions.cache.v2_6");
        i();
    }

    static IInAppBillingService a(c c1)
    {
        return c1.a;
    }

    static IInAppBillingService a(c c1, IInAppBillingService iinappbillingservice)
    {
        c1.a = iinappbillingservice;
        return iinappbillingservice;
    }

    private boolean a(String s, b b1)
    {
        if (!d())
        {
            return false;
        }
        s = a.getPurchases(3, b, s, null);
        if (s.getInt("RESPONSE_CODE") != 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        ArrayList arraylist1;
        b1.d();
        arraylist = s.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        arraylist1 = s.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        int l = 0;
_L6:
        if (l >= arraylist.size()) goto _L2; else goto _L3
_L3:
        String s1;
        JSONObject jsonobject;
        s1 = (String)arraylist.get(l);
        jsonobject = new JSONObject(s1);
        if (arraylist1 == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (arraylist1.size() <= l)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        s = (String)arraylist1.get(l);
_L4:
        Log.i("wss", (new StringBuilder()).append("BillingProcessor_josnData = ").append(s1).toString());
        b1.a(jsonobject.getString("productId"), s1, s);
        l++;
        continue; /* Loop/switch isn't completed */
        s = null;
          goto _L4
_L2:
        return true;
        s;
        if (f != null)
        {
            f.a(100, s);
        }
        Log.e("iabv3", s.toString());
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private h b(String s, b b1)
    {
        b1 = b1.b(s);
        if (b1 == null || TextUtils.isEmpty(((f) (b1)).a))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b1 = new h(b1);
        return b1;
        b1;
        Log.e("iabv3", (new StringBuilder()).append("Failed to load saved purchase details for ").append(s).toString());
        return null;
    }

    static boolean b(c c1)
    {
        return c1.j();
    }

    static e c(c c1)
    {
        return c1.f;
    }

    private boolean c(String s, String s1)
    {
        int l;
        if (!d() || TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return false;
        }
        try
        {
            String s2 = (new StringBuilder()).append(s1).append(":").append(UUID.randomUUID().toString()).toString();
            f(s2);
            s1 = a.getBuyIntent(3, b, s, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("iabv3", s.toString());
            return false;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        Log.i("wss", "Billing_0");
        l = s1.getInt("RESPONSE_CODE");
        f.a(s, l);
        if (l != 0) goto _L2; else goto _L1
_L1:
        Log.i("wss", "Billing_1");
        s = (PendingIntent)s1.getParcelable("BUY_INTENT");
        if (a() == null && s.getIntentSender() == null) goto _L4; else goto _L3
_L3:
        Log.i("wss", "Billing_2");
        a().startIntentSenderForResult(s.getIntentSender(), 0x1f76a0, new Intent(), 0, 0, 0);
        f.a(s1);
_L6:
        f.a(101, null);
        break MISSING_BLOCK_LABEL_345;
_L4:
        if (f != null)
        {
            f.a(103, null);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l != 7)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        h h1;
        Log.i("wss", "Billing_3");
        if (!a(s) && !b(s))
        {
            f();
        }
        if (f == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.i("wss", "Billing_4");
        h1 = d(s);
        s1 = h1;
        if (h1 != null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        s1 = e(s);
        f.a(s, s1);
        Log.i("wss", "Billing_5");
        continue; /* Loop/switch isn't completed */
        if (f != null)
        {
            Log.i("wss", "Billing_6");
        }
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    private boolean d(String s, String s1)
    {
        if (!TextUtils.isEmpty(c))
        {
            boolean flag;
            try
            {
                flag = com.jiubang.golauncher.a.a.a.g.a(c, s, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            return flag;
        } else
        {
            return true;
        }
    }

    private void f(String s)
    {
        a((new StringBuilder()).append(b()).append(".purchase.last.v2_6").toString(), s);
    }

    private void i()
    {
        try
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            if (!a().bindService(intent, g, 1))
            {
                f.a(101, null);
            }
            return;
        }
        catch (Exception exception)
        {
            Log.e("iabv3", exception.toString());
        }
    }

    private boolean j()
    {
        return a((new StringBuilder()).append(b()).append(".products.restored.v2_6").toString(), false);
    }

    private String k()
    {
        return b((new StringBuilder()).append(b()).append(".purchase.last.v2_6").toString(), null);
    }

    public volatile Activity a()
    {
        return super.a();
    }

    public boolean a(int l, int i1, Intent intent)
    {
        String s;
        String s1;
        boolean flag;
        flag = false;
        Log.i("wss", (new StringBuilder()).append("handleActivityResult_requestCode = ").append(l).toString());
        Log.i("wss", (new StringBuilder()).append("handleActivityResult_resultCode = ").append(i1).toString());
        Log.i("wss", (new StringBuilder()).append("handleActivityResult_data = ").append(intent).toString());
        if (l != 0x1f76a0 || intent == null)
        {
            return false;
        }
        l = intent.getIntExtra("RESPONSE_CODE", 0);
        Log.i("wss", (new StringBuilder()).append("responseCode = ").append(l).toString());
        s1 = "";
        s = s1;
        String s2 = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s = s1;
        Log.i("wss", (new StringBuilder()).append("tempPurchaseData = ").append(s2).toString());
        s = s1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        s = s1;
        s1 = (new JSONObject(s2)).getString("productId");
        s = s1;
        Log.i("wss", (new StringBuilder()).append("tempProductId = ").append(s1).toString());
        s = s1;
_L7:
        String s4;
        f.a(s, l);
        Log.d("iabv3", String.format("resultCode = %d, responseCode = %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(l)
        }));
        s4 = k();
        Log.i("wss", (new StringBuilder()).append("purchasePayLoad ==").append(s4).toString());
        if (i1 != -1 || l != 0 || TextUtils.isEmpty(s4))
        {
            break MISSING_BLOCK_LABEL_806;
        }
        s1 = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        Log.i("wss", (new StringBuilder()).append("purchaseData = ").append(s1).toString());
        Log.i("wss", (new StringBuilder()).append("purchaseData = ").append(s2).toString());
        String s3;
        intent = new JSONObject(s1);
        s3 = intent.getString("productId");
        s = intent.getString("developerPayload");
        Log.i("wss", (new StringBuilder()).append("productId = ").append(s3).toString());
        Log.i("wss", (new StringBuilder()).append("developerPayload == ").append(s).toString());
        intent = s;
        if (s == null)
        {
            intent = "";
        }
        boolean flag1;
        flag1 = s4.startsWith("subs");
        Log.i("wss", (new StringBuilder()).append("purchasedSubscription = ").append(flag1).toString());
        Log.i("wss", (new StringBuilder()).append("developerPayload=").append(intent).toString());
        if (!s4.equals(intent)) goto _L2; else goto _L1
_L1:
        if (!d(s1, s2)) goto _L4; else goto _L3
_L3:
        if (!flag1) goto _L6; else goto _L5
_L5:
        intent = e;
_L8:
        intent.a(s3, s1, s2);
        intent = (new StringBuilder()).append("eventHandler != null = ");
        if (f != null)
        {
            flag = true;
        }
        JSONException jsonexception;
        try
        {
            Log.i("wss", intent.append(flag).toString());
            if (f != null)
            {
                f.a(s3, new h(new f(s1, s2)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("iabv3", intent.toString());
            if (f != null)
            {
                f.a(110, null);
            }
        }
_L9:
        return true;
        jsonexception;
        jsonexception.printStackTrace();
          goto _L7
_L6:
        intent = d;
          goto _L8
_L4:
        Log.e("iabv3", "Public key signature doesn't match!");
        if (f != null)
        {
            f.a(102, null);
        }
        break MISSING_BLOCK_LABEL_675;
_L2:
        Log.e("iabv3", String.format("Payload mismatch: %s != %s", new Object[] {
            s4, intent
        }));
        if (f != null)
        {
            f.a(102, null);
        }
          goto _L9
        if (f != null)
        {
            f.a(110, null);
        }
          goto _L9
    }

    public boolean a(String s)
    {
        return d.a(s);
    }

    public boolean b(String s)
    {
        return e.a(s);
    }

    public void c()
    {
        if (g != null && a() != null)
        {
            try
            {
                a().unbindService(g);
            }
            catch (Exception exception)
            {
                Log.e("iabv3", exception.toString());
            }
            a = null;
        }
        d.c();
        super.c();
    }

    public boolean c(String s)
    {
        return c(s, "subs");
    }

    public h d(String s)
    {
        return b(s, d);
    }

    public boolean d()
    {
        return a != null;
    }

    public h e(String s)
    {
        return b(s, e);
    }

    public List e()
    {
        return e.e();
    }

    public boolean f()
    {
        return d() && a("inapp", d) && a("subs", e);
    }

    public boolean g()
    {
        return d() && a("subs", e);
    }

    public void h()
    {
        a((new StringBuilder()).append(b()).append(".products.restored.v2_6").toString(), Boolean.valueOf(true));
    }
}
