// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.app.main.WalmartStartActivity;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.EReceiptNotificationUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNotificationUtils, SaverReceiptFragment

public class SaverReceiptActivity extends WalmartStartActivity
{

    private static final int REQUEST_CODE_SIGN_IN = 0;
    public static final String SAVER_SUBMIT_NOW = "SUBMIT_NOW";
    private static final String STATE_DYNAMIC_ARGS = "DYNAMIC_ARGS";
    private static final String TAG = com/walmart/android/app/saver/SaverReceiptActivity.getSimpleName();
    private Bundle mDynamicArg;

    public SaverReceiptActivity()
    {
    }

    protected void handleIntent(Intent intent)
    {
        String s;
        String s1;
        if (intent != null)
        {
            intent = intent.getExtras();
        } else
        {
            intent = null;
        }
        s = EReceiptNotificationUtils.getEReceiptId(intent);
        s1 = SaverNotificationUtils.getReceiptId(intent);
        if ((!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1)) && !Services.get().getAuthentication().hasCredentials())
        {
            mDynamicArg = intent;
            startActivityForResult(SaverUtils.createSignInIntent(this), 0);
            overridePendingTransition(0x7f05002c, 0x7f050033);
            return;
        } else
        {
            switchToFragment(com/walmart/android/app/saver/SaverReceiptFragment, intent, false);
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 0)
            {
                if (j == 1)
                {
                    break label0;
                }
                finish();
            }
            return;
        }
        switchToFragment(com/walmart/android/app/saver/SaverReceiptFragment, mDynamicArg, false);
        mDynamicArg = null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        }
        if (bundle != null)
        {
            mDynamicArg = bundle.getBundle("DYNAMIC_ARGS");
        }
        bundle = (DrawerLayout)findViewById(0x7f100208);
        if (bundle != null)
        {
            bundle.setDrawerLockMode(1);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        handleIntent(getIntent());
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        getSupportActionBar().setTitle(presenterstackupdatedevent.onTop.getTitleText());
        supportInvalidateOptionsMenu();
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mDynamicArg != null)
        {
            bundle.putBundle("DYNAMIC_ARGS", mDynamicArg);
        }
    }

    protected void onStart()
    {
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }

    public void onSwitchFragmentEvent(SwitchFragmentEvent switchfragmentevent)
    {
        Intent intent = new Intent(this, com/walmart/android/app/main/HomeActivity);
        intent.setFlags(0x20000);
        intent.putExtra("reroute", FragmentConfig.getFragmentClass(switchfragmentevent.fragmentName).getName());
        if (switchfragmentevent.arguments != null)
        {
            intent.putExtras(switchfragmentevent.arguments);
        }
        startActivity(intent);
        finish();
    }

}
