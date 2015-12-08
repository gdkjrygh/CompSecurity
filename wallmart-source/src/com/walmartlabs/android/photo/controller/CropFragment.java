// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.RefreshTimer;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.crop.CropView;

public class CropFragment extends Fragment
{

    public static final String EXTRA_PHOTO_SPEC = "photo_spec";
    public static final String EXTRA_PRODUCT = "product";
    private static final String TAG = com/walmartlabs/android/photo/controller/CropFragment.getSimpleName();
    private PhotoDrawable mBitmapDrawable;
    private BitmapLoadTask mBitmapLoadTask;
    private CropView mCropView;
    private Menu mOptionsMenu;
    private PhotoSpecification mPhotoSpec;
    private PhotoProduct mProduct;
    private View mView;

    public CropFragment()
    {
    }

    public static CropFragment newInstance(PhotoSpecification photospecification, PhotoProduct photoproduct)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("photo_spec", photospecification);
        bundle.putParcelable("product", photoproduct);
        photospecification = new CropFragment();
        photospecification.setArguments(bundle);
        return photospecification;
    }

    private void refreshData()
    {
        mBitmapLoadTask = new BitmapLoadTask(getActivity(), 2, 640, 480, new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

            final CropFragment this$0;

            public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
            {
                if (photodrawable == null || photodrawable.getBitmap() == null)
                {
                    if (getFragmentManager().findFragmentByTag("failed_to_load_dialog") == null)
                    {
                        photodrawable = DialogFactory.createAlertDialog(getString(com.walmartlabs.android.photo.R.string.photo_crop_failed_to_load_title), getString(com.walmartlabs.android.photo.R.string.photo_crop_failed_to_load_message), getActivity(), new android.content.DialogInterface.OnClickListener() {

                            final _cls3 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                doExit();
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                        photodrawable.setCancelable(false);
                        photodrawable.show();
                    }
                    return;
                }
                if (mBitmapDrawable != null)
                {
                    mBitmapDrawable.setIsDisplayed(false);
                }
                mBitmapDrawable = photodrawable;
                PhotoLogger.get().d(CropFragment.TAG, (new StringBuilder()).append("Loaded bitmap for cropping: ").append(mBitmapDrawable.getBitmap().getWidth()).append(" x ").append(mBitmapDrawable.getBitmap().getHeight()).toString());
                photodrawable = mPhotoSpec.getConfigurationForProduct(mProduct);
                int i;
                int j;
                if (photodrawable != null)
                {
                    photodrawable = photodrawable.getCrop();
                } else
                {
                    photodrawable = null;
                }
                i = Math.max(mProduct.getWidth(), mProduct.getHeight());
                j = Math.min(mProduct.getWidth(), mProduct.getHeight());
                mBitmapDrawable.setIsDisplayed(true);
                mCropView.setBitmapAndPrintSize(mBitmapDrawable.getBitmap(), i, j, mProduct.getShortProductName(), photodrawable);
                if (mOptionsMenu == null) goto _L2; else goto _L1
_L1:
                photodrawable = mOptionsMenu.findItem(com.walmartlabs.android.photo.R.id.orientation);
                if (mCropView == null || !mCropView.isLandscape()) goto _L4; else goto _L3
_L3:
                photodrawable.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_portrait));
                photodrawable.setIcon(com.walmartlabs.android.photo.R.drawable.photo_crop_portrait);
_L2:
                mView.findViewById(com.walmartlabs.android.photo.R.id.bottom_layout).setVisibility(0);
                mCropView.setVisibility(0);
                mView.findViewById(com.walmartlabs.android.photo.R.id.progress).setVisibility(8);
                return;
_L4:
                if (mCropView != null)
                {
                    photodrawable.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_landscape));
                    photodrawable.setIcon(com.walmartlabs.android.photo.R.drawable.photo_crop_landscape);
                }
                if (true) goto _L2; else goto _L5
_L5:
            }

            public void onTaskCancelled(Bitmap bitmap)
            {
            }

            
            {
                this$0 = CropFragment.this;
                super();
            }
        }) {

            final CropFragment this$0;

            protected boolean shouldCache()
            {
                return false;
            }

            
            {
                this$0 = CropFragment.this;
                super(context, i, j, k, bitmaploadcallback);
            }
        };
        mBitmapLoadTask.execute(new DevicePhoto[] {
            mPhotoSpec.getPhoto()
        });
    }

    public void doExit()
    {
        getFragmentManager().popBackStack();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(com.walmartlabs.android.photo.R.menu.photo_crop_menu, menu);
        mOptionsMenu = menu;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mView = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_crop, viewgroup, false);
        layoutinflater = getArguments();
        layoutinflater.setClassLoader(com/walmartlabs/android/photo/model/order/PhotoSpecification.getClassLoader());
        mPhotoSpec = (PhotoSpecification)layoutinflater.getParcelable("photo_spec");
        mProduct = (PhotoProduct)layoutinflater.getParcelable("product");
        mCropView = (CropView)mView.findViewById(com.walmartlabs.android.photo.R.id.cropview);
        ((Button)mView.findViewById(com.walmartlabs.android.photo.R.id.crop_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final CropFragment this$0;

            public void onClick(View view)
            {
                view = mCropView.getCurrentCrop();
                view = new Crop(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                ProductConfiguration productconfiguration = mPhotoSpec.getOrCreateConfigurationForProduct(mProduct);
                if (productconfiguration.getQuantity() == 0)
                {
                    productconfiguration.incrementQuantity();
                }
                productconfiguration.setCrop(view);
                getFragmentManager().popBackStack();
            }

            
            {
                this$0 = CropFragment.this;
                super();
            }
        });
        (new RefreshTimer(500L) {

            final CropFragment this$0;

            public void onRefresh()
            {
                if (isAdded())
                {
                    refreshData();
                }
            }

            
            {
                this$0 = CropFragment.this;
                super(l);
            }
        }).start();
        return mView;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (mBitmapLoadTask != null)
        {
            mBitmapLoadTask.cancel(true);
        }
        if (mBitmapDrawable != null)
        {
            mBitmapDrawable.setIsDisplayed(false);
            mBitmapDrawable = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() != com.walmartlabs.android.photo.R.id.orientation) goto _L2; else goto _L1
_L1:
        if (mBitmapDrawable == null) goto _L4; else goto _L3
_L3:
        if (!getString(com.walmartlabs.android.photo.R.string.photo_landscape).equalsIgnoreCase(String.valueOf(menuitem.getTitle()))) goto _L6; else goto _L5
_L5:
        mCropView.setLandscape();
        if (mCropView.isLandscape())
        {
            menuitem.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_portrait));
            menuitem.setIcon(com.walmartlabs.android.photo.R.drawable.photo_crop_portrait);
        }
_L4:
        return true;
_L6:
        mCropView.setPortrait();
        if (!mCropView.isLandscape())
        {
            menuitem.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_landscape));
            menuitem.setIcon(com.walmartlabs.android.photo.R.drawable.photo_crop_landscape);
        }
        if (true) goto _L4; else goto _L2
_L2:
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu = menu.findItem(com.walmartlabs.android.photo.R.id.orientation);
        if (mCropView != null && mCropView.isLandscape())
        {
            menu.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_portrait));
            menu.setIcon(com.walmartlabs.android.photo.R.drawable.photo_crop_portrait);
        } else
        if (mCropView != null)
        {
            menu.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_landscape));
            menu.setIcon(com.walmartlabs.android.photo.R.drawable.photo_crop_landscape);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_crop_photo));
    }








/*
    static PhotoDrawable access$402(CropFragment cropfragment, PhotoDrawable photodrawable)
    {
        cropfragment.mBitmapDrawable = photodrawable;
        return photodrawable;
    }

*/



}
