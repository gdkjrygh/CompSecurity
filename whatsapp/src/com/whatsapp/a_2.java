// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.b2;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, t3, App, iz, 
//            PlaceInfo

public class a_2 extends BaseAdapter
{

    final LocationPicker2 a;

    public a_2(LocationPicker2 locationpicker2, Context context)
    {
        a = locationpicker2;
        super();
    }

    public int getCount()
    {
        if (LocationPicker2.a(a) == null)
        {
            return 0;
        } else
        {
            return LocationPicker2.a(a).size();
        }
    }

    public Object getItem(int i)
    {
        if (LocationPicker2.a(a) == null || i >= LocationPicker2.a(a).size())
        {
            return null;
        } else
        {
            return LocationPicker2.a(a).get(i);
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ImageView imageview;
        PlaceInfo placeinfo;
        int j;
label0:
        {
            j = App.am;
            viewgroup = view;
            if (view == null)
            {
                viewgroup = iz.a(a.getLayoutInflater(), 0x7f03007a, null);
                if (j != 0)
                {
                    viewgroup = view;
                }
            }
            view = (TextView)viewgroup.findViewById(0x7f0b0228);
            TextView textview = (TextView)viewgroup.findViewById(0x7f0b0229);
            imageview = (ImageView)viewgroup.findViewById(0x7f0b0227);
            placeinfo = (PlaceInfo)LocationPicker2.a(a).get(i);
            view.setText(placeinfo.name);
            if (!TextUtils.isEmpty(placeinfo.vicinity))
            {
                textview.setVisibility(0);
                textview.setText(placeinfo.vicinity);
                textview.setSingleLine(true);
                if (j == 0)
                {
                    break label0;
                }
            }
            textview.setVisibility(8);
        }
label1:
        {
            if (placeinfo == LocationPicker2.i(a))
            {
                view.setCompoundDrawablesWithIntrinsicBounds(null, null, new BitmapDrawable(a.getResources(), LocationPicker2.j(a)), null);
                if (j == 0)
                {
                    break label1;
                }
            }
            view.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
label2:
        {
            if (placeinfo.icon != null)
            {
                LocationPicker2.q(a).a(placeinfo.icon, imageview);
                if (j == 0)
                {
                    break label2;
                }
            }
            imageview.setImageDrawable(null);
        }
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
