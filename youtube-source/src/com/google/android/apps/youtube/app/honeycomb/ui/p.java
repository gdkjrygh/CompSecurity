// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.graphics.Bitmap;
import android.net.Uri;

final class p
{

    private Long a;
    private Bitmap b;
    private String c;
    private Long d;
    private String e;
    private String f;
    private String g;
    private Uri h;
    private String i;

    private p()
    {
    }

    p(byte byte0)
    {
        this();
    }

    static Bitmap a(p p1, Bitmap bitmap)
    {
        p1.b = bitmap;
        return bitmap;
    }

    static Uri a(p p1, Uri uri)
    {
        p1.h = uri;
        return uri;
    }

    static Long a(p p1, Long long1)
    {
        p1.a = long1;
        return long1;
    }

    static String a(p p1)
    {
        return p1.e;
    }

    static String a(p p1, String s)
    {
        p1.c = s;
        return s;
    }

    static Long b(p p1, Long long1)
    {
        p1.d = long1;
        return long1;
    }

    static String b(p p1)
    {
        return p1.f;
    }

    static String b(p p1, String s)
    {
        p1.e = s;
        return s;
    }

    static Bitmap c(p p1)
    {
        return p1.b;
    }

    static String c(p p1, String s)
    {
        p1.f = s;
        return s;
    }

    static Long d(p p1)
    {
        return p1.d;
    }

    static String d(p p1, String s)
    {
        p1.i = s;
        return s;
    }

    static String e(p p1)
    {
        return p1.g;
    }

    static String e(p p1, String s)
    {
        p1.g = s;
        return s;
    }

    static Long f(p p1)
    {
        return p1.a;
    }

    static String g(p p1)
    {
        return p1.c;
    }

    static Uri h(p p1)
    {
        return p1.h;
    }

    static String i(p p1)
    {
        return p1.i;
    }
}
