// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            cr, WebSessionsActivity, _u

class w4
    implements cr
{

    final WebSessionsActivity a;

    w4(WebSessionsActivity websessionsactivity)
    {
        a = websessionsactivity;
        super();
    }

    public void a()
    {
        if (!a.isFinishing())
        {
            a.runOnUiThread(new _u(this));
        }
    }

    public void a(int i)
    {
    }
}
