// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.FareSplitClient;
import java.util.Comparator;

final class ang.Object
    implements Comparator
{

    final eca a;

    private static int a(FareSplitClient faresplitclient, FareSplitClient faresplitclient1)
    {
        Integer integer = Integer.valueOf(eca.a(faresplitclient.getStatus()));
        Integer integer1 = Integer.valueOf(eca.a(faresplitclient1.getStatus()));
        if (!integer.equals(integer1))
        {
            return integer.compareTo(integer1);
        } else
        {
            faresplitclient = dty.a(faresplitclient);
            return dty.a(faresplitclient1).compareTo(faresplitclient);
        }
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((FareSplitClient)obj, (FareSplitClient)obj1);
    }

    (eca eca1)
    {
        a = eca1;
        super();
    }
}
