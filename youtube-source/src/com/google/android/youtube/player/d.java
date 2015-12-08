// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.youtube.player.internal.b.a;

final class d
    implements android.content.DialogInterface.OnClickListener
{

    private final Activity a;
    private final Intent b;
    private final int c;

    public d(Activity activity, Intent intent, int i)
    {
        a = (Activity)com.google.android.youtube.player.internal.b.d.a(activity);
        b = (Intent)com.google.android.youtube.player.internal.b.d.a(intent);
        c = ((Integer)com.google.android.youtube.player.internal.b.d.a(Integer.valueOf(i))).intValue();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            a.startActivityForResult(b, c);
            dialoginterface.dismiss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            com.google.android.youtube.player.internal.b.a.b("Can't perform resolution for YouTubeInitalizationError", new Object[] {
                dialoginterface
            });
        }
    }
}
