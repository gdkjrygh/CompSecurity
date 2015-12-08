// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.device;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.walmartlabs.android.photo.model.device:
//            DeviceAlbum, DevicePhoto

public class DevicePhotosModel
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    public static interface PhotosModelListener
    {

        public abstract void onModelChanged();
    }


    private static final String MIMETYPE_JPEG = "image/jpeg";
    private static final String MIMETYPE_JPG = "image/jpg";
    private static final int PHOTOS_LOADER_ID = 0;
    private static final int RESULT_LIMIT = 2000;
    private static final String TAG = com/walmartlabs/android/photo/model/device/DevicePhotosModel.getSimpleName();
    private volatile Map mAlbums;
    private Fragment mFragment;
    private PhotosModelListener mListener;
    private Set mPhotoLookup;
    private volatile List mPhotoSources;

    public DevicePhotosModel(Fragment fragment)
    {
        mPhotoSources = new ArrayList();
        mAlbums = new HashMap();
        mPhotoLookup = new HashSet();
        mFragment = fragment;
    }

    private void init()
    {
        mFragment.getLoaderManager().initLoader(0, null, this);
    }

    private boolean sameAlbums(Map map)
    {
        if (mAlbums.size() != map.size())
        {
            return false;
        }
        for (Iterator iterator = mAlbums.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (!map.containsKey(s))
            {
                return false;
            }
            if (!((DeviceAlbum)mAlbums.get(s)).equals(map.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    private boolean samePhotos(List list)
    {
        if (mPhotoSources.size() != list.size())
        {
            return false;
        }
        int j = mPhotoSources.size();
        for (int i = 0; i < j; i++)
        {
            if (!((DevicePhoto)mPhotoSources.get(i)).equals(list.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public boolean exists(DevicePhoto devicephoto)
    {
        return mPhotoLookup.contains(devicephoto);
    }

    protected void fireModelChanged()
    {
        if (mListener != null)
        {
            mListener.onModelChanged();
        }
    }

    public DeviceAlbum getAlbumByName(String s)
    {
        return (DeviceAlbum)mAlbums.get(s);
    }

    public List getAlbums()
    {
        ArrayList arraylist = new ArrayList(mAlbums.values());
        Collections.sort(arraylist);
        Collections.reverse(arraylist);
        return arraylist;
    }

    public DevicePhoto getPhoto(int i)
    {
        return (DevicePhoto)mPhotoSources.get(i);
    }

    public int getPhotoCount()
    {
        return mPhotoSources.size();
    }

    public List getPhotos()
    {
        return mPhotoSources;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        if (i == 0)
        {
            bundle = (new StringBuilder()).append("mime_type").append("=? OR ").append("mime_type").append("=?").toString();
            return new CursorLoader(mFragment.getActivity(), android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] {
                "_id", "_data", "bucket_display_name", "_display_name", "datetaken"
            }, bundle, new String[] {
                "image/jpeg", "image/jpg"
            }, "datetaken DESC LIMIT 2000");
        } else
        {
            return null;
        }
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        long l = System.currentTimeMillis();
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        HashMap hashmap = new HashMap();
        do
        {
            if (cursor == null || !cursor.moveToNext())
            {
                break;
            }
            loader = cursor.getString(1);
            String s1 = cursor.getString(2);
            Object obj = cursor.getString(3);
            if (!TextUtils.isEmpty(loader) && !TextUtils.isEmpty(((CharSequence) (obj))))
            {
                DevicePhoto devicephoto = new DevicePhoto(cursor.getLong(0), loader, s1, ((String) (obj)), cursor.getLong(4));
                arraylist.add(devicephoto);
                hashset.add(devicephoto);
                obj = (DeviceAlbum)hashmap.get(s1);
                loader = ((Loader) (obj));
                if (obj == null)
                {
                    loader = new DeviceAlbum(s1);
                    hashmap.put(s1, loader);
                }
                loader.addPhoto(devicephoto);
            }
        } while (true);
        long l1 = System.currentTimeMillis();
        boolean flag = samePhotos(arraylist);
        cursor = PhotoLogger.get();
        String s = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("Compared loaded photos (").append(System.currentTimeMillis() - l1).append("ms):  ");
        boolean flag1;
        if (flag)
        {
            loader = "Same";
        } else
        {
            loader = "Different";
        }
        cursor.d(s, stringbuilder.append(loader).toString());
        l1 = System.currentTimeMillis();
        flag1 = sameAlbums(hashmap);
        cursor = PhotoLogger.get();
        s = TAG;
        stringbuilder = (new StringBuilder()).append("Compared loaded albums (").append(System.currentTimeMillis() - l1).append("ms):  ");
        if (flag1)
        {
            loader = "Same";
        } else
        {
            loader = "Different";
        }
        cursor.d(s, stringbuilder.append(loader).toString());
        mFragment.getLoaderManager().destroyLoader(0);
        PhotoLogger.get().i(TAG, (new StringBuilder()).append("Finished model refresh post-processing in ").append(System.currentTimeMillis() - l).append(" ms").toString());
        if (!flag || !flag1 || mPhotoSources.size() == 0)
        {
            mPhotoSources = arraylist;
            mAlbums = hashmap;
            mPhotoLookup = hashset;
            fireModelChanged();
            return;
        } else
        {
            PhotoLogger.get().d(TAG, "onLoadFinished(): No changes to model");
            return;
        }
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void refresh()
    {
        init();
    }

    public void setModelListener(PhotosModelListener photosmodellistener)
    {
        mListener = photosmodellistener;
    }

}
