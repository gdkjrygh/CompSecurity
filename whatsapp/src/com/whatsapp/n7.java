// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            MediaView

class n7
    implements Runnable
{

    final MediaView a;

    n7(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    public void run()
    {
        a.finish();
    }
}
