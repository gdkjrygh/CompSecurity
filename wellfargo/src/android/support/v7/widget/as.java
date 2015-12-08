// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            SearchView

class as
    implements Runnable
{

    final SearchView a;

    as(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public void run()
    {
        SearchView.a(a);
    }
}
