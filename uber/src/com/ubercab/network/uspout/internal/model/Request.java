// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout.internal.model;

import com.ubercab.network.uspout.model.Message;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.ubercab.network.uspout.internal.model:
//            Shape_Request, App, Device

public abstract class Request
{

    public Request()
    {
    }

    public static transient Request create(Message amessage[])
    {
        return (new Shape_Request()).setMessages(Arrays.asList(amessage)).setRequestLocalTimestampMilliseconds(System.currentTimeMillis());
    }

    public abstract App getApp();

    public abstract Device getDevice();

    public abstract List getMessages();

    public abstract long getRequestLocalTimestampMilliseconds();

    public abstract Request setApp(App app);

    public abstract Request setDevice(Device device);

    public abstract Request setMessages(List list);

    public abstract Request setRequestLocalTimestampMilliseconds(long l);
}
