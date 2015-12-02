// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdView;
import java.util.Iterator;
import java.util.Set;

public abstract class jq
    implements ow, oy
{

    private AdView a;
    private kl b;

    public jq()
    {
    }

    private ki a(Context context, ou ou1, Bundle bundle, Bundle bundle1)
    {
        kj kj1 = new kj();
        Object obj = ou1.a();
        if (obj != null)
        {
            kj1.a(((java.util.Date) (obj)));
        }
        int i = ou1.b();
        if (i != 0)
        {
            kj1.a(i);
        }
        obj = ou1.c();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); kj1.a((String)((Iterator) (obj)).next())) { }
        }
        obj = ou1.d();
        if (obj != null)
        {
            kj1.a(((android.location.Location) (obj)));
        }
        if (ou1.f())
        {
            kx.a();
            kj1.b(oe.a(context));
        }
        if (ou1.e() != -1)
        {
            boolean flag;
            if (ou1.e() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kj1.a(flag);
        }
        kj1.a(kb, a(bundle, bundle1));
        return kj1.a();
    }

    protected abstract Bundle a(Bundle bundle, Bundle bundle1);

    public final void a()
    {
        if (a != null)
        {
            a.a();
            a = null;
        }
        if (b != null)
        {
            b = null;
        }
    }

    public final void a(Context context, ox ox, Bundle bundle, kk kk1, ou ou1, Bundle bundle1)
    {
        a = new AdView(context);
        a.a(new kk(kk1.b(), kk1.a()));
        a.a(bundle.getString("pubid"));
        a.a(new jr(this, ox));
        a.a(a(context, ou1, bundle1, bundle));
    }

    public final void a(Context context, oz oz, Bundle bundle, ou ou1, Bundle bundle1)
    {
        b = new kl(context);
        b.a(bundle.getString("pubid"));
        b.a(new js(this, oz));
        b.a(a(context, ou1, bundle1, bundle));
    }

    public final void b()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void c()
    {
        if (a != null)
        {
            a.c();
        }
    }

    public final View d()
    {
        return a;
    }

    public final void e()
    {
        b.a();
    }
}
