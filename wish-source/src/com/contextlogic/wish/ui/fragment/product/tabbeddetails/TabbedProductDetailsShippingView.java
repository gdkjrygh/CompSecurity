// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.scrollview.ListeningScrollView;
import com.contextlogic.wish.ui.fragment.product.description.ProductDetailsDescriptionFragment;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.LocaleUtil;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView, ProductDetailsDescriptionRow, TabbedProductDetailsFragment

public class TabbedProductDetailsShippingView extends TabbedProductDetailsPagerView
    implements com.contextlogic.wish.ui.components.scrollview.ListeningScrollView.ScrollViewListener
{

    private View rootLayout;
    private ListeningScrollView scroller;
    private LinearLayout shippingDescriptionContainer;
    private TextView shippingOfferText;
    private TextView shippingOfferTitle;
    private View shippingOfferView;
    private View spacerView;

    public TabbedProductDetailsShippingView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsShippingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsShippingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void addShippingDetailItems()
    {
        Object obj1 = null;
        Object obj;
        if (product.getShippingPrice().getValue() <= 0.0D)
        {
            obj = getContext().getString(0x7f0601e1);
        } else
        {
            obj = product.getShippingPrice().toFormattedString();
        }
        if (product.getShippingPriceCountry() != null)
        {
            obj1 = getContext().getString(0x7f06043a, new Object[] {
                product.getShippingPriceCountry()
            });
        }
        obj = createDescriptionRow(getContext().getString(0x7f060116), ((String) (obj)), ((String) (obj1)));
        ((ProductDetailsDescriptionRow) (obj)).getSubDescriptionTextView().setTextColor(getResources().getColor(0x7f0c00ab));
        shippingDescriptionContainer.addView(((View) (obj)));
        obj = createBottomBorder();
        shippingDescriptionContainer.addView(((View) (obj)));
        obj = createDescriptionRow(getContext().getString(0x7f060119), product.getShippingCountriesString(), null);
        obj1 = createBottomBorder();
        shippingDescriptionContainer.addView(((View) (obj)));
        shippingDescriptionContainer.addView(((View) (obj1)));
        obj = createDescriptionRow(getContext().getString(0x7f060118), product.getShippingTimeString(), null);
        obj1 = createBottomBorder();
        shippingDescriptionContainer.addView(((View) (obj)));
        shippingDescriptionContainer.addView(((View) (obj1)));
        if (product.getShipsFrom() != null)
        {
            obj = createDescriptionRow(getContext().getString(0x7f06011e), product.getShipsFrom(), null);
            obj1 = createBottomBorder();
            shippingDescriptionContainer.addView(((View) (obj)));
            shippingDescriptionContainer.addView(((View) (obj1)));
        }
        obj1 = null;
        obj = obj1;
        if (product.getReturnPolicyShortString() != null)
        {
            obj = obj1;
            if (!product.getReturnPolicyShortString().equals(product.getReturnPolicyLongString()))
            {
                obj = getContext().getString(0x7f060121);
            }
        }
        obj1 = createDescriptionRow(getContext().getString(0x7f060117), product.getReturnPolicyShortString(), ((String) (obj)));
        ((ProductDetailsDescriptionRow) (obj1)).getDescriptionTextView().setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsShippingView this$0;

            public void onClick(View view)
            {
                clickReturnPolicy();
            }

            
            {
                this$0 = TabbedProductDetailsShippingView.this;
                super();
            }
        });
        if (obj != null)
        {
            ((ProductDetailsDescriptionRow) (obj1)).getSubDescriptionTextView().setOnClickListener(new android.view.View.OnClickListener() {

                final TabbedProductDetailsShippingView this$0;

                public void onClick(View view)
                {
                    clickReturnPolicy();
                }

            
            {
                this$0 = TabbedProductDetailsShippingView.this;
                super();
            }
            });
            obj = (android.widget.LinearLayout.LayoutParams)((ProductDetailsDescriptionRow) (obj1)).getSubDescriptionTextView().getLayoutParams();
            obj.gravity = 5;
            ((ProductDetailsDescriptionRow) (obj1)).getSubDescriptionTextView().setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        shippingDescriptionContainer.addView(((View) (obj1)));
    }

    private void clickReturnPolicy()
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.ReturnPolicySelect, com.contextlogic.wish.analytics.Analytics.PageViewType.ProductDetailsMainTab, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        ProductDetailsDescriptionFragment productdetailsdescriptionfragment = new ProductDetailsDescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgDescription", product.getReturnPolicyLongString());
        bundle.putString("ArgTitle", getContext().getString(0x7f060379));
        productdetailsdescriptionfragment.setArguments(bundle);
        ((RootActivity)fragment.getActivity()).setModalContentFragment(productdetailsdescriptionfragment, true);
    }

    private View createBottomBorder()
    {
        View view = new View(getContext());
        view.setBackgroundColor(getResources().getColor(0x7f0c00d6));
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 1.0F, getResources().getDisplayMetrics())));
        return view;
    }

    private ProductDetailsDescriptionRow createDescriptionRow(String s, String s1, String s2)
    {
        ProductDetailsDescriptionRow productdetailsdescriptionrow = new ProductDetailsDescriptionRow(getContext());
        if (LocaleUtil.deviceLocaleBeginsWith("de"))
        {
            productdetailsdescriptionrow.setTitleColumnWidth(136);
        }
        productdetailsdescriptionrow.setTitle(s);
        productdetailsdescriptionrow.setDescription(s1);
        productdetailsdescriptionrow.setSubDescription(s2);
        return productdetailsdescriptionrow;
    }

    public void cleanup()
    {
        releaseImages();
    }

    public int getCurrentScrollY()
    {
        if (scroller != null)
        {
            return scroller.getScrollY();
        } else
        {
            return 0;
        }
    }

    public void handleOrientationChanged()
    {
    }

    protected void init()
    {
        super.init();
        rootLayout = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300b5, this);
    }

    public void onScrollChanged(int i, int j)
    {
        handleScrollChanged(i, j);
    }

    public void refreshWishStates(boolean flag)
    {
    }

    public void releaseImages()
    {
    }

    public void restoreImages()
    {
    }

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        super.setup(wishproduct, i, tabbedproductdetailsfragment);
        shippingOfferView = rootLayout.findViewById(0x7f0d03db);
        shippingOfferTitle = (TextView)rootLayout.findViewById(0x7f0d03dd);
        shippingOfferText = (TextView)rootLayout.findViewById(0x7f0d03de);
        if (wishproduct.getShippingOfferText() != null && wishproduct.getShippingOfferTitle() != null)
        {
            shippingOfferView.setVisibility(0);
            shippingOfferTitle.setText(wishproduct.getShippingOfferTitle());
            shippingOfferText.setText(wishproduct.getShippingOfferText());
            BitmapUtil.safeSetImageResource((ImageView)rootLayout.findViewById(0x7f0d03dc), 0x7f020123);
        } else
        {
            shippingOfferView.setVisibility(8);
        }
        scroller = (ListeningScrollView)rootLayout.findViewById(0x7f0d03d8);
        scroller.setScrollViewListener(this);
        setupScroller(scroller);
        spacerView = rootLayout.findViewById(0x7f0d03d9);
        wishproduct = new android.widget.LinearLayout.LayoutParams(-1, tabbedproductdetailsfragment.getTabBarStripHeight());
        spacerView.setLayoutParams(wishproduct);
        shippingDescriptionContainer = (LinearLayout)rootLayout.findViewById(0x7f0d03da);
        addShippingDetailItems();
    }

}
