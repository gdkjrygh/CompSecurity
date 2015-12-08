// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class aj
{

    private DataSetObservable a;

    public aj()
    {
        a = new DataSetObservable();
    }

    public abstract int a();

    public int a(Object obj)
    {
        return -1;
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public final void a(DataSetObserver datasetobserver)
    {
        a.registerObserver(datasetobserver);
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract boolean a(View view, Object obj);

    public final void b()
    {
        a.notifyChanged();
    }

    public final void b(DataSetObserver datasetobserver)
    {
        a.unregisterObserver(datasetobserver);
    }
}
