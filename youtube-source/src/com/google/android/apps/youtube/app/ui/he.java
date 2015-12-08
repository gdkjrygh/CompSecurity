// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.converter.d;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ha

final class he
    implements d
{

    he()
    {
    }

    public final Object a_(Object obj)
    {
        obj = (Page)obj;
        ArrayList arraylist = new ArrayList(((Page) (obj)).entries.size());
        for (Iterator iterator = ((Page) (obj)).entries.iterator(); iterator.hasNext(); arraylist.add(ha.a((Video)iterator.next()))) { }
        return new Page(((Page) (obj)).totalResults, ((Page) (obj)).elementsPerPage, ((Page) (obj)).startIndex, ((Page) (obj)).previousUri, ((Page) (obj)).nextUri, arraylist);
    }
}
