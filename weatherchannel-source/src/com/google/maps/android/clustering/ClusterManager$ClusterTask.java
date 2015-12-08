// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering;

import android.os.AsyncTask;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.view.ClusterRenderer;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

// Referenced classes of package com.google.maps.android.clustering:
//            ClusterManager

private class <init> extends AsyncTask
{

    final ClusterManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Float[])aobj);
    }

    protected transient Set doInBackground(Float afloat[])
    {
        ClusterManager.access$100(ClusterManager.this).readLock().lock();
        afloat = ClusterManager.access$200(ClusterManager.this).getClusters(afloat[0].floatValue());
        ClusterManager.access$100(ClusterManager.this).readLock().unlock();
        return afloat;
        afloat;
        ClusterManager.access$100(ClusterManager.this).readLock().unlock();
        throw afloat;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Set)obj);
    }

    protected void onPostExecute(Set set)
    {
        ClusterManager.access$300(ClusterManager.this).onClustersChanged(set);
    }

    private ()
    {
        this$0 = ClusterManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
