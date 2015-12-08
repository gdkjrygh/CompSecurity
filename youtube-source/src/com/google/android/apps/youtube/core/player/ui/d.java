// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.graphics.Bitmap;
import android.support.v4.view.aj;
import android.view.View;
import android.view.ViewGroup;
import com.google.a.a.a.a.rk;
import com.google.a.a.a.a.rm;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.ui:
//            InfoCardGalleryDialogFragment, f

final class d extends aj
{

    final InfoCardGalleryDialogFragment a;
    private final List b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();

    public d(InfoCardGalleryDialogFragment infocardgallerydialogfragment, List list)
    {
        a = infocardgallerydialogfragment;
        super();
        b = list;
        for (int i = 0; i < list.size(); i++)
        {
            d.add(null);
            c.add(null);
        }

    }

    public final int a()
    {
        return b.size();
    }

    public final int a(Object obj)
    {
        return -2;
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        Object obj = null;
        if (i < b.size())
        {
            Object obj1 = (m)b.get(i);
            Object obj2 = ((m) (obj1)).b();
            if (((rm) (obj2)).b != null && ((rm) (obj2)).e != null && ((rm) (obj2)).c != null)
            {
                rk rk1 = ((m) (obj1)).c();
                obj1 = a.i();
                InfoCardGalleryDialogFragment infocardgallerydialogfragment = a;
                android.text.Spanned spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(((rm) (obj2)).c);
                obj2 = com.google.android.apps.youtube.datalib.innertube.a.b.a(((rm) (obj2)).d);
                if (rk1 != null)
                {
                    obj = com.google.android.apps.youtube.datalib.innertube.a.b.a(rk1.b);
                }
                obj = new f(((android.content.Context) (obj1)), infocardgallerydialogfragment, i, spanned, ((CharSequence) (obj2)), ((CharSequence) (obj)));
                viewgroup.addView(((f) (obj)).a());
                ((f) (obj)).a((Bitmap)c.get(i));
                d.set(i, obj);
                return ((f) (obj)).a();
            }
        }
        return null;
    }

    public final void a(int i, Bitmap bitmap)
    {
        if (i < c.size())
        {
            c.set(i, bitmap);
        }
        if (d.get(i) != null)
        {
            ((f)d.get(i)).a(bitmap);
        }
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
        d.set(i, null);
    }

    public final void a(boolean flag)
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)iterator.next();
            if (f1 != null)
            {
                f1.a(flag);
            }
        } while (true);
        b();
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }
}
