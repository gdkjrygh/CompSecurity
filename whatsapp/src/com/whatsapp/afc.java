// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.b2;

// Referenced classes of package com.whatsapp:
//            LocationPicker, t3, App, iz, 
//            PlaceInfo

public class afc extends BaseAdapter
{

    final LocationPicker a;

    public afc(LocationPicker locationpicker, Context context)
    {
        a = locationpicker;
        super();
    }

    public int getCount()
    {
        if (LocationPicker.n(a) == null)
        {
            return 0;
        } else
        {
            return LocationPicker.n(a).size();
        }
    }

    public Object getItem(int i)
    {
        if (LocationPicker.n(a) == null || i >= LocationPicker.n(a).size())
        {
            return null;
        } else
        {
            return LocationPicker.n(a).get(i);
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
            }
            view = (TextView)viewgroup.findViewById(0x7f0b0228);
            TextView textview = (TextView)viewgroup.findViewById(0x7f0b0229);
            imageview = (ImageView)viewgroup.findViewById(0x7f0b0227);
            placeinfo = (PlaceInfo)LocationPicker.n(a).get(i);
            view.setText(placeinfo.name);
            if (placeinfo.vicinity != null && !"".equals(placeinfo.vicinity))
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
            if (placeinfo == LocationPicker.o(a))
            {
                view.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f02059b, 0);
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
                LocationPicker.e(a).a(placeinfo.icon, imageview);
                if (j == 0)
                {
                    break label2;
                }
            }
            imageview.setImageResource(0);
        }
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
