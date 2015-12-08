// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;

// Referenced classes of package org.a.a.a.a:
//            g

class l
    implements g
{

    static final l a = new l(true);
    static final l b = new l(false);
    final boolean c;

    l(boolean flag)
    {
        c = flag;
    }

    public int a()
    {
        return 5;
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        int i = calendar.get(15) + calendar.get(16);
        int j;
        if (i < 0)
        {
            stringbuffer.append('-');
            i = -i;
        } else
        {
            stringbuffer.append('+');
        }
        j = i / 0x36ee80;
        stringbuffer.append((char)(j / 10 + 48));
        stringbuffer.append((char)(j % 10 + 48));
        if (c)
        {
            stringbuffer.append(':');
        }
        i = i / 60000 - j * 60;
        stringbuffer.append((char)(i / 10 + 48));
        stringbuffer.append((char)(i % 10 + 48));
    }

}
