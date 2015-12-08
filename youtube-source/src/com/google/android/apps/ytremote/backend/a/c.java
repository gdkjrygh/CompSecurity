// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.Iterator;
import java.util.List;

public final class c
{

    public static CloudScreen a(List list, ScreenId screenid)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            CloudScreen cloudscreen = (CloudScreen)list.next();
            if (cloudscreen.getScreenId().equals(screenid))
            {
                return cloudscreen;
            }
        }

        return null;
    }

    public static CloudScreen a(List list, String s)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            CloudScreen cloudscreen = (CloudScreen)list.next();
            if (cloudscreen.getName().equals(s))
            {
                return cloudscreen;
            }
        }

        return null;
    }
}
