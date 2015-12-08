// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gtp.go.weather.sharephoto.b.d;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            MyAwardsActivity, z, x

class y extends BaseAdapter
{

    final MyAwardsActivity a;
    private ArrayList b;
    private ArrayList c;
    private ArrayList d;
    private boolean e;
    private int f;
    private int g;

    private y(MyAwardsActivity myawardsactivity)
    {
        a = myawardsactivity;
        super();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
    }

    y(MyAwardsActivity myawardsactivity, x x)
    {
        this(myawardsactivity);
    }

    private void a()
    {
        d.clear();
        c.clear();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (d1.j() != 0)
            {
                d.add(d1);
            } else
            {
                c.add(d1);
            }
        }

        f = c.size();
        g = d.size();
        boolean flag;
        if (f != 0 && g != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    public d a(int i)
    {
        if (i < f)
        {
            return (d)c.get(i);
        }
        if (i == f && e)
        {
            return null;
        }
        if (e)
        {
            return (d)d.get(i - f - 1);
        } else
        {
            return (d)d.get(i);
        }
    }

    public void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            b = arraylist;
        }
    }

    public int getCount()
    {
        if (e)
        {
            return f + g + 1;
        } else
        {
            return f + g;
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = com.gtp.go.weather.sharephoto.award.MyAwardsActivity.d(a).inflate(0x7f0300be, null);
            viewgroup = new z(a, view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (z)view.getTag();
        }
        obj = a(i);
        if (obj != null)
        {
            ((z) (viewgroup)).b.setVisibility(0);
            ((z) (viewgroup)).a.setVisibility(8);
            if (((d) (obj)).j() != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                ((z) (viewgroup)).f.setVisibility(4);
                ((z) (viewgroup)).e.setImageResource(0x7f0203cb);
            } else
            {
                ((z) (viewgroup)).f.setVisibility(0);
                ((z) (viewgroup)).e.setImageResource(0x7f0203cc);
            }
            ((z) (viewgroup)).c.setText(((d) (obj)).c());
            obj = MyAwardsActivity.b(a, ((d) (obj)).g());
            if (obj != null)
            {
                if (i != 0)
                {
                    ((z) (viewgroup)).d.setImageBitmap(MyAwardsActivity.a(a, ((android.graphics.Bitmap) (obj))));
                    return view;
                } else
                {
                    ((z) (viewgroup)).d.setImageBitmap(((android.graphics.Bitmap) (obj)));
                    return view;
                }
            } else
            {
                ((z) (viewgroup)).d.setImageBitmap(null);
                return view;
            }
        } else
        {
            ((z) (viewgroup)).b.setVisibility(8);
            ((z) (viewgroup)).a.setVisibility(0);
            return view;
        }
    }

    public boolean isEnabled(int i)
    {
        return a(i) != null;
    }

    public void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
