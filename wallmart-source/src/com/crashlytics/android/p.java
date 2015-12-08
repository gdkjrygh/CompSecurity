// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import com.crashlytics.android.internal.aQ;

// Referenced classes of package com.crashlytics.android:
//            q, Crashlytics, X, r, 
//            s, u

final class p
    implements Runnable
{

    final u a;
    final Crashlytics b;
    private Activity c;
    private X d;
    private aQ e;

    p(Crashlytics crashlytics, Activity activity, u u, X x, aQ aq)
    {
        b = crashlytics;
        c = activity;
        a = u;
        d = x;
        e = aq;
        super();
    }

    public final void run()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        q q1 = new q(this);
        float f = c.getResources().getDisplayMetrics().density;
        int i = Crashlytics.a(b, f, 5);
        TextView textview = new TextView(c);
        textview.setAutoLinkMask(15);
        textview.setText(d.b());
        textview.setTextAppearance(c, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(c);
        scrollview.setPadding(Crashlytics.a(b, f, 14), Crashlytics.a(b, f, 2), Crashlytics.a(b, f, 10), Crashlytics.a(b, f, 12));
        scrollview.addView(textview);
        builder.setView(scrollview).setTitle(d.a()).setCancelable(false).setNeutralButton(d.c(), q1);
        if (e.d)
        {
            r r1 = new r(this);
            builder.setNegativeButton(d.e(), r1);
        }
        if (e.f)
        {
            s s1 = new s(this);
            builder.setPositiveButton(d.d(), s1);
        }
        builder.show();
    }
}
