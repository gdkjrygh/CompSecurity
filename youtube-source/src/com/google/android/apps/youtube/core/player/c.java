// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.cf;
import java.util.Random;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            b

public final class c
{

    private static String a = "";
    private static b b = new n();
    private static cf c = null;
    private static Random d;
    private static h e;

    public static com.google.android.apps.youtube.core.player.b a()
    {
        String s = a;
        b b1 = b;
        Random random;
        if (d != null)
        {
            random = d;
        } else
        {
            random = new Random(b.a());
        }
        return new com.google.android.apps.youtube.core.player.b(s, b1, random, c, e);
    }

    public static void a(b b1)
    {
        b = b1;
    }

    public static void a(h h)
    {
        e = h;
    }

    public static void a(cf cf)
    {
        c = cf;
    }

    public static void a(String s)
    {
        a = s;
    }

}
