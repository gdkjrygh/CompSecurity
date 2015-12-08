// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.suggest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.apps.youtube.core.suggest:
//            a, c

public class SuggestionProvider extends ContentProvider
{

    private HttpClient a;
    private String b;
    private LinkedHashSet c;
    private ArrayList d;
    private String e;
    private a f;

    public SuggestionProvider()
    {
        c = new LinkedHashSet(10);
        d = new ArrayList(10);
    }

    public int delete(Uri uri, String s, String as[])
    {
        return 0;
    }

    public String getType(Uri uri)
    {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        f.a(contentvalues);
        return null;
    }

    public boolean onCreate()
    {
        a = new DefaultHttpClient();
        f = new a(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        int i;
        i = 0;
        b = null;
        if (uri.getPathSegments().size() > 1)
        {
            b = uri.getLastPathSegment().toLowerCase();
        }
        as = new c();
        if (b == null || b.trim().length() <= 0) goto _L2; else goto _L1
_L1:
        s = URLEncoder.encode(b, "UTF-8");
        uri = Locale.getDefault().getLanguage();
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_439;
        }
        if (uri.length() != 2)
        {
            break MISSING_BLOCK_LABEL_439;
        }
_L6:
        d.clear();
        as1 = f.a(b);
        if (as1.moveToFirst())
        {
            int j = as1.getColumnIndex("suggest_intent_query");
            do
            {
                s1 = as1.getString(j);
                d.add(s1);
            } while (as1.moveToNext());
        }
        as1.close();
        synchronized (c)
        {
            c.clear();
            c.addAll(d);
        }
        int k;
        uri = String.format("https://suggestqueries.google.com/complete/search?hl=%s&ds=yt&client=androidyt&hjson=t&oe=UTF-8&q=%s", new Object[] {
            uri, s
        });
        uri = a.execute(new HttpGet(uri));
        k = uri.getStatusLine().getStatusCode();
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        e = EntityUtils.toString(uri.getEntity(), "UTF-8");
        s = (new JSONArray(e)).getJSONArray(1);
        uri = c;
        uri;
        JVM INSTR monitorenter ;
_L4:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        as1 = s.getJSONArray(i).getString(0);
        c.add(as1);
        i++;
        if (true) goto _L4; else goto _L3
        uri;
        as1;
        JVM INSTR monitorexit ;
        throw uri;
_L5:
        synchronized (c)
        {
            as.a(c);
        }
        return as;
_L3:
        uri;
        JVM INSTR monitorexit ;
          goto _L5
        s;
        uri;
        JVM INSTR monitorexit ;
        throw s;
        try
        {
            L.e((new StringBuilder("unexpected suggest response ")).append(k).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            L.b("error fetching suggestions", uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            L.b((new StringBuilder("error fetching suggestions, response was ")).append(e).toString(), uri);
        }
          goto _L5
_L2:
        return f.a();
        uri = "en";
          goto _L6
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }
}
