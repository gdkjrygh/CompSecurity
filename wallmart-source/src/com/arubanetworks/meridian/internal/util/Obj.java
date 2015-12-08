// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.internal.util;


public class Obj
{

    public Obj()
    {
    }

    public static boolean equals(Object obj, Object obj1)
    {
        return obj == null && obj1 == null || obj != null && obj.equals(obj1);
    }
}
