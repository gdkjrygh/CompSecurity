// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.app.cart.CartUtils;
import com.walmart.android.app.shop.ShelfPriceView;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.NumberPicker;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import io.codetail.animation.SupportAnimator;
import io.codetail.animation.ViewAnimationUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseListItemModelState, AddToCartController, ItemAdapterCallback

public class BaseItemViewHolder extends BasicViewHolder
{
    private static class SimpleOnAttachStateChangeListener
        implements android.view.View.OnAttachStateChangeListener
    {

        public void onViewAttachedToWindow(View view)
        {
        }

        public void onViewDetachedFromWindow(View view)
        {
        }

        private SimpleOnAttachStateChangeListener()
        {
        }

    }


    protected final AddToCartController mAddToCartController;
    private final TextView mBundleLink;
    private final View mBundleLinkView;
    protected ItemAdapterCallback mCallback;
    protected final View mCartIcon;
    protected final View mCartProgress;
    private final Context mContext;
    protected final TextView mFlag;
    protected final View mFullFilledFlag;
    protected final TextView mHas;
    private final View mItemContainer;
    protected final TextView mItemName;
    protected BaseListItemModelState mItemState;
    protected int mPositionInAdapter;
    protected final ShelfPriceView mPriceView;
    protected final ImageView mProductImage;
    protected final Button mQuickAddCartAddButton;
    protected final View mQuickAddCartCloseButton;
    protected final View mQuickAddCartContainer;
    protected final TextView mQuickAddCartItemName;
    protected final ShelfPriceView mQuickAddCartPriceView;
    protected final NumberPicker mQuickAddCartQtyEditor;
    protected final View mQuickAddCartSubmapView;
    protected final StarsView mRating;
    protected final View mRegularContainer;
    protected final View mShippingPassView;
    protected final TextView mStoreInfoText;
    private final TextView mVariantView;
    protected final TextView mWants;
    protected final View mWantsClickable;

    public BaseItemViewHolder(View view, AddToCartController addtocartcontroller)
    {
        super(view);
        mContext = view.getContext().getApplicationContext();
        mAddToCartController = addtocartcontroller;
        mRegularContainer = ViewUtil.findViewById(view, 0x7f10064a);
        mItemContainer = ViewUtil.findViewById(view, 0x7f10064b);
        mItemName = (TextView)ViewUtil.findViewById(view, 0x7f1001a2);
        mProductImage = (ImageView)ViewUtil.findViewById(view, 0x7f100618);
        mPriceView = (ShelfPriceView)ViewUtil.findViewById(view, 0x7f10064f);
        mRating = (StarsView)ViewUtil.findViewById(view, 0x7f100651);
        mWants = (TextView)ViewUtil.findViewById(view, 0x7f100658);
        mWantsClickable = ViewUtil.findViewById(view, 0x7f100656);
        mHas = (TextView)ViewUtil.findViewById(view, 0x7f10065a);
        mStoreInfoText = (TextView)ViewUtil.findViewById(view, 0x7f100650);
        mCartIcon = ViewUtil.findViewById(view, 0x7f10065c);
        mCartProgress = ViewUtil.findViewById(view, 0x7f10065d);
        mFullFilledFlag = ViewUtil.findViewById(view, 0x7f10064d);
        mBundleLinkView = ViewUtil.findViewById(view, 0x7f100654);
        mBundleLink = (TextView)ViewUtil.findViewById(view, 0x7f100655);
        mVariantView = (TextView)ViewUtil.findViewById(view, 0x7f100653);
        mQuickAddCartContainer = ViewUtil.findViewById(view, 0x7f10065f);
        mQuickAddCartItemName = (TextView)ViewUtil.findViewById(view, 0x7f100661);
        mQuickAddCartPriceView = (ShelfPriceView)ViewUtil.findViewById(view, 0x7f100663);
        mQuickAddCartSubmapView = ViewUtil.findViewById(view, 0x7f100664);
        mQuickAddCartCloseButton = ViewUtil.findViewById(view, 0x7f100660);
        mQuickAddCartQtyEditor = (NumberPicker)ViewUtil.findViewById(view, 0x7f100665);
        mQuickAddCartQtyEditor.setRange(1, 99);
        mQuickAddCartAddButton = (Button)ViewUtil.findViewById(view, 0x7f100666);
        mShippingPassView = ViewUtil.findViewById(view, 0x7f100652);
        mFlag = (TextView)ViewUtil.findViewById(view, 0x7f10065e);
        wireListeners();
    }

