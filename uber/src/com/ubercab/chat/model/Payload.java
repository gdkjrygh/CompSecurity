// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.model;

import com.ubercab.chat.realtime.response.ChatPayload;

// Referenced classes of package com.ubercab.chat.model:
//            Shape_Payload

public abstract class Payload
{

    public static final int UNKNOWN_DURATION = -1;

    public Payload()
    {
    }

    static Payload create()
    {
        return new Shape_Payload();
    }

    public static Payload create(ChatPayload chatpayload)
    {
        return (new Shape_Payload()).setEncodingFormat(chatpayload.getEncodingFormat()).setDurationMs(chatpayload.getDurationMs());
    }

    public static Payload create(String s, String s1, String s2)
    {
        return (new Shape_Payload()).setDurationMs(-1).setEncodingFormat(s).setId(s1).setLocalPath(s2);
    }

    public String getContentType()
    {
        return "voice";
    }

    public abstract int getDurationMs();

    public abstract String getEncodingFormat();

    public abstract String getId();

    public abstract String getLocalPath();

    public abstract Payload setDurationMs(int i);

    public abstract Payload setEncodingFormat(String s);

    public abstract Payload setId(String s);

    public abstract Payload setLocalPath(String s);
}
