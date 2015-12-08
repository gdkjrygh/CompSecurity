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

    private Collection zzaDA;
    private Collection zzaDB;
    private String zzaDC[];
    private boolean zzaDz;

    public PlaceFilter zzwf()
    {
        java.util.List list = null;
        ArrayList arraylist;
        ArrayList arraylist1;
        if (zzaDA != null)
        {
            arraylist = new ArrayList(zzaDA);
        } else
        {
            arraylist = null;
        }
        if (zzaDB != null)
        {
            arraylist1 = new ArrayList(zzaDB);
        } else
        {
            arraylist1 = null;
        }
        if (zzaDC != null)
        {
            list = Arrays.asList(zzaDC);
        }
        return new PlaceFilter(arraylist, zzaDz, list, arraylist1);
    }

    private ()
    {
        zzaDA = null;
        zzaDz = false;
        zzaDB = null;
        zzaDC = null;
    }

    zzaDC(zzaDC zzadc)
    {
        this();
    }
}
