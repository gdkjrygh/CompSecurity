// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.core.ui.YouTubeTextView;
import com.google.android.youtube.h;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f

final class j extends BaseAdapter
{

    final f a;
    private final List b = new ArrayList();

    public j(f f1)
    {
        a = f1;
        super();
    }

    public final Integer a(int i)
    {
        return (Integer)b.get(i);
    }

    public final void a()
    {
        b.clear();
    }

    public final void a(Collection collection)
    {
        b.addAll(collection);
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        int k;
        view = (YouTubeTextView)view;
        if (view == null)
        {
            view = (YouTubeTextView)View.inflate(f.c(a), l.v, null);
        }
        k = a(i).intValue();
        k;
        JVM INSTR tableswitch 1 3: default 64
    //                   1 112
    //                   2 119
    //                   3 126;
           goto _L1 _L2 _L3 _L4
_L1:
        i = 0;
_L9:
        view.setText(i);
        k;
        JVM INSTR tableswitch 1 3: default 100
    //                   1 133
    //                   2 140
    //                   3 147;
           goto _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_147;
_L5:
        i = 0;
_L10:
        view.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        return view;
_L2:
        i = p.fl;
          goto _L9
_L3:
        i = p.fk;
          goto _L9
_L4:
        i = p.aE;
          goto _L9
_L6:
        i = h.z;
          goto _L10
_L7:
        i = h.A;
          goto _L10
        i = h.y;
          goto _L10
    }
}
