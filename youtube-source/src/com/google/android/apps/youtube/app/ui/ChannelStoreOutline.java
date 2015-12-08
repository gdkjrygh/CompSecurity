// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.adapter.bd;
import com.google.android.apps.youtube.app.adapter.br;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.a.e;
import com.google.android.apps.youtube.core.a.g;
import com.google.android.apps.youtube.core.a.l;
import com.google.android.apps.youtube.core.a.m;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            l, n, gj

public final class ChannelStoreOutline extends l
{

    private static final g b = new g("ChannelStoreList");
    private final List c;

    private ChannelStoreOutline(List list, List list1)
    {
        super((e[])((List)com.google.android.apps.youtube.common.fromguava.c.a(list)).toArray(new e[list.size()]));
        c = (List)com.google.android.apps.youtube.common.fromguava.c.a(list1);
    }

    public static ChannelStoreOutline a(Activity activity, Analytics analytics, bc bc, com.google.android.apps.youtube.core.identity.l l1, YouTubeApplication youtubeapplication, a a1, am am, aw aw, 
            bj bj, gj gj, View view)
    {
        view = Category.values();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist.add(a(((Context) (activity)), com.google.android.youtube.g.B));
        int j = view.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = view[i];
            if (((Category) (obj)).position != 0)
            {
                arraylist.add(a(((Context) (activity)), com.google.android.youtube.g.s));
            }
            arraylist.add(com.google.android.apps.youtube.app.ui.l.a(activity, ((Category) (obj)), am));
            Object obj1 = b;
            Resources resources = activity.getResources();
            int i1 = resources.getInteger(k.c);
            int j1 = resources.getDimensionPixelSize(com.google.android.youtube.g.x);
            int k1 = resources.getDimensionPixelSize(com.google.android.youtube.g.A);
            int i2 = resources.getDimensionPixelSize(com.google.android.youtube.g.z);
            com.google.android.apps.youtube.core.a.c c1 = new com.google.android.apps.youtube.core.a.c(ag.a(activity, analytics, bc, l1, youtubeapplication, a1, am, aw, bj, gj, activity), true, new g[0]);
            obj1 = new bd(c1, activity.getLayoutInflater(), ((g) (obj1)), i1, j1);
            ((bd) (obj1)).a(i2, 0, k1, j1);
            br br1 = new br(activity.getLayoutInflater().inflate(com.google.android.youtube.l.u, null, false));
            obj = new n(activity, l1, c1, new l(new e[] {
                obj1, br1
            }), br1, resources, ((Category) (obj)));
            arraylist.add(obj);
            arraylist1.add(obj);
        }

        arraylist.add(a(((Context) (activity)), com.google.android.youtube.g.y));
        return new ChannelStoreOutline(arraylist, arraylist1);
    }

    private static e a(Context context, int i)
    {
        View view = new View(context);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, (int)context.getResources().getDimension(i)));
        return m.a(view, false);
    }

    public final void a(Uri uri)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((n)iterator.next()).a(uri)) { }
    }

    public final void a(Uri uri, String s)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((n)iterator.next()).a(uri, s)) { }
    }

    public final void a(Subscription subscription)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((n)iterator.next()).a(subscription)) { }
    }

    public final void b(Uri uri)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((n)iterator.next()).b(uri)) { }
    }


    private class Category extends Enum
    {

        private static final Category $VALUES[];
        public static final Category LOCAL;
        public static final Category MOST_SUBSCRIBED;
        public static final Category MOST_VIEWED;
        public static final Category NOTEWORTHY;
        public static final Category RECOMMENDED;
        public final int position;
        public final int stringId;

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/google/android/apps/youtube/app/ui/ChannelStoreOutline$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])$VALUES.clone();
        }

        public final String toString(Resources resources)
        {
            return resources.getString(stringId);
        }

        static 
        {
            RECOMMENDED = new Category("RECOMMENDED", 0, 0, p.eS);
            MOST_SUBSCRIBED = new Category("MOST_SUBSCRIBED", 1, 1, p.cI);
            MOST_VIEWED = new Category("MOST_VIEWED", 2, 2, p.cJ);
            LOCAL = new Category("LOCAL", 3, 3, p.cw);
            NOTEWORTHY = new Category("NOTEWORTHY", 4, 4, p.cW);
            $VALUES = (new Category[] {
                RECOMMENDED, MOST_SUBSCRIBED, MOST_VIEWED, LOCAL, NOTEWORTHY
            });
        }

        private Category(String s, int i, int j, int i1)
        {
            super(s, i);
            position = j;
            stringId = i1;
        }
    }

}
