// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, ag, GalleryPicker, bp, 
//            l, ah, a6

class aa extends BaseAdapter
{

    LayoutInflater a;
    final GalleryPicker b;
    private View c;
    ArrayList d;

    aa(GalleryPicker gallerypicker, LayoutInflater layoutinflater)
    {
        b = gallerypicker;
        super();
        d = new ArrayList();
        a = layoutinflater;
    }

    public void a()
    {
        d.clear();
        c = null;
    }

    public void a(ag ag1)
    {
        d.add(ag1);
    }

    public void b()
    {
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return d.size();
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        int j;
        j = ImagePreview.B;
        obj = (ag)d.get(i);
        if (i != 0 || c == null) goto _L2; else goto _L1
_L1:
        view = c;
_L4:
        return view;
_L2:
        ImageView imageview;
        Object obj1;
label0:
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = a.inflate(0x7f03006a, null);
                if (i == 0)
                {
                    c = viewgroup;
                    if (j != 0)
                    {
                        viewgroup = view;
                    }
                }
            }
            view = (TextView)viewgroup.findViewById(0x7f0b00f3);
            obj1 = (ImageView)viewgroup.findViewById(0x7f0b01e7);
            TextView textview = (TextView)viewgroup.findViewById(0x7f0b00de);
            imageview = (ImageView)viewgroup.findViewById(0x7f0b0190);
            textview.setText(Integer.toString(((ag) (obj)).b));
            if (((ag) (obj)).a == 6)
            {
                view.setText(com.whatsapp.util.c.b(((ag) (obj)).f, b.getBaseContext(), view.getPaint()));
                if (j == 0)
                {
                    break label0;
                }
            }
            view.setText(((ag) (obj)).f);
        }
        ((ImageView) (obj1)).setImageResource(((ag) (obj)).c());
        obj1 = (bp)imageview.getTag();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = viewgroup;
        if (((bp) (obj1)).a().equals(((ag) (obj)).a())) goto _L4; else goto _L3
_L3:
        GalleryPicker.e(b).a(((bp) (obj1)));
        view = ((ag) (obj)).e;
        obj = new ah(this, imageview, view, ((ag) (obj)));
        view = new a6(this, imageview, ((bp) (obj)), view);
        imageview.setTag(obj);
        GalleryPicker.e(b).a(((bp) (obj)), view);
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
