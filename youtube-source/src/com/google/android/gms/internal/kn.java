// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import com.google.android.gms.plus.a.a.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fe, jf, kl

public final class kn extends fe
    implements SafeParcelable, b
{

    public static final jf CREATOR = new jf();
    private static final HashMap Mu;
    private String Fr;
    private final Set Mv;
    private String Nj;
    private kl Nr;
    private kl Ns;
    private final int jE;
    private String zk;

    public kn()
    {
        jE = 1;
        Mv = new HashSet();
    }

    kn(Set set, int i, String s, kl kl1, String s1, kl kl2, String s2)
    {
        Mv = set;
        jE = i;
        zk = s;
        Nr = kl1;
        Nj = s1;
        Ns = kl2;
        Fr = s2;
    }

    public kn(Set set, String s, kl kl1, String s1, kl kl2, String s2)
    {
        Mv = set;
        jE = 1;
        zk = s;
        Nr = kl1;
        Nj = s1;
        Ns = kl2;
        Fr = s2;
    }

    protected final boolean a(fe.a a1)
    {
        return Mv.contains(Integer.valueOf(a1.cq()));
    }

    protected final Object ac(String s)
    {
        return null;
    }

    protected final boolean ad(String s)
    {
        return false;
    }

    protected final Object b(fe.a a1)
    {
        switch (a1.cq())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.cq()).toString());

        case 2: // '\002'
            return zk;

        case 4: // '\004'
            return Nr;

        case 5: // '\005'
            return Nj;

        case 6: // '\006'
            return Ns;

        case 7: // '\007'
            return Fr;
        }
    }

    public final HashMap cj()
    {
        return Mu;
    }

    public final int describeContents()
    {
        jf jf1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof kn))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kn)obj;
            fe.a a1;
label1:
            do
            {
                for (Iterator iterator = Mu.values().iterator(); iterator.hasNext();)
                {
                    a1 = (fe.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((kn) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kn) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kn) (obj)).a(a1));
            return false;
        }
        return true;
    }

    final Set fD()
    {
        return Mv;
    }

    final kl fU()
    {
        return Nr;
    }

    final kl fV()
    {
        return Ns;
    }

    public final kn fW()
    {
        return this;
    }

    public final Object freeze()
    {
        return fW();
    }

    public final String getId()
    {
        return zk;
    }

    public final a getResult()
    {
        return Nr;
    }

    public final String getStartDate()
    {
        return Nj;
    }

    public final a getTarget()
    {
        return Ns;
    }

    public final String getType()
    {
        return Fr;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final boolean hasId()
    {
        return Mv.contains(Integer.valueOf(2));
    }

    public final boolean hasResult()
    {
        return Mv.contains(Integer.valueOf(4));
    }

    public final boolean hasStartDate()
    {
        return Mv.contains(Integer.valueOf(5));
    }

    public final boolean hasTarget()
    {
        return Mv.contains(Integer.valueOf(6));
    }

    public final boolean hasType()
    {
        return Mv.contains(Integer.valueOf(7));
    }

    public final int hashCode()
    {
        Iterator iterator = Mu.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fe.a a1 = (fe.a)iterator.next();
            if (a(a1))
            {
                int j = a1.cq();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        jf jf1 = CREATOR;
        com.google.android.gms.internal.jf.a(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        Mu = hashmap;
        hashmap.put("id", fe.a.g("id", 2));
        Mu.put("result", com.google.android.gms.internal.fe.a.a("result", 4, com/google/android/gms/internal/kl));
        Mu.put("startDate", fe.a.g("startDate", 5));
        Mu.put("target", com.google.android.gms.internal.fe.a.a("target", 6, com/google/android/gms/internal/kl));
        Mu.put("type", fe.a.g("type", 7));
    }
}
