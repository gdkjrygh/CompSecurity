// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.maps.android:
//            MarkerManager

public class this._cls0
{

    private com.google.android.gms.maps.er mInfoWindowAdapter;
    private com.google.android.gms.maps.ckListener mInfoWindowClickListener;
    private com.google.android.gms.maps.stener mMarkerClickListener;
    private com.google.android.gms.maps.tener mMarkerDragListener;
    private final Set mMarkers = new HashSet();
    final MarkerManager this$0;

    public Marker addMarker(MarkerOptions markeroptions)
    {
        markeroptions = MarkerManager.access$400(MarkerManager.this).addMarker(markeroptions);
        mMarkers.add(markeroptions);
        MarkerManager.access$500(MarkerManager.this).put(markeroptions, this);
        return markeroptions;
    }

    public void clear()
    {
        Marker marker;
        for (Iterator iterator = mMarkers.iterator(); iterator.hasNext(); MarkerManager.access$500(MarkerManager.this).remove(marker))
        {
            marker = (Marker)iterator.next();
            marker.remove();
        }

        mMarkers.clear();
    }

    public Collection getMarkers()
    {
        return Collections.unmodifiableCollection(mMarkers);
    }

    public boolean remove(Marker marker)
    {
        if (mMarkers.remove(marker))
        {
            MarkerManager.access$500(MarkerManager.this).remove(marker);
            marker.remove();
            return true;
        } else
        {
            return false;
        }
    }

    public void setOnInfoWindowAdapter(com.google.android.gms.maps.er er)
    {
        mInfoWindowAdapter = er;
    }

    public void setOnInfoWindowClickListener(com.google.android.gms.maps.ckListener cklistener)
    {
        mInfoWindowClickListener = cklistener;
    }

    public void setOnMarkerClickListener(com.google.android.gms.maps.stener stener)
    {
        mMarkerClickListener = stener;
    }

    public void setOnMarkerDragListener(com.google.android.gms.maps.tener tener)
    {
        mMarkerDragListener = tener;
    }





    public gListener()
    {
        this$0 = MarkerManager.this;
        super();
    }
}
