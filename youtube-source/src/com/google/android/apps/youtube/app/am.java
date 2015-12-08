// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.net.Uri;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.uilib.innertube.i;

public interface am
    extends i
{

    public abstract void a();

    public abstract void a(Uri uri);

    public abstract void a(Uri uri, int j, boolean flag, WatchFeature watchfeature);

    public abstract void a(Uri uri, com.google.android.apps.youtube.app.ui.ChannelStoreOutline.Category category);

    public abstract void a(Video video);

    public abstract void a(String s);

    public abstract void a(String s, int j);

    public abstract void a(String s, String s1);

    public abstract void a(String s, String s1, int j, boolean flag, WatchFeature watchfeature, boolean flag1);

    public abstract void a(String s, boolean flag, WatchFeature watchfeature);

    public abstract void b();

    public abstract void b(Uri uri);

    public abstract void b(String s);

    public abstract void b(String s, int j);

    public abstract void c();

    public abstract void c(String s);

    public abstract void d();

    public abstract void d(String s);

    public abstract void e();

    public abstract void e(String s);

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
