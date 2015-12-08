// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            al, be, bi

final class bf
    implements al
{

    private final WeakReference a;

    public bf(be be1)
    {
        a = new WeakReference(be1);
    }

    public final void a(Object obj, int i)
    {
        obj = (be)a.get();
        if (obj != null && ((be) (obj)).c != null)
        {
            ((be) (obj)).c.a(i);
        }
    }

    public final void b(Object obj, int i)
    {
        obj = (be)a.get();
        if (obj != null && ((be) (obj)).c != null)
        {
            ((be) (obj)).c.b(i);
        }
    }
}
