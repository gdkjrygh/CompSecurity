// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, al, ah, SubtitleWindow, 
//            SubtitleWindowSettings

public final class ad
    implements r
{

    private final int a;
    private final al b = new al();
    private final ah c = new ah();

    public ad(int i)
    {
        a = i;
    }

    public final SubtitleWindow a()
    {
        return new SubtitleWindow(a, b.a(), c.a(), null);
    }

    public final ad a(int i, SubtitleWindowSettings subtitlewindowsettings)
    {
        c.a(i, subtitlewindowsettings);
        return this;
    }

    public final ad a(String s, int i, int j)
    {
        b.a(s, i, j);
        return this;
    }

    public final ad b(String s, int i, int j)
    {
        b.b(s, i, j);
        return this;
    }

    public final Object build()
    {
        return a();
    }
}
