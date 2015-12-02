// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            og, ContactInfo

class vk
{

    private String a;
    private String b;
    private og c;
    final ContactInfo d;
    private String e;

    vk(ContactInfo contactinfo, og og1)
    {
        d = contactinfo;
        super();
        e = og1.a();
        a = (String)og1.a(contactinfo.getResources());
        if (og1.t)
        {
            b = og1.a;
        }
        c = og1;
    }

    vk(ContactInfo contactinfo, String s, String s1)
    {
        d = contactinfo;
        super();
        e = s;
        a = s1;
    }

    static og a(vk vk1, og og1)
    {
        vk1.c = og1;
        return og1;
    }

    static String a(vk vk1)
    {
        return vk1.e;
    }

    static String a(vk vk1, String s)
    {
        vk1.b = s;
        return s;
    }

    static og b(vk vk1)
    {
        return vk1.c;
    }

    static String b(vk vk1, String s)
    {
        vk1.e = s;
        return s;
    }

    static String c(vk vk1)
    {
        return vk1.a;
    }

    static String d(vk vk1)
    {
        return vk1.b;
    }
}
