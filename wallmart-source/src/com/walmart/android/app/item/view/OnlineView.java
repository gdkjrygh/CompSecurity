// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import com.walmart.android.app.item.ItemPriceView;
import com.walmart.android.util.ShippingPassUtil;
import com.walmart.android.utils.ViewUtil;

public class OnlineView extends TableLayout
{
    public static final class AddToButtonState extends Enum
    {

        private static final AddToButtonState $VALUES[];
        public static final AddToButtonState DISABLED;
        public static final AddToButtonState ENABLED;
        public static final AddToButtonState GONE;

        public static AddToButtonState valueOf(String s)
        {
            return (AddToButtonState)Enum.valueOf(com/walmart/android/app/item/view/OnlineView$AddToButtonState, s);
        }

        public static AddToButtonState[] values()
        {
            return (AddToButtonState[])$VALUES.clone();
        }

        static 
        {
            ENABLED = new AddToButtonState("ENABLED", 0);
            DISABLED = new AddToButtonState("DISABLED", 1);
            GONE = new AddToButtonState("GONE", 2);
            $VALUES = (new AddToButtonState[] {
                ENABLED, DISABLED, GONE
            });
        }

        private AddToButtonState(String s, int i)
        {
            super(s, i);
        }
    }


    private Button mAddToCart;
    private View mAddToListsDivider;
    private Button mAddToRegistry;
    private Button mAddToWishList;
    private TextView mAvailability;
    private View mDeliveryDateMessagingSection;
    private TextView mListPrice;
    private View mPreOrderDivider;
    private TextView mPreorder;
    private ItemPriceView mPrice;
    private View mPriceContainer;
    private TextView mPricePerUnit;
    private TextView mPricePrefix;
    private View mPriceProgress;
    private TextView mPutDeliveryDateMessaging;
    private View mPutMessaging;
    private View mPutMessagingProgress;
    private TextView mPutMessagingText;
    private TextView mReturnPolicyTitle;
    private TextView mSeeOurPrice;
    private TextView mShipDeliveryDateMessaging;
    private View mShipMessaging;
    private TextView mShipMessagingText;
    private View mShippingOptionsMessagingSection;
    private View mShippingPassPromotionDivider;
    private View mShippingPassPromotionSection;
    private View mSoldByContainer;
    private TextView mSoldBySeller;
    private TextView mTitle;

    public OnlineView(Context context)
    {
        super(context);
    }

    public OnlineView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void showPriceRow(boolean flag)
    {
        int i = 0;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        int l = getPaddingBottom();
        byte byte0 = 8;
        if (flag)
        {
            i = ViewUtil.dpToPixels(20, getContext());
            byte0 = 0;
        }
        ViewUtil.findViewById(this, 0x7f1001bc).setVisibility(byte0);
        setPadding(j, i, k, l);
    }

    private void updateAddToButton(Button button, AddToButtonState addtobuttonstate)
    {
        int i;
        if (addtobuttonstate.equals(AddToButtonState.GONE))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        button.setEnabled(addtobuttonstate.equals(AddToButtonState.ENABLED));
        button.setVisibility(i);
        i = 8;
        if (mAddToRegistry.getVisibility() == 0 || mAddToWishList.getVisibility() == 0)
        {
            i = mShippingOptionsMessagingSection.getVisibility();
        }
        mAddToListsDivider.setVisibility(i);
    }

