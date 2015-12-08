// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            aw, ar

final class as
    implements android.content.DialogInterface.OnClickListener, aw
{

    final ar a;
    private AlertDialog b;
    private ListAdapter c;
    private CharSequence d;

    private as(ar ar1)
    {
        a = ar1;
        super();
    }

    as(ar ar1, byte byte0)
    {
        this(ar1);
    }

    public final void a(ListAdapter listadapter)
    {
        c = listadapter;
    }

    public final void a(CharSequence charsequence)
    {
        d = charsequence;
    }

    public final void c()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a.getContext());
        if (d != null)
        {
            builder.setTitle(d);
        }
        b = builder.setSingleChoiceItems(c, a.d(), this).show();
    }

    public final void d()
    {
        b.dismiss();
        b = null;
    }

    public final boolean f()
    {
        if (b != null)
        {
            return b.isShowing();
        } else
        {
            return false;
        }
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(i);
        if (a.t != null)
        {
            a.a(null, i, c.getItemId(i));
        }
        d();
    }
}
