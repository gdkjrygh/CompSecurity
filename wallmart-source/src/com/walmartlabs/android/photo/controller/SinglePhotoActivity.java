// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            PhotoAppCompatActivity

public class SinglePhotoActivity extends PhotoAppCompatActivity
{

    public static final String EXTRA_PHOTO = "photo";
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_SELECTED = "selected";
    private static final String TAG = com/walmartlabs/android/photo/controller/SinglePhotoActivity.getSimpleName();
    private BitmapLoadTask mBitmapLoadTask;
    private ImageView mImageView;

    public SinglePhotoActivity()
    {
    }

    private void hideSystemUI()
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    private boolean isImmersiveFullscreen()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = flag1;
            if ((getWindow().getDecorView().getSystemUiVisibility() & 0x800) == 2048)
            {
                flag = true;
            }
        }
        return flag;
    }

    private void onSelectionChanged(boolean flag)
    {
        byte byte0 = -1;
        Intent intent = new Intent();
        intent.putExtra("position", getIntent().getIntExtra("position", -1));
        if (!flag)
        {
            byte0 = 0;
        }
        setResult(byte0, intent);
    }

    private void setSelectionMenuItemChecked(boolean flag, MenuItem menuitem)
    {
        if (flag)
        {
            menuitem.setIcon(getResources().getDrawable(com.walmartlabs.android.photo.R.drawable.photo_fullscreen_checkbox_checked));
            menuitem.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_deselect));
        } else
        {
            menuitem.setIcon(getResources().getDrawable(com.walmartlabs.android.photo.R.drawable.photo_fullscreen_checkbox_unchecked));
            menuitem.setTitle(getString(com.walmartlabs.android.photo.R.string.photo_select));
        }
        onSelectionChanged(flag);
    }

    private void showSystemUI()
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            getWindow().getDecorView().setSystemUiVisibility(1792);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.walmartlabs.android.photo.R.layout.photo_activity_single_photo);
        getWindow().setBackgroundDrawable(new ColorDrawable(0xff000000));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setIcon(com.walmartlabs.android.photo.R.drawable.photo_empty_icon);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0));
        mImageView = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.photo);
        bundle = getIntent();
        bundle.setExtrasClassLoader(com/walmartlabs/android/photo/model/device/DevicePhoto.getClassLoader());
        bundle = (DevicePhoto)bundle.getParcelableExtra("photo");
        if (bundle != null && bundle.originalExists() && !bundle.isBroken())
        {
            findViewById(com.walmartlabs.android.photo.R.id.base_layout).setOnClickListener(new android.view.View.OnClickListener() {

                final SinglePhotoActivity this$0;

                public void onClick(View view)
                {
                    if (isImmersiveFullscreen())
                    {
                        showSystemUI();
                        return;
                    } else
                    {
                        hideSystemUI();
                        return;
                    }
                }

            
            {
                this$0 = SinglePhotoActivity.this;
                super();
            }
            });
            int j = getResources().getDisplayMetrics().widthPixels;
            int k = getResources().getDisplayMetrics().heightPixels;
            int i = Math.max(j, k);
            j = Math.min(k, j);
            mBitmapLoadTask = new BitmapLoadTask(this, 2, Math.min(i, 640), Math.min(j, 480), new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

                final SinglePhotoActivity this$0;

                public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
                {
                    findViewById(com.walmartlabs.android.photo.R.id.progress).setVisibility(8);
                    if (photodrawable != null && !isFinishing() && mImageView.isShown())
                    {
                        PhotoLogger.get().d(SinglePhotoActivity.TAG, (new StringBuilder()).append("Loaded bitmap for preview: ").append(photodrawable.getBitmap().getWidth()).append(" x ").append(photodrawable.getBitmap().getHeight()).toString());
                        mImageView.setVisibility(4);
                        mImageView.setImageDrawable(photodrawable);
                        if (PhotoUtils.canAnimate())
                        {
                            mImageView.setAlpha(0.0F);
                        }
                        mImageView.setVisibility(0);
                        if (PhotoUtils.canAnimate())
                        {
                            mImageView.animate().alpha(1.0F).setDuration(300L);
                        }
                        return;
                    } else
                    {
                        mImageView.setVisibility(8);
                        findViewById(com.walmartlabs.android.photo.R.id.error).setVisibility(0);
                        return;
                    }
                }

                public void onTaskCancelled(Bitmap bitmap)
                {
                }

            
            {
                this$0 = SinglePhotoActivity.this;
                super();
            }
            });
            mBitmapLoadTask.execute(new DevicePhoto[] {
                bundle
            });
            return;
        } else
        {
            Toast.makeText(this, com.walmartlabs.android.photo.R.string.photo_failed_to_load, 0).show();
            finish();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.walmartlabs.android.photo.R.menu.photo_single_menu, menu);
        menu = menu.findItem(com.walmartlabs.android.photo.R.id.select);
        setSelectionMenuItemChecked(getIntent().getBooleanExtra("selected", false), menu);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (mBitmapLoadTask != null)
        {
            mBitmapLoadTask.cancel(true);
        }
        mImageView.setImageBitmap(null);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        }
        if (menuitem.getItemId() == com.walmartlabs.android.photo.R.id.select)
        {
            boolean flag;
            if (!getString(com.walmartlabs.android.photo.R.string.photo_deselect).equals(menuitem.getTitle()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setSelectionMenuItemChecked(flag, menuitem);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }






}
