// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class edy
    implements hst
{

    static final boolean a;
    private final edv b;
    private final hzb c;

    private edy(edv edv1, hzb hzb1)
    {
        if (!a && edv1 == null)
        {
            throw new AssertionError();
        }
        b = edv1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(edv edv1, hzb hzb1)
    {
        return new edy(edv1, hzb1);
    }

    private ica b()
    {
        ica ica = b.a((cev)c.a());
        if (ica == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ica;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!edy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
