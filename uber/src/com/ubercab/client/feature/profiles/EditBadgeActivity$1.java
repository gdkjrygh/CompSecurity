// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.DialogInterface;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeActivity

final class a
    implements android.content.smissListener
{

    final boolean a;
    final EditBadgeActivity b;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        EditBadgeActivity.a(b);
        if (a)
        {
            b.a_(b.getString(0x7f070639));
            return;
        } else
        {
            b.finish();
            return;
        }
    }

    (EditBadgeActivity editbadgeactivity, boolean flag)
    {
        b = editbadgeactivity;
        a = flag;
        super();
    }
}
