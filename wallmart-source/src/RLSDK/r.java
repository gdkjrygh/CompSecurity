// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            y, w, aj, ak

public abstract class r
{

    private final w a;

    protected r(w w)
    {
        if (w == null)
        {
            throw new IllegalArgumentException("Source must be non-null.");
        } else
        {
            a = w;
            return;
        }
    }

    public abstract aj a(int i, aj aj)
        throws y;

    public final w a()
    {
        return a;
    }

    public abstract ak b()
        throws y;
}
