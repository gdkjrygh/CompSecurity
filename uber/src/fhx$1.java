// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.model.Invite;
import com.ubercab.client.core.ui.ChipEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class ang.Object
    implements dsd
{

    final fhx a;

    public final void a()
    {
        Object obj = new ArrayList();
        Iterator iterator = fhx.a(a).b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (com.ubercab.client.core.ui.itText.Chip)iterator.next();
            obj1 = fhx.b(a).a(((com.ubercab.client.core.ui.itText.Chip) (obj1)));
            if (obj1 != null)
            {
                ((List) (obj)).add(new Invite(((Contact) (obj1)).a(), null, null, ((Contact) (obj1)).d()));
            }
        } while (true);
        fhx.c(a);
        a.g.a(((List) (obj)));
        obj = AnalyticsEvent.create("impression").setName(n.fs).setValue(Integer.valueOf(((List) (obj)).size()));
        a.f.a(((AnalyticsEvent) (obj)));
    }

    (fhx fhx1)
    {
        a = fhx1;
        super();
    }
}
