// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.datalib.legacy.model.p;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            r

final class m
    implements r
{

    m()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer(new p());
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1.poll();
    }
}
