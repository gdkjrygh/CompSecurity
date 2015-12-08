// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android;

import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MarkerManager
    implements com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerDragListener, com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
{
    public class Collection
    {

        private com.google.android.gms.maps.GoogleMap.InfoWindowAdapter mInfoWindowAdapter;
        private com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener mInfoWindowClickListener;
        private com.google.android.gms.maps.GoogleMap.OnMarkerClickListener mMarkerClickListener;
        private com.google.android.gms.maps.GoogleMap.OnMarkerDragListener mMarkerDragListener;
        private final Set mMarkers = new HashSet();
        final MarkerManager this$0;

        public Marker addMarker(MarkerOptions markeroptions)
        {
            markeroptions = mMap.addMarker(markeroptions);
            mMarkers.add(markeroptions);
            mAllMarkers.put(markeroptions, this);
            return markeroptions;
        }

        public void clear()
        {
            Marker marker;
            for (Iterator iterator = mMarkers.iterator(); iterator.hasNext(); mAllMarkers.remove(marker))
            {
                marker = (Marker)iterator.next();
                marker.remove();
            }

            mMarkers.clear();
        }

        public java.util.Collection getMarkers()
        {
            return Collections.unmodifiableCollection(mMarkers);
        }

        public boolean remove(Marker marker)
        {
            if (mMarkers.remove(marker))
            {
                mAllMarkers.remove(marker);
                marker.remove();
                return true;
            } else
            {
                return false;
            }
        }

        public void setOnInfoWindowAdapter(com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infowindowadapter)
        {
            mInfoWindowAdapter = infowindowadapter;
        }

        public void setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener oninfowindowclicklistener)
        {
            mInfoWindowClickListener = oninfowindowclicklistener;
        }

        public void setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onmarkerclicklistener)
        {
            mMarkerClickListener = onmarkerclicklistener;
        }

        public void setOnMarkerDragListener(com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onmarkerdraglistener)
        {
            mMarkerDragListener = onmarkerdraglistener;
        }





        public Collection()
        {
            this$0 = MarkerManager.this;
            super();
        }
    }


    private final Map mAllMarkers = new HashMap();
    private final GoogleMap mMap;
    private final Map mNamedCollections = new HashMap();

    public MarkerManager(GoogleMap googlemap)
    {
        mMap = googlemap;
    }

    public Collection getCollection(String s)
    {
        return (Collection)mNamedCollections.get(s);
    }

    public View getInfoContents(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mInfoWindowAdapter != null)
        {
            return collection.mInfoWindowAdapter.getInfoContents(marker);
        } else
        {
            return null;
        }
    }

    public View getInfoWindow(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mInfoWindowAdapter != null)
        {
            return collection.mInfoWindowAdapter.getInfoWindow(marker);
        } else
        {
            return null;
        }
    }

    public Collection newCollection()
    {
        return new Collection();
    }

    public Collection newCollection(String s)
    {
        if (mNamedCollections.get(s) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("collection id is not unique: ").append(s).toString());
        } else
        {
            Collection collection = new Collection();
            mNamedCollections.put(s, collection);
            return collection;
        }
    }

    public void onInfoWindowClick(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mInfoWindowClickListener != null)
        {
            collection.mInfoWindowClickListener.onInfoWindowClick(marker);
        }
    }

    public boolean onMarkerClick(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mMarkerClickListener != null)
        {
            return collection.mMarkerClickListener.onMarkerClick(marker);
        } else
        {
            return false;
        }
    }

    public void onMarkerDrag(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mMarkerDragListener != null)
        {
            collection.mMarkerDragListener.onMarkerDrag(marker);
        }
    }

    public void onMarkerDragEnd(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mMarkerDragListener != null)
        {
            collection.mMarkerDragListener.onMarkerDragEnd(marker);
        }
    }

    public void onMarkerDragStart(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        if (collection != null && collection.mMarkerDragListener != null)
        {
            collection.mMarkerDragListener.onMarkerDragStart(marker);
        }
    }

    public boolean remove(Marker marker)
    {
        Collection collection = (Collection)mAllMarkers.get(marker);
        return collection != null && collection.remove(marker);
    }


}
