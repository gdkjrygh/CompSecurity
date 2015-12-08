// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import java.util.HashMap;

public class o
{

    private static HashMap a = new HashMap();

    public static Object a(String s)
    {
        return a.get(s);
    }

    public static void a(String s, Object obj)
    {
        a.put(s, obj);
    }

    public static void b(String s)
    {
        a.remove(s);
    }

}
