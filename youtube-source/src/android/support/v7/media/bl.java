// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            j, bk

public final class bl extends j
{

    final bk a;
    private final Object b;

    public bl(bk bk, Object obj)
    {
        a = bk;
        super();
        b = obj;
    }

    public final void a(int i)
    {
        ((android.media.MediaRouter.RouteInfo)b).requestSetVolume(i);
    }

    public final void b(int i)
    {
        ((android.media.MediaRouter.RouteInfo)b).requestUpdateVolume(i);
    }
}
