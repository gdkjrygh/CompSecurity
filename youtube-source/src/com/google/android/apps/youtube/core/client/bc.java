// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import java.util.Map;

public interface bc
{

    public abstract GDataRequestFactory a();

    public abstract void a(int i1, b b1);

    public abstract void a(int i1, String s1, b b1);

    public abstract void a(Uri uri, b b1);

    public abstract void a(b b1);

    public abstract void a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed channelfeed, int i1, b b1);

    public abstract void a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed standardfeed, String s1, String s2, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter, b b1);

    public abstract void a(String s1);

    public abstract void a(String s1, b b1);

    public abstract void a(String s1, com.google.android.apps.youtube.core.async.GDataRequestFactory.ComplaintReason complaintreason, String s2, b b1);

    public abstract void a(String s1, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, String s2, String s3, String s4, String s5, Pair pair, 
            b b1);

    public abstract void a(String s1, String s2, String s3, String s4, String s5, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, Map map, 
            String s6, String s7, Uri uri, b b1);

    public abstract void a(String s1, boolean flag, b b1);

    public abstract af b();

    public abstract void b(int i1, b b1);

    public abstract void b(Uri uri, b b1);

    public abstract void b(b b1);

    public abstract void b(String s1, b b1);

    public abstract af c();

    public abstract void c(int i1, b b1);

    public abstract void c(Uri uri, b b1);

    public abstract void c(b b1);

    public abstract void c(String s1, b b1);

    public abstract void d(int i1, b b1);

    public abstract void d(Uri uri, b b1);

    public abstract void d(String s1, b b1);

    public abstract void e(int i1, b b1);

    public abstract void e(Uri uri, b b1);

    public abstract void e(String s1, b b1);

    public abstract af f();

    public abstract void f(Uri uri, b b1);

    public abstract void f(String s1, b b1);

    public abstract af g();

    public abstract void g(String s1, b b1);

    public abstract void h();

    public abstract void h(String s1, b b1);

    public abstract void i();

    public abstract void i(String s1, b b1);

    public abstract af j();

    public abstract void j(String s1, b b1);

    public abstract af k();

    public abstract void k(String s1, b b1);

    public abstract af l();

    public abstract void l(String s1, b b1);

    public abstract af m();

    public abstract void m(String s1, b b1);

    public abstract af n();

    public abstract void n(String s1, b b1);

    public abstract af o();

    public abstract af p();

    public abstract af q();

    public abstract af r();

    public abstract af s();

    public abstract af t();

    public abstract af u();

    public abstract af v();

    public abstract af w();

    public abstract af x();

    public abstract af y();
}
