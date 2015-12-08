// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            aq, aw, as, bg

public interface RemoteControl
{

    public abstract void a(aq aq);

    public abstract void a(aw aw);

    public abstract void a(String s1, String s2, int i1);

    public abstract void a(List list, int i1);

    public abstract boolean a(Video video);

    public abstract State b();

    public abstract void b(int i1);

    public abstract void b(aq aq);

    public abstract void b(aw aw);

    public abstract void b(SubtitleTrack subtitletrack);

    public abstract void b(List list);

    public abstract as c();

    public abstract void c(int i1);

    public abstract void c(aq aq);

    public abstract void c(String s1);

    public abstract void d(String s1);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean h();

    public abstract void i();

    public abstract String j();

    public abstract boolean k();

    public abstract String l();

    public abstract void m();

    public abstract RemotePlayerState n();

    public abstract bg o();

    public abstract String p();

    public abstract int q();

    public abstract String r();

    public abstract int s();

    public abstract double t();

    public abstract List u();

    public abstract boolean v();

    public abstract SubtitleTrack w();
}
