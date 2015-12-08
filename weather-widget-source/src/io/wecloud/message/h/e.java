// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;


public class e
{

    public static String a(String s, int i)
    {
        s = new StringBuilder(s);
        s.append("/common?funid=");
        s.append(i);
        s.append("&rd=");
        s.append(System.currentTimeMillis());
        return s.toString();
    }
}
