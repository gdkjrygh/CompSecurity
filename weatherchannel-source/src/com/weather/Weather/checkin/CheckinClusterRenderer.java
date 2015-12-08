// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.TreeMultimap;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.weather.Weather.checkin:
//            PinGenerator, CheckinIconProvider, CheckinCounts, CheckinClusterItem

public class CheckinClusterRenderer extends DefaultClusterRenderer
{

    private final Context context;
    private Cache descriptorCache;
    private final PinGenerator iconGenerator;
    private final CheckinIconProvider iconProvider;

    public CheckinClusterRenderer(Context context1, GoogleMap googlemap, ClusterManager clustermanager)
    {
        this(context1, googlemap, clustermanager, new PinGenerator(context1), CheckinIconProvider.PIN_PROVIDER);
    }

    CheckinClusterRenderer(Context context1, GoogleMap googlemap, ClusterManager clustermanager, PinGenerator pingenerator, CheckinIconProvider checkiniconprovider)
    {
        super(context1, googlemap, clustermanager);
        descriptorCache = CacheBuilder.newBuilder().maximumSize(40L).build();
        iconGenerator = pingenerator;
        context = context1;
        iconProvider = checkiniconprovider;
    }

    private BitmapDescriptor getDescriptor(Collection collection)
    {
        int i = ((Integer)((Collection)((java.util.Map.Entry)CheckinCounts.forCheckins(collection).consolidate(CheckinCounts.groups).getSortedCounts(CheckinCounts.checkinPriority).asMap().entrySet().iterator().next()).getValue()).iterator().next()).intValue();
        int j = Math.min(99, collection.size());
    /* block-local class not found */
    class IconCountKey {}

        try
        {
            collection = (BitmapDescriptor)descriptorCache.get(new IconCountKey(i, j, null), new _cls1(i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw new RuntimeException("Unable to create icon for checkin marker", collection);
        }
        return collection;
    }

    protected volatile void onBeforeClusterItemRendered(ClusterItem clusteritem, MarkerOptions markeroptions)
    {
        onBeforeClusterItemRendered((CheckinClusterItem)clusteritem, markeroptions);
    }

    protected void onBeforeClusterItemRendered(CheckinClusterItem checkinclusteritem, MarkerOptions markeroptions)
    {
        Preconditions.checkNotNull(checkinclusteritem);
        Preconditions.checkNotNull(markeroptions);
        markeroptions.icon(getDescriptor(ImmutableList.of(checkinclusteritem)));
    }

    protected void onBeforeClusterRendered(Cluster cluster, MarkerOptions markeroptions)
    {
        Preconditions.checkNotNull(cluster);
        Preconditions.checkNotNull(markeroptions);
        markeroptions.icon(getDescriptor(cluster.getItems()));
    }

    protected boolean shouldRenderAsCluster(Cluster cluster)
    {
        Preconditions.checkNotNull(cluster);
        return cluster.getSize() > 1;
    }




    /* member class not found */
    class _cls1 {}

}
