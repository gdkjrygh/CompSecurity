// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class n
{

    private static final ExecutorService e = Executors.newCachedThreadPool();
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean f;
    boolean g;
    ExecutorService h;
    List i;

    n()
    {
        a = true;
        d = true;
        c = true;
        b = true;
        f = true;
        h = e;
    }

}
