// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.flag;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.service.FlagProductService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;

public class FlagProductFragment extends BaseContentFragment
{

    public static final String ARG_PRODUCT = "ArgProduct";
    private BorderedImageView flagProductImage;
    private EditText flagProductMessage;
    private TextView flagProductTitle;
    private WishProduct product;

    public FlagProductFragment()
    {
    }

    private void handleSend()
    {
        Object obj = (InputMethodManager)getActivity().getSystemService("input_method");
        if (obj != null)
        {
            ((InputMethodManager) (obj)).hideSoftInputFromWindow(flagProductMessage.getWindowToken(), 0);
        }
        obj = flagProductMessage.getText().toString();
        if (obj != null && !((String) (obj)).trim().equals(""))
        {
            flagProductMessage.setEnabled(false);
            (new FlagProductService()).requestService(product.getProductId(), ((String) (obj)), null, null);
            finishFragment();
            PopupAlertDialog.showSuccess(getActivity(), getString(0x7f060436), getString(0x7f060185));
            return;
        } else
        {
            PopupAlertDialog.showError(getActivity(), getString(0x7f06030d), getString(0x7f060183), false);
            return;
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.FlagProduct;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03005a;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060164));
        getNavigationBar().setMenuItem(getString(0x7f0603a8), 0, new NavigationBarButtonCallback() {

            final FlagProductFragment this$0;

            public void onMenuItemClicked()
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Send);
                handleSend();
            }

            
            {
                this$0 = FlagProductFragment.this;
                super();
            }
        });
        flagProductTitle = (TextView)view.findViewById(0x7f0d01e9);
        flagProductMessage = (EditText)view.findViewById(0x7f0d01ea);
        flagProductImage = (BorderedImageView)view.findViewById(0x7f0d01e8);
        flagProductImage.getImageView().setRequestedImageHeight(60);
        flagProductImage.getImageView().setRequestedImageWidth(60);
        flagProductImage.getImageView().setImageUrl(product.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        flagProductTitle.setText(product.getName());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        product = (WishProduct)getArguments().getSerializable("ArgProduct");
    }

    public boolean useCanvasBackground()
    {
        return true;
    }

}
