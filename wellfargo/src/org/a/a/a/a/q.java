// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;

// Referenced classes of package org.a.a.a.a:
//            e

class q
    implements e
{

    static final q a = new q();

    q()
    {
    }

    public int a()
    {
        return 2;
    }

    public final void a(StringBuffer stringbuffer, int i)
    {
        stringbuffer.append((char)(i / 10 + 48));
        stringbuffer.append((char)(i % 10 + 48));
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        a(stringbuffer, calendar.get(1) % 100);
    }

}
