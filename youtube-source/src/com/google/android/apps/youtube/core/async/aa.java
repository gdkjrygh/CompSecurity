// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.legacy.model.r;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af

public final class aa
    implements af
{

    private final n a;
    private final e b = com.google.android.apps.youtube.core.utils.aa.a();

    public aa(n n1)
    {
        a = (n)c.a(n1);
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return;
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    public final void a(Object obj, b b1)
    {
        SubtitleTrack subtitletrack;
        subtitletrack = (SubtitleTrack)obj;
        c.b();
        c.a(subtitletrack);
        c.a(subtitletrack.offlineSubtitlesPath);
        obj = new File(subtitletrack.offlineSubtitlesPath);
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(((File) (obj))), 4096);
        obj = bufferedinputstream;
        b1.a(subtitletrack, ((r)a.a(bufferedinputstream, b)).build());
        a(((InputStream) (bufferedinputstream)));
        return;
        Exception exception;
        exception;
        bufferedinputstream = null;
_L6:
        obj = bufferedinputstream;
        b1.a(subtitletrack, exception);
        a(((InputStream) (bufferedinputstream)));
        return;
        b1;
        obj = null;
_L4:
        a(((InputStream) (obj)));
        throw b1;
_L2:
        b1.a(subtitletrack, new IOException());
        return;
        b1;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
