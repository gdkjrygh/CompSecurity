// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ae

final class af extends o
{

    final ae a;

    af(ae ae)
    {
        a = ae;
        super();
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (com.google.android.apps.youtube.datalib.legacy.model.Event.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Event$Builder);
        l1.target(s);
        attributes = attributes.getValue("display");
        if (!TextUtils.isEmpty(attributes))
        {
            l1.displayUsername(attributes);
        }
    }
}
