// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;


// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

private static class cartHandling
{

    public int cartHandling;
    public String email;
    public String firstName;
    public String lastName;
    public boolean newsletterFlag;
    public String password;

    public (String s, String s1, String s2, String s3, boolean flag, int i)
    {
        firstName = s;
        lastName = s1;
        email = s2;
        password = s3;
        newsletterFlag = flag;
        cartHandling = i;
    }
}
