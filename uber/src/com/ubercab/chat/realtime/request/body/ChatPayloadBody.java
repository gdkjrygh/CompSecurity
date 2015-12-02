// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.realtime.request.body;


// Referenced classes of package com.ubercab.chat.realtime.request.body:
//            Shape_ChatPayloadBody

public abstract class ChatPayloadBody
{

    public ChatPayloadBody()
    {
    }

    public static ChatPayloadBody create()
    {
        return new Shape_ChatPayloadBody();
    }

    public abstract String getData();

    public abstract int getDurationMs();

    public abstract String getEncodingFormat();

    public abstract ChatPayloadBody setData(String s);

    public abstract ChatPayloadBody setDurationMs(int i);

    public abstract ChatPayloadBody setEncodingFormat(String s);
}
