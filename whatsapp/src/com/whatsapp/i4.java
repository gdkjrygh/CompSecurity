// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.whatsapp:
//            Conversations, a3n

class i4
    implements com.actionbarsherlock.view.MenuItem.OnActionExpandListener
{

    final Conversations a;

    i4(Conversations conversations)
    {
        a = conversations;
        super();
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        Conversations.a(a).a("");
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return true;
    }
}
