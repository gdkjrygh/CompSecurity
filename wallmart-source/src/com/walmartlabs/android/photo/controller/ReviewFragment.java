// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.util.OrderUtils;
import com.walmartlabs.android.photo.view.PhotoBaseView;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationSummaryView;
import com.walmartlabs.android.photo.view.order.OrderItemsAdapter;
import com.walmartlabs.ui.LoadingContainerView;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.text.DecimalFormat;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderAwareFragment, ContactAndStoreFragment, EditConfigurationFragment

public class ReviewFragment extends OrderAwareFragment
{

    private static final DecimalFormat ORDER_TOTAL_FORMAT = new DecimalFormat("0.00");
    private OrderItemsAdapter mAdapter;
    private String mHintText;

    public ReviewFragment()
    {
    }

    private void displayMessage(String s, String s1)
    {
        DialogFactory.createAlertDialog(s, s1, getActivity()).show();
    }

    public static ReviewFragment newInstance(PendingOrder pendingorder)
    {
        ReviewFragment reviewfragment = new ReviewFragment();
        reviewfragment.setOrder(pendingorder);
        return reviewfragment;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (OrderUtils.printsCount(getOrder()) > 0)
        {
            bundle = getString(com.walmartlabs.android.photo.R.string.photo_tap_to_change);
        } else
        {
            bundle = getString(com.walmartlabs.android.photo.R.string.photo_tap_to_change_all_empty);
        }
        mHintText = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag = true;
        getActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_cart));
        viewgroup = (PhotoBaseView)layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_fragment_base, viewgroup, false);
        viewgroup.setPrimaryButtonVisible(true);
        viewgroup.setPrimaryButtonText(getString(com.walmartlabs.android.photo.R.string.photo_continue));
        viewgroup.setButtonListener(new com.walmartlabs.android.photo.view.PhotoBaseView.ButtonListener() {

            final ReviewFragment this$0;

            public void onPrimaryClicked()
            {
                if (OrderUtils.hasLowResWarnings(getOrder()))
                {
                    Dialog dialog = DialogFactory.createAlertDialog(com.walmartlabs.android.photo.R.drawable.photo_warning, getString(com.walmartlabs.android.photo.R.string.photo_some_lowres_title), getString(com.walmartlabs.android.photo.R.string.photo_some_lowres_message), getString(com.walmartlabs.android.photo.R.string.photo_yes), new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            proceed();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    }, getString(com.walmartlabs.android.photo.R.string.photo_no), getActivity());
                    dialog.setCancelable(false);
                    dialog.show();
                    return;
                } else
                {
                    proceed();
                    return;
                }
            }

            
            {
                this$0 = ReviewFragment.this;
                super();
            }
        });
        bundle = getOrder();
        viewgroup.getSummaryView().setModel(OrderUtils.printsCount(bundle), OrderUtils.totalDue(bundle));
        if (OrderUtils.printsCount(bundle) <= 0)
        {
            flag = false;
        }
        viewgroup.setPrimaryButtonEnabled(flag);
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_order_main, null);
        ((TextView)layoutinflater.findViewById(com.walmartlabs.android.photo.R.id.hint)).setText(mHintText);
        bundle = (LoadingContainerView)layoutinflater.findViewById(com.walmartlabs.android.photo.R.id.order_container);
        if (getOrder().getProductSelection().isEmpty())
        {
            bundle.setEmptyState();
        } else
        {
            bundle.setContentState();
            bundle = (ListRecyclerView)bundle.getContentView();
            if (mAdapter == null)
            {
                mAdapter = new OrderItemsAdapter(getActivity());
            }
            mAdapter.setModel(getOrder());
            bundle.setAdapter(mAdapter);
            bundle.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

                final ReviewFragment this$0;

                public void onItemClick(BasicViewHolder basicviewholder, int i)
                {
                    basicviewholder = EditConfigurationFragment.newInstance(getOrder(), mAdapter.getItem(i));
                    getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.R.anim.photo_activity_open_enter, com.walmartlabs.android.photo.R.anim.photo_activity_open_exit, com.walmartlabs.android.photo.R.anim.photo_activity_close_enter, com.walmartlabs.android.photo.R.anim.photo_activity_close_exit).replace(com.walmartlabs.android.photo.R.id.content_frame, basicviewholder, com/walmartlabs/android/photo/controller/EditConfigurationFragment.getName()).addToBackStack("edit_conf").commit();
                }

            
            {
                this$0 = ReviewFragment.this;
                super();
            }
            });
        }
        viewgroup.setMainContent(layoutinflater);
        return viewgroup;
    }

    public void proceed()
    {
        double d = OrderUtils.totalDue(getOrder());
        int i = OrderUtils.printsCount(getOrder());
        if (d > 100D)
        {
            displayMessage(getResources().getString(com.walmartlabs.android.photo.R.string.photo_order), getResources().getString(com.walmartlabs.android.photo.R.string.photo_max_order_total, new Object[] {
                ORDER_TOTAL_FORMAT.format(100L), ORDER_TOTAL_FORMAT.format(d)
            }));
            return;
        }
        if (i > 300)
        {
            displayMessage(getResources().getString(com.walmartlabs.android.photo.R.string.photo_order), getResources().getString(com.walmartlabs.android.photo.R.string.photo_max_prints_count, new Object[] {
                Integer.valueOf(300), Integer.valueOf(i)
            }));
            return;
        } else
        {
            ContactAndStoreFragment contactandstorefragment = ContactAndStoreFragment.newInstance(getOrder());
            getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left, com.walmartlabs.android.photo.R.anim.photo_slide_in_left, com.walmartlabs.android.photo.R.anim.photo_slide_out_right).replace(com.walmartlabs.android.photo.R.id.content_frame, contactandstorefragment, com/walmartlabs/android/photo/controller/ContactAndStoreFragment.getName()).addToBackStack("contact_store").commit();
            return;
        }
    }


}
