// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.app.Activity;

public class q
{

    String a;
    String b;

    public q(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a(Activity activity)
    {
        if (a.length() == 0)
        {
            return activity.getString(0x7f080111);
        }
        if (a.length() < 6)
        {
            return activity.getString(0x7f080112);
        }
        if (b.length() == 0)
        {
            return activity.getString(0x7f0800b7);
        } else
        {
            return null;
        }
    }

    public boolean b(Activity activity)
    {
        return a(activity) != null;
    }
}
