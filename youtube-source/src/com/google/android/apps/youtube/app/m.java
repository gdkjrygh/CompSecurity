// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            i, k, l

final class m
    implements g
{

    private final ViewGroup a;
    private final TextView b;
    private final ListView c;
    private final TextView d;
    private final h e = new h();

    public m(Context context)
    {
        a = (ViewGroup)LayoutInflater.from(context).inflate(l.I, null);
        b = (TextView)a.findViewById(j.ge);
        c = (ListView)a.findViewById(j.i);
        d = (TextView)a.findViewById(j.aR);
        e.a(com/google/android/apps/youtube/app/i, new k(context));
        c.setAdapter(e);
    }

    public final View a(f f, Object obj)
    {
        f = (com.google.android.apps.youtube.app.l)obj;
        b.setText(((com.google.android.apps.youtube.app.l) (f)).a.b());
        if (((com.google.android.apps.youtube.app.l) (f)).b == null || ((com.google.android.apps.youtube.app.l) (f)).b.isEmpty())
        {
            return a;
        } else
        {
            d.setVisibility(8);
            e.b();
            e.a(((com.google.android.apps.youtube.app.l) (f)).b);
            e.notifyDataSetChanged();
            return a;
        }
    }
}
