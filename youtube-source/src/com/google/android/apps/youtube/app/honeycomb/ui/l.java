// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.m;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            j, p

final class l extends AsyncTask
{

    final j a;

    l(j j1)
    {
        a = j1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = ((List[])aobj)[0].iterator();
        do
        {
            if (!((Iterator) (aobj)).hasNext())
            {
                break;
            }
            Object obj = (Uri)((Iterator) (aobj)).next();
            obj = j.a(a, ((Uri) (obj)));
            if (obj != null)
            {
                j.b(a).add(obj);
            }
        } while (true);
        return j.b(a);
    }

    protected final void onPostExecute(Object obj)
    {
        boolean flag2 = false;
        obj = (List)obj;
        if (((List) (obj)).isEmpty())
        {
            L.c("nothing to upload");
            j.c(a).finish();
            return;
        }
        Iterator iterator = ((List) (obj)).iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            p p1 = (p)iterator.next();
            boolean flag1;
            if (p.a(p1) != null && p.b(p1) != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 | flag;
        }
        obj = (p)((List) (obj)).get(0);
        if (j.d(a) != null)
        {
            j.d(a).setImageBitmap(p.c(((p) (obj))));
        }
        if (j.e(a) != null)
        {
            if (p.d(((p) (obj))) != null)
            {
                j.e(a).setVisibility(0);
                int k = (int)(p.d(((p) (obj))).longValue() / 1000L);
                if (k > 0)
                {
                    j.e(a).setVisibility(0);
                    j.e(a).setText(m.a(k, 3));
                } else
                {
                    j.e(a).setVisibility(8);
                }
            } else
            {
                j.e(a).setVisibility(8);
            }
        }
        if (j.f(a) != null)
        {
            obj = j.f(a);
            int i;
            if (flag)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
        }
        j.a(a);
    }
}
