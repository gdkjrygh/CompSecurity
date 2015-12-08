// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fe, gv, gi, fh, 
//            gz, gx, ha, gw

public class fk extends fe
    implements SafeParcelable
{

    public static final gv CREATOR = new gv();
    private final int jE;
    private final String mClassName;
    private final Parcel uF;
    private final int uG;
    private int uH;
    private int uI;
    private final fh ux;

    fk(int i, Parcel parcel, fh fh1)
    {
        jE = i;
        uF = (Parcel)com.google.android.gms.internal.gi.a(parcel);
        uG = 2;
        ux = fh1;
        if (ux == null)
        {
            mClassName = null;
        } else
        {
            mClassName = ux.cz();
        }
        uH = 2;
    }

    private fk(SafeParcelable safeparcelable, fh fh1, String s)
    {
        jE = 1;
        uF = Parcel.obtain();
        safeparcelable.writeToParcel(uF, 0);
        uG = 1;
        ux = (fh)com.google.android.gms.internal.gi.a(fh1);
        mClassName = (String)com.google.android.gms.internal.gi.a(s);
        uH = 2;
    }

    public static fk a(fe fe1)
    {
        String s = fe1.getClass().getCanonicalName();
        fh fh1 = b(fe1);
        return new fk((SafeParcelable)fe1, fh1, s);
    }

    private static void a(fh fh1, fe fe1)
    {
        Object obj = fe1.getClass();
        if (!fh1.b(((Class) (obj))))
        {
            HashMap hashmap = fe1.cj();
            fh1.a(((Class) (obj)), fe1.cj());
            obj = hashmap.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                fe1 = (fe.a)hashmap.get((String)((Iterator) (obj)).next());
                Class class1 = fe1.cr();
                if (class1 != null)
                {
                    try
                    {
                        a(fh1, (fe)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (fh fh1)
                    {
                        throw new IllegalStateException((new StringBuilder("Could not instantiate an object of type ")).append(fe1.cr().getCanonicalName()).toString(), fh1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (fh fh1)
                    {
                        throw new IllegalStateException((new StringBuilder("Could not access object of type ")).append(fe1.cr().getCanonicalName()).toString(), fh1);
                    }
                }
            } while (true);
        }
    }

    private void a(StringBuilder stringbuilder, int i, Object obj)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type = ")).append(i).toString());

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
            stringbuilder.append("\"").append(com.google.android.gms.internal.gz.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(com.google.android.gms.internal.gx.a((byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(com.google.android.gms.internal.gx.b((byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.ha.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, fe.a a1, Parcel parcel, int i)
    {
        switch (a1.ci())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown field out type = ")).append(a1.ci()).toString());

        case 0: // '\0'
            b(stringbuilder, a1, a(a1, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
            return;

        case 1: // '\001'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.i(parcel, i)));
            return;

        case 2: // '\002'
            b(stringbuilder, a1, a(a1, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i))));
            return;

        case 3: // '\003'
            b(stringbuilder, a1, a(a1, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i))));
            return;

        case 4: // '\004'
            b(stringbuilder, a1, a(a1, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i))));
            return;

        case 5: // '\005'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.l(parcel, i)));
            return;

        case 6: // '\006'
            b(stringbuilder, a1, a(a1, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
            return;

        case 7: // '\007'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.m(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i)));
            return;

        case 10: // '\n'
            b(stringbuilder, a1, a(a1, c(com.google.android.gms.common.internal.safeparcel.a.o(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, String s, fe.a a1, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.ct())
        {
            a(stringbuilder, a1, parcel, i);
            return;
        } else
        {
            b(stringbuilder, a1, parcel, i);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, HashMap hashmap, Parcel parcel)
    {
        hashmap = c(hashmap);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = parcel.readInt();
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.get(Integer.valueOf(0xffff & j));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (fe.a)entry.getValue(), parcel, j);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private static fh b(fe fe1)
    {
        fh fh1 = new fh(fe1.getClass());
        a(fh1, fe1);
        fh1.cx();
        fh1.cw();
        return fh1;
    }

    private void b(StringBuilder stringbuilder, fe.a a1, Parcel parcel, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j;
        boolean flag;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj = null;
        j = 0;
        flag = false;
        if (!a1.co()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.ci();
        JVM INSTR tableswitch 0 11: default 100
    //                   0 111
    //                   1 167
    //                   2 262
    //                   3 309
    //                   4 322
    //                   5 369
    //                   6 382
    //                   7 429
    //                   8 442
    //                   9 442
    //                   10 442
    //                   11 453;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        a1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i);
        j = a1.length;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toString(a1[i]));
            i++;
        } while (true);
_L5:
        int k1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int l1 = parcel.dataPosition();
        if (k1 == 0)
        {
            a1 = obj;
        } else
        {
            int i2 = parcel.readInt();
            a1 = new BigInteger[i2];
            for (i = j; i < i2; i++)
            {
                a1[i] = new BigInteger(parcel.createByteArray());
            }

            parcel.setDataPosition(k1 + l1);
        }
        com.google.android.gms.internal.gw.a(stringbuilder, a1);
_L14:
        stringbuilder.append("]");
        return;
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int k = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj1;
        } else
        {
            a1 = parcel.createLongArray();
            parcel.setDataPosition(i + k);
        }
        com.google.android.gms.internal.gw.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.gw.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int l = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj2;
        } else
        {
            a1 = parcel.createDoubleArray();
            parcel.setDataPosition(i + l);
        }
        com.google.android.gms.internal.gw.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.gw.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i1 = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj3;
        } else
        {
            a1 = parcel.createBooleanArray();
            parcel.setDataPosition(i + i1);
        }
        com.google.android.gms.internal.gw.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.gw.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.w(parcel, i);
        int j1 = parcel.length;
        i = 0;
        while (i < j1) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, a1.cv(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.ci())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
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
            a1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.gz.a(a1)).append("\"");
            return;

        case 8: // '\b'
            a1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.gx.a(a1)).append("\"");
            return;

        case 9: // '\t'
            a1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.gx.b(a1));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            a1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            parcel = a1.keySet();
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
                stringbuilder.append("\"").append(com.google.android.gms.internal.gz.a(a1.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.v(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, a1.cv(), parcel);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, fe.a a1, Object obj)
    {
        if (a1.cn())
        {
            b(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.ch(), obj);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, fe.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.ch(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    public static HashMap c(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static HashMap c(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); hashmap1.put(Integer.valueOf(((fe.a)entry.getValue()).cq()), entry))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return hashmap1;
    }

    protected Object ac(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean ad(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel cB()
    {
        uH;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 44;
           goto _L1 _L2 _L3
_L1:
        return uF;
_L2:
        uI = com.google.android.gms.common.internal.safeparcel.b.a(uF);
_L3:
        com.google.android.gms.common.internal.safeparcel.b.a(uF, uI);
        uH = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    fh cC()
    {
        switch (uG)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Invalid creation type: ")).append(uG).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return ux;

        case 2: // '\002'
            return ux;
        }
    }

    public HashMap cj()
    {
        if (ux == null)
        {
            return null;
        } else
        {
            return ux.ag(mClassName);
        }
    }

    public int describeContents()
    {
        gv gv1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return jE;
    }

    public String toString()
    {
        com.google.android.gms.internal.gi.a(ux, "Cannot convert to JSON on client side.");
        Parcel parcel = cB();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, ux.ag(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gv gv1 = CREATOR;
        com.google.android.gms.internal.gv.a(this, parcel, i);
    }

}
