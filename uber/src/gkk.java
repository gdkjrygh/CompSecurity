// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

public final class gkk
{

    public static ArrayList a(Iterable iterable)
    {
        return a(iterable.iterator());
    }

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        for (; iterator.hasNext(); arraylist.add(iterator.next())) { }
        return arraylist;
    }
}
