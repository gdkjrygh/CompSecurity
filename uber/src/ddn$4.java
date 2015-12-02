// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.Experiment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class ang.Object
    implements glz
{

    final gmg a;
    final ddn b;

    public final Set a()
    {
        Object obj = a.c();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        Experiment experiment;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(com.ubercab.crash.model.Experiment.create(experiment.getName(), experiment.getTreatmentGroupName())))
        {
            experiment = (Experiment)((Iterator) (obj)).next();
        }

        if (hashset.size() > 0)
        {
            return hashset;
        } else
        {
            return null;
        }
    }

    (ddn ddn1, gmg gmg1)
    {
        b = ddn1;
        a = gmg1;
        super();
    }
}
