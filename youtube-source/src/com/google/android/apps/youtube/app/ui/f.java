// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.core.ui.l;
import com.google.android.apps.youtube.datalib.legacy.model.Event;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ck, et

public abstract class f extends l
    implements android.widget.AdapterView.OnItemClickListener
{

    private final a a;
    private final et b;
    private final boolean g;
    private final ck h = new ck();

    public f(Activity activity, PagedView pagedview, a a1, bc bc1, aw aw, boolean flag)
    {
        super(activity, pagedview, a1, bc1.n(), aw);
        g = flag;
        if (a1 instanceof et)
        {
            ((et)a1).a(this);
            b = (et)a1;
            a = b.b();
            return;
        } else
        {
            b = null;
            a = a1;
            pagedview.setOnItemClickListener(this);
            return;
        }
    }

    protected abstract void a(Event event, int i);

    public final boolean a(Object obj)
    {
label0:
        {
            obj = (Event)obj;
            if (((Event) (obj)).action == null)
            {
                break label0;
            }
            if (g)
            {
                if (!((Event) (obj)).targetIsVideo())
                {
                    break label0;
                }
                ck ck1 = h;
                if (!com.google.android.apps.youtube.app.ui.ck.a(((Event) (obj)).targetVideo))
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        if (adapterview != null)
        {
            adapterview = adapterview.getAdapter();
        } else
        {
            adapterview = a;
        }
        if (i < adapterview.getCount())
        {
            adapterview = (Event)adapterview.getItem(i);
            if (adapterview != null)
            {
                a(adapterview, i);
            }
        }
    }
}
