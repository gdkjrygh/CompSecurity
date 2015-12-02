// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.SafetyNetContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fes
{

    private List a;
    private List b;

    public fes(List list)
    {
        a = new ArrayList();
        b = new ArrayList();
        a(list);
    }

    public final List a()
    {
        return a;
    }

    public final void a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            SafetyNetContact safetynetcontact = (SafetyNetContact)list.next();
            if (safetynetcontact.getId() != null)
            {
                a.add(safetynetcontact);
            } else
            {
                b.add(safetynetcontact);
            }
        }

    }

    public final boolean a(SafetyNetContact safetynetcontact)
    {
        return a.contains(safetynetcontact) || b.contains(safetynetcontact);
    }

    public final List b()
    {
        return b;
    }

    public final int c()
    {
        return a.size() + b.size();
    }

    public final boolean d()
    {
        return c() == 0;
    }
}
