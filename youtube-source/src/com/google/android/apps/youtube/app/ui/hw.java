// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj, hx

final class hw
    implements b
{

    final hj a;
    private View b;
    private Dialog c;
    private final String d;

    public hw(hj hj1, String s)
    {
        a = hj1;
        super();
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    static View a(hw hw1)
    {
        return hw1.b;
    }

    static String b(hw hw1)
    {
        return hw1.d;
    }

    public final void a()
    {
        if (c == null)
        {
            b = a.a.getLayoutInflater().inflate(l.X, null, false);
            ((TextView)b.findViewById(j.aC)).setMovementMethod(LinkMovementMethod.getInstance());
            Object obj = (RadioGroup)b.findViewById(j.bq);
            com.google.android.apps.youtube.core.async.GDataRequestFactory.ComplaintReason acomplaintreason[] = com.google.android.apps.youtube.core.async.GDataRequestFactory.ComplaintReason.values();
            int k = acomplaintreason.length;
            for (int i = 0; i < k; i++)
            {
                com.google.android.apps.youtube.core.async.GDataRequestFactory.ComplaintReason complaintreason = acomplaintreason[i];
                RadioButton radiobutton = new RadioButton(a.a);
                radiobutton.setText(complaintreason.stringId);
                radiobutton.setTextColor(a.a.getResources().getColor(f.d));
                radiobutton.setTag(complaintreason);
                ((RadioGroup) (obj)).addView(radiobutton);
            }

            ((RadioGroup) (obj)).check(((RadioGroup) (obj)).getChildAt(0).getId());
            obj = new hx(this);
            c = (new aa(a.a)).setTitle(p.bQ).setView(b).setCancelable(true).setPositiveButton(p.bP, ((android.content.DialogInterface.OnClickListener) (obj))).setNegativeButton(p.K, ((android.content.DialogInterface.OnClickListener) (obj))).create();
        }
        c.show();
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error flagging", exception);
        hj.a(a).c(exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        hj.a(a, p.gI);
    }
}
