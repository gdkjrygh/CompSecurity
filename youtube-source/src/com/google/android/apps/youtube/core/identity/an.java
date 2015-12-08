// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListView;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            UserProfile, al, f

final class an
    implements android.content.DialogInterface.OnClickListener
{

    final List a;
    final String b;
    final Activity c;
    final al d;

    an(al al1, List list, String s, Activity activity)
    {
        d = al1;
        a = list;
        b = s;
        c = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i = ((AlertDialog)dialoginterface).getListView().getCheckedItemPosition();
        if (i > 0)
        {
            dialoginterface = ((UserProfile)a.get(i)).plusUserId;
            al.a(d, dialoginterface);
            al.a(d, new f(b, dialoginterface));
        } else
        {
            al.a(d, "No +Page Delegate");
            al.a(d, new f(b, null));
        }
        c.removeDialog(2);
    }
}
