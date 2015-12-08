// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishProductExtraImage;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.testing.WishTestingUtil;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import java.util.ArrayList;
import java.util.Locale;

public class ProductDetailsAddToCartModal extends FrameLayout
{
    public static final class BuyMode extends Enum
    {

        private static final BuyMode $VALUES[];
        public static final BuyMode BUY;

        public static BuyMode valueOf(String s)
        {
            return (BuyMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/ProductDetailsAddToCartModal$BuyMode, s);
        }

        public static BuyMode[] values()
        {
            return (BuyMode[])$VALUES.clone();
        }

        static 
        {
            BUY = new BuyMode("BUY", 0);
            $VALUES = (new BuyMode[] {
                BUY
            });
        }

        private BuyMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface Callback
    {

        public abstract void onAddToCart(String s, String s1, int i);

        public abstract void onAddToCartCancel();
    }


    public static final int MAX_QUANTITY = 15;
    private Button addToCartButton;
    private final String addToCartButtonText;
    private WishCredit applicableCredit;
    private Callback callback;
    private Button cancelButton;
    private TextView cancelTextView;
    private WishCartItem cartItem;
    private String colorPlaceholderString;
    private Spinner colorSpinner;
    private ArrayList currentColors;
    private ArrayList currentSizes;
    private boolean isFreeGift;
    private View modalView;
    private View priceLayout;
    private TextView priceLayoutMainText;
    private TextView priceLayoutSubText;
    private WishProduct product;
    private BorderedImageView productImageView;
    private String selectedColor;
    private int selectedQuantity;
    private String selectedSize;
    private String sizePlaceholderString;
    private Spinner sizeSpinner;
    private Button soldOutButton;

    public ProductDetailsAddToCartModal(Context context)
    {
        this(context, null);
    }

    public ProductDetailsAddToCartModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0, false, null);
    }

    public ProductDetailsAddToCartModal(Context context, AttributeSet attributeset, int i, boolean flag, String s)
    {
        super(context, attributeset, i);
        isFreeGift = flag;
        addToCartButtonText = s;
        init();
    }

    private void animateModalView()
    {
        if (modalView == null)
        {
            return;
        } else
        {
            int i = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight();
            modalView.setVisibility(0);
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, i, 0.0F);
            translateanimation.setFillAfter(false);
            translateanimation.setDuration(200L);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ProductDetailsAddToCartModal this$0;

                public void onAnimationEnd(Animation animation)
                {
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    modalView.setVisibility(0);
                }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
            });
            modalView.startAnimation(translateanimation);
            return;
        }
    }

    private void handleAddToCart()
    {
        if (selectedColor == null && product.getVariationColors().size() > 0 || selectedSize == null && product.getVariationSizes().size() > 0)
        {
            return;
        }
        Object obj = new LogService();
        if (isFreeGift)
        {
            ((LogService) (obj)).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_ADD_TO_CART_MODAL_BUY.getValue()), null, null, null);
        } else
        {
            ((LogService) (obj)).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_ADD_TO_CART_BUY.getValue()), null, null, null);
        }
        obj = product.getVariationId(selectedSize, selectedColor);
        if (productImageView != null)
        {
            productImageView.getImageView().releaseImage();
        }
        if (obj != null)
        {
            callback.onAddToCart(product.getProductId(), ((String) (obj)), selectedQuantity);
            return;
        } else
        {
            callback.onAddToCartCancel();
            return;
        }
    }

    private void handleCancel()
    {
        if (product != null)
        {
            LogService logservice = new LogService();
            if (isFreeGift)
            {
                logservice.requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_ADD_TO_CART_MODAL_CANCEL.getValue()), null, null, null);
            } else
            {
                logservice.requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_ADD_TO_CART_CANCEL.getValue()), null, null, null);
            }
        }
        if (productImageView != null)
        {
            productImageView.getImageView().releaseImage();
        }
        callback.onAddToCartCancel();
    }

    private void setAddToCartButtonEnabled(boolean flag)
    {
        if (flag)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 1.0F);
            alphaanimation.setDuration(0L);
            alphaanimation.setFillAfter(true);
            addToCartButton.startAnimation(alphaanimation);
            addToCartButton.setEnabled(true);
            return;
        } else
        {
            AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.5F);
            alphaanimation1.setDuration(0L);
            alphaanimation1.setFillAfter(true);
            addToCartButton.setEnabled(false);
            return;
        }
    }

    private void showPrice(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue, WishLocalizedCurrencyValue wishlocalizedcurrencyvalue1)
    {
        if (wishlocalizedcurrencyvalue == null)
        {
            priceLayout.setVisibility(8);
            return;
        }
        priceLayout.setVisibility(0);
        WishLocalizedCurrencyValue wishlocalizedcurrencyvalue2;
        if (applicableCredit != null)
        {
            wishlocalizedcurrencyvalue1 = wishlocalizedcurrencyvalue;
        } else
        if (wishlocalizedcurrencyvalue1 == null)
        {
            wishlocalizedcurrencyvalue1 = wishlocalizedcurrencyvalue;
        }
        wishlocalizedcurrencyvalue2 = wishlocalizedcurrencyvalue;
        if (applicableCredit != null)
        {
            wishlocalizedcurrencyvalue = wishlocalizedcurrencyvalue.subtract(applicableCredit.getValue());
            wishlocalizedcurrencyvalue2 = wishlocalizedcurrencyvalue;
            if (wishlocalizedcurrencyvalue.getValue() <= 0.0D)
            {
                wishlocalizedcurrencyvalue.zeroOutValue();
                wishlocalizedcurrencyvalue2 = wishlocalizedcurrencyvalue;
            }
        }
        if (wishlocalizedcurrencyvalue2.getValue() > 0.0D)
        {
            priceLayoutMainText.setText(wishlocalizedcurrencyvalue2.toFormattedString());
        } else
        {
            priceLayoutMainText.setText(getContext().getString(0x7f0601e1));
        }
        if (wishlocalizedcurrencyvalue1.getValue() > wishlocalizedcurrencyvalue2.getValue())
        {
            priceLayoutSubText.setVisibility(0);
            if (wishlocalizedcurrencyvalue1.getValue() > 0.0D)
            {
                priceLayoutSubText.setText(wishlocalizedcurrencyvalue1.toFormattedString());
                return;
            } else
            {
                priceLayoutSubText.setText(getContext().getString(0x7f0601e1));
                return;
            }
        } else
        {
            priceLayoutSubText.setVisibility(8);
            return;
        }
    }

    private void updateAddToCartButton()
    {
        if (selectedColor == null && product.getVariationColors().size() > 0 || selectedSize == null && product.getVariationSizes().size() > 0)
        {
            setAddToCartButtonEnabled(false);
            showPrice(null, null);
            addToCartButton.setVisibility(0);
            soldOutButton.setVisibility(8);
            WishImage wishimage = product.getImage();
            if (wishimage != null)
            {
                productImageView.getImageView().setImageUrl(wishimage.getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
            }
            return;
        }
        String s = product.getVariationId(selectedSize, selectedColor);
        WishImage wishimage2 = product.getImage();
        WishImage wishimage1 = wishimage2;
        if (s != null)
        {
            WishProductExtraImage wishproductextraimage = product.getVariationImage(s);
            wishimage1 = wishimage2;
            if (wishproductextraimage != null)
            {
                wishimage1 = wishimage2;
                if (wishproductextraimage.getImage() != null)
                {
                    wishimage1 = wishproductextraimage.getImage();
                }
            }
        }
        if (wishimage1 != null)
        {
            productImageView.getImageView().setImageUrl(wishimage1.getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        }
        if (s != null && product.isInStock(s))
        {
            addToCartButton.setVisibility(0);
            soldOutButton.setVisibility(8);
            setAddToCartButtonEnabled(true);
            if (isFreeGift)
            {
                showPrice(null, null);
                return;
            } else
            {
                showPrice(product.getVariationPrice(s), product.getVariationRetailPrice(s));
                return;
            }
        }
        addToCartButton.clearAnimation();
        addToCartButton.setVisibility(8);
        soldOutButton.setVisibility(0);
        if (s != null)
        {
            if (isFreeGift)
            {
                showPrice(null, null);
                return;
            } else
            {
                showPrice(product.getVariationPrice(s), product.getVariationRetailPrice(s));
                return;
            }
        } else
        {
            showPrice(null, null);
            return;
        }
    }

    public void handleCartOptionChange()
    {
        callback.onAddToCart(null, null, selectedQuantity);
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030077, this);
        selectedSize = null;
        selectedColor = null;
        selectedQuantity = 1;
        modalView = view.findViewById(0x7f0d0244);
        productImageView = (BorderedImageView)view.findViewById(0x7f0d024f);
        productImageView.getImageView().setRequestedImageWidth(140);
        productImageView.getImageView().setRequestedImageHeight(140);
        cancelTextView = (TextView)view.findViewById(0x7f0d0250);
        cancelTextView.setPaintFlags(cancelTextView.getPaintFlags() | 8);
        cancelTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsAddToCartModal this$0;

            public void onClick(View view1)
            {
                handleCancel();
            }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
        });
        colorSpinner = (Spinner)view.findViewById(0x7f0d0248);
        WishTestingUtil.addContentDescription(colorSpinner, getClass().getSimpleName(), "colorSpinner");
        sizeSpinner = (Spinner)view.findViewById(0x7f0d0246);
        WishTestingUtil.addContentDescription(sizeSpinner, getClass().getSimpleName(), "sizeSpinner");
        addToCartButton = (Button)view.findViewById(0x7f0d024b);
        WishTestingUtil.addContentDescription(addToCartButton, getClass().getSimpleName(), "addToCartButton");
        soldOutButton = (Button)view.findViewById(0x7f0d024a);
        priceLayout = view.findViewById(0x7f0d024c);
        priceLayoutMainText = (TextView)view.findViewById(0x7f0d024e);
        priceLayoutSubText = (TextView)view.findViewById(0x7f0d024d);
        priceLayoutSubText.setPaintFlags(priceLayoutSubText.getPaintFlags() | 0x10);
        addToCartButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsAddToCartModal this$0;

            public void onClick(View view1)
            {
                handleAddToCart();
            }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
        });
        soldOutButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsAddToCartModal this$0;

            public void onClick(View view1)
            {
            }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
        });
        if (addToCartButtonText != null && isFreeGift)
        {
            addToCartButton.setText(addToCartButtonText);
        } else
        {
            addToCartButton.setText(getContext().getString(0x7f0600b6));
        }
        Locale.getDefault();
        sizePlaceholderString = getContext().getString(0x7f0603e9).toUpperCase(Locale.getDefault());
        colorPlaceholderString = getContext().getString(0x7f0600ed).toUpperCase(Locale.getDefault());
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    public void setBuyMode(BuyMode buymode)
    {
        static class _cls8
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$ProductDetailsAddToCartModal$BuyMode[] = new int[BuyMode.values().length];

        }

        int i = _cls8..SwitchMap.com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal.BuyMode[buymode.ordinal()];
        addToCartButton.setText(getContext().getString(0x7f060054));
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    public void setCartItem(WishCartItem wishcartitem)
    {
        cartItem = wishcartitem;
        addToCartButton.setText(getContext().getString(0x7f0600d5));
        addToCartButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsAddToCartModal this$0;

            public void onClick(View view)
            {
                handleCartOptionChange();
            }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
        });
        soldOutButton.setVisibility(8);
        sizeSpinner.setVisibility(8);
        colorSpinner.setVisibility(8);
        animateModalView();
    }

    public void setProduct(WishProduct wishproduct, WishCredit wishcredit)
    {
        product = wishproduct;
        applicableCredit = wishcredit;
        if (product.getVariationSizes().size() > 0)
        {
            sizeSpinner.setVisibility(0);
            currentSizes = new ArrayList();
            if (product.getVariationSizes().size() > 1)
            {
                currentSizes.add(sizePlaceholderString);
            } else
            {
                selectedSize = (String)product.getVariationSizes().get(0);
            }
            currentSizes.addAll(product.getVariationSizes());
            wishcredit = new ArrayAdapter(getContext(), 0x7f03001c, currentSizes);
            wishcredit.setDropDownViewResource(0x7f03001b);
            sizeSpinner.setAdapter(wishcredit);
            sizeSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final ProductDetailsAddToCartModal this$0;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    adapterview = (String)currentSizes.get(i);
                    if (selectedSize != null && selectedSize.equals(adapterview))
                    {
                        return;
                    }
                    if (!adapterview.equals(sizePlaceholderString))
                    {
                        selectedSize = adapterview;
                    } else
                    {
                        selectedSize = null;
                    }
                    updateAddToCartButton();
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
            });
        } else
        {
            sizeSpinner.setVisibility(8);
        }
        if (product.getVariationColors().size() > 0)
        {
            colorSpinner.setVisibility(0);
            currentColors = new ArrayList();
            if (product.getVariationColors().size() > 1)
            {
                currentColors.add(colorPlaceholderString);
            } else
            {
                selectedColor = (String)product.getVariationColors().get(0);
            }
            currentColors.addAll(product.getVariationColors());
            wishcredit = new ArrayAdapter(getContext(), 0x7f03001c, currentColors);
            wishcredit.setDropDownViewResource(0x7f03001b);
            colorSpinner.setAdapter(wishcredit);
            colorSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final ProductDetailsAddToCartModal this$0;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    adapterview = (String)currentColors.get(i);
                    if (selectedColor != null && selectedColor.equals(adapterview))
                    {
                        return;
                    }
                    if (!adapterview.equals(colorPlaceholderString))
                    {
                        selectedColor = adapterview;
                    } else
                    {
                        selectedColor = null;
                    }
                    updateAddToCartButton();
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = ProductDetailsAddToCartModal.this;
                super();
            }
            });
        } else
        {
            colorSpinner.setVisibility(8);
        }
        updateAddToCartButton();
        wishcredit = new LogService();
        if (isFreeGift)
        {
            wishcredit.requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFT_ADD_TO_CART_MODAL.getValue()), null, null, null);
        } else
        {
            wishcredit.requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_ADDED_TO_CART_MODAL.getValue()), null, null, null);
        }
        if (productImageView != null && wishproduct.getImage() != null)
        {
            productImageView.getImageView().setImageUrl(wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        }
        animateModalView();
    }







/*
    static String access$402(ProductDetailsAddToCartModal productdetailsaddtocartmodal, String s)
    {
        productdetailsaddtocartmodal.selectedSize = s;
        return s;
    }

*/






/*
    static String access$802(ProductDetailsAddToCartModal productdetailsaddtocartmodal, String s)
    {
        productdetailsaddtocartmodal.selectedColor = s;
        return s;
    }

*/

}
