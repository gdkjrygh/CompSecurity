// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.service.cart.ListInfo;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.wmservice.CartManager;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ShowBundleDialogFragment, BaseItemsAdapter

class ItemAdapterCallback
{

    private final AppCompatActivity mActivity;
    private final BaseItemsAdapter mAdapter;
    private final Presenter mListItemPresenter;

    public ItemAdapterCallback(AppCompatActivity appcompatactivity, Presenter presenter, BaseItemsAdapter baseitemsadapter)
    {
        mActivity = appcompatactivity;
        mListItemPresenter = presenter;
        mAdapter = baseitemsadapter;
    }

    private List convertComponentsForCart(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        com.walmart.android.service.wishlist.models.ListItemModel.BundleComponent bundlecomponent;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new com.walmart.android.service.cart.CartService.OfferConfiguration(bundlecomponent.getOfferId(), bundlecomponent.getQuantity())))
        {
            bundlecomponent = (com.walmart.android.service.wishlist.models.ListItemModel.BundleComponent)list.next();
        }

        return arraylist;
    }

    private ListInfo createListInfo(ListItemModel listitemmodel)
    {
        return new ListInfo(listitemmodel.getListId(), listitemmodel.getId(), listitemmodel.getListType());
    }

    public void addToCart(ListItemModel listitemmodel, int i)
    {
        ListInfo listinfo = createListInfo(listitemmodel);
        CartManager cartmanager = Services.get().getCartManager();
        CallbackSameThread callbacksamethread = new CallbackSameThread(listitemmodel) {

            final ItemAdapterCallback this$0;
            final ListItemModel val$item;

            public void onResultSameThread(Request request, Result result)
            {
                if (mListItemPresenter.isTop())
                {
                    if (result.successful())
                    {
                        Toast.makeText(mActivity, 0x7f090644, 0).show();
                    } else
                    {
                        DialogFactory.showDialog(900, mActivity);
                    }
                    mAdapter.markAddToCartCompletion(item.getId(), item.getListId());
                }
            }

            
            {
                this$0 = ItemAdapterCallback.this;
                item = listitemmodel;
                super(final_context);
            }
        };
        if (listitemmodel.isBundle())
        {
            cartmanager.addGrouping(listitemmodel.getGroupId(), convertComponentsForCart(listitemmodel.getBundleComponents()), i, listinfo, callbacksamethread);
            return;
        } else
        {
            cartmanager.addItem(listitemmodel.getOfferId(), i, listinfo, callbacksamethread);
            return;
        }
    }

    public void onItemClicked(ListItemModel listitemmodel)
    {
        if (!TextUtils.isEmpty(listitemmodel.getUsItemId()))
        {
            ItemDetailsPresenter itemdetailspresenter = new ItemDetailsPresenter(mActivity, listitemmodel.getUsItemId());
            itemdetailspresenter.setListInfo(createListInfo(listitemmodel));
            mListItemPresenter.getPresenterStack().pushPresenter(itemdetailspresenter, true);
        }
    }

    public void onShowBundleClicked(ListItemModel listitemmodel)
    {
        ShowBundleDialogFragment.newInstance(listitemmodel.getBundleComponents()).show(mActivity.getSupportFragmentManager(), "bundleDialog");
    }



}
