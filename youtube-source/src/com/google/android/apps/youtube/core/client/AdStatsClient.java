// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.core.player.AdError;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.aw;

public interface AdStatsClient
{

    public abstract void a();

    public abstract void a(int l);

    public abstract void a(int l, int i1);

    public abstract void a(AdError aderror);

    public abstract void a(al al);

    public abstract void a(InfoCard infocard, int l);

    public abstract void a(InfoCard infocard, com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction infocardaction);

    public abstract void a(aw aw);

    public abstract void b();

    public abstract void b(int l);

    public abstract void b(AdError aderror);

    public abstract void c();

    public abstract void c(int l);

    public abstract void d();

    public abstract void d(int l);

    public abstract void e();

    public abstract void e(int l);

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract AdStatsClientState j();

    public abstract void k();
}
