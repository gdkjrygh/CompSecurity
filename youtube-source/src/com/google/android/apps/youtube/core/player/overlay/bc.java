// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bd, bb

final class bc
    implements android.content.DialogInterface.OnClickListener
{

    final ArrayAdapter a;
    final bd b;
    final bb c;

    bc(bb bb, ArrayAdapter arrayadapter, bd bd1)
    {
        c = bb;
        a = arrayadapter;
        b = bd1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        SubtitleTrack subtitletrack = (SubtitleTrack)a.getItem(i);
        b.a(subtitletrack);
        dialoginterface.dismiss();
    }
}
