// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ws

class go
{

    String a;
    ws b;

    public go(ws ws1)
    {
        b = ws1;
    }

    public go(ws ws1, String s)
    {
        this(ws1);
        a = s;
    }

    public boolean a()
    {
        return b == ws.SUCCESS;
    }

    public String toString()
    {
        return b.toString();
    }
}