    private SupportAnimator createRevealAnimation(View view, int i, int j, int k, int l, final Runnable endAction)
    {
        view = ViewAnimationUtils.createCircularReveal(view, i, j, k, l);
        view.addListener(new io.codetail.animation.SupportAnimator.SimpleAnimatorListener() {

            final BaseItemViewHolder this$0;
            final Runnable val$endAction;

            public void onAnimationEnd()
            {
                if (endAction != null)
                {
                    endAction.run();
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                endAction = runnable;
                super();
            }
        });
        return view;
    }

    private int getFlagBackground(com.walmart.android.service.wishlist.models.ListItemModel.Flag flag)
    {
        static class _cls12
        {

            static final int $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[];

            static 
            {
                $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag = new int[com.walmart.android.service.wishlist.models.ListItemModel.Flag.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[com.walmart.android.service.wishlist.models.ListItemModel.Flag.ROLLBACK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[com.walmart.android.service.wishlist.models.ListItemModel.Flag.WALMART_ONLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[com.walmart.android.service.wishlist.models.ListItemModel.Flag.NEW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[com.walmart.android.service.wishlist.models.ListItemModel.Flag.SPECIAL_BUY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[com.walmart.android.service.wishlist.models.ListItemModel.Flag.CLEARANCE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$wishlist$models$ListItemModel$Flag[com.walmart.android.service.wishlist.models.ListItemModel.Flag.BEST_SELLER.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls12..SwitchMap.com.walmart.android.service.wishlist.models.ListItemModel.Flag[flag.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f020349;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return 0x7f020348;

        case 5: // '\005'
        case 6: // '\006'
            return 0x7f02034a;
        }
    }

    private int getFlagStringId(com.walmart.android.service.wishlist.models.ListItemModel.Flag flag)
    {
        switch (_cls12..SwitchMap.com.walmart.android.service.wishlist.models.ListItemModel.Flag[flag.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f090639;

        case 5: // '\005'
            return 0x7f090636;

        case 3: // '\003'
            return 0x7f090637;

        case 4: // '\004'
            return 0x7f09063a;

        case 2: // '\002'
            return 0x7f090638;

        case 6: // '\006'
            return 0x7f090635;
        }
    }

    private String getProductType(ListItemModel listitemmodel)
    {
        ProductType producttype = ProductType.REGULAR;
        if (!listitemmodel.isBundle()) goto _L2; else goto _L1
_L1:
        producttype = ProductType.BUNDLE;
_L4:
        return producttype.toString();
_L2:
        if (listitemmodel.isPreorder())
        {
            producttype = ProductType.PREORDER;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setupBundleView(ListItemModel listitemmodel)
    {
        if (listitemmodel.isBundle())
        {
            mBundleLinkView.setVisibility(0);
            mBundleLink.setText(Html.fromHtml(mContext.getString(0x7f090678)));
            return;
        } else
        {
            mBundleLinkView.setVisibility(8);
            return;
        }
    }

    private void setupCartView(boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        if (flag)
        {
            View view = mCartIcon;
            int i;
            if (flag1)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
            view = mCartProgress;
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            return;
        } else
        {
            mCartIcon.setVisibility(8);
            mCartProgress.setVisibility(8);
            return;
        }
    }

    private void setupFlag(ListItemModel listitemmodel)
    {
        if (listitemmodel.hasPrimaryFlag())
        {
            listitemmodel = listitemmodel.getPrimaryFlag();
            mFlag.setText(getFlagStringId(listitemmodel));
            mFlag.setBackgroundResource(getFlagBackground(listitemmodel));
            mFlag.setVisibility(0);
            return;
        } else
        {
            mFlag.setVisibility(8);
            return;
        }
    }

    private void setupPriceView(ListItemModel listitemmodel)
    {
        int i;
        byte byte0;
        int j;
        if (listitemmodel.isAvailable())
        {
            if (listitemmodel.hasSubmapPrice())
            {
                i = 0x7f09066a;
            } else
            {
                i = 0x7f090643;
            }
        } else
        {
            i = 0x7f09065a;
        }
        if (listitemmodel.isAvailable() && listitemmodel.getOfferType() != com.walmart.android.service.wishlist.models.ListItemModel.OfferType.STORE_ONLY && !listitemmodel.hasSubmapPrice())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        if (i == 0x7f09065a)
        {
            j = 0x7f0f012d;
        } else
        {
            j = 0x7f0f012c;
        }
        mStoreInfoText.setVisibility(byte0);
        mStoreInfoText.setText(i);
        mStoreInfoText.setTextColor(mContext.getResources().getColor(j));
        if (!listitemmodel.hasPrice() || listitemmodel.hasSubmapPrice())
        {
            mPriceView.setVisibility(8);
            return;
        } else
        {
            mPriceView.setPrice(listitemmodel.getPrice());
            mPriceView.setVisibility(0);
            return;
        }
    }

    private void setupRating(ListItemModel listitemmodel)
    {
        if (listitemmodel.hasRating())
        {
            mRating.setPercentage((listitemmodel.getRating() / 5D) * 100D);
            mRating.setVisibility(0);
            return;
        } else
        {
            mRating.setVisibility(4);
            return;
        }
    }

    private void setupVariantView(ListItemModel listitemmodel)
    {
        if (listitemmodel.hasVariants())
        {
            StringBuilder stringbuilder = new StringBuilder();
            com.walmart.android.service.wishlist.models.ListItemModel.Variant variant;
            for (listitemmodel = listitemmodel.getVariants().iterator(); listitemmodel.hasNext(); stringbuilder.append(mContext.getString(0x7f090677, new Object[] {
    variant.getName(), variant.getValue()
})))
            {
                variant = (com.walmart.android.service.wishlist.models.ListItemModel.Variant)listitemmodel.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append('\n');
                }
            }

            mVariantView.setText(stringbuilder.toString());
            mVariantView.setVisibility(0);
            return;
        } else
        {
            mVariantView.setVisibility(8);
            return;
        }
    }

    private boolean shouldShowShippingPass(ListItemModel listitemmodel)
    {
        return false;
    }

    private void wireListeners()
    {
        mItemContainer.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseItemViewHolder this$0;

            public void onClick(View view)
            {
                if (mCallback != null && mItemState != null)
                {
                    mCallback.onItemClicked(mItemState.getItem());
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                super();
            }
        });
        mCartIcon.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseItemViewHolder this$0;

            public void onClick(View view)
            {
                if (mItemState != null && !mItemState.isInCartState())
                {
                    mAddToCartController.openQuickAdd(BaseItemViewHolder.this, mItemState);
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listCartTap")).putString("itemId", mItemState.getItem().getUsItemId()));
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                super();
            }
        });
        mQuickAddCartCloseButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseItemViewHolder this$0;

            public void onClick(View view)
            {
                if (mItemState != null && mItemState.isInCartState())
                {
                    mAddToCartController.closeQuickAdd();
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                super();
            }
        });
        mQuickAddCartQtyEditor.setOnChangeListener(new com.walmart.android.wmui.NumberPicker.OnChangedListener() {

            final BaseItemViewHolder this$0;

            public void onChanged(NumberPicker numberpicker, int i, int j)
            {
                if (mItemState != null)
                {
                    mItemState.setCartQuantity(j);
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                super();
            }
        });
        mQuickAddCartAddButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseItemViewHolder this$0;

            public void onClick(View view)
            {
                if (mItemState != null && mItemState.isInCartState())
                {
                    mItemState.setIsAddToCartInProgress(true);
                    mCartIcon.setVisibility(8);
                    mCartProgress.setVisibility(0);
                    int i = mQuickAddCartQtyEditor.getCurrent();
                    if (mCallback != null)
                    {
                        Object obj = mItemState.getItem();
                        mCallback.addToCart(((ListItemModel) (obj)), i);
                        String s = ((ListItemModel) (obj)).getUsItemId();
                        view = ((ListItemModel) (obj)).getPrice();
                        if (TextUtils.isEmpty(view))
                        {
                            view = "";
                        } else
                        {
                            view = CartUtils.formatPriceForAnalytics(view);
                        }
                        obj = getProductType(((ListItemModel) (obj)));
                        view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("addToCart")).putString("itemId", s).putString("itemPrice", view).putString("prodType", ((String) (obj))).putString("unitCount", String.valueOf(i));
                        MessageBus.getBus().post(view);
                    }
                    mAddToCartController.closeQuickAdd();
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                super();
            }
        });
        mBundleLink.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseItemViewHolder this$0;

            public void onClick(View view)
            {
                if (mCallback != null && mItemState != null && mItemState.getItem() != null)
                {
                    mCallback.onShowBundleClicked(mItemState.getItem());
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                super();
            }
        });
    }

    public void changeToCart()
    {
        changeToCart(null);
    }

    protected void changeToCart(final Runnable endAction)
    {
        mQuickAddCartContainer.setVisibility(0);
        final int cx = mRegularContainer.getWidth() - mRegularContainer.getPaddingRight() - mCartIcon.getWidth() / 2;
        final int cy = mRegularContainer.getHeight() - mRegularContainer.getPaddingBottom() - mCartIcon.getHeight() / 2;
        final int startRadius = Math.min(mCartIcon.getWidth(), mCartIcon.getHeight());
        final int endRadius = Math.max(mQuickAddCartContainer.getWidth(), mQuickAddCartContainer.getHeight());
        endAction = new Runnable() {

            final BaseItemViewHolder this$0;
            final Runnable val$endAction;

            public void run()
            {
                mRegularContainer.setVisibility(4);
                if (endAction != null)
                {
                    endAction.run();
                }
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                endAction = runnable;
                super();
            }
        };
        if (android.os.Build.VERSION.SDK_INT > 21 && !mQuickAddCartAddButton.isAttachedToWindow())
        {
            mQuickAddCartContainer.addOnAttachStateChangeListener(new SimpleOnAttachStateChangeListener() {

                final BaseItemViewHolder this$0;
                final int val$cx;
                final int val$cy;
                final int val$endRadius;
                final Runnable val$runnable;
                final int val$startRadius;

                public void onViewAttachedToWindow(View view)
                {
                    view.removeOnAttachStateChangeListener(this);
                    createRevealAnimation(mQuickAddCartContainer, cx, cy, startRadius, endRadius, runnable).start();
                }

            
            {
                this$0 = BaseItemViewHolder.this;
                cx = i;
                cy = j;
                startRadius = k;
                endRadius = l;
                runnable = runnable1;
                super();
            }
            });
            return;
        } else
        {
            createRevealAnimation(mQuickAddCartContainer, cx, cy, startRadius, endRadius, endAction).start();
            return;
        }
    }

    public void changeToRegular()
    {
        changeToRegular(null);
    }

    protected void changeToRegular(final Runnable endAction)
    {
        mRegularContainer.setVisibility(0);
        final int cx = mRegularContainer.getWidth() - mRegularContainer.getPaddingRight() - mCartIcon.getWidth() / 2;
        final int cy = mRegularContainer.getHeight() - mRegularContainer.getPaddingBottom() - mCartIcon.getHeight() / 2;
        final int startRadius = Math.max(mQuickAddCartContainer.getWidth(), mQuickAddCartContainer.getHeight());
        final int endRadius = Math.min(mCartIcon.getWidth(), mCartIcon.getHeight());
        endAction = new Runnable() {

            final BaseItemViewHolder this$0;
            final Runnable val$endAction;

            public void run()
            {
                if (endAction != null)
                {
                    endAction.run();
                }
                mQuickAddCartContainer.setVisibility(4);
            }

            
            {
                this$0 = BaseItemViewHolder.this;
                endAction = runnable;
                super();
            }
        };
        if (android.os.Build.VERSION.SDK_INT > 21 && !mQuickAddCartAddButton.isAttachedToWindow())
        {
            mQuickAddCartContainer.addOnAttachStateChangeListener(new SimpleOnAttachStateChangeListener() {

                final BaseItemViewHolder this$0;
                final int val$cx;
                final int val$cy;
                final int val$endRadius;
                final Runnable val$runnable;
                final int val$startRadius;

                public void onViewAttachedToWindow(View view)
                {
                    view.removeOnAttachStateChangeListener(this);
                    createRevealAnimation(mQuickAddCartContainer, cx, cy, startRadius, endRadius, runnable).start();
                }

            
            {
                this$0 = BaseItemViewHolder.this;
                cx = i;
                cy = j;
                startRadius = k;
                endRadius = l;
                runnable = runnable1;
                super();
            }
            });
            return;
        } else
        {
            createRevealAnimation(mQuickAddCartContainer, cx, cy, startRadius, endRadius, endAction).start();
            return;
        }
    }

    public void populate(int i, BaseListItemModelState baselistitemmodelstate, ItemAdapterCallback itemadaptercallback)
    {
        byte byte0 = 4;
        boolean flag = false;
        mItemState = baselistitemmodelstate;
        mPositionInAdapter = i;
        mCallback = itemadaptercallback;
        itemadaptercallback = baselistitemmodelstate.getItem();
        Object obj = mRegularContainer.getContext();
        String s = itemadaptercallback.getName();
        boolean flag1;
        if (!TextUtils.isEmpty(s))
        {
            mItemName.setText(s);
        } else
        {
            mItemName.setText(0x7f090646);
        }
        if (!TextUtils.isEmpty(itemadaptercallback.getImageUrl()))
        {
            Picasso.with(((Context) (obj))).load(itemadaptercallback.getImageUrl()).error(0x7f02021b).into(mProductImage);
        } else
        {
            mProductImage.setImageResource(0x7f02021b);
        }
        setupPriceView(itemadaptercallback);
        setupRating(itemadaptercallback);
        setupCartView(itemadaptercallback.canAddToCart(), baselistitemmodelstate.isAddToCartInProgress());
        setupBundleView(itemadaptercallback);
        setupVariantView(itemadaptercallback);
        mHas.setText(Integer.toString(itemadaptercallback.getHasQuantity()));
        obj = mFullFilledFlag;
        if (itemadaptercallback.isFullFilled())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        mQuickAddCartItemName.setText(itemadaptercallback.getName());
        flag1 = itemadaptercallback.hasSubmapPrice();
        obj = mQuickAddCartSubmapView;
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        mQuickAddCartPriceView.setPrice(itemadaptercallback.getPrice());
        obj = mQuickAddCartPriceView;
        if (flag1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((ShelfPriceView) (obj)).setVisibility(i);
        obj = mQuickAddCartAddButton;
        if (itemadaptercallback.isPreorder())
        {
            i = 0x7f090467;
        } else
        {
            i = 0x7f09006a;
        }
        ((Button) (obj)).setText(i);
        mQuickAddCartQtyEditor.setCurrent(baselistitemmodelstate.getCartQuantity());
        obj = mRegularContainer;
        if (baselistitemmodelstate.isInCartState())
        {
            i = 4;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = mQuickAddCartContainer;
        i = byte0;
        if (baselistitemmodelstate.isInCartState())
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        baselistitemmodelstate = mShippingPassView;
        if (shouldShowShippingPass(itemadaptercallback))
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        baselistitemmodelstate.setVisibility(i);
        setupFlag(itemadaptercallback);
    }

    public void updateCartQuantity(int i)
    {
        mQuickAddCartQtyEditor.setCurrent(i);
    }


}
