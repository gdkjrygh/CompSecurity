// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.app.AlertDialog;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.ui.presenter.v;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.datalib.distiller.model.c;
import com.google.android.youtube.p;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            r, f, v, u, 
//            x, p, z, y, 
//            ab, j, t

final class s
    implements r
{

    final f a;
    private AlertDialog b;
    private AlertDialog c;
    private AlertDialog d;
    private j e;
    private c f;

    private s(f f1)
    {
        a = f1;
        super();
    }

    s(f f1, byte byte0)
    {
        this(f1);
    }

    static j a(s s1)
    {
        return s1.e;
    }

    static void b(s s1)
    {
        if (s1.c == null)
        {
            s1.c = (new android.app.AlertDialog.Builder(com.google.android.apps.youtube.app.d.f.c(s1.a))).setTitle(p.fo).setMessage(p.fm).setPositiveButton(p.fp, new com.google.android.apps.youtube.app.d.v(s1)).setNegativeButton(p.fn, new u(s1)).create();
        }
        com.google.android.apps.youtube.app.d.f.a(s1.a, new x(s1));
    }

    static void c(s s1)
    {
        if (com.google.android.apps.youtube.app.d.f.a(s1.f).n() == com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.PRIVATE)
        {
            com.google.android.apps.youtube.app.d.f.a(s1.a, p.at);
            return;
        } else
        {
            com.google.android.apps.youtube.app.d.f.l(s1.a).a(s1.f);
            return;
        }
    }

    static void d(s s1)
    {
        if (s1.d == null)
        {
            s1.d = (new android.app.AlertDialog.Builder(com.google.android.apps.youtube.app.d.f.c(s1.a))).setTitle(p.aH).setMessage(p.aF).setPositiveButton(p.aI, new z(s1)).setNegativeButton(p.aG, new y(s1)).create();
        }
        com.google.android.apps.youtube.app.d.f.a(s1.a, new ab(s1));
    }

    static c e(s s1)
    {
        return s1.f;
    }

    static AlertDialog f(s s1)
    {
        return s1.c;
    }

    static AlertDialog g(s s1)
    {
        return s1.d;
    }

    public final void a(c c1)
    {
        if (b == null)
        {
            e = new j(a);
            b = (new aa(com.google.android.apps.youtube.app.d.f.c(a))).setTitle(p.an).setAdapter(e, new t(this)).create();
        }
        f = c1;
        e.a();
        j j1 = e;
        ArrayList arraylist = new ArrayList();
        if (com.google.android.apps.youtube.app.d.f.a(c1).o())
        {
            arraylist.add(Integer.valueOf(2));
        }
        if (com.google.android.apps.youtube.app.d.f.a(a).b != null && !TextUtils.isEmpty(com.google.android.apps.youtube.app.d.f.a(a).b.plusUserId) && com.google.android.apps.youtube.app.d.f.a(a).b.plusUserId.equals(c1.d()))
        {
            arraylist.add(Integer.valueOf(3));
        } else
        {
            arraylist.add(Integer.valueOf(1));
        }
        j1.a(arraylist);
        b.show();
    }
}
