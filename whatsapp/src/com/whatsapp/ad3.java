// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.whatsapp:
//            adk, App, ListChatInfo, og

class ad3 extends adk
{

    final ListChatInfo a;

    ad3(ListChatInfo listchatinfo)
    {
        a = listchatinfo;
        super();
    }

    public void a(Collection collection, Map map)
    {
        int i = App.am;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            map = (c4)collection.next();
            if (!((c4) (map)).y.a.equals(ListChatInfo.d(a).a) || ((c4) (map)).w != 1 && ((c4) (map)).w != 3 && ((c4) (map)).w != 2)
            {
                continue;
            }
            ListChatInfo.g(a);
            if (i == 0)
            {
                break;
            }
        } while (i == 0);
    }
}
