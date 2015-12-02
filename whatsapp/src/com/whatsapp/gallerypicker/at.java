// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tonicartos.widget.stickygridheaders.d;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImageGallery, q, ai, bp, 
//            l, ap, af, t, 
//            ImagePreview

public class at extends BaseAdapter
    implements d
{

    private Drawable a;
    final ImageGallery b;
    int c;

    public at(ImageGallery imagegallery)
    {
        b = imagegallery;
        super();
        c = 0;
    }

    static Drawable a(at at1)
    {
        return at1.a;
    }

    static Drawable a(at at1, Drawable drawable)
    {
        at1.a = drawable;
        return drawable;
    }

    public int a()
    {
        return ImageGallery.h(b).size();
    }

    public int a(int i)
    {
        return ((q)ImageGallery.h(b).get(i)).c;
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            viewgroup = (ViewGroup)view;
            view = (TextView)viewgroup.getChildAt(0);
        } else
        {
            viewgroup = (ViewGroup)b.getLayoutInflater().inflate(0x7f03007e, null, true);
            viewgroup.setClickable(false);
            view = (TextView)viewgroup.findViewById(0x7f0b022e);
        }
        view.setText(((q)ImageGallery.h(b).get(i)).toString());
        return viewgroup;
    }

    public int getCount()
    {
        return ImageGallery.e(b);
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            viewgroup = ImageGallery.a(b).a(i);
            if (view == null)
            {
                c = c + 1;
                view = new ImageGallery.ImageAdapter._cls1(this, b, viewgroup);
            }
            view = (ImageView)view;
            view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            ImageGallery.f(b).a((bp)view.getTag());
            if (viewgroup != null)
            {
                ap ap1 = new ap(this, view, viewgroup);
                view.setTag(ap1);
                af af1 = new af(this, view, ap1, viewgroup);
                ImageGallery.f(b).a(ap1, af1);
                view.setSelected(ImageGallery.l(b).contains(viewgroup.a()));
                if (ImagePreview.B == 0)
                {
                    break label0;
                }
            }
            view.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            view.setBackgroundColor(com.whatsapp.gallerypicker.ImageGallery.d(b));
            view.setImageDrawable(null);
        }
        return view;
    }
}
