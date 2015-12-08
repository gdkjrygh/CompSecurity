// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.MarkerManager;
import com.google.maps.android.clustering.Cluster;
import java.util.Map;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

private class tion extends AnimatorListenerAdapter
    implements android.animation.enderer.AnimationTask
{

    private final LatLng from;
    private MarkerManager mMarkerManager;
    private boolean mRemoveOnComplete;
    private final Marker marker;
    private final tion markerWithPosition;
    final DefaultClusterRenderer this$0;
    private final LatLng to;

    public void onAnimationEnd(Animator animator)
    {
        if (mRemoveOnComplete)
        {
            animator = (Cluster)DefaultClusterRenderer.access$600(DefaultClusterRenderer.this).get(marker);
            DefaultClusterRenderer.access$2100(DefaultClusterRenderer.this).remove(animator);
            DefaultClusterRenderer.access$300(DefaultClusterRenderer.this).move(marker);
            DefaultClusterRenderer.access$600(DefaultClusterRenderer.this).remove(marker);
            mMarkerManager.remove(marker);
        }
        tion.access._mth1602(markerWithPosition, to);
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        double d2 = to.latitude;
        double d3 = from.latitude;
        double d4 = f;
        double d5 = from.latitude;
        double d1 = to.longitude - from.longitude;
        double d = d1;
        if (Math.abs(d1) > 180D)
        {
            d = d1 - Math.signum(d1) * 360D;
        }
        valueanimator = new LatLng((d2 - d3) * d4 + d5, (double)f * d + from.longitude);
        marker.setPosition(valueanimator);
    }

    public void perform()
    {
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        valueanimator.setInterpolator(DefaultClusterRenderer.access$2300());
        valueanimator.addUpdateListener(this);
        valueanimator.addListener(this);
        valueanimator.start();
    }

    public void removeOnAnimationComplete(MarkerManager markermanager)
    {
        mMarkerManager = markermanager;
        mRemoveOnComplete = true;
    }

    private tion(tion tion, LatLng latlng, LatLng latlng1)
    {
        this$0 = DefaultClusterRenderer.this;
        super();
        markerWithPosition = tion;
        marker = tion.access._mth1700(tion);
        from = latlng;
        to = latlng1;
    }

    tion(tion tion, LatLng latlng, LatLng latlng1, tion tion1)
    {
        this(tion, latlng, latlng1);
    }
}
