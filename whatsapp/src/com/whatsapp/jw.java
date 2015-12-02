// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a92, ListChatInfo, og, App, 
//            k, aoz

class jw
    implements a92
{

    final ListChatInfo a;

    jw(ListChatInfo listchatinfo)
    {
        a = listchatinfo;
        super();
    }

    public void a(String s)
    {
        if (!ListChatInfo.d(a).a(a).equals(s))
        {
            ListChatInfo.d(a).n = s;
            App.az.o(ListChatInfo.d(a));
            App.ah.c(ListChatInfo.d(a).a, s);
            ListChatInfo.f(a);
            App.B(ListChatInfo.d(a).a);
            App.c(ListChatInfo.d(a));
        }
    }
}
