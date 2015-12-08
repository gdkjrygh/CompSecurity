// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzg, LatLng

public final class PolygonOptions
    implements SafeParcelable
{

    public static final zzg CREATOR = new zzg();
    private final int zzCY;
    private float zzaCX;
    private int zzaCY;
    private int zzaCZ;
    private final List zzaDA;
    private final List zzaDB;
    private boolean zzaDC;
    private float zzaDa;
    private boolean zzaDb;

    public PolygonOptions()
    {
        zzaCX = 10F;
        zzaCY = 0xff000000;
        zzaCZ = 0;
        zzaDa = 0.0F;
        zzaDb = true;
        zzaDC = false;
        zzCY = 1;
        zzaDA = new ArrayList();
        zzaDB = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        zzaCX = 10F;
        zzaCY = 0xff000000;
        zzaCZ = 0;
        zzaDa = 0.0F;
        zzaDb = true;
        zzaDC = false;
        zzCY = i;
        zzaDA = list;
        zzaDB = list1;
        zzaCX = f;
        zzaCY = j;
        zzaCZ = k;
        zzaDa = f1;
        zzaDb = flag;
        zzaDC = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        zzaDA.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        zzaDA.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); zzaDA.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        zzaDB.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        zzaCZ = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        zzaDC = flag;
        return this;
    }

    public int getFillColor()
    {
        return zzaCZ;
    }

    public List getHoles()
    {
        return zzaDB;
    }

    public List getPoints()
    {
        return zzaDA;
    }

    public int getStrokeColor()
    {
        return zzaCY;
    }

    public float getStrokeWidth()
    {
        return zzaCX;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public float getZIndex()
    {
        return zzaDa;
    }

    public boolean isGeodesic()
    {
        return zzaDC;
    }

    public boolean isVisible()
    {
        return zzaDb;
    }

    public PolygonOptions strokeColor(int i)
    {
        zzaCY = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        zzaCX = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        zzaDb = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public PolygonOptions zIndex(float f)
    {
        zzaDa = f;
        return this;
    }

    List zzvK()
    {
        return zzaDB;
    }

}
