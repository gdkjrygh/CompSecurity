// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.shop.ShelfGridPresenter;
import com.walmart.android.app.shop.ShelfUtils;
import com.walmart.android.app.shop.SplitScreenShelfGridPresenter;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase, TaxonomyWithItemsListPresenter

public class SplittableBreadcrumbTaxonomyPresenter extends BreadcrumbTaxonomyPresenterBase
{

    private Activity mActivity;
    private ListView mListView;
    private ViewGroup mRootView;
    private PresenterStack mStack;
    private TaxonomyWithItemsListPresenter mTaxonomyWithItemsListPresenter;
    private ViewStackLayout mViewStackLayout;

    public SplittableBreadcrumbTaxonomyPresenter(Activity activity, int i)
    {
        super(activity, i);
        mActivity = activity;
    }

    private boolean canPushShelfToTaxonomy()
    {
        return ShelfUtils.isEnoughWidthForSplitScreen(ViewUtil.getScreenMinDimension(mActivity), mActivity.getResources());
    }

    private boolean canShowSplitTaxonomy()
    {
        return ShelfUtils.isEnoughWidthForSplitScreen(ViewUtil.getScreenWidth(mActivity), mActivity.getResources());
    }

    private boolean isShowingSplitTaxonomy()
    {
        return mViewStackLayout.getVisibility() == 0;
    }

    private void setupTaxonomyLayout()
    {
        boolean flag = canShowSplitTaxonomy();
        int j = mActivity.getResources().getDimensionPixelSize(0x7f0a00ab);
        Object obj = mViewStackLayout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ViewStackLayout) (obj)).setVisibility(i);
        obj = mListView.getLayoutParams();
        if (flag)
        {
            i = j;
        } else
        {
            i = -1;
        }
        obj.width = i;
    }

    public View getView()
    {
        return mRootView;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (mStack.getCount() > 0)
        {
            mStack.peek().onActivityResultAsTop(i, j, intent);
            return;
        } else
        {
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        mStack.onConfigurationChanged(configuration);
        setupTaxonomyLayout();
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        if (mStack.getCount() > 0)
        {
            return mStack.peek().onCreateMenu(menu, menuinflater);
        } else
        {
            return super.onCreateMenu(menu, menuinflater);
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(viewgroup.getContext(), 0x7f0401b1, viewgroup);
            mListView = (ListView)ViewUtil.findViewById(mRootView, 0x7f1005cb);
            viewgroup = mRootView.findViewById(0x7f100545);
            init(mRootView, mListView, viewgroup);
            mViewStackLayout = (ViewStackLayout)ViewUtil.findViewById(mRootView, 0x7f1005cc);
            mStack = new PresenterStack(mViewStackLayout);
            mStack.setListener(new com.walmart.android.ui.PresenterStack.Listener() {

                final SplittableBreadcrumbTaxonomyPresenter this$0;

                public boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1)
                {
                    return false;
                }

                public void onPresenterPopped(Presenter presenter)
                {
                    ((AppCompatActivity)mActivity).supportInvalidateOptionsMenu();
                }

                public void onPresenterPushed(Presenter presenter)
                {
                    ((AppCompatActivity)mActivity).supportInvalidateOptionsMenu();
                }

                public void onPresenterTitleUpdated(Presenter presenter)
                {
                }

            
            {
                this$0 = SplittableBreadcrumbTaxonomyPresenter.this;
                super();
            }
            });
            setupTaxonomyLayout();
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        if (mStack.getCount() > 0)
        {
            return mStack.peek().onOptionsMenuItemSelected(menuitem, activity);
        } else
        {
            return super.onOptionsMenuItemSelected(menuitem, activity);
        }
    }

    protected void onTaxonomyLoaded(TaxonomyItem taxonomyitem)
    {
        super.onTaxonomyLoaded(taxonomyitem);
        if (mTaxonomyWithItemsListPresenter != null)
        {
            mTaxonomyWithItemsListPresenter.setTaxonomy(taxonomyitem);
        }
    }

    protected void onTaxonomyPop()
    {
        super.onTaxonomyPop();
        mStack.popPresenter(isShowingSplitTaxonomy());
    }

    protected void onTaxonomyPush(TaxonomyItem taxonomyitem)
    {
        super.onTaxonomyPush(taxonomyitem);
        if (taxonomyitem.browseToken == null)
        {
            mTaxonomyWithItemsListPresenter = new TaxonomyWithItemsListPresenter(mActivity);
            boolean flag;
            if (isShowingSplitTaxonomy() && mStack.getCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mStack.pushPresenter(mTaxonomyWithItemsListPresenter, flag);
            mTaxonomyWithItemsListPresenter.setOnItemClickedListener(new TaxonomyWithItemsListAdapter.OnItemClickedListener() {

                final SplittableBreadcrumbTaxonomyPresenter this$0;

                public void onItemClicked(com.walmart.android.data.StoreQueryResult.Item item)
                {
                    pushPresenter(new ItemDetailsPresenter(mActivity, item.getiD()));
                }

            
            {
                this$0 = SplittableBreadcrumbTaxonomyPresenter.this;
                super();
            }
            });
        }
    }

    protected void pushShelfPresenter(TaxonomyItem taxonomyitem)
    {
        if (canPushShelfToTaxonomy())
        {
            SplitScreenShelfGridPresenter splitscreenshelfgridpresenter = new SplitScreenShelfGridPresenter(mActivity, taxonomyitem.browseToken);
            splitscreenshelfgridpresenter.setTitleText(taxonomyitem.name);
            mStack.pushPresenter(splitscreenshelfgridpresenter, true);
            splitscreenshelfgridpresenter.setPushNewPresentersTo(getPresenterStack());
            return;
        } else
        {
            super.pushShelfPresenter(taxonomyitem);
            return;
        }
    }

    protected boolean shouldVisitLeafItems()
    {
        return canPushShelfToTaxonomy();
    }


}
