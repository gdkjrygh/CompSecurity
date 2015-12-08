// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            r

final class l
    implements r
{

    l()
    {
    }

    public final void a(com.google.android.apps.youtube.common.e.l l1, Attributes attributes)
    {
        l1.offer(new com.google.android.apps.youtube.datalib.legacy.model.Page.Builder());
    }

    public final void a(com.google.android.apps.youtube.common.e.l l1, Attributes attributes, String s)
    {
        l1.poll();
    }
}
