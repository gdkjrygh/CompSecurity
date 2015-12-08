// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.youtube.datalib.model.transfer.a;

final class x
{

    private Uri a;
    private String b;
    private String c;
    private com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Pair i;
    private String j;
    private a k;

    private x()
    {
        k = new a();
    }

    x(byte byte0)
    {
        this();
    }

    static Uri a(x x1, Uri uri)
    {
        x1.a = uri;
        return uri;
    }

    static Pair a(x x1, Pair pair)
    {
        x1.i = pair;
        return pair;
    }

    static com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy a(x x1, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy)
    {
        x1.d = privacy;
        return privacy;
    }

    static a a(x x1, a a1)
    {
        x1.k = a1;
        return a1;
    }

    static String a(x x1)
    {
        return x1.b;
    }

    static String a(x x1, String s)
    {
        x1.c = s;
        return s;
    }

    static a b(x x1)
    {
        return x1.k;
    }

    static String b(x x1, String s)
    {
        x1.e = s;
        return s;
    }

    static String c(x x1)
    {
        return x1.j;
    }

    static String c(x x1, String s)
    {
        x1.f = s;
        return s;
    }

    static String d(x x1)
    {
        return x1.c;
    }

    static String d(x x1, String s)
    {
        x1.g = s;
        return s;
    }

    static com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy e(x x1)
    {
        return x1.d;
    }

    static String e(x x1, String s)
    {
        x1.h = s;
        return s;
    }

    static String f(x x1)
    {
        return x1.e;
    }

    static String f(x x1, String s)
    {
        x1.b = s;
        return s;
    }

    static String g(x x1)
    {
        return x1.f;
    }

    static String g(x x1, String s)
    {
        x1.j = s;
        return s;
    }

    static String h(x x1)
    {
        return x1.g;
    }

    static String i(x x1)
    {
        return x1.h;
    }

    static Pair j(x x1)
    {
        return x1.i;
    }

    static Uri k(x x1)
    {
        return x1.a;
    }
}
