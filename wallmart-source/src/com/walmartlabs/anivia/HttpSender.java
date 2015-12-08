// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;


public interface HttpSender
{
    public static class Response
    {

        public final String body;
        public final int statusCode;

        public Response(int i, String s)
        {
            statusCode = i;
            body = s;
        }
    }


    public abstract Response post(String s, String s1, String s2);
}
