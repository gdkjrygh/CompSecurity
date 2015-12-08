// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.fragments.WalmartPresenterFragment;
import com.walmart.android.service.wishlist.AddBundle;
import com.walmart.android.service.wishlist.AddItemFactory;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SelectListPresenter, ListCreatorPresenter

public class ListCreatorFragment extends WalmartPresenterFragment
{

    private static final String TAG = com/walmart/android/app/wishlist/ListCreatorFragment.getSimpleName();

    public ListCreatorFragment()
    {
    }

    private Presenter createPresenter(Bundle bundle)
    {
        Object obj = null;
        String s = bundle.getString("LIST_ID");
        AddItemFactory additemfactory = (AddItemFactory)bundle.getParcelable("ADDED_ITEM");
        bundle = (AddBundle)bundle.getParcelable("ADDED_BUNDLE");
        if (additemfactory != null)
        {
            bundle = additemfactory.getItem();
            bundle = new SelectListPresenter((AppCompatActivity)getActivity(), bundle);
        } else
        {
            if (bundle != null)
            {
                return new SelectListPresenter((AppCompatActivity)getActivity(), bundle);
            }
            bundle = obj;
            if (s != null)
            {
                return new ListCreatorPresenter((AppCompatActivity)getActivity(), s, null);
            }
        }
        return bundle;
    }

    public void onAttach(Activity activity)
    {
        WLog.d(TAG, "onAttach()");
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        WLog.d(TAG, "onCreate()");
        super.onCreate(bundle);
    }

    public Presenter onCreatePresenter()
    {
        Presenter presenter = null;
        Bundle bundle = getDynamicArguments();
        if (bundle != null)
        {
            presenter = createPresenter(bundle);
            setDynamicArguments(null);
        }
        return presenter;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        WLog.d(TAG, "onCreateView()");
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDetach()
    {
        WLog.d(TAG, "onDetach()");
        super.onDetach();
    }

    public void onRestart()
    {
        WLog.d(TAG, "onRestart()");
    }

    public void onResume()
    {
        WLog.d(TAG, "onResume()");
        Object obj = getDynamicArguments();
        if (obj != null)
        {
            obj = createPresenter(((Bundle) (obj)));
            mPresenterStack.pushPresenter(((Presenter) (obj)), false);
            setDynamicArguments(null);
        }
        super.onResume();
    }

}
