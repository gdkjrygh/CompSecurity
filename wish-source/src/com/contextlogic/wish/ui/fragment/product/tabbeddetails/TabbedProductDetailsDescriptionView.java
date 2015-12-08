// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.components.scrollview.ListeningScrollView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView, TabbedProductDetailsFragment

public class TabbedProductDetailsDescriptionView extends TabbedProductDetailsPagerView
    implements com.contextlogic.wish.ui.components.scrollview.ListeningScrollView.ScrollViewListener
{

    private TextView descriptionText;
    private View rootLayout;
    private ListeningScrollView scroller;
    private View spacerView;

    public TabbedProductDetailsDescriptionView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsDescriptionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsDescriptionView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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
        rootLayout = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300af, this);
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
        scroller = (ListeningScrollView)rootLayout.findViewById(0x7f0d0385);
        scroller.setScrollViewListener(this);
        setupScroller(scroller);
        spacerView = rootLayout.findViewById(0x7f0d0386);
        tabbedproductdetailsfragment = new android.widget.LinearLayout.LayoutParams(-1, tabbedproductdetailsfragment.getTabBarStripHeight());
        spacerView.setLayoutParams(tabbedproductdetailsfragment);
        descriptionText = (TextView)rootLayout.findViewById(0x7f0d0387);
        descriptionText.setText(wishproduct.getDescription());
    }
}
