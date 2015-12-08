// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;


// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            Clock

class SystemClock
    implements Clock
{

    SystemClock()
    {
    }

    public long getCurrentTime()
    {
        return System.currentTimeMillis();
    }
}
