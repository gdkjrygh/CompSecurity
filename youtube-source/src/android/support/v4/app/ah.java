// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            ar, aq, ap, ao, 
//            an

public final class ah
{

    private static final an a;

    static an a()
    {
        return a;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new ar();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new aq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new ap();
        } else
        {
            a = new ao();
        }
    }
}
