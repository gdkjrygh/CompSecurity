// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.commons.video.VideoMessage;
import java.util.List;

public class VideoPagerAdapter extends PagerAdapter
{

    private static final int NO_OF_VIDEOS = 10;
    public static final String SELECTED_POSITION = "selectedPosition";
    private final Context context;
    private final LayoutInflater inflater;
    private List videoList;

    public VideoPagerAdapter(Context context1)
    {
        context = (Context)Preconditions.checkNotNull(context1);
        inflater = LayoutInflater.from(context1);
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (obj instanceof ViewGroup)
        {
            viewgroup.removeView((ViewGroup)obj);
        }
    }

    public int getCount()
    {
        if (videoList == null)
        {
            return 0;
        } else
        {
            return videoList.size();
        }
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public float getPageWidth(int i)
    {
        return 0.88F;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        ViewGroup viewgroup1 = (ViewGroup)inflater.inflate(0x7f0300ca, viewgroup, false);
        Object obj1 = (TextView)viewgroup1.findViewById(0x7f0d0230);
        Object obj = (VideoMessage)videoList.get(i);
        ((TextView) (obj1)).setText(((VideoMessage) (obj)).getTitle());
        obj1 = (ImageView)viewgroup1.findViewById(0x7f0d022d);
        obj = ((VideoMessage) (obj)).getRegularThumbnailLink();
        if (URLUtil.isValidUrl(((String) (obj))))
        {
            Picasso.with(context).load(((String) (obj))).config(android.graphics.Bitmap.Config.RGB_565).fit().centerInside().into(((ImageView) (obj1)));
        }
        viewgroup1.setOnClickListener(new _cls1(i));
        viewgroup.addView(viewgroup1);
        viewgroup1.setTag(Integer.valueOf(i));
        return viewgroup1;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }


    /* member class not found */
    class _cls1 {}

}
