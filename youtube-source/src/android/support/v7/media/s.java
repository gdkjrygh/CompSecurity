// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class s
{

    public static final s a = new s(new Bundle(), null);
    private final Bundle b;
    private List c;

    private s(Bundle bundle, List list)
    {
        b = bundle;
        c = list;
    }

    s(Bundle bundle, List list, byte byte0)
    {
        this(bundle, list);
    }

    public static s a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new s(bundle, null);
        } else
        {
            return null;
        }
    }

    static void b(s s1)
    {
        s1.e();
    }

    static List c(s s1)
    {
        return s1.c;
    }

    private void e()
    {
        if (c == null)
        {
            c = b.getStringArrayList("controlCategories");
            if (c == null || c.isEmpty())
            {
                c = Collections.emptyList();
            }
        }
    }

    public final List a()
    {
        e();
        return c;
    }

    public final boolean a(s s1)
    {
        if (s1 != null)
        {
            e();
            s1.e();
            return c.containsAll(s1.c);
        } else
        {
            return false;
        }
    }

    public final boolean a(List list)
    {
        if (list != null)
        {
            e();
            int k = c.size();
            if (k != 0)
            {
                int l = list.size();
label0:
                for (int i = 0; i < l; i++)
                {
                    IntentFilter intentfilter = (IntentFilter)list.get(i);
                    if (intentfilter == null)
                    {
                        continue;
                    }
                    int j = 0;
                    do
                    {
                        if (j >= k)
                        {
                            continue label0;
                        }
                        if (intentfilter.hasCategory((String)c.get(j)))
                        {
                            return true;
                        }
                        j++;
                    } while (true);
                }

            }
        }
        return false;
    }

    public final boolean b()
    {
        e();
        return c.isEmpty();
    }

    public final boolean c()
    {
        e();
        return !c.contains(null);
    }

    public final Bundle d()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof s)
        {
            obj = (s)obj;
            e();
            ((s) (obj)).e();
            return c.equals(((s) (obj)).c);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        e();
        return c.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteSelector{ ");
        stringbuilder.append("controlCategories=").append(Arrays.toString(a().toArray()));
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

}
