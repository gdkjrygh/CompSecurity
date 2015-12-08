// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.fv;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.h;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            au

public class at extends a
{

    protected final Resources a;
    private final LayoutInflater b;
    private final int d;
    private final Map e = new HashMap();
    private final Bitmap f;

    public at(Context context, int i)
    {
        b = LayoutInflater.from(context);
        a = context.getResources();
        d = i;
        f = fv.a(a);
    }

    protected final View a(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(d, viewgroup, false);
            view1.setTag(new au(view1));
        }
        return view1;
    }

    protected final View a(Playlist playlist, View view, ViewGroup viewgroup)
    {
        view = a(view, viewgroup);
        viewgroup = (au)view.getTag();
        ((au) (viewgroup)).a.setText(playlist.title);
        ((au) (viewgroup)).b.setImageResource(h.J);
        return view;
    }

    public final void a()
    {
        e.clear();
        super.a();
    }

    protected final void a(int i, Object obj)
    {
        obj = (Playlist)obj;
        c.a(obj);
        e.put(((Playlist) (obj)).contentUri, f);
        super.a(i, obj);
    }

    protected final void a(Object obj)
    {
        obj = (Playlist)obj;
        c.a(obj);
        e.put(((Playlist) (obj)).contentUri, f);
        super.a(obj);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a((Playlist)getItem(i), view, viewgroup);
    }
}
