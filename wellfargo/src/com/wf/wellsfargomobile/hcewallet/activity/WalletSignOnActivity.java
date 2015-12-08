// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.LogonFragment;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;
import com.wf.wellsfargomobile.ai;
import com.wf.wellsfargomobile.x;
import java.util.Calendar;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletActivity, n

public class WalletSignOnActivity extends WalletActivity
    implements x
{

    public WalletSignOnActivity()
    {
    }

    protected DialogFragment a(String s, String s1, String s2, int i)
    {
        ai ai1 = new ai();
        Bundle bundle = new Bundle();
        bundle.putInt("DIALOG_ICON", i);
        bundle.putString("DIALOG_TITLE", s);
        bundle.putString("DIALOG_MESSAGE", s1);
        if (s2 != null)
        {
            bundle.putString("DIALOG_POSITIVE_BUTTON_TEXT", s2);
        }
        ai1.setArguments(bundle);
        return ai1;
    }

    protected void a()
    {
        super.a();
        int i = 0x7f04002b;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04002c;
        }
        View view = getLayoutInflater().inflate(i, null);
        TextView textview = (TextView)view.findViewById(0x7f0f0086);
        LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0f0087);
        textview.setVisibility(8);
        linearlayout.setOnClickListener(new n(this));
        a.a(view);
    }

    public void a(String s, String s1)
    {
        if (s1 != null)
        {
            a(s, s1, null, 0x7f0200fb).show(getSupportFragmentManager(), "MessageDialogFragment");
        }
    }

    void b(String s, String s1)
    {
        a(s, s1);
    }

    public void hideKeyboard(View view)
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        Bundle bundle = null;
        super.onActivityResult(i, j, intent);
        if (i == 5 && j == 1)
        {
            ((LogonFragment)getSupportFragmentManager().findFragmentById(0x7f0f010e)).c().setEnabled(true);
            bundle = intent.getExtras();
            if (bundle.containsKey("error_title"))
            {
                intent = bundle.getString("error_title");
            } else
            {
                intent = null;
            }
            WFApp.O();
            b(intent, bundle.getString("error_msg"));
            return;
        }
        if (j == 28)
        {
            setResult(j);
            finish();
            return;
        }
        if (j == 5)
        {
            intent = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            intent.putExtra("webatmloc_request", true);
            startActivityForResult(intent, 5);
            return;
        }
        if (j == 0)
        {
            finish();
            return;
        }
        Bundle bundle1 = intent.getExtras();
        intent = bundle;
        if (bundle1.containsKey("error_title"))
        {
            intent = bundle1.getString("error_title");
        }
        WFApp.O();
        b(intent, bundle1.getString("error_msg"));
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04005b);
        bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("cvid"))
        {
            bundle = bundle.getString("cvid");
            LogonFragment logonfragment = (LogonFragment)getSupportFragmentManager().findFragmentById(0x7f0f010e);
            logonfragment.a(bundle);
            logonfragment.b("wallet_login_request");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
        WFApp.a((ImageView)findViewById(0x7f0f00bd));
        ((TextView)findViewById(0x7f0f00a2)).setText(getString(0x7f080043, new Object[] {
            Integer.valueOf(Calendar.getInstance().get(1))
        }));
    }
}
