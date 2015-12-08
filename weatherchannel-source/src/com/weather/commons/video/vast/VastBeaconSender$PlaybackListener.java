// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;


// Referenced classes of package com.weather.commons.video.vast:
//            VastBeaconSender

private static final class <init>
    implements com.weather.commons.video.itionListener
{

    private final VastBeaconSender sender;

    public void onPositionChange()
    {
        VastBeaconSender.access$100(sender);
    }

    private Listener(VastBeaconSender vastbeaconsender)
    {
        sender = vastbeaconsender;
    }

    sender(VastBeaconSender vastbeaconsender, sender sender1)
    {
        this(vastbeaconsender);
    }
}
