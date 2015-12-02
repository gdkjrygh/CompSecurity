// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationSearchResult;
import java.util.List;

public final class frj
{

    public static int a(List list, LocationSearchResult locationsearchresult)
    {
        return gki.e(list, new gka(locationsearchresult) {

            final LocationSearchResult a;

            private boolean a(LocationSearchResult locationsearchresult1)
            {
                return locationsearchresult1.isDuplicate(a);
            }

            public final boolean apply(Object obj)
            {
                return a((LocationSearchResult)obj);
            }

            
            {
                a = locationsearchresult;
                super();
            }
        });
    }

    public static cic a(int i)
    {
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return null;

        case 0: // '\0'
            return l.cC;

        case 3: // '\003'
            return l.ay;

        case 4: // '\004'
            return l.aS;

        case 5: // '\005'
            return l.g;

        case 7: // '\007'
            return l.ds;

        case 6: // '\006'
            return l.V;
        }
    }

    public static int b(List list, LocationSearchResult locationsearchresult)
    {
        if (locationsearchresult.getTag() != null)
        {
            return a(gkk.a(gki.a(list, new frl((byte)0))), locationsearchresult);
        } else
        {
            return a(gkk.a(gki.a(list, new frk(locationsearchresult.getServiceType()))), locationsearchresult);
        }
    }
}
