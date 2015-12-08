// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2.a.a;


// Referenced classes of package com.google.wireless.gdata2.a.a:
//            c, b

public final class a
{

    String a;
    String b;
    c c;
    b d;

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("id: ").append(a);
        stringbuffer.append(" op: ").append(b);
        if (c != null)
        {
            stringbuffer.append(" sc: ").append(c.a());
        }
        if (d != null)
        {
            stringbuffer.append(" interrupted: ").append(d.a());
        }
        return stringbuffer.toString();
    }
}