    private void updateDeliveryDateMessagingSectionVisibility()
    {
        boolean flag2 = false;
        View view;
        boolean flag;
        boolean flag1;
        int i;
        if (mShipDeliveryDateMessaging.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mPutDeliveryDateMessaging.getVisibility() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view = mDeliveryDateMessagingSection;
        i = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 8;
            }
        }
        view.setVisibility(i);
    }

    private void updateNewPriceWithAnimation(String s, Animation animation)
    {
        mPrice.setPrice(s);
        mPrice.postInvalidate();
        setPricePrefix(mPrice.getPrefix());
        mPriceContainer.startAnimation(animation);
    }

    public void hideAddToCart()
    {
        mAddToCart.setVisibility(8);
    }

    public void hidePutMessaging()
    {
        mPutMessaging.setVisibility(8);
        mPutMessagingText.setVisibility(8);
        mPutMessagingProgress.setVisibility(8);
    }

    public void hideSeeOurPrice()
    {
        mSeeOurPrice.setVisibility(8);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mTitle = (TextView)ViewUtil.findViewById(this, 0x7f1001c1);
        mPriceContainer = ViewUtil.findViewById(this, 0x7f1001bd);
        mPricePrefix = (TextView)ViewUtil.findViewById(this, 0x7f1001be);
        mPrice = (ItemPriceView)ViewUtil.findViewById(this, 0x7f1001bf);
        mPriceProgress = ViewUtil.findViewById(this, 0x7f1001c0);
        mListPrice = (TextView)ViewUtil.findViewById(this, 0x7f1001c2);
        mSeeOurPrice = (TextView)ViewUtil.findViewById(this, 0x7f1001c3);
        mAvailability = (TextView)ViewUtil.findViewById(this, 0x7f1001c4);
        mPricePerUnit = (TextView)ViewUtil.findViewById(this, 0x7f10017c);
        mAddToCart = (Button)ViewUtil.findViewById(this, 0x7f1001c9);
        mAddToRegistry = (Button)ViewUtil.findViewById(this, 0x7f1001a9);
        mAddToListsDivider = ViewUtil.findViewById(this, 0x7f1001ca);
        mAddToWishList = (Button)ViewUtil.findViewById(this, 0x7f1000b1);
        mPreorder = (TextView)ViewUtil.findViewById(this, 0x7f1001cb);
        mPreOrderDivider = ViewUtil.findViewById(this, 0x7f1001cc);
        mShippingPassPromotionDivider = ViewUtil.findViewById(this, 0x7f1001d0);
        mShippingPassPromotionSection = ViewUtil.findViewById(this, 0x7f1001cd);
        mShippingOptionsMessagingSection = ViewUtil.findViewById(this, 0x7f1001d1);
        mShipMessaging = ViewUtil.findViewById(this, 0x7f1001d2);
        mShipMessagingText = (TextView)ViewUtil.findViewById(this, 0x7f1001d3);
        mPutMessaging = ViewUtil.findViewById(this, 0x7f1001d4);
        mPutMessagingText = (TextView)ViewUtil.findViewById(this, 0x7f1001d5);
        mPutMessagingProgress = ViewUtil.findViewById(this, 0x7f1001d6);
        mShipDeliveryDateMessaging = (TextView)ViewUtil.findViewById(this, 0x7f1001d8);
        mPutDeliveryDateMessaging = (TextView)ViewUtil.findViewById(this, 0x7f1001d9);
        mDeliveryDateMessagingSection = ViewUtil.findViewById(this, 0x7f1001d7);
        mSoldByContainer = ViewUtil.findViewById(this, 0x7f1001c5);
        mSoldBySeller = (TextView)ViewUtil.findViewById(mSoldByContainer, 0x7f1001c6);
        mReturnPolicyTitle = (TextView)ViewUtil.findViewById(this, 0x7f1001c8);
        ((TextView)ViewUtil.findViewById(this, 0x7f1001cf)).setText(ShippingPassUtil.getShippingPassImageText(getContext(), 0x7f090568));
    }

    public void setAddToCartEnabled(boolean flag)
    {
        mAddToCart.setClickable(flag);
    }

    public void setAddToCartListener(android.view.View.OnClickListener onclicklistener)
    {
        mAddToCart.setOnClickListener(onclicklistener);
    }

    public void setAddToRegistryListener(android.view.View.OnClickListener onclicklistener)
    {
        mAddToRegistry.setOnClickListener(onclicklistener);
    }

    public void setAddToWishListListener(android.view.View.OnClickListener onclicklistener)
    {
        mAddToWishList.setOnClickListener(onclicklistener);
    }

    public void setAvailability(String s)
    {
        mAvailability.setText(s);
        TextView textview = mAvailability;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void setListPrice(CharSequence charsequence)
    {
        mListPrice.setText(charsequence);
        TextView textview = mListPrice;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void setPreorderMessage(CharSequence charsequence)
    {
        byte byte1 = 8;
        mPreorder.setText(charsequence);
        Object obj = mPreorder;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        obj = mPreOrderDivider;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
    }

    public void setPriceAndHideRowIfEmpty(String s)
    {
        boolean flag = false;
        mPriceProgress.setVisibility(8);
        mPrice.setPrice(s);
        ItemPriceView itempriceview = mPrice;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        itempriceview.setVisibility(byte0);
        if (mPrice.getVisibility() == 0)
        {
            flag = true;
        }
        showPriceRow(flag);
    }

    public void setPriceAnimated(final String price, Animation animation, final Animation in)
    {
        showPriceRow(true);
        if (mPriceProgress.getVisibility() == 0)
        {
            mPrice.setPrice(null);
            mPriceProgress.setVisibility(8);
        }
        if (TextUtils.isEmpty(price))
        {
            mPrice.setPrice(price);
            mPrice.setVisibility(4);
        } else
        if (!mPrice.hasPrice(price))
        {
            if (mPriceContainer.getWidth() <= 0 && mPriceContainer.getHeight() <= 0 || TextUtils.isEmpty(mPrice.getPrice()))
            {
                mPriceContainer.setVisibility(0);
                mPrice.setVisibility(0);
                updateNewPriceWithAnimation(price, in);
                return;
            } else
            {
                mPriceContainer.startAnimation(animation);
                animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final OnlineView this$0;
                    final Animation val$in;
                    final String val$price;

                    public void onAnimationEnd(Animation animation1)
                    {
                        updateNewPriceWithAnimation(price, in);
                    }

                    public void onAnimationRepeat(Animation animation1)
                    {
                    }

                    public void onAnimationStart(Animation animation1)
                    {
                        mPriceContainer.setVisibility(0);
                        mPrice.setVisibility(0);
                    }

            
            {
                this$0 = OnlineView.this;
                price = s;
                in = animation;
                super();
            }
                });
                return;
            }
        }
    }

    public void setPricePerUnit(String s)
    {
        mPricePerUnit.setText(Html.fromHtml(s));
        TextView textview = mPricePerUnit;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void setPricePrefix(String s)
    {
        mPricePrefix.setText(s);
        TextView textview = mPricePrefix;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void setPutDeliveryDateMessaging(String s)
    {
        mPutDeliveryDateMessaging.setText(s);
        TextView textview = mPutDeliveryDateMessaging;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        updateDeliveryDateMessagingSectionVisibility();
    }

    public void setPutMessaging(String s)
    {
        mPutMessagingText.setText(s);
    }

    public void setReturnPolicyListener(android.view.View.OnClickListener onclicklistener)
    {
        mReturnPolicyTitle.setOnClickListener(onclicklistener);
    }

    public void setSeeOurPrice(String s)
    {
        mSeeOurPrice.setText(s);
        mSeeOurPrice.setVisibility(0);
    }

    public void setShipDeliveryDateMessaging(String s)
    {
        mShipDeliveryDateMessaging.setText(s);
        TextView textview = mShipDeliveryDateMessaging;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        updateDeliveryDateMessagingSectionVisibility();
    }

    public void setShippingMessaging(CharSequence charsequence)
    {
        View view = mShipMessaging;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        mShipMessagingText.setText(charsequence);
    }

    public void setShippingOptionsMessagingEnabled(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        mShippingOptionsMessagingSection.setVisibility(i);
        mAddToListsDivider.setVisibility(i);
    }

    public void setShippingPassPromotionEnabled(boolean flag)
    {
        boolean flag1 = false;
        View view = mShippingPassPromotionSection;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = mShippingPassPromotionDivider;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setShippingPassPromotionListener(android.view.View.OnClickListener onclicklistener)
    {
        mShippingPassPromotionSection.setOnClickListener(onclicklistener);
    }

    public void setSoldBy(String s)
    {
        mSoldBySeller.setText(s);
        View view = mSoldByContainer;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    public void setTitle(int i)
    {
        mTitle.setText(i);
    }

    public void showAddToCart()
    {
        mAddToCart.setVisibility(0);
    }

    public void showPriceProgress()
    {
        mPriceProgress.setVisibility(0);
        mPrice.setVisibility(4);
    }

    public void showPutMessagingAnimatedIfAvailable(Animation animation, final Animation in)
    {
        if (mPutMessagingText.getText().length() > 0)
        {
            mPutMessaging.startAnimation(animation);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final OnlineView this$0;
                final Animation val$in;

                public void onAnimationEnd(Animation animation1)
                {
                    mPutMessagingText.setVisibility(0);
                    mPutMessagingProgress.setVisibility(8);
                    mPutMessaging.startAnimation(in);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                }

            
            {
                this$0 = OnlineView.this;
                in = animation;
                super();
            }
            });
        }
    }

    public void showPutMessagingIfAvailable()
    {
        boolean flag = false;
        Object obj;
        int i;
        int j;
        if (mPutMessagingText.getText().length() > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = mPutMessaging;
        if (i != 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((View) (obj)).setVisibility(j);
        obj = mPutMessagingText;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
        mPutMessagingProgress.setVisibility(8);
    }

    public void showPutProgress()
    {
        mPutMessagingText.setVisibility(8);
        mPutMessaging.setVisibility(0);
        mPutMessagingProgress.setVisibility(0);
    }

    public void showReturnPolicy()
    {
        ViewUtil.setVisibility(this, 0, new int[] {
            0x7f1001c7, 0x7f1001c8
        });
    }

    public void updateAddToCart(int i, boolean flag)
    {
        mAddToCart.setText(i);
        mAddToCart.setEnabled(flag);
    }

    public void updateAddToListState(AddToButtonState addtobuttonstate)
    {
        updateAddToButton(mAddToWishList, addtobuttonstate);
    }

    public void updateAddToRegistryState(AddToButtonState addtobuttonstate)
    {
        updateAddToButton(mAddToRegistry, addtobuttonstate);
    }






}
