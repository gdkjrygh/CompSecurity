// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.photos;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishProductExtraImage;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.photos:
//            ProductPhotosAdapter

public class ProductPhotosFragment extends BaseContentFragment
{

    public static final String ARG_IMAGE_URL_STRING = "ArgImageUrlString";
    public static final String ARG_PRODUCT = "ArgProduct";
    public static final String ARG_START_INDEX = "ArgStartIndex";
    private ProductPhotosAdapter adapter;
    private ViewPager pager;
    private WishProduct product;
    private String singleImageUrlString;
    private TextView sizeText;
    private int startIndex;
    private TextView uploadedByText;
    private BorderedImageView uploaderImage;
    private View uploaderLayout;
    private TextView uploaderText;

    public ProductPhotosFragment()
    {
    }

    private void handlePageSelected(int i)
    {
        startIndex = i;
        refreshTitle();
        refreshUploader();
    }

    private void refreshTitle()
    {
        getNavigationBar().setTitle(String.format(getString(0x7f06034e), new Object[] {
            Integer.valueOf(pager.getCurrentItem() + 1), Integer.valueOf(adapter.getCount())
        }));
    }

    private void refreshUploader()
    {
        int i = pager.getCurrentItem();
        if (singleImageUrlString != null || i == 0)
        {
            uploaderLayout.setVisibility(8);
            uploaderImage.getImageView().setImageUrl(null);
            uploaderText.setText(null);
            return;
        }
        WishProductExtraImage wishproductextraimage = (WishProductExtraImage)product.getExtraPhotos().get(i - 1);
        if (wishproductextraimage.getUploader() != null && wishproductextraimage.getUploader().getName() != null && wishproductextraimage.getUploader().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium) != null)
        {
            uploaderLayout.setVisibility(0);
            uploaderImage.getImageView().setImageUrl(wishproductextraimage.getUploader().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium));
            uploaderText.setText(wishproductextraimage.getUploader().getName());
            if (wishproductextraimage.getSize() != null)
            {
                uploaderText.setVisibility(8);
                uploadedByText.setText(wishproductextraimage.getUploader().getName());
                sizeText.setVisibility(0);
                sizeText.setText(getString(0x7f0603ea, new Object[] {
                    wishproductextraimage.getSize()
                }));
                return;
            } else
            {
                uploadedByText.setText(getString(0x7f06045b));
                sizeText.setVisibility(8);
                uploaderText.setVisibility(0);
                return;
            }
        } else
        {
            uploaderLayout.setVisibility(8);
            uploaderImage.getImageView().setImageUrl(null);
            uploaderText.setText(null);
            return;
        }
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03008c;
    }

    public void handleResume()
    {
        super.handleResume();
        refreshTitle();
        refreshUploader();
    }

    protected void initializeUi(View view)
    {
        adapter = new ProductPhotosAdapter(getActivity(), product, singleImageUrlString);
        uploaderLayout = view.findViewById(0x7f0d02a4);
        uploaderImage = (BorderedImageView)view.findViewById(0x7f0d02a5);
        uploaderText = (TextView)view.findViewById(0x7f0d02a8);
        uploadedByText = (TextView)view.findViewById(0x7f0d02a7);
        sizeText = (TextView)view.findViewById(0x7f0d02a6);
        uploaderImage.getImageView().setRequestedImageWidth(40);
        uploaderImage.getImageView().setRequestedImageHeight(40);
        pager = (ViewPager)view.findViewById(0x7f0d02a3);
        pager.setAdapter(adapter);
        pager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final ProductPhotosFragment this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                handlePageSelected(i);
            }

            
            {
                this$0 = ProductPhotosFragment.this;
                super();
            }
        });
        pager.setCurrentItem(startIndex);
        refreshTitle();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        product = (WishProduct)getArguments().getSerializable("ArgProduct");
        singleImageUrlString = getArguments().getString("ArgImageUrlString");
        startIndex = getArguments().getInt("ArgStartIndex");
    }

    public void onPause()
    {
        super.onPause();
    }

}
