// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import com.ubercab.ui.FloatingLabelEditText;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gzg
{

    private final AlertDialog a = b();
    private final chp b;
    private final Context c;
    private final String d;
    private final FloatingLabelEditText e;
    private final List f = new CopyOnWriteArrayList();
    private final View g;

    public gzg(Context context, chp chp1, int i)
    {
        b = chp1;
        c = context;
        d = context.getResources().getString(i);
        g = LayoutInflater.from(c).inflate(gse.ub__payment_view_verification, null);
        e = (FloatingLabelEditText)g.findViewById(gsd.ub__payment_floatinglabeledittext_verification);
    }

    static List a(gzg gzg1)
    {
        return gzg1.f;
    }

    private AlertDialog b()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(c)).setView(g).setPositiveButton(0x104000a, new _cls3()).setNegativeButton(0x1040000, new _cls2()).setOnCancelListener(new _cls1()).create();
        e.c(d);
        return alertdialog;
    }

    static chp b(gzg gzg1)
    {
        return gzg1.b;
    }

    static FloatingLabelEditText c(gzg gzg1)
    {
        return gzg1.e;
    }

    public final void a()
    {
        b.a(e.i);
        a.show();
    }

    public final void a(gzh gzh)
    {
        f.add(gzh);
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
