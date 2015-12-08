// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.a.a.a.a.mk;
import com.google.a.a.a.a.ml;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.l;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app:
//            i

final class j
    implements g
{

    private final ViewGroup a;

    public j(Context context)
    {
        a = (ViewGroup)LayoutInflater.from(context).inflate(l.H, null);
    }

    public final View a(f f, Object obj)
    {
        Object obj1;
        obj1 = (i)obj;
        obj = ((i) (obj1)).a.b[0];
        ((mk) (obj)).b;
        JVM INSTR tableswitch 1 4: default 48
    //                   1 214
    //                   2 220
    //                   3 226
    //                   4 232;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        f = "None";
_L7:
        ((TextView)a.findViewById(com.google.android.youtube.j.k)).setText(f);
        if (!TextUtils.isEmpty(((mk) (obj)).c))
        {
            ((TextView)a.findViewById(com.google.android.youtube.j.n)).setText(((mk) (obj)).c);
        }
        f = (TextView)a.findViewById(com.google.android.youtube.j.h);
        long l1 = ((i) (obj1)).b;
        long l2 = TimeUnit.SECONDS.toMillis(((mk) (obj)).d);
        obj1 = new SpannableStringBuilder((new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.US)).format(new Date(l1 + l2)));
        ((Spannable) (obj1)).setSpan(Integer.valueOf(1), 0, 14, 33);
        f.setText(((CharSequence) (obj1)));
        ((TextView)a.findViewById(com.google.android.youtube.j.j)).setText(String.valueOf(((mk) (obj)).e));
        return a;
_L2:
        f = "Incomplete VAST";
        continue; /* Loop/switch isn't completed */
_L3:
        f = "Forecasting";
        continue; /* Loop/switch isn't completed */
_L4:
        f = "Incomplete Asset";
        continue; /* Loop/switch isn't completed */
_L5:
        f = "Complete";
        if (true) goto _L7; else goto _L6
_L6:
    }
}
