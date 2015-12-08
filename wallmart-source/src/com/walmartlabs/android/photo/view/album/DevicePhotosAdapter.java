// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmartlabs.android.photo.model.device.DeviceAlbum;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.device.DevicePhotosModel;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.utils.WLog;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.walmartlabs.android.photo.view.album:
//            PhotoExecutors, CheckablePhotoView, PhotoSelectionState

public class DevicePhotosAdapter extends BasicAdapter
{
    public static class DevicePhotoViewHolder extends BasicViewHolder
    {

        public CheckablePhotoView photo;

        public DevicePhotoViewHolder(View view)
        {
            super(view);
            photo = (CheckablePhotoView)itemView;
        }
    }

    public static interface EnlargeListener
    {

        public abstract void onEnlarge(DevicePhoto devicephoto, int i);
    }


    private static final String TAG = com/walmartlabs/android/photo/view/album/DevicePhotosAdapter.getSimpleName();
    private Context mContext;
    private String mDisplayingAlbum;
    private EnlargeListener mEnlargeListener;
    private android.widget.AbsListView.LayoutParams mImageViewLayoutParams;
    private int mMinItemHeight;
    private DevicePhotosModel mModel;
    private PhotoSelectionState mSelectionState;
    private boolean mTooFastToLoad;

    public DevicePhotosAdapter(Fragment fragment, PhotoSelectionState photoselectionstate)
    {
        if (photoselectionstate == null)
        {
            throw new IllegalArgumentException("photoSelectionState may not be null");
        } else
        {
            mContext = fragment.getActivity();
            mSelectionState = photoselectionstate;
            int i = mContext.getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_grid_padding);
            mMinItemHeight = mContext.getResources().getDisplayMetrics().widthPixels / mContext.getResources().getInteger(com.walmartlabs.android.photo.R.integer.photo_grid_nbr_columns) - i * 2;
            mImageViewLayoutParams = new android.widget.AbsListView.LayoutParams(-1, mMinItemHeight);
            return;
        }
    }

    private void loadBitmap(DevicePhotoViewHolder devicephotoviewholder, final int position)
    {
        BitmapLoadTask bitmaploadtask;
label0:
        {
            final long photoId = getItem(position).getId();
            devicephotoviewholder.itemView.setTag(Long.valueOf(photoId));
            if (!isTooFastToLoad())
            {
                bitmaploadtask = new BitmapLoadTask(mContext, 0, new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

                    final DevicePhotosAdapter this$0;
                    final long val$photoId;
                    final int val$position;

                    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
                    {
label0:
                        {
                            obj = (DevicePhotoViewHolder)obj;
                            if (((Long)((DevicePhotoViewHolder) (obj)).itemView.getTag()).longValue() == photoId)
                            {
                                if (photodrawable == null)
                                {
                                    break label0;
                                }
                                ((DevicePhotoViewHolder) (obj)).photo.setPhotoSource(photodrawable, flag);
                                ((DevicePhotoViewHolder) (obj)).photo.setPhotoViewListener(new CheckablePhotoView.PhotoViewListener() {

                                    final _cls1 this$1;

                                    public void onEnlargeClick()
                                    {
                                        if (mEnlargeListener != null)
                                        {
                                            mEnlargeListener.onEnlarge(getItem(position), position);
                                        }
                                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                                });
                            }
                            return;
                        }
                        photodrawable = ((DevicePhotoViewHolder) (obj)).photo;
                        if (!isValidItem(position))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        photodrawable.setUnavailable(flag);
                    }

                    public void onTaskCancelled(Bitmap bitmap)
                    {
                    }

            
            {
                this$0 = DevicePhotosAdapter.this;
                photoId = l;
                position = i;
                super();
            }
                });
                bitmaploadtask.setTag(devicephotoviewholder);
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    break label0;
                }
                bitmaploadtask.executeOnExecutor(PhotoExecutors.THREAD_POOL_EXECUTOR, new DevicePhoto[] {
                    getItem(position)
                });
            }
            return;
        }
        try
        {
            bitmaploadtask.execute(new DevicePhoto[] {
                getItem(position)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DevicePhotoViewHolder devicephotoviewholder)
        {
            WLog.w(TAG, "getView(): Bitmap load task was rejected for execution");
        }
    }

    private boolean same(List list, List list1)
    {
        if (list == list1)
        {
            return true;
        }
        if (list == null || list1 == null)
        {
            return false;
        }
        int i;
        boolean flag;
        boolean flag1;
        if (list.size() == list1.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = 0;
        flag1 = flag;
        while (flag1 && i < list.size()) 
        {
            DevicePhoto devicephoto = (DevicePhoto)list.get(i);
            DevicePhoto devicephoto1 = (DevicePhoto)list1.get(i);
            if (devicephoto != null)
            {
                flag = devicephoto.equals(devicephoto1);
            } else
            if (devicephoto1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 &= flag;
            i++;
        }
        return flag1;
    }

    public void displayAlbum(String s)
    {
        s = mModel.getAlbumByName(s);
        if (s != null)
        {
            s = s.getName();
        } else
        {
            s = null;
        }
        mDisplayingAlbum = s;
        notifyDataSetChanged();
    }

    public void ensureBitmapLoaded(DevicePhotoViewHolder devicephotoviewholder, int i)
    {
        if (!devicephotoviewholder.photo.bitmapLoaded())
        {
            loadBitmap(devicephotoviewholder, i);
        }
    }

    public String getDisplayedAlbum()
    {
        return mDisplayingAlbum;
    }

    public DevicePhoto getItem(int i)
    {
        if (mModel != null && mModel.getPhotos() != null && mModel.getPhotos().size() > i)
        {
            if (mDisplayingAlbum != null)
            {
                return mModel.getAlbumByName(mDisplayingAlbum).getPhoto(i);
            } else
            {
                return (DevicePhoto)mModel.getPhotos().get(i);
            }
        } else
        {
            return null;
        }
    }

    public int getItemCount()
    {
label0:
        {
            boolean flag = false;
            int i = ((flag) ? 1 : 0);
            if (mModel != null)
            {
                if (mDisplayingAlbum == null)
                {
                    break label0;
                }
                DeviceAlbum devicealbum = mModel.getAlbumByName(mDisplayingAlbum);
                i = ((flag) ? 1 : 0);
                if (devicealbum != null)
                {
                    i = devicealbum.getPhotos().size();
                }
            }
            return i;
        }
        return mModel.getPhotos().size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public boolean isSelected(int i)
    {
        return mSelectionState.isSelected(getItem(i));
    }

    public boolean isTooFastToLoad()
    {
        return mTooFastToLoad;
    }

    public boolean isValidItem(int i)
    {
        DevicePhoto devicephoto = getItem(i);
        return devicephoto != null && devicephoto.getSize() < 0x989680L && devicephoto.originalExists() && !devicephoto.isBroken();
    }

    public DevicePhotoViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = new DevicePhotoViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.photo.R.layout.photo_grid_item, null));
        ((DevicePhotoViewHolder) (viewgroup)).photo.setMinimumHeight(mMinItemHeight);
        ((DevicePhotoViewHolder) (viewgroup)).photo.setLayoutParams(mImageViewLayoutParams);
        return viewgroup;
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(DevicePhotoViewHolder devicephotoviewholder, int i)
    {
        boolean flag = isValidItem(i);
        devicephotoviewholder.photo.reset();
        devicephotoviewholder.photo.setChecked(isSelected(i));
        CheckablePhotoView checkablephotoview = devicephotoviewholder.photo;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkablephotoview.setUnavailable(flag);
        loadBitmap(devicephotoviewholder, i);
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((DevicePhotoViewHolder)basicviewholder, i);
    }

    public void setDataSource(DevicePhotosModel devicephotosmodel)
    {
        if (mModel == null || !same(mModel.getPhotos(), devicephotosmodel.getPhotos()))
        {
            mModel = devicephotosmodel;
            notifyDataSetChanged();
        }
        displayAlbum(mDisplayingAlbum);
    }

    public void setEnlargeListener(EnlargeListener enlargelistener)
    {
        mEnlargeListener = enlargelistener;
    }

    public void setSelected(int i, boolean flag)
    {
        mSelectionState.setSelected(getItem(i), flag);
    }

    public void setTooFastToLoad(boolean flag)
    {
        mTooFastToLoad = flag;
    }

    public void toggleSelection(int i)
    {
        boolean flag;
        if (!isSelected(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setSelected(i, flag);
    }


}
