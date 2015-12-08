// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemsAdapter, CreatorListItemModelState, BaseListItemModelState, BaseItemViewHolder, 
//            AddToCartController, ItemAdapterCallback, QuantityEditorDialogFragment

public class CreatorItemsAdapter extends BaseItemsAdapter
    implements SwipeController.DismissibleAdapter
{
    class CreatorItemViewHolder extends BaseItemViewHolder
    {

        final TextView mDeleteAction;
        final View mDeleteContainer;
        final TextView mDeleteItemName;
        final CreatorItemsAdapter this$0;

        public void changeToCart()
        {
            mDeleteContainer.setVisibility(4);
            super.changeToCart(new Runnable() {

                final CreatorItemViewHolder this$1;

                public void run()
                {
                    mDeleteContainer.setVisibility(0);
                }

            
            {
                this$1 = CreatorItemViewHolder.this;
                super();
            }
            });
        }

        public void changeToRegular()
        {
            mDeleteContainer.setVisibility(4);
            super.changeToRegular(new Runnable() {

                final CreatorItemViewHolder this$1;

                public void run()
                {
                    mDeleteContainer.setVisibility(0);
                }

            
            {
                this$1 = CreatorItemViewHolder.this;
                super();
            }
            });
        }

        public volatile void populate(int i, BaseListItemModelState baselistitemmodelstate, ItemAdapterCallback itemadaptercallback)
        {
            populate(i, (CreatorListItemModelState)baselistitemmodelstate, itemadaptercallback);
        }

        public void populate(int i, CreatorListItemModelState creatorlistitemmodelstate, ItemAdapterCallback itemadaptercallback)
        {
            super.populate(i, creatorlistitemmodelstate, itemadaptercallback);
            mWants.setText(String.valueOf(creatorlistitemmodelstate.getWantsQuantity()));
            mWantsClickable.setOnClickListener(creatorlistitemmodelstate. new android.view.View.OnClickListener() {

                final CreatorItemViewHolder this$1;
                final CreatorListItemModelState val$itemState;

                public void onClick(View view)
                {
                    view = itemState.getItem().getUsItemId();
                    Object obj = QuantityEditorDialogFragment.newInstance(itemState.getWantsQuantity(), 1, 20);
                    ((QuantityEditorDialogFragment) (obj)).setOnNewQuantityListener(view. new QuantityEditorDialogFragment.OnNewQuantityListener() {

                        final CreatorItemViewHolder._cls1 this$2;
                        final String val$itemId;

                        public void onNewQuantity(int i)
                        {
                            itemState.setWantsQuantity(i);
                            mWants.setText(String.valueOf(i));
                            Object obj = itemState.getItem();
                            WishListManager.get().updateItemQuantities(((ListItemModel) (obj)).getListId(), ((ListItemModel) (obj)).getId(), i, ((ListItemModel) (obj)).getHasQuantity(), new CallbackSameThread() {

                                final CreatorItemViewHolder._cls1._cls1 this$3;

                                public void onResultSameThread(Request request, Result result)
                                {
                                    super.onResultSameThread(request, result);
                                }

            
            {
                this$3 = CreatorItemViewHolder._cls1._cls1.this;
                super();
            }
                            });
                            obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listWantsUpdate");
                            if (!TextUtils.isEmpty(itemId))
                            {
                                ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("itemId", itemId);
                            }
                            MessageBus.getBus().post(obj);
                        }

            
            {
                this$2 = final__pcls1;
                itemId = String.this;
                super();
            }
                    });
                    ((QuantityEditorDialogFragment) (obj)).show(mActivity.getSupportFragmentManager(), "CreatorWantsQtyDialog");
                    obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listWantsTap");
                    if (!TextUtils.isEmpty(view))
                    {
                        ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("itemId", view);
                    }
                    MessageBus.getBus().post(obj);
                }

            
            {
                this$1 = final_creatoritemviewholder;
                itemState = CreatorListItemModelState.this;
                super();
            }
            });
            itemadaptercallback = mRegularContainer;
            TextView textview;
            if (creatorlistitemmodelstate.isInCartState() || creatorlistitemmodelstate.isDeleted())
            {
                i = 4;
            } else
            {
                i = 0;
            }
            itemadaptercallback.setVisibility(i);
            itemadaptercallback = mDeleteAction;
            if (creatorlistitemmodelstate.isDeleted())
            {
                i = 0x7f090619;
            } else
            {
                i = 0x7f090618;
            }
            itemadaptercallback.setText(i);
            textview = mDeleteItemName;
            if (creatorlistitemmodelstate.isDeleted())
            {
                itemadaptercallback = creatorlistitemmodelstate.getItem().getName();
            } else
            {
                itemadaptercallback = "";
            }
            textview.setText(itemadaptercallback);
            mDeleteAction.setOnClickListener(creatorlistitemmodelstate. new android.view.View.OnClickListener() {

                final CreatorItemViewHolder this$1;
                final CreatorListItemModelState val$itemState;

                public void onClick(View view)
                {
                    if (itemState.isDeleted())
                    {
                        cancelPendingDeletion(itemState);
                        itemState.setDeleted(false);
                        mRegularContainer.setVisibility(0);
                        mRegularContainer.setTranslationX(-mRegularContainer.getWidth());
                        mRegularContainer.animate().translationX(0.0F).setDuration(300L).setListener(new AnimatorListenerAdapter() {

                            final CreatorItemViewHolder._cls2 this$2;

                            private void reset()
                            {
                                mRegularContainer.animate().setListener(null);
                                mRegularContainer.setTranslationX(0.0F);
                                notifyItemChanged(itemState);
                            }

                            public void onAnimationCancel(Animator animator)
                            {
                                reset();
                            }

                            public void onAnimationEnd(Animator animator)
                            {
                                reset();
                            }

            
            {
                this$2 = CreatorItemViewHolder._cls2.this;
                super();
            }
                        }).start();
                    }
                }

            
            {
                this$1 = final_creatoritemviewholder;
                itemState = CreatorListItemModelState.this;
                super();
            }
            });
        }

        public CreatorItemViewHolder(View view, AddToCartController addtocartcontroller)
        {
            this$0 = CreatorItemsAdapter.this;
            super(view, addtocartcontroller);
            mDeleteContainer = ViewUtil.findViewById(view, 0x7f100647);
            mDeleteItemName = (TextView)ViewUtil.findViewById(view, 0x7f100648);
            mDeleteAction = (TextView)ViewUtil.findViewById(view, 0x7f100649);
        }
    }


    private static final long DELETION_REGRET_PERIOD_MS = 3000L;
    private final AppCompatActivity mActivity;
    private final Handler mHandler = new Handler();
    private final HashMap mPendingDeletions = new HashMap();

    public CreatorItemsAdapter(AppCompatActivity appcompatactivity)
    {
        super(appcompatactivity);
        mActivity = appcompatactivity;
    }

    private void addPendingDeletion(final CreatorListItemModelState itemModelState)
    {
        Runnable runnable = new Runnable() {

            final CreatorItemsAdapter this$0;
            final CreatorListItemModelState val$itemModelState;

            public void run()
            {
                mPendingDeletions.remove(itemModelState);
                deleteItemFromAdapter(itemModelState);
                ListItemModel listitemmodel = itemModelState.getItem();
                WishListManager.get().deleteItem(listitemmodel.getListId(), listitemmodel.getId(), new CallbackSameThread() {

                    final _cls2 this$1;

                    public void onResultSameThread(Request request, Result result)
                    {
                        super.onResultSameThread(request, result);
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                sendRemovedItemEvent(listitemmodel);
            }

            
            {
                this$0 = CreatorItemsAdapter.this;
                itemModelState = creatorlistitemmodelstate;
                super();
            }
        };
        mPendingDeletions.put(itemModelState, runnable);
        mHandler.postDelayed(runnable, 3000L);
    }

    private void cancelPendingDeletion(CreatorListItemModelState creatorlistitemmodelstate)
    {
        if (mPendingDeletions.containsKey(creatorlistitemmodelstate))
        {
            mHandler.removeCallbacks((Runnable)mPendingDeletions.remove(creatorlistitemmodelstate));
        }
    }

    private void deleteItemFromAdapter(CreatorListItemModelState creatorlistitemmodelstate)
    {
        int j = mItems.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!((CreatorListItemModelState)mItems.get(i)).equals(creatorlistitemmodelstate))
                    {
                        break label0;
                    }
                    mItems.remove(i);
                    notifyItemRemoved(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    private void notifyItemChanged(CreatorListItemModelState creatorlistitemmodelstate)
    {
        int j = mItems.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!((CreatorListItemModelState)mItems.get(i)).equals(creatorlistitemmodelstate))
                    {
                        break label0;
                    }
                    notifyItemChanged(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    private void sendRemovedItemEvent(ListItemModel listitemmodel)
    {
        listitemmodel = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listRemoveItemTap")).putString("itemId", listitemmodel.getUsItemId());
        MessageBus.getBus().post(listitemmodel);
    }

    protected volatile BaseListItemModelState createItemModeState(ListItemModel listitemmodel)
    {
        return createItemModeState(listitemmodel);
    }

    protected CreatorListItemModelState createItemModeState(ListItemModel listitemmodel)
    {
        return new CreatorListItemModelState(listitemmodel);
    }

    public void dismiss(int i)
    {
        CreatorListItemModelState creatorlistitemmodelstate = (CreatorListItemModelState)mItems.get(i);
        creatorlistitemmodelstate.setDeleted(true);
        addPendingDeletion(creatorlistitemmodelstate);
        notifyItemChanged(i);
    }

    public void flushPendingDeletions()
    {
        Runnable runnable;
        for (Iterator iterator = mPendingDeletions.values().iterator(); iterator.hasNext(); mHandler.removeCallbacks(runnable))
        {
            runnable = (Runnable)iterator.next();
        }

        Object obj;
        for (Iterator iterator1 = mPendingDeletions.keySet().iterator(); iterator1.hasNext(); sendRemovedItemEvent(((ListItemModel) (obj))))
        {
            obj = (CreatorListItemModelState)iterator1.next();
            deleteItemFromAdapter(((CreatorListItemModelState) (obj)));
            obj = ((CreatorListItemModelState) (obj)).getItem();
            WishListManager.get().deleteItem(((ListItemModel) (obj)).getListId(), ((ListItemModel) (obj)).getId(), new CallbackSameThread() {

                final CreatorItemsAdapter this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                }

            
            {
                this$0 = CreatorItemsAdapter.this;
                super();
            }
            });
        }

        mPendingDeletions.clear();
    }

    public boolean isDismissible(int i)
    {
        CreatorListItemModelState creatorlistitemmodelstate = (CreatorListItemModelState)mItems.get(i);
        return !creatorlistitemmodelstate.isInCartState() && !creatorlistitemmodelstate.isDeleted();
    }

    public CreatorItemViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new CreatorItemViewHolder(ViewUtil.inflate(mContext, 0x7f0401e9, viewgroup), mAddToCartController);
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void setItems(List list)
    {
        flushPendingDeletions();
        super.setItems(list);
    }






}
