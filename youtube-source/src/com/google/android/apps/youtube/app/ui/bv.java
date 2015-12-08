// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.apps.youtube.app.offline.OfflineStreamQuality;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            by, bw, bx

public final class bv
{

    private final Activity a;
    private final p b;
    private AlertDialog c;
    private LinkedList d;
    private CheckBox e;
    private android.view.View.OnClickListener f;
    private bx g;

    public bv(Activity activity, p p1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
    }

    static OfflineStreamQuality a(bv bv1)
    {
        for (bv1 = bv1.d.iterator(); bv1.hasNext();)
        {
            by by1 = (by)bv1.next();
            if (by.e(by1))
            {
                return by.a(by1);
            }
        }

        return null;
    }

    private void a()
    {
        if (c == null)
        {
            View view = LayoutInflater.from(a).inflate(l.aw, null);
            d = new LinkedList();
            a(new by(this, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type.SD, view.findViewById(j.er), (byte)0));
            a(new by(this, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type.HD, view.findViewById(j.bB), (byte)0));
            e = (CheckBox)view.findViewById(j.ec);
            c = (new aa(a)).setTitle(com.google.android.youtube.p.cz).setPositiveButton(com.google.android.youtube.p.dA, null).setNegativeButton(com.google.android.youtube.p.K, null).setView(view).create();
        }
        a(b.c());
        e.setChecked(false);
    }

    private void a(OfflineStreamQuality offlinestreamquality)
    {
        Iterator iterator = d.iterator();
        while (iterator.hasNext()) 
        {
            by by1 = (by)iterator.next();
            boolean flag;
            if (offlinestreamquality == by.a(by1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            by.a(by1, flag);
        }
    }

    static void a(bv bv1, OfflineStreamQuality offlinestreamquality)
    {
        bv1.a(offlinestreamquality);
    }

    private void a(by by1)
    {
        if (by.a(by1) == null)
        {
            by.b(by1);
            return;
        } else
        {
            d.add(by1);
            return;
        }
    }

    static Activity b(bv bv1)
    {
        return bv1.a;
    }

    private void b()
    {
        c.show();
        if (f == null)
        {
            f = new bw(this);
            c.getButton(-1).setOnClickListener(f);
        }
    }

    static CheckBox c(bv bv1)
    {
        return bv1.e;
    }

    static p d(bv bv1)
    {
        return bv1.b;
    }

    static bx e(bv bv1)
    {
        return bv1.g;
    }

    static AlertDialog f(bv bv1)
    {
        return bv1.c;
    }

    public final boolean a(Offlineability offlineability, bx bx1)
    {
        boolean flag = false;
        if (offlineability != null)
        {
            offlineability = offlineability.b();
            g = (bx)com.google.android.apps.youtube.common.fromguava.c.a(bx1);
            a();
            bx1 = d.iterator();
            int i = 0;
            while (bx1.hasNext()) 
            {
                by by1 = (by)bx1.next();
                com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format format = (com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format)offlineability.get(com.google.android.apps.youtube.app.ui.by.c(by1));
                if (format != null)
                {
                    by.a(by1, format);
                    i++;
                } else
                {
                    by.b(by1);
                }
            }
            if (i > 0)
            {
                b();
                flag = true;
            }
            return flag;
        }
        g = (bx)com.google.android.apps.youtube.common.fromguava.c.a(bx1);
        a();
        for (offlineability = d.iterator(); offlineability.hasNext(); by.d((by)offlineability.next())) { }
        b();
        return true;
    }
}
