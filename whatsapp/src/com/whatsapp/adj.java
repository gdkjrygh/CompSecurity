// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            asp

final class adj
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public adj(String s, String s1, String s2, String s3)
    {
        c = (String)asp.a(s);
        a = (String)asp.a(s1);
        d = (String)asp.a(s2);
        b = (String)asp.a(s3);
    }

    public String toString()
    {
        return (new StringBuilder()).append(c).append(" ").append(a).append(" ").append(b).toString();
    }
}
