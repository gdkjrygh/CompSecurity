// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.a.a;

import com.google.android.apps.ytremote.util.c;
import java.util.ArrayList;
import java.util.Collections;

public final class a
{

    public static transient ArrayList a(Object aobj[])
    {
        c.a(((Object) (aobj)));
        ArrayList arraylist = new ArrayList(aobj.length);
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }
}
