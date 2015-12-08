// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hc

public final class hb
{

    private final Context a;
    private final android.content.DialogInterface.OnClickListener b;
    private final SharedPreferences c;
    private final LayoutInflater d;
    private final View e;
    private final AlertDialog f;
    private boolean g;

    public hb(Context context)
    {
        this(context, null);
    }

    public hb(Context context, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = onclicklistener;
        c = context.getSharedPreferences("youtube", 0);
        g = c.contains("upload_policy");
        d = LayoutInflater.from(context);
        e = d.inflate(l.bv, null);
        if (!g && ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(0) == null)
        {
            a(p.hm);
        }
        onclicklistener = new hc(this, (RadioButton)e.findViewById(j.cW));
        f = (new aa(context)).setTitle(p.gq).setView(e).setPositiveButton(0x104000a, onclicklistener).setCancelable(false).create();
    }

    static android.content.DialogInterface.OnClickListener a(hb hb1)
    {
        return hb1.b;
    }

    private void a(int i)
    {
        c.edit().putString("upload_policy", a.getString(i)).apply();
        g = true;
    }

    static void a(hb hb1, int i)
    {
        hb1.a(i);
    }

    public final Dialog a()
    {
        return f;
    }

    public final boolean b()
    {
        return g;
    }
}
