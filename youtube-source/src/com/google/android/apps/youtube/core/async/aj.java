// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            GDataRequest, ag

final class aj
    implements b
{

    private final b a;

    public aj(b b1)
    {
        a = (b)c.a(b1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        a.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (GDataRequest)obj;
        obj1 = (List)obj1;
        int i = Integer.parseInt(((GDataRequest) (obj)).a.getQueryParameter("start-index")) - 1;
        int j = Integer.parseInt(((GDataRequest) (obj)).a.getQueryParameter("max-results"));
        com.google.android.apps.youtube.datalib.legacy.model.Page.Builder builder = new com.google.android.apps.youtube.datalib.legacy.model.Page.Builder();
        builder.startIndex(i + 1);
        builder.elementsPerPage(j);
        builder.totalResults(((List) (obj1)).size());
        if (i > 0)
        {
            builder.previousUri(ag.a(((GDataRequest) (obj)).a, Math.max(0, (i - j) + 1), j));
        }
        if (i + j < ((List) (obj1)).size())
        {
            builder.nextUri(ag.a(((GDataRequest) (obj)).a, i + j + 1, j));
        }
        Collections.reverse(((List) (obj1)));
        try
        {
            builder.addEntries(((List) (obj1)).subList(i, Math.min(j + i, ((List) (obj1)).size())));
            a.a(obj, builder.build());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            a.a(obj, ((Exception) (obj1)));
        }
    }
}
