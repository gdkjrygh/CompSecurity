// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.Survey;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            fk, dj

final class fa extends o
{

    final dj a;

    fa(dj dj1)
    {
        a = dj1;
        super();
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer((new ba(((fk)l1.peek()).a)).f(attributes.getValue("id")));
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = (ba)l1.b(com/google/android/apps/youtube/datalib/legacy/model/ba);
        l1 = (fk)l1.peek();
        if (attributes != null && attributes.c() && attributes.b() != null)
        {
            try
            {
                attributes.a(a.a(attributes.b()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                L.b((new StringBuilder("Survey convertion error: ")).append(s).toString());
                attributes.a(Survey.EMPTY);
            }
        }
        if (attributes != null && l1 != null)
        {
            l1.a(attributes.d());
        }
    }
}
