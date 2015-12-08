// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.BarcodeActionController;
import com.walmart.android.service.wishlist.AddBundle;
import com.walmart.android.service.wishlist.AddItemBase;
import com.walmart.android.service.wishlist.AddItemFactory;
import com.walmartlabs.ui.FragmentSwitcher;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseListActivity, ListCreatorFragment

public class ListCreatorActivity extends BaseListActivity
{
    private static class ActivityResult
    {

        private final Intent data;
        private final int requestCode;
        private final int resultCode;




        private ActivityResult(int i, int j, Intent intent)
        {
            requestCode = i;
            resultCode = j;
            data = intent;
        }

    }


    static final String EXTRAS_ADDED_BUNDLE = "ADDED_BUNDLE";
    static final String EXTRAS_ADDED_ITEM = "ADDED_ITEM";
    static final String EXTRAS_LIST_ID = "LIST_ID";
    private static final String STATE_DYNAMIC_ARGS = "DYNAMIC_ARGS";
    private ActivityResult mPendingActivityResult;

    public ListCreatorActivity()
    {
    }

    private static void launch(Activity activity, Bundle bundle)
    {
        Intent intent = new Intent(activity, com/walmart/android/app/wishlist/ListCreatorActivity);
        intent.addFlags(0x20000);
        intent.putExtra("DYNAMIC_ARGS", bundle);
        activity.startActivity(intent);
        activity.overridePendingTransition(0x7f05002c, 0x7f050033);
    }

    public static void launch(Activity activity, AddBundle addbundle)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ADDED_BUNDLE", addbundle);
        launch(activity, bundle);
    }

    public static void launch(Activity activity, AddItemBase additembase)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ADDED_ITEM", new AddItemFactory(additembase));
        launch(activity, bundle);
    }

    public static void launch(Activity activity, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("LIST_ID", s);
        launch(activity, bundle);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        mPendingActivityResult = new ActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        }
        DrawerLayout drawerlayout;
        if (bundle != null)
        {
            bundle = bundle.getBundle("DYNAMIC_ARGS");
        } else
        {
            bundle = getIntent().getBundleExtra("DYNAMIC_ARGS");
        }
        drawerlayout = (DrawerLayout)findViewById(0x7f100208);
        if (drawerlayout != null)
        {
            drawerlayout.setDrawerLockMode(1);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        switchToFragment(com/walmart/android/app/wishlist/ListCreatorFragment, bundle, false);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        Bundle bundle = null;
        if (intent != null)
        {
            bundle = intent.getBundleExtra("DYNAMIC_ARGS");
        }
        switchToFragment(com/walmart/android/app/wishlist/ListCreatorFragment, bundle, false);
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

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (mPendingActivityResult == null) goto _L2; else goto _L1
_L1:
        if (mPendingActivityResult.requestCode != 1001) goto _L4; else goto _L3
_L3:
        (new BarcodeActionController(this)).onScanResult(mPendingActivityResult.resultCode, mPendingActivityResult.data);
_L6:
        mPendingActivityResult = null;
_L2:
        return;
_L4:
        com.walmartlabs.ui.PresenterFragment presenterfragment = mFragmentSwitcher.getTopFragment();
        if (presenterfragment != null)
        {
            presenterfragment.onActivityResult(mPendingActivityResult.requestCode, mPendingActivityResult.resultCode, mPendingActivityResult.data);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
