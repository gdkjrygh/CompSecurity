// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class ac
    implements Runnable
{

    final AppCompatDelegateImplV7 a;

    ac(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public void run()
    {
        if ((AppCompatDelegateImplV7.a(a) & 1) != 0)
        {
            AppCompatDelegateImplV7.a(a, 0);
        }
        if ((AppCompatDelegateImplV7.a(a) & 0x100) != 0)
        {
            AppCompatDelegateImplV7.a(a, 8);
        }
        AppCompatDelegateImplV7.a(a, false);
        AppCompatDelegateImplV7.b(a, 0);
    }
}
