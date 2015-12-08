// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            d, c

public final class MetadataBundle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int jE;
    final Bundle vM;

    MetadataBundle(int i, Bundle bundle)
    {
        jE = i;
        vM = (Bundle)gi.a(bundle);
        vM.setClassLoader(getClass().getClassLoader());
        bundle = new ArrayList();
        Iterator iterator = vM.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (c.a(s1) == null)
            {
                bundle.add(s1);
                Log.w("MetadataBundle", (new StringBuilder("Ignored unknown metadata field in bundle: ")).append(s1).toString());
            }
        } while (true);
        String s;
        for (bundle = bundle.iterator(); bundle.hasNext(); vM.remove(s))
        {
            s = (String)bundle.next();
        }

    }

    private MetadataBundle(Bundle bundle)
    {
        this(1, bundle);
    }

    public static MetadataBundle a(b b1, Object obj)
    {
        MetadataBundle metadatabundle = cY();
        metadatabundle.b(b1, obj);
        return metadatabundle;
    }

    public static MetadataBundle a(MetadataBundle metadatabundle)
    {
        return new MetadataBundle(new Bundle(metadatabundle.vM));
    }

    public static MetadataBundle cY()
    {
        return new MetadataBundle(new Bundle());
    }

    public final Object a(b b1)
    {
        return b1.a(vM);
    }

    public final void b(b b1, Object obj)
    {
        if (c.a(b1.a()) == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unregistered field: ")).append(b1.a()).toString());
        } else
        {
            b1.a(obj, vM);
            return;
        }
    }

    public final Set cZ()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = vM.keySet().iterator(); iterator.hasNext(); hashset.add(c.a((String)iterator.next()))) { }
        return hashset;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MetadataBundle))
        {
            return false;
        }
        obj = (MetadataBundle)obj;
        Object obj1 = vM.keySet();
        if (!obj1.equals(((MetadataBundle) (obj)).vM.keySet()))
        {
            return false;
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            String s = (String)((Iterator) (obj1)).next();
            if (!ge.a(vM.get(s), ((MetadataBundle) (obj)).vM.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    public final int hashCode()
    {
        Iterator iterator = vM.keySet().iterator();
        String s;
        int i;
        for (i = 1; iterator.hasNext(); i = vM.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public final String toString()
    {
        return (new StringBuilder("MetadataBundle [values=")).append(vM).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }

}
