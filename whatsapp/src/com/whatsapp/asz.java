// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ListChatInfo

class asz
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ListChatInfo a;

    asz(ListChatInfo listchatinfo)
    {
        a = listchatinfo;
        super();
    }

    public void onGlobalLayout()
    {
        ListChatInfo.h(a);
    }
}
