// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.collections;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.Collection;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;
import java.util.ArrayList;

public class CollectionsFeedGridCellView extends StaggeredGridCellView
{
    private class ImageSettingRunnable
        implements Runnable
    {

        private boolean cancelled;
        private ArrayList imageUrls;
        final CollectionsFeedGridCellView this$0;

        public void markCancelled()
        {
            cancelled = true;
        }

        public void run()
        {
            if (!cancelled)
            {
                primaryImageView.getImageView().setImageUrl((String)imageUrls.get(0));
                topSecondaryImageView.getImageView().setImageUrl((String)imageUrls.get(1));
                bottomSecondaryImageView.getImageView().setImageUrl((String)imageUrls.get(2));
            }
        }

        public ImageSettingRunnable(ArrayList arraylist)
        {
            this$0 = CollectionsFeedGridCellView.this;
            super();
            imageUrls = arraylist;
            cancelled = false;
        }
    }


    private BorderedImageView bottomSecondaryImageView;
    private FrameLayout cellView;
    private Collection collection;
    private TextView collectionTitle;
    private Handler handler;
    private ImageSettingRunnable imageSettingRunnable;
    private BorderedImageView primaryImageView;
    private BorderedImageView topSecondaryImageView;

    public CollectionsFeedGridCellView(Context context)
    {
        super(context);
    }

    private void setImageDimensions(int i, int j, BorderedImageView borderedimageview)
    {
        borderedimageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, j));
    }

    public BorderedImageView getBottomSecondaryImageView()
    {
        return bottomSecondaryImageView;
    }

    public String getImageUrl(WishImage wishimage, int i)
    {
        if (i > 350)
        {
            return wishimage.getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large);
        } else
        {
            return wishimage.getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium);
        }
    }

    public BorderedImageView getPrimaryImageView()
    {
        return primaryImageView;
    }

    public BorderedImageView getTopSecondaryImageView()
    {
        return topSecondaryImageView;
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030049, getContentView());
        cellView = (FrameLayout)view.findViewById(0x7f0d01a9);
        primaryImageView = (BorderedImageView)view.findViewById(0x7f0d01ab);
        topSecondaryImageView = (BorderedImageView)view.findViewById(0x7f0d01ad);
        bottomSecondaryImageView = (BorderedImageView)view.findViewById(0x7f0d01ae);
        collectionTitle = (TextView)view.findViewById(0x7f0d01af);
        imageSettingRunnable = null;
        handler = new Handler();
        cellView.setOnClickListener(new android.view.View.OnClickListener() {

            final CollectionsFeedGridCellView this$0;

            public void onClick(View view1)
            {
                view1 = new Bundle();
                view1.putBoolean("ArgPlaceholderMode", false);
                view1.putString("ArgInitialCategory", collection.getInitialCategory());
                view1.putSerializable("ArgCategories", collection.getCategories());
                view1.putBoolean("ArgNotTopLevelMenuItem", true);
                view1.putString("ArgTitle", collection.getTitle());
                view1.putBoolean("ArgFeaturedProductCollection", true);
                FilterFeedFragment filterfeedfragment = new FilterFeedFragment();
                filterfeedfragment.setArguments(view1);
                handler.post(filterfeedfragment. new Runnable() {

                    final _cls1 this$1;
                    final FilterFeedFragment val$fragment;

                    public void run()
                    {
                        RootActivity rootactivity = (RootActivity)getContext();
                        rootactivity.setTitle(collectionTitle.getText());
                        rootactivity.setContentFragment(fragment, false);
                    }

            
            {
                this$1 = final__pcls1;
                fragment = FilterFeedFragment.this;
                super();
            }
                });
            }

            
            {
                this$0 = CollectionsFeedGridCellView.this;
                super();
            }
        });
    }

    public void prepareForRecycle()
    {
        releaseImages();
        setImageViewUrlsToNull();
    }

    public void releaseImages()
    {
        primaryImageView.getImageView().releaseImage();
        topSecondaryImageView.getImageView().releaseImage();
        bottomSecondaryImageView.getImageView().releaseImage();
    }

    public void restoreImages()
    {
        primaryImageView.getImageView().restoreImage();
        topSecondaryImageView.getImageView().restoreImage();
        bottomSecondaryImageView.getImageView().restoreImage();
    }

    public void setCollection(Collection collection1, int i, int j, long l)
    {
        collection = collection1;
        if (imageSettingRunnable != null)
        {
            removeCallbacks(imageSettingRunnable);
            imageSettingRunnable.markCancelled();
            imageSettingRunnable = null;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(getImageUrl(collection1.primaryImage(), j));
        arraylist.add(getImageUrl(collection1.secondaryImageOne(), j));
        arraylist.add(getImageUrl(collection1.secondaryImageTwo(), j));
        setImageViewUrlsToNull();
        imageSettingRunnable = new ImageSettingRunnable(arraylist);
        imageSettingRunnable.run();
        collectionTitle.setText(collection1.getTitle().toUpperCase());
    }

    public void setImageViewUrlsToNull()
    {
        primaryImageView.getImageView().setImageUrl(null);
        topSecondaryImageView.getImageView().setImageUrl(null);
        bottomSecondaryImageView.getImageView().setImageUrl(null);
    }

    public void setImageWidth(int i)
    {
        setImageDimensions((i * 3) / 4, i / 2, primaryImageView);
        setImageDimensions(i / 4, i / 4, topSecondaryImageView);
        setImageDimensions(i / 4, i / 4, bottomSecondaryImageView);
    }






}
