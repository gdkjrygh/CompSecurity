// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            b, SafeParcelResponse, a, FieldMappingDictionary

public class k
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    protected final int a;
    protected final boolean b;
    protected final int c;
    protected final boolean d;
    protected final String e;
    protected final int f;
    protected final Class g;
    protected final String h;
    private final int i;
    private FieldMappingDictionary j;
    private a k;

    static a a(k k1)
    {
        return k1.k;
    }

    public int a()
    {
        return i;
    }

    public Object a(Object obj)
    {
        return k.a(obj);
    }

    public void a(FieldMappingDictionary fieldmappingdictionary)
    {
        j = fieldmappingdictionary;
    }

    public int b()
    {
        return a;
    }

    public boolean c()
    {
        return b;
    }

    public int d()
    {
        return c;
    }

    public int describeContents()
    {
        b b1 = CREATOR;
        return 0;
    }

    public boolean e()
    {
        return d;
    }

    public String f()
    {
        return e;
    }

    public int g()
    {
        return f;
    }

    public Class h()
    {
        return g;
    }

    String i()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h;
        }
    }

    public boolean j()
    {
        return k != null;
    }

    ConverterWrapper k()
    {
        if (k == null)
        {
            return null;
        } else
        {
            return ConverterWrapper.a(k);
        }
    }

    public Map l()
    {
        au.a(h);
        au.a(j);
        return j.a(h);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Field\n");
        stringbuilder.append("            versionCode=").append(i).append('\n');
        stringbuilder.append("                 typeIn=").append(a).append('\n');
        stringbuilder.append("            typeInArray=").append(b).append('\n');
        stringbuilder.append("                typeOut=").append(c).append('\n');
        stringbuilder.append("           typeOutArray=").append(d).append('\n');
        stringbuilder.append("        outputFieldName=").append(e).append('\n');
        stringbuilder.append("      safeParcelFieldId=").append(f).append('\n');
        stringbuilder.append("       concreteTypeName=").append(i()).append('\n');
        if (h() != null)
        {
            stringbuilder.append("     concreteType.class=").append(h().getCanonicalName()).append('\n');
        }
        StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
        String s;
        if (k == null)
        {
            s = "null";
        } else
        {
            s = k.getClass().getCanonicalName();
        }
        stringbuilder1.append(s).append('\n');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        b b1 = CREATOR;
        com.google.android.gms.common.server.response.b.a(this, parcel, i1);
    }


    (int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
            String s1, ConverterWrapper converterwrapper)
    {
        i = i1;
        a = j1;
        b = flag;
        c = k1;
        d = flag1;
        e = s;
        f = l1;
        if (s1 == null)
        {
            g = null;
            h = null;
        } else
        {
            g = com/google/android/gms/common/server/response/SafeParcelResponse;
            h = s1;
        }
        if (converterwrapper == null)
        {
            k = null;
            return;
        } else
        {
            k = converterwrapper.c();
            return;
        }
    }
}
