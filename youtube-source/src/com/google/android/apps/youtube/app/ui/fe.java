// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.PairingCode;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ev

final class fe
    implements b
{

    final ev a;
    private final String b;
    private final String c;

    private fe(ev ev1, String s, String s1)
    {
        a = ev1;
        super();
        b = s;
        c = s1;
    }

    fe(ev ev1, String s, String s1, byte byte0)
    {
        this(ev1, s, s1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error loading existing screens", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        boolean flag;
        obj1 = (List)obj1;
        obj = b;
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_65;
            }
        } while (!((YouTubeTvScreen)((Iterator) (obj1)).next()).getScreenName().equals(obj));
        flag = true;
_L1:
        if (flag)
        {
            ev.h(a).showDialog(1027);
            return;
        } else
        {
            ev.g(a).a(b.toString(), new PairingCode(c.replaceAll("\\D", "")), ev.f(a));
            return;
        }
        flag = false;
          goto _L1
    }
}
