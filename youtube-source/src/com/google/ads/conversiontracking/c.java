// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;

import android.content.SharedPreferences;

// Referenced classes of package com.google.ads.conversiontracking:
//            f

final class c
    implements Runnable
{

    final SharedPreferences a;
    final f b;
    final String c;

    c(SharedPreferences sharedpreferences, f f1, String s)
    {
        a = sharedpreferences;
        b = f1;
        c = s;
        super();
    }

    public final void run()
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString(f.b(b), c);
        editor.commit();
    }
}
