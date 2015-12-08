// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;


// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocketWriter

static class ype
{

    static final int $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType[];

    static 
    {
        $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType = new int[ype.values().length];
        try
        {
            $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType[ype.TEXT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType[ype.BINARY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
