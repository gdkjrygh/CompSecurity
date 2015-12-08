// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import com.walmart.android.app.wishlist.DeepLinkActivity;
import com.walmart.android.app.wishlist.LandingPagePresenter;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class WishListFragment extends WalmartPresenterFragment
{

    private static final String TAG = com/walmart/android/fragments/WishListFragment.getSimpleName();

    public WishListFragment()
    {
    }

    private void handleDynamicArguments(Bundle bundle)
    {
        bundle = bundle.getString("wishlist_id", null);
        if (!TextUtils.isEmpty(bundle))
        {
            Intent intent = new Intent(getActivity(), com/walmart/android/app/wishlist/DeepLinkActivity);
            intent.addFlags(0x20000);
            intent.putExtra("wishlist_id", bundle);
            startActivity(intent);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        WLog.d(TAG, "onActivityResult()");
        super.onActivityResult(i, j, intent);
    }

    public boolean onBackPressed()
    {
        WLog.d(TAG, "onBackPressed()");
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        WLog.d(TAG, "onCreate()");
        super.onCreate(bundle);
    }

    public Presenter onCreatePresenter()
    {
        return new LandingPagePresenter((AppCompatActivity)getActivity());
    }

    public void onPause()
    {
        WLog.d(TAG, "onPause()");
        super.onPause();
    }

    public void onRestart()
    {
        WLog.d(TAG, "onRestart()");
        super.onRestart();
    }

    public void onResume()
    {
        WLog.d(TAG, "onResume()");
        super.onResume();
        Bundle bundle = getDynamicArguments();
        if (bundle != null)
        {
            handleDynamicArguments(bundle);
            setDynamicArguments(null);
        }
    }

    public void onStop()
    {
        WLog.d(TAG, "onStop()");
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        WLog.d(TAG, "onViewCreated()");
        super.onViewCreated(view, bundle);
    }

}
