// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.DialogInterface;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditProfileFieldActivity

final class a
    implements android.content.stener
{

    final boolean a;
    final EditProfileFieldActivity b;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (a)
        {
            b.a_(b.getString(0x7f070639));
            return;
        } else
        {
            EditProfileFieldActivity.a(b);
            return;
        }
    }

    (EditProfileFieldActivity editprofilefieldactivity, boolean flag)
    {
        b = editprofilefieldactivity;
        a = flag;
        super();
    }
}
