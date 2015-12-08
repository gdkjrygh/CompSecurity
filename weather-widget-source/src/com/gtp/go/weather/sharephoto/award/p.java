// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gtp.go.weather.sharephoto.b.a.c;
import com.gtp.go.weather.sharephoto.b.d;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            k, l

class p extends AsyncTask
{

    final k a;

    private p(k k1)
    {
        a = k1;
        super();
    }

    p(k k1, l l)
    {
        this(k1);
    }

    protected void a(int ai[])
    {
        boolean flag = false;
        k k1 = a;
        if (ai[0] == 1)
        {
            flag = true;
        }
        k.a(k1, flag, ai[1]);
    }

    protected transient int[] a(Void avoid[])
    {
        int i;
        int j;
        boolean flag = true;
        int ai[] = new int[2];
        Object obj = c.a(com.gtp.go.weather.sharephoto.award.k.d(a), new String[] {
            String.valueOf("user_award_id")
        }, null, null);
        ai[1] = ((List) (obj)).size();
        d d1;
        int l;
        long l1;
        long l2;
        if (ai[1] > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        avoid = com.gtp.go.weather.sharephoto.award.k.c(a).getString("key_has_read_user_award_ids", "");
        j = i;
        if (TextUtils.isEmpty(avoid)) goto _L2; else goto _L1
_L1:
        avoid = new JSONArray(avoid);
        l = avoid.length();
        obj = ((List) (obj)).iterator();
_L7:
        j = i;
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        d1 = (d)((Iterator) (obj)).next();
        i = 0;
_L8:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        l1 = d1.a();
        l2 = avoid.getLong(i);
        if (l1 != l2) goto _L5; else goto _L4
_L4:
        i = 0;
_L10:
        if (i == 0) goto _L7; else goto _L6
_L6:
        j = i;
_L2:
        if (j != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        ai[0] = i;
        return ai;
_L5:
        i++;
          goto _L8
        avoid;
_L9:
        j = i;
        if (com.gtp.a.a.b.c.a())
        {
            avoid.printStackTrace();
            j = i;
        }
          goto _L2
        avoid;
          goto _L9
        avoid;
        i = 1;
          goto _L9
        i = 1;
          goto _L10
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((int[])obj);
    }
}
