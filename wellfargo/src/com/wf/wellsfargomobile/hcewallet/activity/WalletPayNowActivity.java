// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;
import com.wf.wellsfargomobile.ai;
import com.wf.wellsfargomobile.hcewallet.a.a;
import com.wf.wellsfargomobile.hcewallet.a.b;
import com.wf.wellsfargomobile.hcewallet.a.f;
import com.wf.wellsfargomobile.hcewallet.c.h;
import com.wf.wellsfargomobile.hcewallet.c.j;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.service.WalletIntentService;
import com.wf.wellsfargomobile.mrdc.e;
import com.wf.wellsfargomobile.util.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            b, c, d, e, 
//            f, g, h, i

public class WalletPayNowActivity extends BaseActionBarActivity
    implements j
{

    protected a b;
    BroadcastReceiver c;
    IntentFilter d;
    private final BroadcastReceiver e = new com.wf.wellsfargomobile.hcewallet.activity.b(this);
    private final BroadcastReceiver f = new c(this);
    private LinearLayout g;
    private s h;
    private String i[];
    private List j;
    private Handler k;
    private String l;
    private Runnable m;

    public WalletPayNowActivity()
    {
        c = new d(this);
        d = new IntentFilter("com.wf.PaymentInitiated");
        i = new String[3];
        l = "";
        m = new com.wf.wellsfargomobile.hcewallet.activity.e(this);
    }

    static void a(WalletPayNowActivity walletpaynowactivity)
    {
        walletpaynowactivity.e();
    }

    static void a(WalletPayNowActivity walletpaynowactivity, String s1)
    {
        walletpaynowactivity.e(s1);
    }

    static void a(WalletPayNowActivity walletpaynowactivity, String s1, String s2, int i1)
    {
        walletpaynowactivity.a(s1, s2, i1);
    }

    private void a(String s1, String s2, int i1)
    {
        if (s2 != null)
        {
            ai ai1 = new ai();
            Bundle bundle = new Bundle();
            bundle.putInt("DIALOG_ICON", i1);
            bundle.putString("DIALOG_TITLE", s1);
            bundle.putString("DIALOG_MESSAGE", s2);
            ai1.setArguments(bundle);
            ai1.show(getSupportFragmentManager(), "MessageDialogFragment");
        }
    }

    static void b(WalletPayNowActivity walletpaynowactivity, String s1)
    {
        walletpaynowactivity.d(s1);
    }

    static void c(WalletPayNowActivity walletpaynowactivity, String s1)
    {
        walletpaynowactivity.c(s1);
    }

    private void c(String s1)
    {
        if (com.wf.wellsfargomobile.hcewallet.d.i.isConnected(getApplicationContext()))
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
            intent.putExtra("WALLET_INTENT_SERVICE_CD", 1002);
            intent.putExtra("HCE_WALLET_VIEW_ID", s1);
            startService(intent);
            b().show();
            return;
        } else
        {
            a(getString(0x7f0800b2), getString(0x7f0800ae), 0x7f0200fb);
            return;
        }
    }

    private void d()
    {
        k = new Handler();
        k.postDelayed(m, 0x927c0L);
    }

    private void d(String s1)
    {
        if (s1.equals("WH"))
        {
            Intent intent = new Intent();
            intent.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            intent.putExtra("HCE_WALLET_VIEW_ID", s1);
            intent.putExtra("HCE_WALLET_WAC_AUTH_SESSION", "HCE_WALLET_WAC_AUTH_SESSION");
            setResult(-1, intent);
            return;
        } else
        {
            Intent intent1 = new Intent();
            intent1.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            intent1.putExtra("HCE_WALLET_VIEW_ID", s1);
            intent1.putExtra("HCE_WALLET_AUTH_SESSION", false);
            setResult(-1, intent1);
            return;
        }
    }

    private void e()
    {
        Intent intent = new Intent(this, com/wf/wellsfargomobile/MainActivity);
        intent.addFlags(0x14000000);
        startActivity(intent);
        finish();
    }

    private void e(String s1)
    {
        if (l != null && l.equals("PN"))
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            intent.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            intent.putExtra("HCE_WALLET_VIEW_ID", s1);
            intent.putExtra("HCE_WALLET_ERR_CD", "");
            startActivity(intent);
            return;
        } else
        {
            Intent intent1 = new Intent();
            intent1.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            intent1.putExtra("HCE_WALLET_VIEW_ID", s1);
            setResult(-1, intent1);
            return;
        }
    }

    private void f()
    {
        Object obj1 = (LinearLayout)findViewById(0x7f0f008c);
        Object obj = (LinearLayout)findViewById(0x7f0f008e);
        Button button = (Button)findViewById(0x7f0f008d);
        g = (LinearLayout)findViewById(0x7f0f008a);
        ImageView imageview = (ImageView)findViewById(0x7f0f008b);
        h = new s(this);
        h.setCancelable(false);
        h.setCanceledOnTouchOutside(false);
        h.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        button.setOnClickListener(new com.wf.wellsfargomobile.hcewallet.activity.f(this));
        String as[] = i;
        int l1 = as.length;
        int i1 = 0;
        int j1 = 0;
        while (i1 < l1) 
        {
            String s1 = as[i1];
            int k1 = j1;
            if (s1 != null)
            {
                k1 = j1;
                if (!s1.equals(""))
                {
                    TextView textview = new TextView(this);
                    if (j1 == 0)
                    {
                        textview.setTypeface(textview.getTypeface(), 1);
                        textview.setText(Html.fromHtml(Html.fromHtml(s1).toString().toString()));
                    } else
                    {
                        textview.setText(s1);
                    }
                    ((LinearLayout) (obj1)).addView(textview);
                    k1 = j1 + 1;
                }
            }
            i1++;
            j1 = k1;
        }
        obj1 = getLayoutInflater();
        if (j != null && j.size() > 0)
        {
            View view;
            for (Iterator iterator = j.iterator(); iterator.hasNext(); ((LinearLayout) (obj)).addView(view))
            {
                b b1 = (b)iterator.next();
                view = ((LayoutInflater) (obj1)).inflate(0x7f04002e, new LinearLayout(this), false);
                TextView textview1 = (TextView)view.findViewById(0x7f0f0089);
                textview1.setPaintFlags(textview1.getPaintFlags() | 8);
                textview1.setText(b1.a());
                textview1.setOnClickListener(new g(this, b1.b()));
            }

        }
        obj = com.wf.wellsfargomobile.hcewallet.d.i.getImageData(b.a(), getApplicationContext());
        if (obj != null)
        {
            imageview.setImageBitmap(((android.graphics.Bitmap) (obj)));
        }
    }

    private void g()
    {
        WFApp.i();
        WFApp.d(null);
        WFApp.e(false);
        WFApp.ac();
        com.wf.wellsfargomobile.mrdc.e.a();
        WFApp.a(false);
    }

    protected void a()
    {
        super.a();
        View view = getLayoutInflater().inflate(0x7f04002b, null);
        TextView textview = (TextView)view.findViewById(0x7f0f0086);
        ((LinearLayout)view.findViewById(0x7f0f0087)).setOnClickListener(new com.wf.wellsfargomobile.hcewallet.activity.h(this));
        textview.setOnClickListener(new com.wf.wellsfargomobile.hcewallet.activity.i(this));
        a.a(view);
    }

    public void a(String s1)
    {
        if (com.wf.wellsfargomobile.hcewallet.d.i.isConnected(getApplicationContext()))
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
            intent.putExtra("WALLET_INTENT_SERVICE_CD", 1004);
            intent.putExtra("nonce", s1);
            startService(intent);
            b().show();
            return;
        } else
        {
            a(getString(0x7f0800b2), getString(0x7f0800ae), 0x7f0200fb);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            g.setAlpha(1.0F);
        }
    }

    public s b()
    {
        return h;
    }

    public void b(String s1)
    {
        if (s1 != null && s1.contains("WAC"))
        {
            setResult(3);
            g();
            WFApp.A();
            s1 = new Intent(this, com/wf/wellsfargomobile/MainActivity);
            s1.addFlags(0x14000000);
            startActivity(s1);
            finish();
            return;
        } else
        {
            s1 = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            s1.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            s1.putExtra("HCE_WALLET_VIEW_ID", "LOG_OUT");
            s1.putExtra("HCE_WALLET_ERR_CD", "");
            startActivity(s1);
            finish();
            return;
        }
    }

    public void c()
    {
        (new h()).show(getSupportFragmentManager(), "PaymentInitiated");
        com.wf.wellsfargomobile.hcewallet.d.i.makeVibrate(this);
        g.setAlpha(0.1F);
    }

    public void onBackPressed()
    {
        c("WH");
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            l = bundle.getString("PN");
        }
        setContentView(0x7f040030);
        b = com.wf.wellsfargomobile.hcewallet.a.f.a().b();
        i[0] = b.b();
        i[1] = b.c();
        i[2] = b.d();
        j = b.e();
        f();
        d();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        WFApp.m = false;
        k.removeCallbacks(m);
    }

    protected void onPause()
    {
        super.onPause();
        unregisterReceiver(c);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(e);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(f);
    }

    protected void onResume()
    {
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(e, new IntentFilter("WALLET_SIGN_OFF_COMPLETE"));
        LocalBroadcastManager.getInstance(this).registerReceiver(f, new IntentFilter("WALLET_ACTIVE_SESSION_CHECK_COMPLETE"));
        WFApp.m = true;
        registerReceiver(c, d);
    }
}
