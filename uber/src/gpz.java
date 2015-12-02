// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.mvc.app.MvcActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class gpz
{

    private ViewGroup a;
    private View b;
    private final List c = new CopyOnWriteArrayList();
    private final iiy d = new iiy();
    private final MvcActivity e;

    public gpz(MvcActivity mvcactivity)
    {
        e = mvcactivity;
    }

    static ViewGroup a(gpz gpz1)
    {
        return gpz1.a;
    }

    private void a()
    {
        if (a != null && b != null)
        {
            a.removeView(b);
            b = null;
        }
    }

    private void b(gpz gpz1)
    {
        c.remove(gpz1);
        gpz1.e();
    }

    public void a(Context context, Bundle bundle)
    {
    }

    public final void a(Bundle bundle)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((gpz)iterator.next()).a(bundle)) { }
    }

    protected final void a(View view)
    {
        if (a == null)
        {
            throw new IllegalStateException("Tried to call addView when not attached.");
        } else
        {
            a();
            a.addView(view);
            b = view;
            return;
        }
    }

    public final void a(ViewGroup viewgroup, Bundle bundle)
    {
        if (a != null)
        {
            throw new IllegalStateException("Trying to attach more than once without detaching.");
        } else
        {
            a = viewgroup;
            a(viewgroup.getContext(), bundle);
            return;
        }
    }

    protected final void a(gpz gpz1, ViewGroup viewgroup, Bundle bundle)
    {
        c.add(gpz1);
        gpz1.a(viewgroup, bundle);
    }

    protected final void a(ica ica1, icg icg)
    {
        d.a(ica1.a(ico.a()).a(new _cls1(icg)));
    }

    public final View c()
    {
        return b;
    }

    protected final MvcActivity d()
    {
        return e;
    }

    public final void e()
    {
        d.a();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); b((gpz)iterator.next())) { }
        a();
        a = null;
    }

    /* member class not found */
    class _cls1 {}

}
