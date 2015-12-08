// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            at

final class au
    implements at
{

    private static final au a = new au();

    private au()
    {
    }

    static au a()
    {
        return a;
    }

    public final volatile String a(Object obj)
    {
        return ((Playlist)obj).id;
    }

}
