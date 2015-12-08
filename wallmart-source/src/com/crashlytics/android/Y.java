// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.crashlytics.android.internal.ab;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.v;

final class Y
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private Y(String s, int i, int j, int k)
    {
        a = s;
        b = i;
        c = j;
        d = k;
    }

    public static Y a(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        int i = ab.h(context);
        v.a().b().a("Crashlytics", (new StringBuilder("App icon resource ID is ")).append(i).toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        context = new Y(s, i, options.outWidth, options.outHeight);
        return context;
        context;
        v.a().b().a("Crashlytics", "Failed to load icon", context);
        return null;
    }
}
