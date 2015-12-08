// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//            r, j

public class s
{

    private final j a;
    private int b;

    public s(Context context)
    {
        this(context, r.a(context, 0));
    }

    public s(Context context, int i)
    {
        a = new j(new ContextThemeWrapper(context, r.a(context, i)));
        b = i;
    }

    public Context a()
    {
        return a.a;
    }

    public s a(android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        a.r = onkeylistener;
        return this;
    }

    public s a(Drawable drawable)
    {
        a.d = drawable;
        return this;
    }

    public s a(View view)
    {
        a.g = view;
        return this;
    }

    public s a(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a.t = listadapter;
        a.u = onclicklistener;
        return this;
    }

    public s a(CharSequence charsequence)
    {
        a.f = charsequence;
        return this;
    }

    public r b()
    {
        r r1 = new r(a.a, b, false);
        a.a(r.a(r1));
        r1.setCancelable(a.o);
        if (a.o)
        {
            r1.setCanceledOnTouchOutside(true);
        }
        r1.setOnCancelListener(a.p);
        r1.setOnDismissListener(a.q);
        if (a.r != null)
        {
            r1.setOnKeyListener(a.r);
        }
        return r1;
    }
}
