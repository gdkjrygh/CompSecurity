// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.youtube.f;
import com.google.android.youtube.g;
import com.google.android.youtube.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            UserProfile, ap

final class ao extends BaseAdapter
{

    private final Activity a;
    private final Resources b;
    private final List c;
    private final bj d;

    public ao(Activity activity, List list, bj bj1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = activity.getResources();
        c = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        d = bj1;
        boolean flag;
        if (list.size() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "Must have at least two profiles.");
    }

    static Resources a(ao ao1)
    {
        return ao1.b;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return c.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = a.getLayoutInflater().inflate(l.a, null);
        }
        viewgroup = (CheckedTextView)view;
        UserProfile userprofile = (UserProfile)c.get(i);
        Object obj = viewgroup.getCompoundDrawables()[0];
        if (obj instanceof BitmapDrawable)
        {
            viewgroup.setCompoundDrawables(null, null, null, null);
            ((BitmapDrawable)obj).getBitmap().recycle();
        }
        viewgroup.setTag(userprofile);
        viewgroup.setText(userprofile.displayUsername);
        i = b.getDimensionPixelSize(g.r);
        obj = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ALPHA_8);
        ((Bitmap) (obj)).eraseColor(f.h);
        viewgroup.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(b, ((Bitmap) (obj))), null, null, null);
        d.a(userprofile.thumbnailUri, com.google.android.apps.youtube.common.a.a.a(a, new ap(this, viewgroup, userprofile)));
        return view;
    }
}
