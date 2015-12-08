// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            AddToCartController, BaseListItemModelState, BaseItemViewHolder, ItemAdapterCallback

public abstract class BaseItemsAdapter extends BasicAdapter
{

    protected final AddToCartController mAddToCartController = new AddToCartController();
    protected ItemAdapterCallback mCallback;
    protected final Context mContext;
    protected final ArrayList mItems = new ArrayList();

    public BaseItemsAdapter(Context context)
    {
        mContext = context;
    }

    protected abstract BaseListItemModelState createItemModeState(ListItemModel listitemmodel);

    public int getItemCount()
    {
        return mItems.size();
    }

    public void markAddToCartCompletion(String s, String s1)
    {
        int j = mItems.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    BaseListItemModelState baselistitemmodelstate = (BaseListItemModelState)mItems.get(i);
                    ListItemModel listitemmodel = baselistitemmodelstate.getItem();
                    if (!listitemmodel.getId().equals(s) || !listitemmodel.getListId().equals(s1))
                    {
                        break label0;
                    }
                    if (baselistitemmodelstate.isAddToCartInProgress())
                    {
                        baselistitemmodelstate.setIsAddToCartInProgress(false);
                        notifyItemChanged(i);
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public void onPopulateViewHolder(BaseItemViewHolder baseitemviewholder, int i)
    {
        BaseListItemModelState baselistitemmodelstate = (BaseListItemModelState)mItems.get(i);
        baseitemviewholder.populate(i, baselistitemmodelstate, mCallback);
        if (baselistitemmodelstate.isInCartState())
        {
            mAddToCartController.updateCurrentHolder(baseitemviewholder);
        } else
        if (mAddToCartController.getCurrentHolder() == baseitemviewholder)
        {
            mAddToCartController.updateCurrentHolder(null);
            return;
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((BaseItemViewHolder)basicviewholder, i);
    }

    public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        onViewRecycled((BaseItemViewHolder)viewholder);
    }

    public void onViewRecycled(BaseItemViewHolder baseitemviewholder)
    {
        super.onViewRecycled(baseitemviewholder);
        baseitemviewholder.mItemState = null;
        if (mAddToCartController.getCurrentHolder() == baseitemviewholder)
        {
            mAddToCartController.updateCurrentHolder(null);
        }
    }

    public void setCallback(ItemAdapterCallback itemadaptercallback)
    {
        mCallback = itemadaptercallback;
    }

    public void setItems(List list)
    {
        mItems.clear();
        mAddToCartController.updateCurrentHolder(null);
        mAddToCartController.updateItemState(null);
        ListItemModel listitemmodel;
        for (list = list.iterator(); list.hasNext(); mItems.add(createItemModeState(listitemmodel)))
        {
            listitemmodel = (ListItemModel)list.next();
        }

        notifyDataSetChanged();
    }
}
