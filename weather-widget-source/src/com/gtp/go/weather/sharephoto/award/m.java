// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            k

class m extends a
{

    final List a;
    final k b;

    m(k k1, List list)
    {
        b = k1;
        a = list;
        super();
    }

    protected void a()
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put((Long)iterator.next())) { }
        android.content.SharedPreferences.Editor editor = k.c(b).edit();
        editor.putString("key_has_read_user_award_ids", jsonarray.toString());
        editor.commit();
    }
}
