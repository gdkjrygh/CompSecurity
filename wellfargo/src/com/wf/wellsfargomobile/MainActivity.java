// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.d;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.locations.LocationListActivity;
import com.wf.wellsfargomobile.notices.InfoActivity;
import com.wf.wellsfargomobile.quickbalance.QuickBalanceWebViewFragment;
import com.wf.wellsfargomobile.util.e;
import com.wf.wellsfargomobile.util.h;
import com.wf.wellsfargomobile.util.s;
import com.wf.wellsfargomobile.util.t;
import com.wf.wellsfargomobile.webview.javascriptinterface.a.a;
import com.wf.wellsfargomobile.widget.LockableScrollView;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseActionBarActivity, x, af, WFApp, 
//            WebViewActivity, ae, LogonFragment, ai, 
//            SignOnFragment, ac, y, z, 
//            ah, aa, ab, ag, 
//            ad, SlidingMenuWebViewFragment

public class MainActivity extends BaseActionBarActivity
    implements h, a, x
{

    private final android.view.View.OnClickListener A = new af(this);
    public RelativeLayout b;
    private LockableScrollView c;
    private RelativeLayout d;
    private LinearLayout e;
    private LinearLayout f;
    private RelativeLayout g;
    private RelativeLayout h;
    private GestureDetectorCompat i;
    private Typeface j;
    private s k;
    private ImageView l;
    private boolean m;
    private String n;
    private String o;
    private int p;
    private com.google.android.gms.gcm.b q;
    private String r;
    private String s;
    private DrawerLayout t;
    private boolean u;
    private Button v;
    private ImageView w;
    private boolean x;
    private LinearLayout y;
    private QuickBalanceWebViewFragment z;

    public MainActivity()
    {
        x = false;
    }

    static com.google.android.gms.gcm.b a(MainActivity mainactivity, com.google.android.gms.gcm.b b1)
    {
        mainactivity.q = b1;
        return b1;
    }

    private String a(Context context)
    {
        SharedPreferences sharedpreferences = b(context);
        context = sharedpreferences.getString("gcm_registration_id_pref", "");
        if (context != null && context.isEmpty())
        {
            context = "";
        } else
        if (sharedpreferences.getInt("app_version", 0x80000000) != WFApp.Y())
        {
            Log.i("MainActivity", "App version changed.");
            return "";
        }
        return context;
    }

    static String a(MainActivity mainactivity, String s1)
    {
        mainactivity.r = s1;
        return s1;
    }

    private void a(Context context, String s1)
    {
        context = b(context);
        int i1 = WFApp.Y();
        if (Log.isLoggable("MainActivity", 4))
        {
            Log.i("MainActivity", (new StringBuilder()).append("Reg Id is.").append(s1).toString());
        }
        context = context.edit();
        context.putString("gcm_registration_id_pref", s1);
        context.putInt("app_version", i1);
        context.apply();
    }

    private void a(ImageView imageview, boolean flag)
    {
        if (flag)
        {
            imageview.setImageResource(0x7f0200f6);
            imageview.setContentDescription(getString(0x7f0800d6));
            return;
        } else
        {
            imageview.setImageResource(0x7f0200f7);
            imageview.setContentDescription(getString(0x7f0800d7));
            return;
        }
    }

    static void a(MainActivity mainactivity)
    {
        mainactivity.l();
    }

    static void a(MainActivity mainactivity, Context context, String s1)
    {
        mainactivity.a(context, s1);
    }

    static boolean a(MainActivity mainactivity, boolean flag)
    {
        mainactivity.u = flag;
        return flag;
    }

    private SharedPreferences b(Context context)
    {
        return getSharedPreferences("WF_PREFERENCES", 0);
    }

    static GestureDetectorCompat b(MainActivity mainactivity)
    {
        return mainactivity.i;
    }

    static void c(MainActivity mainactivity)
    {
        mainactivity.g();
    }

    static com.google.android.gms.gcm.b d(MainActivity mainactivity)
    {
        return mainactivity.q;
    }

    static String e(MainActivity mainactivity)
    {
        return mainactivity.s;
    }

    static String f(MainActivity mainactivity)
    {
        return mainactivity.r;
    }

    private void f()
    {
label0:
        {
            if (l != null)
            {
                if (System.currentTimeMillis() > com.wf.wellsfargomobile.WFApp.i)
                {
                    break label0;
                }
                l.setImageDrawable(WFApp.S());
            }
            return;
        }
        int i1 = getSharedPreferences("WF_PREFERENCES", 0).getInt("lastBackgroundImageIndex", 1);
        l.setImageDrawable(com.wf.wellsfargomobile.WFApp.b(i1));
    }

    static Button g(MainActivity mainactivity)
    {
        return mainactivity.v;
    }

    private void g()
    {
        if (WFApp.q())
        {
            startActivityForResult(new Intent(this, com/wf/wellsfargomobile/locations/LocationListActivity), 7);
        } else
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            intent.putExtra("webatmloc_request", true);
            startActivityForResult(intent, 5);
        }
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    private void h()
    {
        (new ae(this)).execute(new Void[] {
            null, null, null
        });
    }

    private void i()
    {
label0:
        {
            if (!com.wf.wellsfargomobile.WFApp.d())
            {
                if (!com.wf.wellsfargomobile.hcewallet.d.i.isUserEligibleForHCEWallet(getApplicationContext()))
                {
                    break label0;
                }
                v.setVisibility(0);
            }
            return;
        }
        v.setVisibility(8);
    }

    private void j()
    {
        LogonFragment logonfragment = (LogonFragment)getSupportFragmentManager().findFragmentById(0x7f0f010e);
        if (logonfragment != null)
        {
            logonfragment.a();
        }
    }

    private void k()
    {
        LogonFragment logonfragment = (LogonFragment)getSupportFragmentManager().findFragmentById(0x7f0f010e);
        if (logonfragment != null)
        {
            logonfragment.b();
        }
    }

    private void l()
    {
        if (x) goto _L2; else goto _L1
_L1:
        android.widget.RelativeLayout.LayoutParams layoutparams;
        int i1;
        com.wf.wellsfargomobile.WFApp.d(UUID.randomUUID().toString());
        f.setClickable(true);
        f.setVisibility(0);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            e.setImportantForAccessibility(2);
        }
        j();
        z.a(WFApp.o());
        x = true;
        y.setVisibility(8);
        i1 = getResources().getConfiguration().orientation;
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams.addRule(12);
        layoutparams.topMargin = 0;
        i1;
        JVM INSTR tableswitch 2 2: default 128
    //                   2 153;
           goto _L3 _L4
_L3:
        c.setLayoutParams(layoutparams);
        d();
_L5:
        a(w, x);
        return;
_L4:
        d.setVisibility(8);
        g.setVisibility(8);
        h.setVisibility(8);
          goto _L3
_L2:
        f.setClickable(false);
        f.setVisibility(8);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            e.setImportantForAccessibility(1);
        }
        k();
        z.a();
        com.wf.wellsfargomobile.WFApp.d(null);
        x = false;
        android.widget.RelativeLayout.LayoutParams layoutparams1;
        if (WFApp.U())
        {
            w.setVisibility(0);
        } else
        {
            w.setVisibility(8);
        }
        y.setVisibility(0);
        layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams1.addRule(10);
        layoutparams1.topMargin = 0;
        c.setLayoutParams(layoutparams1);
        d.setVisibility(0);
        g.setVisibility(0);
        h.setVisibility(0);
        e();
          goto _L5
    }

    public void a(String s1)
    {
        z.b(s1);
        z.a();
        com.wf.wellsfargomobile.WFApp.d(null);
        x = false;
        y.setVisibility(0);
        s1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        s1.addRule(10);
        s1.topMargin = 0;
        c.setLayoutParams(s1);
        d.setVisibility(0);
        g.setVisibility(0);
        h.setVisibility(0);
        e();
        a(w, x);
        w.setVisibility(8);
        f.setVisibility(8);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            e.setImportantForAccessibility(1);
        }
        k();
        WFApp.V();
    }

    public void a(String s1, String s2)
    {
        a(s1, s2, 0x7f0200f9);
    }

    public void a(String s1, String s2, int i1)
    {
        if (s2 != null)
        {
            b(s1, s2, i1).show(getSupportFragmentManager(), "MessageDialogFragment");
        }
    }

    public void a(String s1, String s2, int i1, String s3)
    {
        if (s2 != null)
        {
            b(s1, s2, i1).show(getSupportFragmentManager(), s3);
        }
    }

    public void a(String s1, String s2, String s3, int i1)
    {
        if (s2 != null)
        {
            b(s1, s2, s3, i1).show(getSupportFragmentManager(), "MessageDialogFragment");
        }
    }

    protected DialogFragment b(String s1, String s2, int i1)
    {
        return b(s1, s2, null, i1);
    }

    protected DialogFragment b(String s1, String s2, String s3, int i1)
    {
        ai ai1 = new ai();
        Bundle bundle = new Bundle();
        bundle.putInt("DIALOG_ICON", i1);
        bundle.putString("DIALOG_TITLE", s1);
        bundle.putString("DIALOG_MESSAGE", s2);
        if (s3 != null)
        {
            bundle.putString("DIALOG_POSITIVE_BUTTON_TEXT", s3);
        }
        ai1.setArguments(bundle);
        return ai1;
    }

    public void b(String s1)
    {
        Intent intent = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
        intent.putExtra("unauth_browse", true);
        intent.putExtra("unauth_browse_goto", s1);
        startActivityForResult(intent, 5);
    }

    public boolean b()
    {
        return u;
    }

    public ProgressDialog c()
    {
        return k;
    }

    public void c(String s1)
    {
        e e1 = new e();
        Bundle bundle = new Bundle();
        bundle.putString("DIALOG_MESSAGE", getString(0x7f0800db));
        bundle.putString("callBackFunctionName", s1);
        e1.setArguments(bundle);
        e1.show(getSupportFragmentManager(), "DisableMessageDialogFragment");
    }

    public void d()
    {
        c.setScrollingEnabled(false);
        c.fullScroll(33);
        w.requestFocus();
    }

    public void d(String s1)
    {
        if (s1 != null && !s1.trim().isEmpty())
        {
            a(s1);
        }
    }

    public void e()
    {
        c.setScrollingEnabled(true);
    }

    public void hideKeyboard(View view)
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    public void logToJsConsole(String s1)
    {
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 6 10: default 36
    //                   6 80
    //                   7 72
    //                   8 36
    //                   9 205
    //                   10 72;
           goto _L1 _L2 _L3 _L1 _L4 _L3
_L1:
        j1;
        JVM INSTR lookupswitch 3: default 72
    //                   1: 235
    //                   26: 291
    //                   27: 335;
           goto _L3 _L5 _L6 _L7
_L3:
        super.onActivityResult(i1, j1, intent);
        return;
_L2:
        if (j1 == 1)
        {
            Object obj;
            Object obj1;
            String s1;
            int k1;
            if (com.wf.wellsfargomobile.WFApp.d())
            {
                ((SignOnFragment)getSupportFragmentManager().findFragmentById(0x7f0f011c)).a().setEnabled(true);
            } else
            {
                ((LogonFragment)getSupportFragmentManager().findFragmentById(0x7f0f010e)).c().setEnabled(true);
            }
            obj1 = intent.getExtras();
            s1 = ((Bundle) (obj1)).getString("error_msg");
            if (((Bundle) (obj1)).containsKey("error_title"))
            {
                obj = ((Bundle) (obj1)).getString("error_title");
            } else
            {
                obj = null;
            }
            if (((Bundle) (obj1)).containsKey("message_type"))
            {
                k1 = ((Bundle) (obj1)).getInt("message_type");
            } else
            {
                k1 = 0x7f0200f9;
            }
            a(((String) (obj)), s1, k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (com.google.android.gms.common.d.a(this) == 0)
        {
            com.wf.wellsfargomobile.WFApp.b(true);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            com.wf.wellsfargomobile.WFApp.b(false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.wf.wellsfargomobile.WFApp.b(false);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        obj = intent.getStringExtra("error_title");
        obj1 = intent.getStringExtra("error_msg");
        k1 = intent.getIntExtra("message_type", 0x7f0200f9);
        m = true;
        n = ((String) (obj));
        o = ((String) (obj1));
        p = k1;
        continue; /* Loop/switch isn't completed */
_L6:
        com.wf.wellsfargomobile.WFApp.d(null);
        WFApp.A();
        m = true;
        n = getString(0x7f08011c);
        o = getString(0x7f08011b);
        p = 0x7f0200fb;
        continue; /* Loop/switch isn't completed */
_L7:
        com.wf.wellsfargomobile.WFApp.d(null);
        WFApp.A();
        m = true;
        n = getString(0x7f080120);
        o = getString(0x7f08011f);
        p = 0x7f0200fb;
        if (true) goto _L3; else goto _L8
_L8:
    }

    public void onBackPressed()
    {
        if (!u)
        {
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        WFApp.ac();
        if (isTaskRoot()) goto _L2; else goto _L1
_L1:
        Intent intent;
        String s1;
        intent = getIntent();
        s1 = intent.getAction();
        if (!intent.hasCategory("android.intent.category.LAUNCHER") || s1 == null || !s1.equals("android.intent.action.MAIN")) goto _L2; else goto _L3
_L3:
        finish();
_L7:
        return;
_L2:
        int i1;
        if (a != null)
        {
            b b1 = new b(-1, -1);
            View view = getLayoutInflater().inflate(0x7f04001c, null);
            a.a(view, b1);
        }
        setContentView(0x7f040064);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            i1 = android.provider.Settings.System.getInt(getContentResolver(), "always_finish_activities", 0);
        } else
        {
            i1 = android.provider.Settings.System.getInt(getContentResolver(), "always_finish_activities", 0);
        }
        if (i1 == 1)
        {
            Log.w("MainActivity", "Always finish activities is turned on, tell the user to turn it off");
            if (bundle == null)
            {
                bundle = new com.wf.wellsfargomobile.util.i();
                Bundle bundle1 = new Bundle();
                bundle1.putInt("DIALOG_ICON", 0x7f0200fe);
                bundle1.putString("DIALOG_TITLE", getString(0x7f08004f));
                bundle1.putString("DIALOG_MESSAGE", getString(0x7f08004e));
                bundle.setArguments(bundle1);
                bundle.show(getSupportFragmentManager(), "FinishActivitesMessageDialogFragment");
            }
        }
        k = new s(this);
        k.setCancelable(false);
        k.setCanceledOnTouchOutside(false);
        k.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            if (getPackageManager().hasSystemFeature("android.hardware.camera.front") && Camera.getNumberOfCameras() == 1)
            {
                com.wf.wellsfargomobile.WFApp.b(t.b);
            } else
            if (getPackageManager().hasSystemFeature("android.hardware.camera"))
            {
                com.wf.wellsfargomobile.WFApp.b(t.a);
            } else
            {
                com.wf.wellsfargomobile.WFApp.b(t.b);
            }
        } else
        if (getPackageManager().hasSystemFeature("android.hardware.camera"))
        {
            com.wf.wellsfargomobile.WFApp.b(t.a);
        } else
        {
            com.wf.wellsfargomobile.WFApp.b(t.b);
        }
        if (com.wf.wellsfargomobile.WFApp.d())
        {
            j = Typeface.createFromAsset(getAssets(), "fonts/02534_ArialFett2.ttf");
            bundle = (Button)findViewById(0x7f0f011e);
            Button button = (Button)findViewById(0x7f0f011f);
            Button button1 = (Button)findViewById(0x7f0f0120);
            Button button2 = (Button)findViewById(0x7f0f0121);
            bundle.setTypeface(j);
            button.setTypeface(j);
            button1.setTypeface(j);
            button2.setTypeface(j);
            f();
        } else
        {
            bundle = (LogonFragment)getSupportFragmentManager().findFragmentById(0x7f0f010e);
            if (bundle != null)
            {
                bundle.b("login_request");
            }
            t = (DrawerLayout)findViewById(0x7f0f0112);
            t.setDrawerShadow(0x7f020154, 0x800003);
            bundle = new y(this, this, t, 0x7f0200fc, 0x7f080051, 0x7f080050);
            t.setDrawerListener(bundle);
            v = (Button)findViewById(0x7f0f0117);
            v.setOnClickListener(A);
            if (com.wf.wellsfargomobile.hcewallet.d.i.readOldWalletValueFromSharedPref(this) != null)
            {
                com.wf.wellsfargomobile.hcewallet.d.i.writeToOldWalletSharedPref(this, null);
            }
            c = (LockableScrollView)findViewById(0x7f0f0113);
            e = (LinearLayout)findViewById(0x7f0f00c2);
            f = (LinearLayout)findViewById(0x7f0f00ce);
            f.setClickable(false);
            f.setOnClickListener(new z(this));
            d = (RelativeLayout)findViewById(0x7f0f00c5);
            g = (RelativeLayout)findViewById(0x7f0f00c7);
            h = (RelativeLayout)findViewById(0x7f0f00ca);
            w = (ImageView)findViewById(0x7f0f0115);
            y = (LinearLayout)findViewById(0x7f0f0116);
            if (WFApp.U())
            {
                w.setVisibility(0);
            } else
            {
                w.setVisibility(8);
            }
            bundle = (e)getSupportFragmentManager().findFragmentByTag("DisableMessageDialogFragment");
            if (bundle != null)
            {
                bundle.dismiss();
            }
            bundle = (ai)getSupportFragmentManager().findFragmentByTag("NetworkErrorFastLookDialogFragment");
            if (bundle != null)
            {
                bundle.dismiss();
            }
            z = (QuickBalanceWebViewFragment)getSupportFragmentManager().findFragmentById(0x7f0f0119);
            i = new GestureDetectorCompat(this, new ah(this));
            w.setOnTouchListener(new aa(this));
            b = (RelativeLayout)findViewById(0x7f0f0082);
            b.setVisibility(0);
            b.setOnTouchListener(new ab(this));
        }
        ((RelativeLayout)findViewById(0x7f0f0114)).setOnTouchListener(new ac(this));
        l = (ImageView)findViewById(0x7f0f011b);
        try
        {
            i1 = com.google.android.gms.common.d.a(this);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.wf.wellsfargomobile.WFApp.b(false);
            return;
        }
        if (i1 != 0) goto _L5; else goto _L4
_L4:
        com.wf.wellsfargomobile.WFApp.b(true);
_L11:
        if (!WFApp.q()) goto _L7; else goto _L6
_L6:
        s = com.wf.wellsfargomobile.a.a.m();
        if (s == null) goto _L7; else goto _L8
_L8:
        q = com.google.android.gms.gcm.b.a(this);
        r = a(this);
        if (!r.isEmpty()) goto _L7; else goto _L9
_L9:
        h();
        return;
_L5:
        com.wf.wellsfargomobile.WFApp.b(false);
        if (!com.google.android.gms.common.d.b(i1)) goto _L11; else goto _L10
_L10:
        i1;
        JVM INSTR tableswitch 1 3: default 1176
    //                   1 1036
    //                   2 1162
    //                   3 1162;
           goto _L11 _L12 _L13 _L13
_L12:
        if ("amazon".equals(Build.BRAND.toLowerCase(new Locale("en", "us"))) || "amazon".equals(Build.MANUFACTURER.toLowerCase(new Locale("en", "us"))) || "kindle fire".equals(Build.MODEL.toLowerCase(new Locale("en", "us"))) || "kindle fire".equals(Build.PRODUCT.toLowerCase(new Locale("en", "us")))) goto _L11; else goto _L14
_L14:
        com.google.android.gms.common.d.a(i1, this, 9).show();
          goto _L11
_L13:
        com.google.android.gms.common.d.a(i1, this, 9).show();
          goto _L11
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (!com.wf.wellsfargomobile.WFApp.d()) goto _L2; else goto _L1
_L1:
        getMenuInflater().inflate(0x7f100000, menu);
        menu = menu.findItem(0x7f0f0124);
        if (menu == null || android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L3
_L3:
        menu = (Button)menu.getActionView().findViewById(0x7f0f0065);
        menu.setTypeface(j);
        com.wf.wellsfargomobile.ag.a[WFApp.R().ordinal()];
        JVM INSTR tableswitch 2 2: default 92
    //                   2 116;
           goto _L4 _L5
_L4:
        menu.setCompoundDrawablesWithIntrinsicBounds(0x7f02015c, 0, 0, 0);
_L7:
        menu.setOnClickListener(new ad(this));
_L2:
        return true;
_L5:
        menu.setCompoundDrawablesWithIntrinsicBounds(0x7f02015d, 0, 0, 0);
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onDestroy()
    {
        super.onDestroy();
        WFApp.o = false;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0f0124)
        {
            g();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onPostResume()
    {
        super.onPostResume();
        if (m)
        {
            m = false;
            a(n, o, p);
        }
        if (x && z != null && !z.b())
        {
            x = false;
            l();
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        boolean flag = bundle.getBoolean("PROGRESS_DIALOG_SHOW");
        x = bundle.getBoolean("QuickBalanceOpen", false);
        if (flag)
        {
            k.show();
        }
    }

    public void onResume()
    {
        Object obj;
        super.onResume();
        obj = (ImageView)findViewById(0x7f0f0061);
        ImageView imageview = (ImageView)findViewById(0x7f0f0063);
        com.wf.wellsfargomobile.WFApp.a(this, ((ImageView) (obj)), (ImageView)findViewById(0x7f0f0064), imageview, null, (LinearLayout)findViewById(0x7f0f0108), (Button)findViewById(0x7f0f00cd));
        if (com.wf.wellsfargomobile.util.d.d.equals(WFApp.R()) && !com.wf.wellsfargomobile.WFApp.d())
        {
            ((ImageView) (obj)).setImageResource(0x7f02013d);
        }
        com.wf.wellsfargomobile.WFApp.a((ImageView)findViewById(0x7f0f00bd));
        obj = (TextView)findViewById(0x7f0f00a2);
        if (obj != null)
        {
            switch (com.wf.wellsfargomobile.ag.a[WFApp.R().ordinal()])
            {
            default:
                ((TextView) (obj)).setText(getString(0x7f080043, new Object[] {
                    Integer.valueOf(Calendar.getInstance().get(1))
                }));
                break;

            case 1: // '\001'
                break MISSING_BLOCK_LABEL_187;
            }
        }
_L1:
        if (com.wf.wellsfargomobile.WFApp.d())
        {
            f();
        } else
        {
            i();
            a(w, x);
        }
        WFApp.o = true;
        return;
        ((TextView) (obj)).setText(getString(0x7f080044, new Object[] {
            Integer.valueOf(Calendar.getInstance().get(1))
        }));
          goto _L1
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (k.isShowing())
        {
            bundle.putBoolean("PROGRESS_DIALOG_SHOW", true);
        }
        bundle.putBoolean("QuickBalanceOpen", x);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        (new com.wf.wellsfargomobile.locations.b()).execute(new Context[] {
            this
        });
    }

    protected void onStop()
    {
        super.onStop();
    }

    public void showFullSite(View view)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.wf.wellsfargomobile.a.a.e())));
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void showInfo(View view)
    {
        startActivity(new Intent(this, com/wf/wellsfargomobile/notices/InfoActivity));
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void showPrivacyPolicy(View view)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.wf.wellsfargomobile.a.a.q())));
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void showQuickGuide(View view)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.wf.wellsfargomobile.a.a.r())));
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void showSecurityGuarantee(View view)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.wf.wellsfargomobile.a.a.p())));
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void showUsernamePasswordHelp(View view)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f080179))));
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }

    public void signOn(View view)
    {
        SignOnFragment signonfragment = (SignOnFragment)getSupportFragmentManager().findFragmentById(0x7f0f011c);
        if (signonfragment != null)
        {
            signonfragment.signOn(view);
        }
    }

    public void toggleSlidingMenu(View view)
    {
        Object obj = (SlidingMenuWebViewFragment)getSupportFragmentManager().findFragmentById(0x7f0f011a);
        if (obj != null)
        {
            obj = ((SlidingMenuWebViewFragment) (obj)).getView();
            if (obj != null)
            {
                if (t.isDrawerOpen(((View) (obj))))
                {
                    t.closeDrawer(((View) (obj)));
                } else
                {
                    t.openDrawer(((View) (obj)));
                }
            }
        }
        hideKeyboard(view);
    }
}
