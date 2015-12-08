// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;

public interface Algorithm
{

    public abstract void addItem(ClusterItem clusteritem);

    public abstract void addItems(Collection collection);

    public abstract void clearItems();

    public abstract Set getClusters(double d);

    public abstract Collection getItems();

    public abstract void removeItem(ClusterItem clusteritem);
}
