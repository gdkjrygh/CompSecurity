// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter

public static final class <init>
{

    private boolean zzazC;
    private Collection zzazD;
    private Collection zzazE;
    private String zzazF[];

    public PlaceFilter zzuK()
    {
        java.util.List list = null;
        ArrayList arraylist;
        ArrayList arraylist1;
        if (zzazD != null)
        {
            arraylist = new ArrayList(zzazD);
        } else
        {
            arraylist = null;
        }
        if (zzazE != null)
        {
            arraylist1 = new ArrayList(zzazE);
        } else
        {
            arraylist1 = null;
        }
        if (zzazF != null)
        {
            list = Arrays.asList(zzazF);
        }
        return new PlaceFilter(arraylist, zzazC, list, arraylist1);
    }

    private ()
    {
        zzazD = null;
        zzazC = false;
        zzazE = null;
        zzazF = null;
    }

    zzazF(zzazF zzazf)
    {
        this();
    }
}
