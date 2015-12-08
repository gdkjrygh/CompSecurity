// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.ad;
import java.util.Comparator;

final class t
    implements Comparator
{

    public static final t a = new t();

    private t()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (ad)obj;
        obj1 = (ad)obj1;
        return ((ad) (obj)).a().compareTo(((ad) (obj1)).a());
    }

}
