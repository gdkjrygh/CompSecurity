// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(DataHolder dataholder, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.data.DataHolder.a.a;
        int k = b.H(parcel);
        try
        {
            b.a(parcel, 1, dataholder.gY(), false);
            b.c(parcel, 1000, dataholder.getVersionCode());
            b.a(parcel, 2, dataholder.gZ(), i, false);
            b.c(parcel, 3, dataholder.getStatusCode());
            b.a(parcel, 4, dataholder.gV(), false);
            b.H(parcel, k);
            if (jx.a != 0)
            {
                com.google.android.gms.common.data.DataHolder.a.a = j + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DataHolder dataholder)
        {
            throw dataholder;
        }
    }

    public DataHolder B(Parcel parcel)
    {
        String as[];
        CursorWindow acursorwindow[];
        Object obj;
        int i;
        int j;
        int k1;
        int l1;
        acursorwindow = null;
        l1 = com.google.android.gms.common.data.DataHolder.a.a;
        k1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        j = 0;
        as = null;
        i = 0;
        obj = null;
_L20:
        if (parcel.dataPosition() >= k1) goto _L2; else goto _L1
_L1:
        Object obj1;
        String as1[];
        String as2[];
        Object obj2;
        String as3[];
        CursorWindow acursorwindow2[];
        int k;
        int l;
        int i1;
        int j1;
        int i2;
        i2 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        as3 = as;
        as1 = as;
        j1 = i;
        acursorwindow2 = acursorwindow;
        as2 = as;
        k = i;
        obj1 = acursorwindow;
        l = j;
        obj2 = as;
        i1 = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(i2);
        JVM INSTR lookupswitch 5: default 128
    //                   1: 196
    //                   2: 266
    //                   3: 312
    //                   4: 360
    //                   1000: 231;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        android.os.Bundle bundle;
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, i2);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        obj1 = obj;
        obj = acursorwindow;
        acursorwindow = ((CursorWindow []) (obj1));
_L18:
        if (l1 == 0) goto _L10; else goto _L9
_L9:
        obj1 = acursorwindow;
        acursorwindow = ((CursorWindow []) (obj));
          goto _L11
_L4:
        as3 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, i2);
        obj1 = acursorwindow;
        obj2 = obj;
        l = j;
        as = as3;
        if (l1 == 0) goto _L13; else goto _L12
_L12:
        jx.a++;
_L8:
        j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
        obj1 = acursorwindow;
        obj2 = obj;
        l = j;
        as = as3;
        i = j1;
        if (l1 == 0) goto _L13; else goto _L14
_L14:
        as1 = as3;
_L5:
        acursorwindow2 = (CursorWindow[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, i2, CursorWindow.CREATOR);
        obj1 = acursorwindow2;
        obj2 = obj;
        l = j;
        as = as1;
        i = j1;
        if (l1 == 0) goto _L13; else goto _L15
_L15:
        k = j1;
        as2 = as1;
_L6:
        j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
        obj1 = acursorwindow2;
        obj2 = obj;
        l = j;
        as = as2;
        i = k;
        if (l1 == 0) goto _L13; else goto _L16
_L16:
        i1 = k;
        obj2 = as2;
        l = j;
        obj1 = acursorwindow2;
_L7:
        bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i2);
        acursorwindow = ((CursorWindow []) (obj1));
        obj = bundle;
        j = l;
        as = ((String []) (obj2));
        i = i1;
        if (l1 != 0) goto _L3; else goto _L17
_L17:
        i = i1;
        as = ((String []) (obj2));
        obj2 = bundle;
_L13:
        j = l;
        obj = obj1;
        acursorwindow = ((CursorWindow []) (obj2));
          goto _L18
_L11:
        try
        {
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        parcel = new DataHolder(i, as, acursorwindow, j, ((android.os.Bundle) (obj1)));
        parcel.gX();
        return parcel;
_L2:
        obj1 = obj;
        if (true) goto _L11; else goto _L10
_L10:
        CursorWindow acursorwindow1[] = acursorwindow;
        acursorwindow = ((CursorWindow []) (obj));
        obj = acursorwindow1;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public DataHolder[] aw(int i)
    {
        return new DataHolder[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return B(parcel);
    }

    public Object[] newArray(int i)
    {
        return aw(i);
    }
}
