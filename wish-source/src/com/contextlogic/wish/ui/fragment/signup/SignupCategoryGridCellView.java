// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishSignupCategory;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.BitmapUtil;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryFragment

public class SignupCategoryGridCellView extends StaggeredGridCellView
{
    private class ImageSettingRunnable
        implements Runnable
    {

        private boolean cancelled;
        final SignupCategoryGridCellView this$0;

        public void markCancelled()
        {
            cancelled = true;
        }

        public void run()
        {
            if (!cancelled)
            {
                ArrayList arraylist = new ArrayList();
                for (Iterator iterator = category.getPreviews().iterator(); iterator.hasNext(); arraylist.add(((WishImage)iterator.next()).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium))) { }
                imageView1.getImageView().setImageUrl((String)arraylist.get(0));
                imageView2.getImageView().setImageUrl((String)arraylist.get(1));
                imageView3.getImageView().setImageUrl((String)arraylist.get(2));
                imageView4.getImageView().setImageUrl((String)arraylist.get(3));
            }
        }

        private ImageSettingRunnable()
        {
            this$0 = SignupCategoryGridCellView.this;
            super();
        }

    }

    public static interface SignupCategoryCellFragment
    {

        public abstract boolean isWishPending(String s);
    }


    private WishSignupCategory category;
    private SignupCategoryCellFragment fragment;
    private ImageSettingRunnable imageSettingRunnable;
    private BorderedImageView imageView1;
    private BorderedImageView imageView2;
    private BorderedImageView imageView3;
    private BorderedImageView imageView4;
    private View wishBackView;
    private ImageView wishCheckImage;
    private ProgressBar wishLoadingSpinner;

    public SignupCategoryGridCellView(Context context)
    {
        super(context);
    }

    public String getImageUrl(WishProduct wishproduct, int i)
    {
        if (i > 350)
        {
            return wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large);
        } else
        {
            return wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium);
        }
    }

    public BorderedImageView getImageView()
    {
        return imageView1;
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300a1, getContentView());
        wishLoadingSpinner = (ProgressBar)view.findViewById(0x7f0d033c);
        wishCheckImage = (ImageView)view.findViewById(0x7f0d033d);
        BitmapUtil.safeSetImageResource(wishCheckImage, 0x7f0200e9);
        imageView1 = (BorderedImageView)view.findViewById(0x7f0d0337);
        imageView2 = (BorderedImageView)view.findViewById(0x7f0d0338);
        imageView3 = (BorderedImageView)view.findViewById(0x7f0d0339);
        imageView4 = (BorderedImageView)view.findViewById(0x7f0d033a);
        wishBackView = view.findViewById(0x7f0d033b);
        imageSettingRunnable = null;
    }

    public void prepareForRecycle()
    {
        imageView1.getImageView().releaseImage();
        imageView1.getImageView().setImageUrl(null);
        imageView2.getImageView().releaseImage();
        imageView2.getImageView().setImageUrl(null);
        imageView3.getImageView().releaseImage();
        imageView3.getImageView().setImageUrl(null);
        imageView4.getImageView().releaseImage();
        imageView4.getImageView().setImageUrl(null);
    }

    public void refreshWishState()
    {
        if (fragment == null || category == null)
        {
            return;
        }
        if (fragment.isWishPending(category.getId()))
        {
            wishCheckImage.setVisibility(8);
            wishLoadingSpinner.setVisibility(0);
            wishBackView.setVisibility(0);
            return;
        }
        if (category.isAlreadyWishing())
        {
            wishLoadingSpinner.setVisibility(8);
            wishCheckImage.setVisibility(0);
            wishBackView.setVisibility(0);
            return;
        } else
        {
            wishBackView.setVisibility(8);
            return;
        }
    }

    public void releaseImages()
    {
        imageView1.getImageView().releaseImage();
        imageView2.getImageView().releaseImage();
        imageView3.getImageView().releaseImage();
        imageView4.getImageView().releaseImage();
    }

    public void restoreImages()
    {
        imageView1.getImageView().restoreImage();
        imageView2.getImageView().restoreImage();
        imageView3.getImageView().restoreImage();
        imageView4.getImageView().restoreImage();
    }

    public void setCategory(WishSignupCategory wishsignupcategory, int i, int j, long l)
    {
        imageView1.getImageView().setRequestedImageWidthPx(j);
        imageView1.getImageView().setRequestedImageHeightPx(j);
        imageView2.getImageView().setRequestedImageWidthPx(j);
        imageView2.getImageView().setRequestedImageHeightPx(j);
        imageView3.getImageView().setRequestedImageWidthPx(j);
        imageView3.getImageView().setRequestedImageHeightPx(j);
        imageView4.getImageView().setRequestedImageWidthPx(j);
        imageView4.getImageView().setRequestedImageHeightPx(j);
        category = wishsignupcategory;
        if (imageSettingRunnable != null)
        {
            removeCallbacks(imageSettingRunnable);
            imageSettingRunnable.markCancelled();
            imageSettingRunnable = null;
        }
        refreshWishState();
        imageSettingRunnable = new ImageSettingRunnable();
        if (l > 0L)
        {
            postDelayed(imageSettingRunnable, l);
            return;
        } else
        {
            imageSettingRunnable.run();
            return;
        }
    }

    public void setFragment(SignupCategoryFragment signupcategoryfragment)
    {
        fragment = signupcategoryfragment;
    }





}
