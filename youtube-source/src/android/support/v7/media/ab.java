// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            bi, y, be, bd, 
//            bg, ad

final class ab
    implements bi
{

    final y a;
    private final bd b;
    private boolean c;

    public ab(y y1, Object obj)
    {
        a = y1;
        super();
        y1 = y.a(y1);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            y1 = new be(y1, obj);
        } else
        {
            y1 = new bg(y1, obj);
        }
        b = y1;
        b.a(this);
        c();
    }

    public final Object a()
    {
        return b.a();
    }

    public final void a(int i)
    {
        if (!c && y.c(a) != null)
        {
            y.c(a).a(i);
        }
    }

    public final void b()
    {
        c = true;
        b.a(null);
    }

    public final void b(int i)
    {
        if (!c && y.c(a) != null)
        {
            y.c(a).b(i);
        }
    }

    public final void c()
    {
        b.a(y.b(a));
    }
}
