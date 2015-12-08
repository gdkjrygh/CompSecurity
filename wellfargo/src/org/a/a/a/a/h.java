// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;

// Referenced classes of package org.a.a.a.a:
//            g

class h
    implements g
{

    private final String a;

    h(String s)
    {
        a = s;
    }

    public int a()
    {
        return a.length();
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        stringbuffer.append(a);
    }
}
