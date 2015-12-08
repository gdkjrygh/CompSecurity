// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsFragment

class this._cls0
    implements android.widget.istener
{

    final NotificationsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        handleNotificationClick(i);
    }

    ()
    {
        this$0 = NotificationsFragment.this;
        super();
    }
}
