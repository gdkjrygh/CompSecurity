// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            y

public interface x
{

    public abstract FormatStream a();

    public abstract void a(float f1);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1);

    public abstract void a(int i1, VideoStreamingData videostreamingdata, int j1, String s, PlayerConfig playerconfig);

    public abstract void a(Handler handler);

    public abstract void a(y y);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(Handler handler);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void l();
}
