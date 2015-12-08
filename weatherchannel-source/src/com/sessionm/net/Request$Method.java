// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            Request

public static final class  extends Enum
{

    public static final gA gA;
    private static final gA gB[];
    public static final gA gw;
    public static final gA gx;
    public static final gA gy;
    public static final gA gz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/net/Request$Method, s);
    }

    public static [] values()
    {
        return ([])gB.clone();
    }

    static 
    {
        gw = new <init>("POST", 0);
        gx = new <init>("GET", 1);
        gy = new <init>("DELETE", 2);
        gz = new <init>("PUT", 3);
        gA = new <init>("GENERIC", 4);
        gB = (new gB[] {
            gw, gx, gy, gz, gA
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
