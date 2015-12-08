// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.bz;
import com.google.android.apps.youtube.core.identity.y;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import com.google.android.youtube.q;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            q, o

public final class n extends AlertDialog
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener
{

    private final Activity a;
    private final Analytics b;
    private final bc c;
    private final bj d;
    private final bz e;
    private final y f;
    private final View g;
    private final TextView h;
    private final ImageView i;
    private boolean j;

    public n(Activity activity, bc bc1, bj bj1, bz bz1, Analytics analytics, y y1)
    {
        super(new ContextThemeWrapper(activity, q.a));
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        d = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        e = (bz)com.google.android.apps.youtube.common.fromguava.c.a(bz1);
        b = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        f = (y)com.google.android.apps.youtube.common.fromguava.c.a(y1);
        bc1 = ((LayoutInflater)activity.getSystemService("layout_inflater")).inflate(l.D, null);
        setTitle(p.gE);
        setView(bc1, 0, 0, 0, 0);
        setIcon(0);
        g = bc1.findViewById(j.cn);
        h = (TextView)bc1.findViewById(j.cJ);
        i = (ImageView)bc1.findViewById(j.fy);
        setButton(-1, activity.getString(0x104000a), this);
        setButton(-2, activity.getString(0x1040000), this);
        setOnCancelListener(this);
        setOnDismissListener(this);
    }

    static View a(n n1)
    {
        return n1.g;
    }

    static void a(n n1, boolean flag)
    {
        n1.a(true);
    }

    private void a(boolean flag)
    {
        j = flag;
        Button button = getButton(-1);
        if (button != null)
        {
            button.setEnabled(flag);
        }
    }

    static TextView b(n n1)
    {
        return n1.h;
    }

    static Activity c(n n1)
    {
        return n1.a;
    }

    static ImageView d(n n1)
    {
        return n1.i;
    }

    static bj e(n n1)
    {
        return n1.d;
    }

    static Analytics f(n n1)
    {
        return n1.b;
    }

    static y g(n n1)
    {
        return n1.f;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        f.b();
    }

    public final void onClick(DialogInterface dialoginterface, int k)
    {
        switch (k)
        {
        default:
            return;

        case -1: 
            a(false);
            c.c(com.google.android.apps.youtube.common.a.a.a(a, new com.google.android.apps.youtube.core.ui.q(this)));
            return;

        case -2: 
            f.b();
            return;
        }
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.removeDialog(1);
    }

    protected final void onStart()
    {
        super.onStart();
        g.setVisibility(0);
        a(false);
        e.a(com.google.android.apps.youtube.common.a.a.a(a, new o(this)));
        getButton(-1).setEnabled(j);
    }
}
