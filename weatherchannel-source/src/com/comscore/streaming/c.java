// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//            StreamSense

class c
    implements Runnable
{

    final StreamSense a;

    c(StreamSense streamsense)
    {
        a = streamsense;
        super();
    }

    public void run()
    {
        a.b();
    }
}
