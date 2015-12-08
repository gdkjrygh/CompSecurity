// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            c

public final class n
    implements a
{

    private final SharedPreferences a;
    private List b;
    private boolean c;

    public n(SharedPreferences sharedpreferences)
    {
        a = (SharedPreferences)com.google.android.apps.ytremote.util.c.a(sharedpreferences, "preferences can not be null");
        c = false;
    }

    private void a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        CloudScreen cloudscreen;
        for (list = list.iterator(); list.hasNext(); stringbuilder1.append(cloudscreen.getName()).append(","))
        {
            cloudscreen = (CloudScreen)list.next();
            stringbuilder.append(cloudscreen.getScreenId()).append(",");
        }

        a.edit().putString("screenIds", stringbuilder.toString()).putString("screenNames", stringbuilder1.toString()).commit();
    }

    private void b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            a(s, s1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid)
    {
        b(s, s1);
        s = com.google.android.apps.ytremote.backend.a.c.a(b, screenid);
        if (s != null)
        {
            b.remove(s);
        }
        a(b);
        return s;
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid, String s2)
    {
        b(s, s1);
        s1 = com.google.android.apps.ytremote.backend.a.c.a(b, screenid);
        s = null;
        if (s1 != null)
        {
            int i = b.indexOf(s1);
            s = s1.withName(s2);
            b.remove(s1);
            b.add(i, s);
        }
        a(b);
        return s;
    }

    public final List a(String s, String s1)
    {
        if (c)
        {
            return b;
        }
        if (!a.contains("screenIds"))
        {
            b = new ArrayList();
        } else
        {
            s1 = a.getString("screenIds", "").split(",");
            String as[] = a.getString("screenNames", "").split(",");
            ArrayList arraylist = new ArrayList();
            int i = 0;
            while (i < s1.length) 
            {
                s = s1[i];
                if (!TextUtils.isEmpty(s))
                {
                    ScreenId screenid = new ScreenId(s);
                    if (i < as.length)
                    {
                        s = as[i];
                    } else
                    {
                        s = "";
                    }
                    arraylist.add(new CloudScreen(screenid, s, null, null));
                }
                i++;
            }
            b = arraylist;
        }
        c = true;
        return b;
    }

    public final void a(String s, String s1, CloudScreen cloudscreen)
    {
        b(s, s1);
        b.add(0, cloudscreen);
        if (b.size() > 5)
        {
            a(s, s1, ((CloudScreen)b.get(5)).getScreenId());
        }
        a(b);
    }
}
