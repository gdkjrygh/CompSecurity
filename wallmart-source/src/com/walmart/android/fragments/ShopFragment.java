// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.app.shop.SearchResultPresenter;
import com.walmart.android.app.shop.ShelfGridPresenter;
import com.walmart.android.app.shop.ShelfListPresenter;
import com.walmart.android.app.shop.ShelfUtils;
import com.walmart.android.app.shop.ShopSearchEvent;
import com.walmart.android.app.shop.taxonomy.BreadcrumbTaxonomyPresenter;
import com.walmart.android.app.shop.taxonomy.SplittableBreadcrumbTaxonomyPresenter;
import com.walmart.android.app.storelocator.WalmartStoreModeManager;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class ShopFragment extends WalmartPresenterFragment
{

    private static final String TAG = com/walmart/android/fragments/ShopFragment.getSimpleName();
    private HashMap mDepartmentLookupTable;
    private int mSelectedSearchTab;

    public ShopFragment()
    {
    }

    private Presenter handleBrowseIntent(Bundle bundle)
    {
        Object obj = null;
        String s = getActivity().getString(0x7f090572);
        String s1 = bundle.getString("browse_token");
        if (s1 != null)
        {
            if (getResources().getBoolean(0x7f0c0003))
            {
                obj = new ShelfGridPresenter(getActivity(), s1);
            } else
            {
                obj = new ShelfListPresenter(getActivity(), s1);
            }
            ((Presenter) (obj)).setTitleText(s);
        }
        s1 = bundle.getString("shelf_id");
        if (s1 != null)
        {
            int i;
            if (bundle.containsKey("shelf_title"))
            {
                obj = bundle.getString("shelf_title");
            } else
            {
                obj = s;
            }
            i = bundle.getInt("shelf_max_items", 50);
            if (getActivity().getResources().getBoolean(0x7f0c0003))
            {
                bundle = new ShelfGridPresenter(getActivity(), s1, i);
            } else
            {
                bundle = new ShelfListPresenter(getActivity(), s1, i);
            }
            bundle.setTitleText(((String) (obj)));
            obj = bundle;
        }
        return ((Presenter) (obj));
    }

    private Presenter handleSearchIntent(Bundle bundle)
    {
        Object obj = null;
        String s = bundle.getString("search_query");
        String s1 = bundle.getString("search_barcode");
        if (s != null)
        {
            s1 = bundle.getString("search_department");
            obj = null;
            if (s1 != null)
            {
                obj = (String)mDepartmentLookupTable.get(s1.toLowerCase(Locale.getDefault()));
            }
            obj = new SearchResultPresenter(getActivity(), s, ((String) (obj)), mSelectedSearchTab);
            bundle = bundle.getString("search_type");
            if (!TextUtils.isEmpty(bundle))
            {
                try
                {
                    ((SearchResultPresenter) (obj)).setSearchType(com.walmart.android.search.SearchData.SearchType.valueOf(bundle));
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    WLog.e(TAG, (new StringBuilder()).append("Could not get SearchType from: ").append(bundle).toString());
                }
            }
            ((SearchResultPresenter) (obj)).setOnTabSelectedListener(new com.walmart.android.app.shop.SearchResultPresenter.OnTabSelectedListener() {

                final ShopFragment this$0;

                public void onTabSelected(int i)
                {
                    mSelectedSearchTab = i;
                }

            
            {
                this$0 = ShopFragment.this;
                super();
            }
            });
            ((SearchResultPresenter) (obj)).setTitleText("Search Results");
            bundle = ((Bundle) (obj));
        } else
        {
            bundle = ((Bundle) (obj));
            if (s1 != null)
            {
                bundle = new ShelfListPresenter(getActivity(), new String[] {
                    s1
                });
                bundle.setTitleText("Scan Results");
                return bundle;
            }
        }
        return bundle;
    }

    private void init()
    {
        Bundle bundle = getDynamicArguments();
        Presenter presenter = null;
        String s = null;
        Presenter presenter1;
        if (bundle != null)
        {
            mPresenterStack.popToRootSilent();
            presenter1 = handleSearchIntent(bundle);
            presenter = presenter1;
            if (presenter1 == null)
            {
                presenter = handleBrowseIntent(bundle);
            }
            presenter1 = presenter;
            if (presenter == null)
            {
                s = bundle.getString("start_mode");
                presenter1 = presenter;
            }
        } else
        {
            presenter1 = presenter;
            if (mPresenterStack.peek() == null)
            {
                s = "root";
                presenter1 = presenter;
            }
        }
        if (presenter1 != null)
        {
            mPresenterStack.pushAndReplacePresenter(presenter1, false);
        } else
        if (s != null)
        {
            loadTaxonomy(s);
        }
        setDynamicArguments(null);
    }

    private void initDepartmentLookupTable(Context context)
    {
        mDepartmentLookupTable = new HashMap();
        context = context.getResources().getString(0x7f0900c7);
        ObjectMapper objectmapper = new ObjectMapper();
        try
        {
            mDepartmentLookupTable = (HashMap)objectmapper.readValue(context, new TypeReference() {

                final ShopFragment this$0;

            
            {
                this$0 = ShopFragment.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    private void loadTaxonomy(String s)
    {
        byte byte0;
        if (s.equals("savings_showcase"))
        {
            byte0 = 2;
        } else
        if (s.equals("rollbacks"))
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (ShelfUtils.canUseSplitScreen(getActivity()))
        {
            mPresenterStack.pushAndReplacePresenter(new SplittableBreadcrumbTaxonomyPresenter(getActivity(), byte0), false);
            return;
        } else
        {
            mPresenterStack.pushAndReplacePresenter(new BreadcrumbTaxonomyPresenter(getActivity(), byte0), false);
            return;
        }
    }

    public View getView()
    {
        return super.getView();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public boolean onBackPressed()
    {
        boolean flag = super.onBackPressed();
        if (!flag)
        {
            mPresenterStack.clear();
        }
        return flag;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        initDepartmentLookupTable(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (mFragmentRootView == null)
        {
            mFragmentRootView = layoutinflater.inflate(0x7f040199, viewgroup, false);
        }
        mSelectedSearchTab = 0;
        layoutinflater = WalmartStoreModeManager.create(getActivity()).getStoreModeEvent();
        if (layoutinflater != null && layoutinflater.isInStore())
        {
            mSelectedSearchTab = 1;
        }
        return mFragmentRootView;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onDetach()
    {
        super.onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onRestart()
    {
        init();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onSearchEvent(ShopSearchEvent shopsearchevent)
    {
        shopsearchevent = handleSearchIntent(shopsearchevent.args);
        if (shopsearchevent != null)
        {
            mPresenterStack.popToRootSilent();
            mPresenterStack.pushPresenter(shopsearchevent, false);
        }
    }

    public void onStart()
    {
        super.onStart();
        MessageBus.getBus().register(this);
    }

    public void onStop()
    {
        super.onStop();
        MessageBus.getBus().unregister(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (mPresenterStack == null)
        {
            mViewStackContainer = (ViewStackLayout)ViewUtil.findViewById(mFragmentRootView, 0x7f10013a);
            createPresenterStack();
        }
        init();
    }

    public void popToRoot()
    {
        super.popToRoot();
        loadTaxonomy("root");
    }



/*
    static int access$002(ShopFragment shopfragment, int i)
    {
        shopfragment.mSelectedSearchTab = i;
        return i;
    }

*/
}
