// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.b.t;
import com.google.android.gms.b.u;
import com.google.android.gms.b.y;
import com.google.android.gms.b.z;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, f, FieldMappingDictionary

public class SafeParcelResponse extends FastJsonResponse
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final FieldMappingDictionary d;
    private final String e;
    private int f;
    private int g;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
    {
        a = i;
        b = (Parcel)au.a(parcel);
        d = fieldmappingdictionary;
        if (d == null)
        {
            e = null;
        } else
        {
            e = d.d();
        }
        f = 2;
    }

    public static HashMap a(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static HashMap a(Map map)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((FastJsonResponse.Field)entry.getValue()).g()), entry))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return hashmap;
    }

    private void a(StringBuilder stringbuilder, int i, Object obj)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type = ").append(i).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            stringbuilder.append(obj);
            return;

        case 7: // '\007'
            stringbuilder.append("\"").append(y.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(u.a((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(u.b((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            z.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        switch (field.d())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(field.d()).toString());

        case 0: // '\0'
            a(stringbuilder, field, a(field, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i))));
            return;

        case 1: // '\001'
            a(stringbuilder, field, a(field, com.google.android.gms.common.internal.safeparcel.a.i(parcel, i)));
            return;

        case 2: // '\002'
            a(stringbuilder, field, a(field, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i))));
            return;

        case 3: // '\003'
            a(stringbuilder, field, a(field, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i))));
            return;

        case 4: // '\004'
            a(stringbuilder, field, a(field, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i))));
            return;

        case 5: // '\005'
            a(stringbuilder, field, a(field, com.google.android.gms.common.internal.safeparcel.a.l(parcel, i)));
            return;

        case 6: // '\006'
            a(stringbuilder, field, a(field, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
            return;

        case 7: // '\007'
            a(stringbuilder, field, a(field, com.google.android.gms.common.internal.safeparcel.a.m(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            a(stringbuilder, field, a(field, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i)));
            return;

        case 10: // '\n'
            a(stringbuilder, field, a(field, a(com.google.android.gms.common.internal.safeparcel.a.o(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
    {
        if (field.c())
        {
            a(stringbuilder, field, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, field.b(), obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, FastJsonResponse.Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, field.b(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    private void a(StringBuilder stringbuilder, String s, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (field.j())
        {
            a(stringbuilder, field, parcel, i);
            return;
        } else
        {
            b(stringbuilder, field, parcel, i);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, Map map, Parcel parcel)
    {
        map = a(map);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)map.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.a(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (FastJsonResponse.Field)entry.getValue(), parcel, j);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != i)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private void b(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        if (!field.e()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        field.d();
        JVM INSTR tableswitch 0 11: default 80
    //                   0 91
    //                   1 110
    //                   2 123
    //                   3 136
    //                   4 149
    //                   5 162
    //                   6 175
    //                   7 188
    //                   8 201
    //                   9 201
    //                   10 201
    //                   11 212;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        t.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.x(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.B(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, field.l(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (field.d())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
            return;

        case 7: // '\007'
            field = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i);
            stringbuilder.append("\"").append(y.a(field)).append("\"");
            return;

        case 8: // '\b'
            field = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i);
            stringbuilder.append("\"").append(u.a(field)).append("\"");
            return;

        case 9: // '\t'
            field = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i);
            stringbuilder.append("\"").append(u.b(field));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            field = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            parcel = field.keySet();
            parcel.size();
            stringbuilder.append("{");
            parcel = parcel.iterator();
            for (i = 1; parcel.hasNext(); i = 0)
            {
                String s = (String)parcel.next();
                if (i == 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append("\"").append(s).append("\"");
                stringbuilder.append(":");
                stringbuilder.append("\"").append(y.a(field.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.A(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, field.l(), parcel);
            return;
        }
    }

    protected Object a(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Map a()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.a(e);
        }
    }

    protected boolean b(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int d()
    {
        return a;
    }

    public int describeContents()
    {
        f f1 = CREATOR;
        return 0;
    }

    public Parcel e()
    {
        f;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return b;
_L2:
        g = com.google.android.gms.common.internal.safeparcel.c.a(b);
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    FieldMappingDictionary f()
    {
        switch (c)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(c).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return d;

        case 2: // '\002'
            return d;
        }
    }

    public String toString()
    {
        au.a(d, "Cannot convert to JSON on client side.");
        Parcel parcel = e();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, d.a(e), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f f1 = CREATOR;
        com.google.android.gms.common.server.response.f.a(this, parcel, i);
    }

}
