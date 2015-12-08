// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            Request

public static final class gu extends Enum
{

    public static final gt go;
    public static final gt gp;
    public static final gt gq;
    public static final gt gr;
    public static final gt gs;
    public static final gt gt;
    private static final gt gv[];
    private final String gu;

    public static gu valueOf(String s)
    {
        return (gu)Enum.valueOf(com/sessionm/net/Request$Header, s);
    }

    public static gu[] values()
    {
        return (gu[])gv.clone();
    }

    public String getKey()
    {
        return gu;
    }

    static 
    {
        go = new <init>("CACHE_CONTROL", 0, "Cache-Control");
        gp = new <init>("USER_AGENT", 1, "User-Agent");
        gq = new <init>("CONTENT_TYPE", 2, "Content-Type");
        gr = new <init>("SET_COOKIE", 3, "Set-Cookie");
        gs = new <init>("LOCATION", 4, "Location");
        gt = new <init>("CONTENT_LENGTH", 5, "Content-Length");
        gv = (new gv[] {
            go, gp, gq, gr, gs, gt
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        gu = s1;
    }
}
