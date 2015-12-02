// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            fe

class rl
    implements Runnable
{

    final EmojiPopupWindow._cls2 a;

    rl(EmojiPopupWindow._cls2 _pcls2)
    {
        a = _pcls2;
        super();
    }

    public void run()
    {
        a.a.setOnDismissListener(null);
        a.a.dismiss();
        a.a.a(fe.b(a.a));
    }
}
