// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.datalib.distiller.model.b;
import com.google.android.apps.youtube.datalib.distiller.model.c;
import com.google.android.gms.plus.j;
import com.google.android.youtube.h;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            o, f, q

final class p
    implements o
{

    final f a;

    private p(f f1)
    {
        a = f1;
        super();
    }

    p(f f1, byte byte0)
    {
        this(f1);
    }

    static void a(p p1, UserProfile userprofile, String s, c c)
    {
        Object obj = null;
        if (c == null)
        {
            String s2 = f.k(p1.a).c();
            if (s2 == null)
            {
                c = null;
            } else
            {
                c = userprofile.displayUsername;
            }
            if (s2 == null)
            {
                userprofile = obj;
            } else
            {
                userprofile = userprofile.thumbnailUri.toString();
            }
            userprofile = (new j(com.google.android.apps.youtube.app.d.f.c(p1.a))).d(f.k(p1.a).b()).a(h.b).a(com.google.android.apps.youtube.app.d.f.c(p1.a).getString(com.google.android.youtube.p.A)).h("104").a(Uri.parse((new StringBuilder("http://www.youtube.com/watch?v=")).append(s).toString())).b(com.google.android.apps.youtube.app.d.f.c(p1.a).getString(com.google.android.youtube.p.as)).e(s2).f(c).g(userprofile).c("youTubeComments").a(true).a();
            userprofile.setPackage("com.google.android.gms");
        } else
        {
            String s1 = f.k(p1.a).c();
            s = f.a(c);
            if (c instanceof b)
            {
                userprofile = (b)c;
            } else
            {
                userprofile = null;
            }
            c = (new com.google.android.gms.plus.h()).a(f.k(p1.a).b()).b(s.k()).e("104").c(s1);
            if (s.q())
            {
                c.d("youTubeComments");
            }
            if (userprofile != null)
            {
                c.a(userprofile.d(), userprofile.c(), userprofile.j().toString());
            }
            userprofile = c.a();
            userprofile.setPackage("com.google.android.gms");
        }
        com.google.android.apps.youtube.app.d.f.c(p1.a).startActivityForResult(userprofile, 0);
    }

    private void b(c c)
    {
        f.a(a, new q(this, c));
    }

    public final void a()
    {
        b(null);
    }

    public final void a(c c)
    {
        b(c);
    }
}
