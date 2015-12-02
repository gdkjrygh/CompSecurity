// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.TextUtils;
import com.ubercab.client.core.model.FareInfo;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.UpfrontFareSearchResult;
import java.util.List;

public final class ffy
{

    private final String a;
    private final LocationSearchResult b;
    private final FareInfo c;

    public ffy(LocationSearchResult locationsearchresult)
    {
        this(locationsearchresult, locationsearchresult.getTag(), null);
    }

    public ffy(LocationSearchResult locationsearchresult, byte byte0)
    {
        this(locationsearchresult, null, null);
    }

    private ffy(LocationSearchResult locationsearchresult, String s, FareInfo fareinfo)
    {
        b = locationsearchresult;
        a = s;
        c = fareinfo;
    }

    ffy(LocationSearchResult locationsearchresult, String s, FareInfo fareinfo, byte byte0)
    {
        this(locationsearchresult, s, fareinfo);
    }

    public ffy(String s)
    {
        this(null, s, null);
    }

    public static List a(List list)
    {
        return gkk.a(gki.a(list, new gjv() {

            private static LocationSearchResult a(ffy ffy1)
            {
                return ffy1.c();
            }

            public final Object apply(Object obj)
            {
                return a((ffy)obj);
            }

        }));
    }

    public static List a(List list, boolean flag)
    {
        return gkk.a(gki.a(list, new gjv(flag) {

            final boolean a;

            private ffy a(LocationSearchResult locationsearchresult)
            {
                if (a)
                {
                    return new ffy(locationsearchresult);
                } else
                {
                    return new ffy(locationsearchresult, (byte)0);
                }
            }

            public final Object apply(Object obj)
            {
                return a((LocationSearchResult)obj);
            }

            
            {
                a = flag;
                super();
            }
        }));
    }

    public static List b(List list, boolean flag)
    {
        return gkk.a(gki.a(list, new gjv(flag) {

            final boolean a;

            private ffy a(UpfrontFareSearchResult upfrontfaresearchresult)
            {
                LocationSearchResult locationsearchresult = upfrontfaresearchresult.getDestinationLocation();
                if (a)
                {
                    return new ffy(locationsearchresult, locationsearchresult.getTag(), upfrontfaresearchresult.getFareInfo(), (byte)0);
                } else
                {
                    return new ffy(locationsearchresult, null, upfrontfaresearchresult.getFareInfo(), (byte)0);
                }
            }

            public final Object apply(Object obj)
            {
                return a((UpfrontFareSearchResult)obj);
            }

            
            {
                a = flag;
                super();
            }
        }));
    }

    private String c(Resources resources)
    {
        if (i())
        {
            return dtt.a(resources.getString(0x7f07026c));
        }
        if (j())
        {
            return dtt.a(resources.getString(0x7f070672));
        }
        if (b != null)
        {
            return b.getTitle();
        } else
        {
            return "";
        }
    }

    private int h()
    {
        if (i())
        {
            return 0x7f02017e;
        }
        if (j())
        {
            return 0x7f02019c;
        }
        boolean flag;
        if (b != null && ("cache".equals(b.getType()) || "cache".equals(b.getServiceType())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag ? 0x7f020189 : 0x7f02017d;
    }

    private boolean i()
    {
        return LocationSearchResult.isTagHome(a);
    }

    private boolean j()
    {
        return LocationSearchResult.isTagWork(a);
    }

    public final String a(Resources resources)
    {
        String s = c(resources);
        if (b != null)
        {
            return s;
        } else
        {
            return resources.getString(0x7f070040, new Object[] {
                s
            });
        }
    }

    public final boolean a()
    {
        return !TextUtils.isEmpty(a);
    }

    public final boolean a(ffy ffy1)
    {
        if (b == null || ffy1.c() == null)
        {
            return b == ffy1.c() && a.equals(ffy1.b());
        } else
        {
            return b.isDuplicate(ffy1.c());
        }
    }

    public final int b(Resources resources)
    {
        if (a() && b == null)
        {
            return resources.getColor(0x7f0d0071);
        } else
        {
            return resources.getColor(0x7f0d004b);
        }
    }

    public final String b()
    {
        return a;
    }

    public final LocationSearchResult c()
    {
        return b;
    }

    public final int d()
    {
        return h();
    }

    public final String e()
    {
        if (b == null)
        {
            return "";
        }
        if (a())
        {
            return b.getTitle();
        } else
        {
            return b.getSubtitle();
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ffy)obj;
            if (b == null ? ((ffy) (obj)).b != null : !b.equals(((ffy) (obj)).b))
            {
                return false;
            }
            if (a == null ? ((ffy) (obj)).a != null : !a.equals(((ffy) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean f()
    {
        return c != null;
    }

    public final FareInfo g()
    {
        return c;
    }

    public final int hashCode()
    {
        int l = 0;
        int k;
        if (a != null)
        {
            k = a.hashCode();
        } else
        {
            k = 0;
        }
        if (b != null)
        {
            l = b.hashCode();
        }
        return k * 31 + l;
    }
}
