// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            be, bg

public final class bd
{

    private final Activity a;
    private final bc b;
    private final aw c;
    private final a d;

    public bd(Activity activity, bc bc1, aw aw1, a a1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        c = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    static Activity a(bd bd1)
    {
        return bd1.a;
    }

    static a b(bd bd1)
    {
        return bd1.d;
    }

    static aw c(bd bd1)
    {
        return bd1.c;
    }

    static bc d(bd bd1)
    {
        return bd1.b;
    }

    public final Dialog a(bg bg)
    {
        View view = a.getLayoutInflater().inflate(l.E, null, false);
        bg = new be(this, (EditText)view.findViewById(j.cJ), (CheckBox)view.findViewById(j.bT), bg);
        bg = (new aa(a)).setTitle(p.aB).setView(view).setPositiveButton(a.getString(0x104000a), bg).setNegativeButton(a.getString(0x1040000), bg).create();
        bg.getWindow().setSoftInputMode(4);
        return bg;
    }
}
