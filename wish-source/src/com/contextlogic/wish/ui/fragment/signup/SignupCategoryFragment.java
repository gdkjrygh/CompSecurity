// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishSignupCategory;
import com.contextlogic.wish.api.service.CategoryUnwishService;
import com.contextlogic.wish.api.service.CategoryWishService;
import com.contextlogic.wish.api.service.GetSignupCategoriesService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewListener;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryGridCellView, SignupCategoryAdapter

public class SignupCategoryFragment extends BaseContentFragment
    implements StaggeredGridViewListener, SignupCategoryGridCellView.SignupCategoryCellFragment
{

    public static final String ARG_RETURNING_MODE = "ArgReturningMode";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private ArrayList categories;
    private CategoryUnwishService categoryUnwishService;
    private CategoryWishService categoryWishService;
    private String dataStateStoreKey;
    private View errorView;
    private GetSignupCategoriesService getSignupCategoryService;
    private SignupCategoryAdapter gridAdapter;
    private StaggeredGridView gridView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private View loadingView;
    private View nextButton;
    private View nextButtonContainer;
    private int selectedCategoryCount;

    public SignupCategoryFragment()
    {
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601a6));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist)
    {
        loadingComplete = true;
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            WishSignupCategory wishsignupcategory = (WishSignupCategory)arraylist.next();
            categories.add(wishsignupcategory);
            if (wishsignupcategory.isAlreadyWishing())
            {
                selectedCategoryCount = selectedCategoryCount + 1;
            }
        } while (true);
        gridView.scrollTo(0, 0);
        gridView.reloadData();
        arraylist = new FrameLayout(getActivity());
        arraylist.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 80F, getResources().getDisplayMetrics())));
        gridView.addFooterView(arraylist);
        refreshViewState();
    }

    private void handleNext()
    {
        dismissModal();
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIGNUP_CATEGORY_NEXT);
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.GetStarted);
        (new Handler()).post(new Runnable() {

            final SignupCategoryFragment this$0;

            public void run()
            {
                RootActivity rootactivity = (RootActivity)getActivity();
                if (rootactivity != null)
                {
                    rootactivity.setContentFragment(rootactivity.getFirstFeedFragment(false), true);
                }
            }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
        });
    }

    private void hideAllUiElements()
    {
        gridView.setVisibility(8);
        errorView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadFeed()
    {
        loadingErrored = false;
        getSignupCategoryService.requestService(new com.contextlogic.wish.api.service.GetSignupCategoriesService.SuccessCallback() {

            final SignupCategoryFragment this$0;

            public void onServiceSucceeded(ArrayList arraylist)
            {
                postDelayed(arraylist. new Runnable() {

                    final _cls9 this$1;
                    final ArrayList val$items;

                    public void run()
                    {
                        handleLoadingSuccess(items);
                    }

            
            {
                this$1 = final__pcls9;
                items = ArrayList.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final SignupCategoryFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls10 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls10.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
        });
        refreshViewState();
    }

    private void refresh()
    {
        categories.clear();
        selectedCategoryCount = 0;
        gridView.reloadData();
        loadingComplete = false;
        loadFeed();
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (loadingErrored)
        {
            gridView.setVisibility(0);
            errorView.setVisibility(0);
        } else
        {
            if (loadingComplete)
            {
                gridView.setVisibility(0);
                return;
            }
            if (getSignupCategoryService.isPending())
            {
                gridView.setVisibility(0);
                loadingView.setVisibility(0);
                return;
            }
        }
    }

    private void refreshWishStates()
    {
        if (getView() != null)
        {
            SparseArray sparsearray = gridView.getVisibleViews();
            int j = sparsearray.size();
            for (int i = 0; i < j; i++)
            {
                StaggeredGridCellView staggeredgridcellview = (StaggeredGridCellView)sparsearray.valueAt(i);
                if (staggeredgridcellview instanceof SignupCategoryGridCellView)
                {
                    ((SignupCategoryGridCellView)staggeredgridcellview).refreshWishState();
                }
            }

        }
        if (selectedCategoryCount > categoryUnwishService.pendingRequestCount())
        {
            nextButtonContainer.setVisibility(0);
            return;
        } else
        {
            nextButtonContainer.setVisibility(8);
            return;
        }
    }

    private void refreshWishStatesDelayed()
    {
        if (getView() != null)
        {
            getView().post(new Runnable() {

                final SignupCategoryFragment this$0;

                public void run()
                {
                    refreshWishStates();
                }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
            });
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.SignupStepOne;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f0300a0;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_SIGNUP_CATEGORY;
    }

    public void handleResume()
    {
        super.handleResume();
        if (!loadingComplete)
        {
            loadFeed();
        }
        refreshViewState();
    }

    public boolean hideBackButton()
    {
        return true;
    }

    protected void initializeUi(View view)
    {
        gridView = (StaggeredGridView)view.findViewById(0x7f0d0334);
        loadingView = view.findViewById(0x7f0d0331);
        errorView = view.findViewById(0x7f0d0332);
        gridView.setListener(this);
        gridAdapter = new SignupCategoryAdapter(getActivity(), categories, gridView, this);
        gridView.setAdapter(gridAdapter);
        gridView.reloadData();
        nextButtonContainer = view.findViewById(0x7f0d0335);
        nextButtonContainer.setVisibility(8);
        nextButton = view.findViewById(0x7f0d0336);
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupCategoryFragment this$0;

            public void onClick(View view1)
            {
                handleNext();
            }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d0333).setOnClickListener(new android.view.View.OnClickListener() {

            final SignupCategoryFragment this$0;

            public void onClick(View view1)
            {
                refresh();
            }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
        });
        getNavigationBar().setBackButtonEnabled(false);
        getNavigationBar().setTitle(getString(0x7f06047b));
        hideAllUiElements();
    }

    public boolean isWishPending(String s)
    {
        return categoryWishService.isPending(s) || categoryUnwishService.isPending(s);
    }

    public boolean onBackPressed()
    {
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSignupCategoryService = new GetSignupCategoriesService();
        categoryWishService = new CategoryWishService();
        categoryUnwishService = new CategoryUnwishService();
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public boolean onLongClickCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        return false;
    }

    public void onPause()
    {
        super.onPause();
        getSignupCategoryService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && categories.size() > 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(categories, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
        }
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
    }

    public void onSelectCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        staggeredgridcellview = (WishSignupCategory)categories.get(i);
        if (!isWishPending(staggeredgridcellview.getId()))
        {
            if (staggeredgridcellview.isAlreadyWishing())
            {
                unwishForCategory(staggeredgridcellview.getId());
            } else
            {
                wishForCategory(staggeredgridcellview.getId());
            }
            refreshWishStates();
        }
    }

    protected void releaseImages()
    {
        if (gridView != null)
        {
            gridView.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (gridView != null)
        {
            gridView.restoreImages();
        }
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            categories = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            boolean flag;
            if (categories != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loadingComplete = flag;
        }
        if (!loadingComplete)
        {
            categories = new ArrayList();
            loadingComplete = false;
        }
    }

    public void unwishForCategory(String s)
    {
        if (!categoryUnwishService.isPending(s))
        {
            categoryUnwishService.requestService(s, new com.contextlogic.wish.api.service.CategoryUnwishService.SuccessCallback() , new com.contextlogic.wish.api.service.CategoryUnwishService.FailureCallback() {

                final SignupCategoryFragment this$0;

                public void onServiceFailed()
                {
                    refreshWishStatesDelayed();
                }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
            });
            refreshWishStates();
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }

    public void wishForCategory(String s)
    {
        if (!categoryWishService.isPending(s))
        {
            categoryWishService.requestService(s, true, new com.contextlogic.wish.api.service.CategoryWishService.SuccessCallback() , new com.contextlogic.wish.api.service.CategoryWishService.FailureCallback() {

                final SignupCategoryFragment this$0;

                public void onServiceFailed()
                {
                    refreshWishStatesDelayed();
                }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
            });
            refreshWishStates();
        }
    }




/*
    static int access$208(SignupCategoryFragment signupcategoryfragment)
    {
        int i = signupcategoryfragment.selectedCategoryCount;
        signupcategoryfragment.selectedCategoryCount = i + 1;
        return i;
    }

*/


/*
    static int access$210(SignupCategoryFragment signupcategoryfragment)
    {
        int i = signupcategoryfragment.selectedCategoryCount;
        signupcategoryfragment.selectedCategoryCount = i - 1;
        return i;
    }

*/




}
