// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.p;
import com.google.android.youtube.q;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, aj, ai

final class ak
    implements ae
{

    final aj a;
    private final View b;
    private final TextView c;
    private final ae d;

    private ak(aj aj1, View view, ViewGroup viewgroup)
    {
        a = aj1;
        super();
        b = view.findViewById(j.fZ);
        c = (TextView)b.findViewById(j.aP);
        d = aj.a(aj1).a(view, viewgroup);
    }

    ak(aj aj1, View view, ViewGroup viewgroup, byte byte0)
    {
        this(aj1, view, viewgroup);
    }

    public final View a(int i, Object obj)
    {
        obj = (LiveEvent)obj;
        d.a(i, ((LiveEvent) (obj)).video);
        if (((LiveEvent) (obj)).video.isLive())
        {
            c.setText(p.cl);
            c.setTextAppearance(aj.b(a), q.f);
        }
        return b;
    }
}
