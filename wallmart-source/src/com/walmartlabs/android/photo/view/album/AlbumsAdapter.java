// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmartlabs.android.photo.model.device.DeviceAlbum;
import com.walmartlabs.android.photo.model.device.DevicePhotosModel;
import java.util.ArrayList;
import java.util.List;

public class AlbumsAdapter extends BaseAdapter
{

    private Context mContext;
    private List mItems;

    public AlbumsAdapter(Context context)
    {
        mItems = new ArrayList();
        mContext = context;
    }

    private DeviceAlbum createAllPhotosAlbum(DevicePhotosModel devicephotosmodel)
    {
        DeviceAlbum devicealbum = new DeviceAlbum(mContext.getString(com.walmartlabs.android.photo.R.string.photo_recent_photos));
        devicealbum.setPhotos(devicephotosmodel.getPhotos());
        return devicealbum;
    }

    public int getCount()
    {
        return mItems.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(mContext).inflate(com.walmartlabs.android.photo.R.layout.photo_actionbar_spinner_dropdown_item, viewgroup, false);
        viewgroup = (DeviceAlbum)getItem(i);
        ((TextView)view.findViewById(com.walmartlabs.android.photo.R.id.title)).setText(viewgroup.getName());
        ((TextView)view.findViewById(com.walmartlabs.android.photo.R.id.description)).setText(String.valueOf(viewgroup.getSize()));
        return view;
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(mContext).inflate(com.walmartlabs.android.photo.R.layout.photo_actionbar_spinner_item, viewgroup, false);
        viewgroup = (DeviceAlbum)getItem(i);
        ((TextView)view.findViewById(com.walmartlabs.android.photo.R.id.title)).setText(viewgroup.getName());
        TextView textview = (TextView)view.findViewById(com.walmartlabs.android.photo.R.id.description);
        if (viewgroup.getSize() == 1)
        {
            textview.setText(mContext.getString(com.walmartlabs.android.photo.R.string.photo_photos_count_single, new Object[] {
                Integer.valueOf(viewgroup.getSize())
            }));
            return view;
        } else
        {
            textview.setText(mContext.getString(com.walmartlabs.android.photo.R.string.photo_photos_count, new Object[] {
                Integer.valueOf(viewgroup.getSize())
            }));
            return view;
        }
    }

    public int indexOf(String s)
    {
        if (s != null)
        {
            for (int i = 0; i < mItems.size(); i++)
            {
                if (s.equals(((DeviceAlbum)mItems.get(i)).getName()))
                {
                    return i;
                }
            }

        }
        return 0;
    }

    public void setModel(DevicePhotosModel devicephotosmodel)
    {
        DeviceAlbum devicealbum = createAllPhotosAlbum(devicephotosmodel);
        mItems.clear();
        mItems.add(devicealbum);
        mItems.addAll(devicephotosmodel.getAlbums());
    }
}
