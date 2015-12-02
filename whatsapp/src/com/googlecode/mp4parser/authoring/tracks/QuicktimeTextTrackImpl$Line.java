// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            QuicktimeTextTrackImpl

public static class text
{

    long from;
    String text;
    long to;

    public long getFrom()
    {
        return from;
    }

    public String getText()
    {
        return text;
    }

    public long getTo()
    {
        return to;
    }

    public (long l, long l1, String s)
    {
        from = l;
        to = l1;
        text = s;
    }
}
