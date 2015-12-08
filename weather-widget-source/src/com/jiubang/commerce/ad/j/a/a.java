// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.jiubang.commerce.ad.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.j.a:
//            b, d

public class a extends BaseAdapter
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    private Context a;
    private LayoutInflater b;
    private com.jiubang.commerce.ad.j.a c;
    private List d;

    public a(Context context, com.jiubang.commerce.ad.j.a a1, List list)
    {
        a = context;
        b = LayoutInflater.from(a);
        c = a1;
        if (list != null && list.size() > 0)
        {
            a(list);
        }
    }

    private void a(ImageView imageview, String s)
    {
        if (imageview == null || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            imageview.setTag(s);
            imageview.setImageResource(f.a(a).c("default_icon"));
            com.jiubang.commerce.ad.a.a(a, s, new b(this, imageview));
            return;
        }
    }

    public com.jiubang.commerce.ad.a.a a(int i)
    {
        if (d != null)
        {
            return (com.jiubang.commerce.ad.a.a)d.get(i);
        } else
        {
            return null;
        }
    }

    public void a(List list)
    {
        if (d == null)
        {
            d = new ArrayList();
        } else
        {
            d.clear();
        }
        if (list != null)
        {
            d.addAll(list);
            if (d.size() > 0)
            {
                com.jiubang.commerce.ad.a.a a1;
                for (list = d.iterator(); list.hasNext(); com.jiubang.commerce.ad.a.a(a, a1, "", ""))
                {
                    a1 = (com.jiubang.commerce.ad.a.a)list.next();
                }

            }
        }
        notifyDataSetChanged();
    }

    public int getCount()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
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
        com.jiubang.commerce.ad.a.a a1;
        if (view == null || !(view.getTag() instanceof d))
        {
            viewgroup = new d(this);
            view = b.inflate(f.a(a).b("ad_activation_recommend_item"), null);
            viewgroup.a = (ImageView)view.findViewById(f.a(a).a("dialog_item_icon"));
            viewgroup.b = (TextView)view.findViewById(f.a(a).a("dialog_item_name"));
            view.setTag(viewgroup);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        } else
        {
            viewgroup = (d)view.getTag();
        }
        a1 = a(i);
        if (a1 != null)
        {
            ((d) (viewgroup)).b.setText(a1.g());
            ((d) (viewgroup)).b.setTag(a1);
            a(((d) (viewgroup)).a, a1.h());
        }
        return view;
    }

    public void onClick(View view)
    {
        if (view.getTag() instanceof d)
        {
            view = ((d)view.getTag()).b;
            if (view != null && (view.getTag() instanceof com.jiubang.commerce.ad.a.a))
            {
                view = (com.jiubang.commerce.ad.a.a)view.getTag();
                com.jiubang.commerce.ad.a.a(a, view, "", "", true);
                if (c != null)
                {
                    c.b();
                }
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (view != null && (view.getTag() instanceof d))
        {
            if ((view = ((d)view.getTag()).a) != null && view.getDrawable() != null)
            {
                switch (motionevent.getAction())
                {
                case 2: // '\002'
                default:
                    return false;

                case 0: // '\0'
                    try
                    {
                        view.getDrawable().setColorFilter(0x7f000000, android.graphics.PorterDuff.Mode.SRC_ATOP);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        view.printStackTrace();
                        return false;
                    }
                    return false;

                case 1: // '\001'
                case 3: // '\003'
                    break;
                }
                try
                {
                    view.getDrawable().clearColorFilter();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                    return false;
                }
                return false;
            }
        }
        return false;
    }
}
