// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.walmart.android.app.main.AppState;
import com.walmartlabs.ui.PresenterFragment;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseListActivity, FindListFragment

public class FindListActivity extends BaseListActivity
{

    private static final String STATE_DYNAMIC_ARGS = "DYNAMIC_ARGS";
    private static final String TAG = com/walmart/android/app/wishlist/FindListActivity.getSimpleName();
    private Bundle mDynamicArg;
    private FragmentManager mFragmentManager;

    public FindListActivity()
    {
    }

    protected void handleIntent(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getExtras();
        } else
        {
            intent = null;
        }
        mDynamicArg = intent;
        switchToFragment(com/walmart/android/app/wishlist/FindListFragment, mDynamicArg, false);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        PresenterFragment presenterfragment = (PresenterFragment)mFragmentManager.findFragmentById(0x7f100209);
        if (presenterfragment != null)
        {
            presenterfragment.onActivityResult(i, j, intent);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate()");
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        }
        mFragmentManager = getSupportFragmentManager();
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

    protected void onNewIntent(Intent intent)
    {
        WLog.v(TAG, "onNewIntent()");
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

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mDynamicArg != null)
        {
            bundle.putBundle("DYNAMIC_ARGS", mDynamicArg);
        }
    }

}
