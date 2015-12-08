// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.rest;


public final class RestMethod extends Enum
{

    private static final RestMethod $VALUES[];
    public static final RestMethod DELETE;
    public static final RestMethod GET;
    public static final RestMethod POST;
    public static final RestMethod PUT;

    private RestMethod(String s, int i)
    {
        super(s, i);
    }

    public static RestMethod valueOf(String s)
    {
        return (RestMethod)Enum.valueOf(com/uservoice/uservoicesdk/rest/RestMethod, s);
    }

    public static RestMethod[] values()
    {
        return (RestMethod[])$VALUES.clone();
    }

    static 
    {
        GET = new RestMethod("GET", 0);
        POST = new RestMethod("POST", 1);
        PUT = new RestMethod("PUT", 2);
        DELETE = new RestMethod("DELETE", 3);
        $VALUES = (new RestMethod[] {
            GET, POST, PUT, DELETE
        });
    }
}
