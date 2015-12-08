// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            ao, dt, ds

private static final class <init>
    implements ao
{

    private final float a;

    public final int a(Object obj, Object obj1)
    {
        if (((ds)obj1).d() == ((ds)obj).d())
        {
            float f = Math.abs(((ds)obj1).c() - a);
            float f1 = Math.abs(((ds)obj).c() - a);
            if (f < f1)
            {
                return 1;
            }
            return f != f1 ? -1 : 0;
        } else
        {
            return ((ds)obj1).d() - ((ds)obj).d();
        }
    }

    private bject(float f)
    {
        a = f;
    }

    a(float f, byte byte0)
    {
        this(f);
    }
}
