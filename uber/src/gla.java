// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsFragment;
import com.ubercab.crash.model.CrashFingerprint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class gla
{

    private final chp a;

    public gla(chp chp1)
    {
        a = chp1;
    }

    public final CrashFingerprint a()
    {
        Object obj = a.a(5);
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((AnalyticsFragment)((Iterator) (obj)).next()).getFormattedName())) { }
        Collections.sort(arraylist);
        return CrashFingerprint.create(arraylist);
    }
}
