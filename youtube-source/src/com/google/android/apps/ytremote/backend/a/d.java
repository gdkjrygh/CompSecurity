// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            c

public final class d
    implements a
{

    private final a a;
    private final a b;

    public d(a a1, a a2)
    {
        a = a1;
        b = a2;
    }

    private static boolean a(String s)
    {
        return !s.equals("SIGNED_OUT_USER");
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid)
    {
        CloudScreen cloudscreen1 = a.a(s, s1, screenid);
        CloudScreen cloudscreen = null;
        if (a(s))
        {
            cloudscreen = b.a(s, s1, screenid);
        }
        if (cloudscreen != null)
        {
            return cloudscreen;
        } else
        {
            return cloudscreen1;
        }
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid, String s2)
    {
        CloudScreen cloudscreen1 = a.a(s, s1, screenid, s2);
        CloudScreen cloudscreen = null;
        if (a(s))
        {
            cloudscreen = b.a(s, s1, screenid, s2);
        }
        if (cloudscreen != null)
        {
            return cloudscreen;
        } else
        {
            return cloudscreen1;
        }
    }

    public final List a(String s, String s1)
    {
        List list = a.a(s, s1);
        Object obj = null;
        if (a(s))
        {
            obj = b.a(s, s1);
        }
        s = new ArrayList();
        s1 = new HashSet();
        if (obj != null)
        {
            CloudScreen cloudscreen1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(cloudscreen1))
            {
                cloudscreen1 = (CloudScreen)((Iterator) (obj)).next();
                s1.add(cloudscreen1.getScreenId());
            }

        }
        obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            CloudScreen cloudscreen = (CloudScreen)((Iterator) (obj)).next();
            if (!s1.contains(cloudscreen.getScreenId()))
            {
                s.add(cloudscreen);
            }
        } while (true);
        return s;
    }

    public final void a(String s, String s1, CloudScreen cloudscreen)
    {
        CloudScreen cloudscreen1 = com.google.android.apps.ytremote.backend.a.c.a(a(s, s1), cloudscreen.getScreenId());
        if (cloudscreen1 != null)
        {
            a(s, s1, cloudscreen1.getScreenId());
        }
        a.a(s, s1, cloudscreen);
        if (a(s))
        {
            b.a(s, s1, cloudscreen);
        }
    }
}
