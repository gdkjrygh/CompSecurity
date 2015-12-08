// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.d;
import a.a.a.g;
import java.util.Date;

// Referenced classes of package a.a.a.d:
//            i

public class j extends i
{

    public final g d;
    public final String e;

    public j(g g1, String s, Object obj)
    {
        super(a(g1, obj));
        d = g1;
        e = s;
    }

    private static Object a(g g1, Object obj)
    {
        if (obj != null && obj.getClass().isArray())
        {
            throw new d("Illegal value: found array, but simple object required");
        }
        if (g1.b != java/util/Date) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof Date)) goto _L4; else goto _L3
_L3:
        Object obj1 = Long.valueOf(((Date)obj).getTime());
_L6:
        return obj1;
_L4:
        obj1 = obj;
        if (!(obj instanceof Long))
        {
            throw new d((new StringBuilder("Illegal date value: expected java.util.Date or Long for value ")).append(obj).toString());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (g1.b == Boolean.TYPE)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (g1.b != java/lang/Boolean) goto _L6; else goto _L5
_L5:
        if (obj instanceof Boolean)
        {
            int k;
            if (((Boolean)obj).booleanValue())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            return Integer.valueOf(k);
        }
        if (!(obj instanceof Number))
        {
            break; /* Loop/switch isn't completed */
        }
        int l = ((Number)obj).intValue();
        obj1 = obj;
        if (l != 0)
        {
            obj1 = obj;
            if (l != 1)
            {
                throw new d((new StringBuilder("Illegal boolean value: numbers must be 0 or 1, but was ")).append(obj).toString());
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
        obj1 = obj;
        if (obj instanceof String)
        {
            g1 = (String)obj;
            if ("TRUE".equalsIgnoreCase(g1))
            {
                return Integer.valueOf(1);
            }
            if ("FALSE".equalsIgnoreCase(g1))
            {
                return Integer.valueOf(0);
            } else
            {
                throw new d((new StringBuilder("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insesnsitive), but was ")).append(obj).toString());
            }
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public void a(StringBuilder stringbuilder, String s)
    {
        if (s != null)
        {
            stringbuilder.append(s).append('.');
        }
        stringbuilder.append('\'').append(d.e).append('\'').append(e);
    }
}
