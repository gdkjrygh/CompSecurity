// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.youtube.p;
import com.google.android.youtube.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            h, f, aq, UserProfile, 
//            ao, an, am

public final class al
{

    private final h a;
    private final bj b;
    private final SharedPreferences c;
    private List d;

    public al(h h1, bj bj1, SharedPreferences sharedpreferences)
    {
        a = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        d = new LinkedList();
    }

    private String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s = c.getString("delegate_cache", "");
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(al al1, Activity activity, f f1, List list)
    {
        al1 = new Bundle();
        al1.putString("accountName", f1.b());
        al1.putSerializable("profiles", new ArrayList(list));
        activity.showDialog(2, al1);
    }

    static void a(al al1, f f1)
    {
        List list = al1.d;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = al1.d.iterator(); iterator.hasNext(); ((aq)iterator.next()).a(f1)) { }
        break MISSING_BLOCK_LABEL_49;
        al1;
        throw al1;
        al1.d.clear();
        list;
        JVM INSTR monitorexit ;
    }

    static void a(al al1, Exception exception)
    {
        List list = al1.d;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = al1.d.iterator(); iterator.hasNext(); ((aq)iterator.next()).a(exception)) { }
        break MISSING_BLOCK_LABEL_49;
        al1;
        throw al1;
        al1.d.clear();
        list;
        JVM INSTR monitorexit ;
    }

    static void a(al al1, String s)
    {
        al1.a(s);
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c.edit().putString("user_identity", s).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static boolean a(al al1, Page page)
    {
        String s = al1.a();
        StringBuilder stringbuilder = new StringBuilder();
        for (page = page.iterator(); page.hasNext(); stringbuilder.append(((UserProfile)page.next()).plusUserId)) { }
        page = Util.b(stringbuilder.toString());
        al1.b(page);
        return !page.equals(s);
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c.edit().putString("delegate_cache", s).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final Dialog a(Activity activity, Bundle bundle)
    {
        String s = bundle.getString("accountName");
        bundle = (List)bundle.getSerializable("profiles");
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(bundle);
        ao ao1 = new ao(activity, bundle, b);
        return (new android.app.AlertDialog.Builder(new ContextThemeWrapper(activity, q.a))).setTitle(p.gE).setSingleChoiceItems(ao1, 1, null).setPositiveButton(p.dA, new an(this, bundle, s, activity)).setCancelable(false).create();
    }

    public final void a(Activity activity, f f1, aq aq1)
    {
        a a1;
label0:
        {
            a1 = com.google.android.apps.youtube.common.a.a.a(activity, new am(this, f1, activity));
            synchronized (d)
            {
                d.add(aq1);
                if (d.size() <= 1)
                {
                    break label0;
                }
            }
            return;
        }
        a.a(f1.c(), a1);
        return;
        f1;
        throw f1;
    }
}
