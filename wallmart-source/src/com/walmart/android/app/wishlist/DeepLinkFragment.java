// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.fragments.WalmartPresenterFragment;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.wishlist:
//            GiverItemListPresenter

public class DeepLinkFragment extends WalmartPresenterFragment
{

    private static final long DELAY_BEFORE_EXIT = 1000L;
    private static final String TAG = com/walmart/android/app/wishlist/DeepLinkFragment.getSimpleName();
    private Request mInfligthRequest;
    private long mResumeTime;

    public DeepLinkFragment()
    {
    }

    private void loadList()
    {
        String s = getDynamicArguments().getString("wishlist_id", "");
        mInfligthRequest = WishListManager.get().getWishList(s).addCallback(new CallbackSameThread() {

            final DeepLinkFragment this$0;

            public void onResultSameThread(Request request, Result result)
            {
                boolean flag1 = false;
                mInfligthRequest = null;
                if (result.successful() && result.hasData())
                {
                    
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = DeepLinkFragment.this;
                super();
            }
        });
    }

    public void onActivityCreated(Bundle bundle)
    {
        WLog.v(TAG, "onActivityCreated");
        if (mPresenterStack.peek() == null)
        {
            loadList();
        }
        onActivityCreated(bundle);
    }

    public boolean onBackPressed()
    {
        if (System.currentTimeMillis() - mResumeTime < 1000L)
        {
            return true;
        } else
        {
            return onBackPressed();
        }
    }

    public Presenter onCreatePresenter()
    {
        return null;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (mFragmentRootView == null)
        {
            mFragmentRootView = layoutinflater.inflate(0x7f0401df, viewgroup, false);
            mFragmentRootView.setLayoutParams(new LayoutParams(-1, -1));
            mViewStackContainer = (ViewStackLayout)mFragmentRootView.findViewById(0x7f100139);
            mPresenterStack = new PresenterStack(mViewStackContainer);
        }
        return mFragmentRootView;
    }

    public void onDestroy()
    {
        WLog.v(TAG, "onDestroy");
        onDestroy();
        if (mInfligthRequest != null)
        {
            mInfligthRequest.cancel();
            mInfligthRequest = null;
        }
    }

    public void onResume()
    {
        mResumeTime = System.currentTimeMillis();
        WLog.v(TAG, "onResume");
        onResume();
    }



/*
    static Request access$002(DeepLinkFragment deeplinkfragment, Request request)
    {
        deeplinkfragment.mInfligthRequest = request;
        return request;
    }

*/




    // Unreferenced inner class com/walmart/android/app/wishlist/DeepLinkFragment$1$1

/* anonymous class */
    class _cls1
        implements android.content.DialogInterface.OnDismissListener
    {

        final _cls1 this$1;

        public void onDismiss(DialogInterface dialoginterface)
        {
            getActivity().finish();
        }

            
            {
                this$1 = _cls1.this;
                super();
            }
    }

}
