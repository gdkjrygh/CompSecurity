// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ia, afo, ro, ListChatInfo

class ng
    implements ia
{

    final afo a;

    ng(afo afo1)
    {
        a = afo1;
        super();
    }

    public void a(ArrayList arraylist)
    {
        a.a.runOnUiThread(new ro(this, arraylist));
    }
}
