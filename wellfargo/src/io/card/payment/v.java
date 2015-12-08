// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.Iterator;
import java.util.List;

final class v
{

    private static String a = null;

    static void a(List list)
    {
        if (list != null)
        {
            a = "[";
            for (list = list.iterator(); list.hasNext();)
            {
                android.hardware.Camera.Size size = (android.hardware.Camera.Size)list.next();
                a = (new StringBuilder()).append(a).append("[").append(size.width).append(", ").append(size.height).append("], ").toString();
            }

            a = (new StringBuilder()).append(a).append("]").toString();
        }
        (new StringBuilder("- supported preview sizes: ")).append(a).toString();
    }

}
