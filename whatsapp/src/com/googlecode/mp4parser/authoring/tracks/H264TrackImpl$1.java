// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

static class LActions
{

    static final int $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[];

    static 
    {
        $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = new int[LActions.values().length];
        try
        {
            $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[LActions.IGNORE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[LActions.BUFFER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[LActions.STORE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[LActions.END.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
