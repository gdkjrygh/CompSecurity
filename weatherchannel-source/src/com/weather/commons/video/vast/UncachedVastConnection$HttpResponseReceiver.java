// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import android.util.Xml;
import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.commons.video.vast:
//            UncachedVastConnection, VastContentHandler

private static class <init>
    implements Receiver
{

    private final Receiver vastReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(String s, Object obj)
    {
        VastContentHandler vastcontenthandler = new VastContentHandler();
        try
        {
            Xml.parse(s, vastcontenthandler);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            vastReceiver.onError(s, obj);
        }
        vastReceiver.onCompletion(vastcontenthandler.getVast(), obj);
    }

    public void onError(Throwable throwable, Object obj)
    {
        vastReceiver.onError(throwable, obj);
    }

    private (Receiver receiver)
    {
        vastReceiver = receiver;
    }

    vastReceiver(Receiver receiver, vastReceiver vastreceiver)
    {
        this(receiver);
    }
}
