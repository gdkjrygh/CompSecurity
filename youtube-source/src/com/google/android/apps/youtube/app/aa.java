// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class aa
    implements g
{

    private final ViewGroup a;
    private final TextView b;
    private final TextView c;

    public aa(Context context)
    {
        a = (ViewGroup)LayoutInflater.from(context).inflate(l.K, null);
        b = (TextView)a.findViewById(j.bQ);
        c = (TextView)a.findViewById(j.fS);
    }

    public final View a(f f, Object obj)
    {
        f = (c)obj;
        obj = b;
        long l1 = f.i();
        Object obj1 = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);
        obj1 = new SpannableStringBuilder((new StringBuilder("Insertion time: ")).append(((DateFormat) (obj1)).format(new Date(l1))).toString());
        ((Spannable) (obj1)).setSpan(Integer.valueOf(1), 0, 14, 33);
        ((TextView) (obj)).setText(((CharSequence) (obj1)));
        obj = c;
        f = Uri.parse(f.d());
        obj1 = new android.net.Uri.Builder();
        ((android.net.Uri.Builder) (obj1)).scheme(f.getScheme());
        ((android.net.Uri.Builder) (obj1)).authority(f.getAuthority());
        ((android.net.Uri.Builder) (obj1)).encodedPath(f.getEncodedPath());
        f = new SpannableStringBuilder((new StringBuilder("Url: ")).append(((android.net.Uri.Builder) (obj1)).build().toString()).toString());
        f.setSpan(Integer.valueOf(1), 0, 4, 33);
        ((TextView) (obj)).setText(f);
        return a;
    }
}
