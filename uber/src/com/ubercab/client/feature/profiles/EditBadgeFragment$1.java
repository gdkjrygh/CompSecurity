// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeFragment

final class a
    implements android.widget.ionListener
{

    final EditBadgeFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        EditBadgeFragment.a(a, textview);
        return true;
    }

    (EditBadgeFragment editbadgefragment)
    {
        a = editbadgefragment;
        super();
    }
}
