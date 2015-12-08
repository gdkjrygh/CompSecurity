// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.d.r;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            b, cu, cs, cr, 
//            f, g

public final class cq extends b
{

    private final TextView e;
    private final TextView f;
    private final View g;
    private final cu h;

    public cq(Activity activity, bj bj, com.google.android.apps.youtube.app.ui.presenter.f f1, cu cu1, g g1, r r)
    {
        super(View.inflate(activity, l.U, null), activity, bj, f1, g1, r);
        h = (cu)c.a(cu1);
        e = (TextView)a.findViewById(j.eJ);
        g = a.findViewById(j.cl);
        f = (TextView)a.findViewById(j.ay);
    }

    private View a(f f1, TopLevelComment toplevelcomment)
    {
        int i;
        super.a(f1, toplevelcomment);
        if (toplevelcomment.m())
        {
            g.setVisibility(0);
            e.setVisibility(8);
        } else
        if (toplevelcomment.a())
        {
            g.setVisibility(8);
            e.setVisibility(0);
            e.setText(p.au);
            e.setOnClickListener(new cr(this, toplevelcomment));
        } else
        {
            g.setVisibility(8);
            e.setVisibility(8);
        }
        f1 = f;
        cs.a[toplevelcomment.n().ordinal()];
        JVM INSTR tableswitch 1 4: default 76
    //                   1 165
    //                   2 172
    //                   3 179
    //                   4 186;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i = 0;
_L7:
        f1.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        return a;
_L2:
        i = h.L;
        continue; /* Loop/switch isn't completed */
_L3:
        i = h.C;
        continue; /* Loop/switch isn't completed */
_L4:
        i = h.F;
        continue; /* Loop/switch isn't completed */
_L5:
        i = h.B;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static cu a(cq cq1)
    {
        return cq1.h;
    }

    public final volatile View a(f f1, com.google.android.apps.youtube.datalib.distiller.model.c c1)
    {
        return a(f1, (TopLevelComment)c1);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (TopLevelComment)obj);
    }
}
