// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.navigation:
//            b

public final class d
    implements b
{

    private final Context a;
    private final Uri b;

    public d(Context context, Uri uri)
    {
        a = (Context)c.a(context);
        b = (Uri)c.a(uri);
    }

    public final void a()
    {
        a.startActivity((new Intent("android.intent.action.VIEW", b)).setFlags(0x10000000));
    }
}
