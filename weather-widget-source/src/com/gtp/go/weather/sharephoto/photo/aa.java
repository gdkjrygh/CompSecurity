// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity, ab, l

class aa extends BaseAdapter
{

    final PhotoActivity a;

    private aa(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    aa(PhotoActivity photoactivity, l l)
    {
        this(photoactivity);
    }

    public int getCount()
    {
        if (PhotoActivity.f(a) != null)
        {
            return PhotoActivity.f(a).size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        if (PhotoActivity.f(a) != null)
        {
            return (ab)PhotoActivity.f(a).get(i);
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
        viewgroup = view;
        if (view == null)
        {
            viewgroup = PhotoActivity.g(a).inflate(0x7f0300ea, null);
        }
        view = (TextView)viewgroup.findViewById(0x7f0904aa);
        if (PhotoActivity.f(a) != null)
        {
            view.setText(((ab)PhotoActivity.f(a).get(i)).a);
        }
        return viewgroup;
    }
}
