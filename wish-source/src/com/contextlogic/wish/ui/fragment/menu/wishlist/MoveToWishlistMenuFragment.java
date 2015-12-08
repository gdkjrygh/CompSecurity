// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.CreateBucketService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.text.UnifiedFontEditText;
import com.contextlogic.wish.ui.fragment.base.BaseMenuFragment;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlist:
//            MoveToWishlistMenuAdapter

public class MoveToWishlistMenuFragment extends BaseMenuFragment
{
    public static interface Callback
    {

        public abstract void onBucketEditCancelled();

        public abstract void onBucketEdited(ArrayList arraylist, String s, String s1);

        public abstract void onProductsRemoved(ArrayList arraylist);
    }


    public static final String ARG_PRODUCT_IDS = "ArgProductIds";
    private Callback callback;
    private ListView listView;
    private ProgressDialog loadingSpinner;
    private ArrayList productBuckets;
    private ArrayList productIds;
    private MoveToWishlistMenuAdapter wishlistAdapter;

    public MoveToWishlistMenuFragment()
    {
    }

    private void extractProductBuckets()
    {
        productBuckets.clear();
        if (LoggedInUser.getInstance().getCurrentUser() == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = LoggedInUser.getInstance().getCurrentUser().getProductBuckets().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WishUserProductBucket wishuserproductbucket = (WishUserProductBucket)iterator.next();
            if (wishuserproductbucket.isEditable())
            {
                if (wishuserproductbucket.getBucketId().equalsIgnoreCase("holiday_wishlist") || wishuserproductbucket.getBucketId().equalsIgnoreCase("birthday_wishlist"))
                {
                    productBuckets.add(wishuserproductbucket);
                } else
                {
                    arraylist.add(wishuserproductbucket);
                }
            }
        } while (true);
        Collections.sort(arraylist, new Comparator() {

            final MoveToWishlistMenuFragment this$0;

            public int compare(WishUserProductBucket wishuserproductbucket1, WishUserProductBucket wishuserproductbucket2)
            {
                return wishuserproductbucket1.getName().compareToIgnoreCase(wishuserproductbucket2.getName());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((WishUserProductBucket)obj, (WishUserProductBucket)obj1);
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super();
            }
        });
        productBuckets.addAll(arraylist);
    }

    private void handleBucketClick(WishUserProductBucket wishuserproductbucket)
    {
        callback.onBucketEdited(productIds, wishuserproductbucket.getName(), wishuserproductbucket.getBucketId());
    }

    private void handleBucketCreate()
    {
        Object obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setTitle(getString(0x7f060103));
        final UnifiedFontEditText input = new UnifiedFontEditText(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setView(input);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getString(0x7f060101), new android.content.DialogInterface.OnClickListener() {

            final MoveToWishlistMenuFragment this$0;
            final UnifiedFontEditText val$input;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = input.getText();
                if (dialoginterface != null && !dialoginterface.toString().trim().equals(""))
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Create);
                    dialoginterface = dialoginterface.toString();
                    if (wishlistAlreadyExists(dialoginterface))
                    {
                        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getString(0x7f060104));
                        return;
                    } else
                    {
                        showLoadingSpinner();
                        (new CreateBucketService()).requestService(dialoginterface, dialoginterface. new com.contextlogic.wish.api.service.CreateBucketService.SuccessCallback() {

                            final _cls3 this$1;
                            final String val$bucketName;

                            public void onServiceSucceeded()
                            {
                                hideLoadingSpinner();
                                callback.onBucketEdited(productIds, bucketName, null);
                            }

            
            {
                this$1 = final__pcls3;
                bucketName = String.this;
                super();
            }
                        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                            final _cls3 this$1;

                            public void onServiceFailed()
                            {
                                hideLoadingSpinner();
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                        return;
                    }
                } else
                {
                    PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getString(0x7f0602b7));
                    return;
                }
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                input = unifiedfontedittext;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(getString(0x7f0600bc), new android.content.DialogInterface.OnClickListener() {

            final MoveToWishlistMenuFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super();
            }
        });
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).getWindow().setSoftInputMode(5);
        ((AlertDialog) (obj)).show();
    }

    private void handleRemoveClick()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
        alertdialog.setTitle(getActivity().getString(0x7f060073));
        alertdialog.setMessage(WishApplication.getAppInstance().getQuantityString(0x7f070001, productIds.size()));
        alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final MoveToWishlistMenuFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super();
            }
        });
        alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final MoveToWishlistMenuFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct);
                callback.onProductsRemoved(productIds);
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super();
            }
        });
        alertdialog.show();
    }

    private void refreshViewState()
    {
        if (productBuckets == null || productBuckets.size() == 0)
        {
            listView.setVisibility(8);
            return;
        } else
        {
            listView.setVisibility(0);
            wishlistAdapter.notifyDataSetChanged();
            return;
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.MoveToWishlistMenu;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030073;
    }

    public void handleResume()
    {
        super.handleResume();
        refreshViewState();
    }

    public void hideLoadingSpinner()
    {
        if (loadingSpinner != null)
        {
            try
            {
                loadingSpinner.dismiss();
            }
            catch (Throwable throwable) { }
            loadingSpinner = null;
        }
    }

    protected void initializeUi(View view)
    {
        listView = (ListView)view.findViewById(0x7f0d0235);
        wishlistAdapter = new MoveToWishlistMenuAdapter(getActivity(), productBuckets, listView);
        LinearLayout linearlayout = new LinearLayout(getActivity());
        linearlayout.setOrientation(0);
        linearlayout.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, (int)TypedValue.applyDimension(1, 80F, getResources().getDisplayMetrics())));
        listView.addFooterView(linearlayout);
        listView.setAdapter(wishlistAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MoveToWishlistMenuFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                if (i > productBuckets.size())
                {
                    return;
                }
                if (i == 0)
                {
                    handleBucketCreate();
                    return;
                } else
                {
                    handleBucketClick((WishUserProductBucket)productBuckets.get(i - 1));
                    return;
                }
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d0236).setOnClickListener(new android.view.View.OnClickListener() {

            final MoveToWishlistMenuFragment this$0;

            public void onClick(View view1)
            {
                handleRemoveClick();
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super();
            }
        });
        listView.setFadingEdgeLength(0);
    }

    public boolean onBackPressed()
    {
        ((RootActivity)getActivity()).closeMenus();
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        productBuckets = new ArrayList();
        extractProductBuckets();
        productIds = getArguments().getStringArrayList("ArgProductIds");
    }

    protected void releaseImages()
    {
        if (wishlistAdapter != null)
        {
            wishlistAdapter.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (wishlistAdapter != null)
        {
            wishlistAdapter.restoreImages();
        }
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    public void showLoadingSpinner()
    {
        loadingSpinner = new ProgressDialog(getActivity()) {

            final MoveToWishlistMenuFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = MoveToWishlistMenuFragment.this;
                super(context);
            }
        };
        loadingSpinner.setCancelable(false);
        loadingSpinner.requestWindowFeature(1);
        loadingSpinner.setMessage(getString(0x7f060285));
        try
        {
            loadingSpinner.show();
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    public boolean wishlistAlreadyExists(String s)
    {
        s = s.toLowerCase();
        for (Iterator iterator = productBuckets.iterator(); iterator.hasNext();)
        {
            WishUserProductBucket wishuserproductbucket = (WishUserProductBucket)iterator.next();
            if (wishuserproductbucket.getName() != null && s.equals(wishuserproductbucket.getName().toLowerCase()))
            {
                return true;
            }
        }

        return false;
    }






}
