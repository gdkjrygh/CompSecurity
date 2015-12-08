// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.jiubang.playsdk.d;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.main.BitmapBean;
import java.util.ArrayList;

public class n extends BaseAdapter
{

    private Context a;
    private ArrayList b;
    private int c;

    public n(Context context, ArrayList arraylist, int i)
    {
        a = context;
        b = arraylist;
        c = i;
    }

    public int getCount()
    {
        if (b != null)
        {
            return b.size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        if (b != null)
        {
            return (BitmapBean)b.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        BitmapBean bitmapbean;
label0:
        {
            if (view == null)
            {
                view = new KPNetworkImageView(a);
                view.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(c, -1));
            }
            viewgroup = (KPNetworkImageView)view;
            bitmapbean = (BitmapBean)getItem(i);
            if (bitmapbean != null)
            {
                android.graphics.Bitmap bitmap = bitmapbean.a();
                if (bitmap == null)
                {
                    break label0;
                }
                viewgroup.setImageBitmap(bitmap);
                viewgroup.a("");
                viewgroup.a(0);
            }
            return view;
        }
        viewgroup.a(bitmapbean.b());
        viewgroup.a(d.d);
        return view;
    }
}
