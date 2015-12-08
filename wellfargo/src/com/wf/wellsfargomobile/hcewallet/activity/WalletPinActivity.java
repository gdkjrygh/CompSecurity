// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;
import com.wf.wellsfargomobile.ai;
import com.wf.wellsfargomobile.hcewallet.c.a;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.service.HCEWalletHostApduService;
import com.wf.wellsfargomobile.hcewallet.service.WalletIntentService;
import com.wf.wellsfargomobile.util.s;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            j, k, l, m, 
//            WalletPayNowActivity, WalletErrorCVActivity

public class WalletPinActivity extends BaseActionBarActivity
    implements android.view.View.OnClickListener
{

    protected LinearLayout b;
    private final BroadcastReceiver c = new j(this);
    private TextView d;
    private EditText e;
    private s f;
    private Button g;
    private boolean h;
    private Handler i;

    public WalletPinActivity()
    {
        h = false;
    }

    static TextView a(WalletPinActivity walletpinactivity)
    {
        return walletpinactivity.d;
    }

    private void a(int i1, String s1, String s2)
    {
        a a1;
        Bundle bundle;
        a(((View) (b)));
        a1 = new a();
        bundle = new Bundle();
        i1;
        JVM INSTR lookupswitch 2: default 52
    //                   100: 71
    //                   200: 100;
           goto _L1 _L2 _L3
_L1:
        a1.setArguments(bundle);
        a1.show(getSupportFragmentManager(), "DialogPopup");
        return;
_L2:
        bundle.putString("DIALOG_TITLE", getString(0x7f080064));
        bundle.putString("DIALOG_MESSAGE", getString(0x7f080062));
        continue; /* Loop/switch isn't completed */
_L3:
        bundle.putString("DIALOG_TITLE", s1);
        bundle.putString("DIALOG_MESSAGE", s2);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(View view)
    {
        Log.d("WalletPinActivity", "Clicked");
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    static void a(WalletPinActivity walletpinactivity, String s1)
    {
        walletpinactivity.b(s1);
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

    static Button b(WalletPinActivity walletpinactivity)
    {
        return walletpinactivity.g;
    }

    private void b(String s1)
    {
        WFApp.a("WalletPinActivity");
        d.setVisibility(8);
        a(b);
        if (c(e.getText().toString()))
        {
            if (com.wf.wellsfargomobile.hcewallet.d.i.isConnected(getApplicationContext()))
            {
                Intent intent = new Intent(this, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
                intent.putExtra("WALLET_INTENT_SERVICE_CD", 1001);
                intent.putExtra("WAC_SIGN_ON_KEY", e.getText().toString());
                intent.putExtra("WAC_VIEW_ID", s1);
                startService(intent);
                b().show();
                e.setText("");
                return;
            } else
            {
                a(getString(0x7f0800b2), getString(0x7f0800ae), 0x7f0200fb);
                return;
            }
        } else
        {
            d.setVisibility(0);
            d.setText(0x7f080116);
            return;
        }
    }

    static EditText c(WalletPinActivity walletpinactivity)
    {
        return walletpinactivity.e;
    }

    private void c()
    {
        d = (TextView)findViewById(0x7f0f0088);
        ((Button)findViewById(0x7f0f008f)).setOnClickListener(this);
        e = (EditText)findViewById(0x7f0f0090);
        e.setOnEditorActionListener(new k(this));
        e.setTypeface(Typeface.DEFAULT);
        b = (LinearLayout)findViewById(0x7f0f008a);
        b.setOnClickListener(this);
        ((Button)findViewById(0x7f0f0091)).setOnClickListener(this);
        g = (Button)findViewById(0x7f0f0092);
        g.setOnClickListener(this);
        g.setEnabled(false);
        g.setBackgroundResource(0x7f02007b);
        g.setTextColor(-1);
        f = new s(this);
        f.setCancelable(false);
        f.setCanceledOnTouchOutside(false);
        f.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Object obj = (Button)findViewById(0x7f0f0094);
        Button button = (Button)findViewById(0x7f0f0093);
        ((Button) (obj)).setOnClickListener(this);
        ((Button) (obj)).setEnabled(false);
        ((Button) (obj)).setBackgroundResource(0x7f02007e);
        ((Button) (obj)).setTextColor(-1);
        button.setOnClickListener(this);
        e.addTextChangedListener(new l(this, ((Button) (obj))));
        obj = getIntent();
        if (obj != null && ((Intent) (obj)).getExtras() != null && ((Intent) (obj)).getExtras().containsKey("NAVIGATION_FROM"))
        {
            h = true;
        }
    }

    private boolean c(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s1 != null)
        {
            flag = flag1;
            if (!s1.equals(""))
            {
                flag = flag1;
                if (s1.length() >= 4)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void d()
    {
        i.postDelayed(new m(this), 100L);
    }

    private void e()
    {
        if (h)
        {
            startActivity(new Intent(this, com/wf/wellsfargomobile/MainActivity));
        }
        finish();
    }

    protected void a()
    {
        super.a();
        View view = getLayoutInflater().inflate(0x7f040019, null);
        a.a(view);
    }

    public void a(String s1)
    {
        if (s1 == null || !s1.equalsIgnoreCase("PN")) goto _L2; else goto _L1
_L1:
        s1 = new Intent(this, com/wf/wellsfargomobile/hcewallet/activity/WalletPayNowActivity);
        s1.putExtra("PN", "PN");
        startActivity(s1);
        finish();
_L4:
        s1 = new Intent(this, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
        s1.putExtra("WALLET_INTENT_SERVICE_CD", 1003);
        startService(s1);
        return;
_L2:
        if (s1 != null && s1.equalsIgnoreCase("WH"))
        {
            s1 = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            s1.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            s1.putExtra("HCE_WALLET_VIEW_ID", "WH");
            s1.putExtra("HCE_WALLET_ERR_CD", "");
            startActivity(s1);
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1, String s2, String s3, String s4)
    {
        String s5;
label0:
        {
            if (s3 != null)
            {
                s5 = s3;
                if (!s3.equals(""))
                {
                    break label0;
                }
            }
            s5 = "IL";
        }
        if (s1 == null || !s1.equals("MW9000")) goto _L2; else goto _L1
_L1:
        a(((String) (null)), s2, 0x7f0200fb);
_L4:
        return;
_L2:
        if (s5.equalsIgnoreCase("WVS"))
        {
            s2 = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            s2.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            s2.putExtra("HCE_WALLET_VIEW_ID", s4);
            s2.putExtra("HCE_WALLET_ERR_CD", s1);
            startActivity(s2);
            finish();
            return;
        }
        if (s5.equalsIgnoreCase("WV"))
        {
            s2 = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            s2.putExtra("HCE_WALLET_VIEW", "HCE_WALLET_VIEW");
            s2.putExtra("HCE_WALLET_VIEW_ID", s4);
            s2.putExtra("HCE_WALLET_ERR_CD", s1);
            s2.putExtra("HCE_WALLET_AUTH_SESSION", false);
            startActivity(s2);
            finish();
            return;
        }
        if (s5.equalsIgnoreCase("IL"))
        {
            d.setVisibility(0);
            d.setText(com.wf.wellsfargomobile.hcewallet.d.i.handleErrorMessage(s2));
            return;
        }
        if (s5.equalsIgnoreCase("CV"))
        {
            s1 = new Intent(this, com/wf/wellsfargomobile/hcewallet/activity/WalletErrorCVActivity);
            s1.putExtra("WALLET_INTENT_CV_ERROR", s2);
            startActivity(s1);
            return;
        }
        if (!s5.equalsIgnoreCase("PU")) goto _L4; else goto _L3
_L3:
        if (s1 == null || !s1.equalsIgnoreCase("MW7004"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s2 == null) goto _L4; else goto _L5
_L5:
        if (s2.indexOf("{H}") > 0)
        {
            a(200, s2.substring(0, s2.indexOf("{H}")), s2.substring(s2.indexOf("{H}") + 3, s2.length()));
            return;
        } else
        {
            a(200, null, s2);
            return;
        }
        if (s2 == null) goto _L4; else goto _L6
_L6:
        if (s2.indexOf("{H}") > 0)
        {
            a(s2.substring(0, s2.indexOf("{H}")), s2.substring(s2.indexOf("{H}") + 3, s2.length()), 0x7f0200fb);
            return;
        } else
        {
            a(((String) (null)), s2, 0x7f0200fb);
            return;
        }
    }

    public s b()
    {
        return f;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 10001 10001: default 20
    //                   10001 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!com.wf.wellsfargomobile.hcewallet.d.i.isDefaultPaymentApp(this))
        {
            e();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        e();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131689611: 
        case 2131689612: 
        case 2131689613: 
        case 2131689614: 
        case 2131689616: 
        default:
            return;

        case 2131689615: 
            com.wf.wellsfargomobile.hcewallet.d.i.navigateToNFCSettings(this);
            return;

        case 2131689610: 
            a(b);
            return;

        case 2131689617: 
            a(100, null, ((String) (null)));
            return;

        case 2131689618: 
            b("PN");
            return;

        case 2131689620: 
            b("WH");
            return;

        case 2131689619: 
            a(b);
            e();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040031);
        c();
        i = new Handler();
        d();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        WFApp.n = false;
    }

    protected void onPause()
    {
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(c);
    }

    protected void onResume()
    {
        super.onResume();
        WFApp.n = true;
        LocalBroadcastManager.getInstance(this).registerReceiver(c, new IntentFilter("WAC_SIGN_ON_COMPLETE"));
        if (com.wf.wellsfargomobile.hcewallet.d.i.isDefaultPaymentApp(this))
        {
            if (com.wf.wellsfargomobile.hcewallet.d.i.isNfcEnabled(this))
            {
                d.setVisibility(8);
                g.setBackgroundResource(0x7f02007a);
                if (e.getText().toString().length() >= 4)
                {
                    g.setEnabled(true);
                    g.setBackgroundResource(0x7f02007a);
                    return;
                } else
                {
                    g.setEnabled(false);
                    g.setBackgroundResource(0x7f02007b);
                    return;
                }
            } else
            {
                d.setVisibility(0);
                g.setBackgroundResource(0x7f02007b);
                g.setEnabled(false);
                return;
            }
        } else
        {
            Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
            intent.putExtra("category", "payment");
            intent.putExtra("component", new ComponentName(getApplicationContext(), com/wf/wellsfargomobile/hcewallet/service/HCEWalletHostApduService.getCanonicalName()));
            startActivityForResult(intent, 10001);
            return;
        }
    }
}
