// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.net.LoadProductsTask;
import com.walmartlabs.android.photo.util.DeviceUtils;
import com.walmartlabs.android.photo.util.OrderUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.RefreshTimer;
import com.walmartlabs.android.photo.view.PhotoBaseView;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationSummaryView;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationView;
import com.walmartlabs.android.photo.view.configuration.OverlaidGalleryView;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderAwareFragment, ReviewFragment

public class ConfigurationFragment extends OrderAwareFragment
{

    private static final int SHOW_GALLERY_MIN_HEIGHT_DP = 480;
    private static final String TAG = com/walmartlabs/android/photo/controller/ConfigurationFragment.getSimpleName();
    private PhotoBaseView mBaseView;
    private LoadProductsTask mLoadProductsTask;
    private OrderConfigurationView mMainContentView;
    private com.walmartlabs.android.photo.model.order.PendingOrder.PendingOrderListener mOrderListener;

    public ConfigurationFragment()
    {
    }

    private void doRefresh()
    {
        (new RefreshTimer(500L) {

            final ConfigurationFragment this$0;

            public void onRefresh()
            {
                if (isAdded())
                {
                    refreshProductsView();
                }
            }

            
            {
                this$0 = ConfigurationFragment.this;
                super(l);
            }
        }).start();
    }

    private void loadProducts(com.walmartlabs.android.photo.net.LoadProductsTask.ProductsUpdateCallback productsupdatecallback)
    {
        mLoadProductsTask = new LoadProductsTask(getActivity(), productsupdatecallback);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mLoadProductsTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            mLoadProductsTask.execute(new Void[0]);
            return;
        }
    }

    public static ConfigurationFragment newInstance(PendingOrder pendingorder)
    {
        ConfigurationFragment configurationfragment = new ConfigurationFragment();
        configurationfragment.setOrder(pendingorder);
        return configurationfragment;
    }

    private void refreshProductsView()
    {
        PendingOrder pendingorder = getOrder();
        mMainContentView.getProductsView().setQuantities(OrderUtils.quantitiesMap(pendingorder, null));
        mBaseView.getSummaryView().setModel(OrderUtils.printsCount(pendingorder), OrderUtils.totalDue(pendingorder));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mOrderListener = new com.walmartlabs.android.photo.model.order.PendingOrder.PendingOrderListener() {

            final ConfigurationFragment this$0;

            public void onOrderUpdated()
            {
                refreshProductsView();
            }

            
            {
                this$0 = ConfigurationFragment.this;
                super();
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_choose_print_sizes));
        mBaseView = (PhotoBaseView)layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_fragment_base, viewgroup, false);
        mBaseView.setPrimaryButtonVisible(true);
        mBaseView.setPrimaryButtonEnabled(false);
        mBaseView.setPrimaryButtonText(getString(com.walmartlabs.android.photo.R.string.photo_continue));
        mBaseView.setButtonListener(new com.walmartlabs.android.photo.view.PhotoBaseView.ButtonListener() {

            final ConfigurationFragment this$0;

            public void onPrimaryClicked()
            {
                ReviewFragment reviewfragment = ReviewFragment.newInstance(getOrder());
                getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left, com.walmartlabs.android.photo.R.anim.photo_slide_in_left, com.walmartlabs.android.photo.R.anim.photo_slide_out_right).replace(com.walmartlabs.android.photo.R.id.content_frame, reviewfragment, com/walmartlabs/android/photo/controller/ReviewFragment.getName()).addToBackStack("review").commit();
            }

            
            {
                this$0 = ConfigurationFragment.this;
                super();
            }
        });
        mMainContentView = (OrderConfigurationView)layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_configuration_main, null);
        mMainContentView.getProductsView().setProductClickListener(new com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView.ProductClickListener() {

            final ConfigurationFragment this$0;

            public void onCropClick(PhotoProduct photoproduct)
            {
            }

            public void onQuantityClick(PhotoProduct photoproduct, int i)
            {
                if (i < 0)
                {
                    getOrder().decrementProduct(null, photoproduct);
                } else
                if (i > 0)
                {
                    getOrder().incrementProduct(null, photoproduct);
                    return;
                }
            }

            
            {
                this$0 = ConfigurationFragment.this;
                super();
            }
        });
        ((TextView)mMainContentView.findViewById(com.walmartlabs.android.photo.R.id.hint)).setText(Html.fromHtml(getString(com.walmartlabs.android.photo.R.string.photo_able_to_edit)));
        mMainContentView.getProductsView().setModel(null, false);
        getOrder().resetQuantitiesAndCrop();
        loadProducts(new com.walmartlabs.android.photo.net.LoadProductsTask.ProductsUpdateCallback() {

            final ConfigurationFragment this$0;

            public void onUpdated(List list)
            {
                if (isAdded())
                {
                    mMainContentView.getProductsView().setModel(list, false);
                    refreshProductsView();
                    if (list != null && list.size() > 0)
                    {
                        mBaseView.setPrimaryButtonEnabled(true);
                    }
                    return;
                } else
                {
                    PhotoLogger.get().d(ConfigurationFragment.TAG, "Ignoring products callback since fragment is not added to the activity");
                    return;
                }
            }

            
            {
                this$0 = ConfigurationFragment.this;
                super();
            }
        });
        mBaseView.setMainContent(mMainContentView);
        layoutinflater = (OverlaidGalleryView)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.overlaid_gallery);
        if (DeviceUtils.getScreenHeightDips(getActivity()) < 480)
        {
            mBaseView.findViewById(com.walmartlabs.android.photo.R.id.divider).setVisibility(8);
            mBaseView.findViewById(com.walmartlabs.android.photo.R.id.hint).setVisibility(8);
            layoutinflater.setVisibility(8);
        } else
        {
            layoutinflater.setModel(getOrder());
        }
        return mBaseView;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (mLoadProductsTask != null)
        {
            mLoadProductsTask.cancel(true);
        }
    }

    public void onPause()
    {
        super.onPause();
        getOrder().setListener(null);
    }

    public void onResume()
    {
        super.onResume();
        if (getOrder().isEmpty())
        {
            getFragmentManager().popBackStack();
            return;
        } else
        {
            doRefresh();
            getOrder().setListener(mOrderListener);
            return;
        }
    }





}
