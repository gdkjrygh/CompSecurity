// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.ui.bu;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            d, f

public abstract class ActionBarMenuHelper extends bu
{

    public ActionBarMenuHelper(YouTubeActivity youtubeactivity, am am, String s, o o)
    {
        super(youtubeactivity, am, s, o);
    }

    public static final ActionBarMenuHelper a(YouTubeActivity youtubeactivity, am am, String s)
    {
        return new d(youtubeactivity, am, s, youtubeactivity.M());
    }

    public abstract int a();

    public abstract void a(SearchMode searchmode);

    public abstract void a(f f);

    public abstract void a(String s, boolean flag);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(f f);

    public abstract boolean c();

    public abstract void d();

    public abstract void e();
}
