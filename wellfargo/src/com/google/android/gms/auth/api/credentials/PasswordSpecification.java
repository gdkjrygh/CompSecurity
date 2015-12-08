// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            i, c

public final class PasswordSpecification
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    public static final PasswordSpecification a = (new c()).a(12, 16).a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").a("abcdefghijkmnopqrstxyz", 1).a("ABCDEFGHJKLMNPQRSTXY", 1).a("3456789", 1).a();
    public static final PasswordSpecification b = (new c()).a(12, 16).a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").a("abcdefghijklmnopqrstuvwxyz", 1).a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).a("1234567890", 1).a();
    final int c;
    final String d;
    final List e;
    final List f;
    final int g;
    final int h;
    private final int i[] = a();
    private final Random j = new SecureRandom();

    PasswordSpecification(int k, String s, List list, List list1, int l, int i1)
    {
        c = k;
        d = s;
        e = Collections.unmodifiableList(list);
        f = Collections.unmodifiableList(list1);
        g = l;
        h = i1;
    }

    private int a(char c1)
    {
        return c1 - 32;
    }

    static String a(Collection collection)
    {
        return b(collection);
    }

    static boolean a(int k, int l, int i1)
    {
        return b(k, l, i1);
    }

    private int[] a()
    {
        int ai[] = new int[95];
        Arrays.fill(ai, -1);
        Iterator iterator = e.iterator();
        for (int k = 0; iterator.hasNext(); k++)
        {
            char ac[] = ((String)iterator.next()).toCharArray();
            int i1 = ac.length;
            for (int l = 0; l < i1; l++)
            {
                ai[a(ac[l])] = k;
            }

        }

        return ai;
    }

    private static String b(Collection collection)
    {
        char ac[] = new char[collection.size()];
        collection = collection.iterator();
        for (int k = 0; collection.hasNext(); k++)
        {
            ac[k] = ((Character)collection.next()).charValue();
        }

        return new String(ac);
    }

    private static boolean b(int k, int l, int i1)
    {
        return k < l || k > i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.auth.api.credentials.i.a(this, parcel, k);
    }

}
