// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.SharedPreferences;
import android.os.AsyncTask;

// Referenced classes of package com.go.weatherex.g:
//            y

class ac extends AsyncTask
{

    final y a;

    ac(y y1)
    {
        a = y1;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        y.l(a).edit().putBoolean("key_need_show_follow_location_notice", y.i(a)).commit();
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
