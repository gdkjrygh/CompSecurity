// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import android.os.Parcel;
import com.ubercab.android.location.UberLocation;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.location:
//            RiderLocation

public final class Shape_RiderLocation extends RiderLocation
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static RiderLocation a(Parcel parcel)
        {
            return new Shape_RiderLocation(parcel, (byte)0);
        }

        private static RiderLocation[] a(int i1)
        {
            return new RiderLocation[i1];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private static final ClassLoader a = com/ubercab/client/core/location/Shape_RiderLocation.getClassLoader();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private List o;
    private UberLocation p;

    Shape_RiderLocation()
    {
    }

    private Shape_RiderLocation(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
        d = (String)parcel.readValue(a);
        e = (String)parcel.readValue(a);
        f = (String)parcel.readValue(a);
        g = (String)parcel.readValue(a);
        h = (String)parcel.readValue(a);
        i = (String)parcel.readValue(a);
        j = (String)parcel.readValue(a);
        k = (String)parcel.readValue(a);
        l = (String)parcel.readValue(a);
        m = (String)parcel.readValue(a);
        n = (String)parcel.readValue(a);
        o = (List)parcel.readValue(a);
        p = (UberLocation)parcel.readValue(a);
    }

    Shape_RiderLocation(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RiderLocation)obj;
            if (((RiderLocation) (obj)).getAddress() == null ? getAddress() != null : !((RiderLocation) (obj)).getAddress().equals(getAddress()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getFormattedAddress() == null ? getFormattedAddress() != null : !((RiderLocation) (obj)).getFormattedAddress().equals(getFormattedAddress()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getSubtitle() == null ? getSubtitle() != null : !((RiderLocation) (obj)).getSubtitle().equals(getSubtitle()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getId() == null ? getId() != null : !((RiderLocation) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getLongAddress() == null ? getLongAddress() != null : !((RiderLocation) (obj)).getLongAddress().equals(getLongAddress()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getNickname() == null ? getNickname() != null : !((RiderLocation) (obj)).getNickname().equals(getNickname()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getReference() == null ? getReference() != null : !((RiderLocation) (obj)).getReference().equals(getReference()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getReferenceType() == null ? getReferenceType() != null : !((RiderLocation) (obj)).getReferenceType().equals(getReferenceType()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getRelevance() == null ? getRelevance() != null : !((RiderLocation) (obj)).getRelevance().equals(getRelevance()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getShortAddress() == null ? getShortAddress() != null : !((RiderLocation) (obj)).getShortAddress().equals(getShortAddress()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getTag() == null ? getTag() != null : !((RiderLocation) (obj)).getTag().equals(getTag()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getTitle() == null ? getTitle() != null : !((RiderLocation) (obj)).getTitle().equals(getTitle()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getType() == null ? getType() != null : !((RiderLocation) (obj)).getType().equals(getType()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getListAddressComponents() == null ? getListAddressComponents() != null : !((RiderLocation) (obj)).getListAddressComponents().equals(getListAddressComponents()))
            {
                return false;
            }
            if (((RiderLocation) (obj)).getLocation() == null ? getLocation() != null : !((RiderLocation) (obj)).getLocation().equals(getLocation()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAddress()
    {
        return b;
    }

    public final String getFormattedAddress()
    {
        return c;
    }

    public final String getId()
    {
        return e;
    }

    public final List getListAddressComponents()
    {
        return o;
    }

    public final UberLocation getLocation()
    {
        return p;
    }

    public final String getLongAddress()
    {
        return f;
    }

    public final String getNickname()
    {
        return g;
    }

    public final String getReference()
    {
        return h;
    }

    public final String getReferenceType()
    {
        return i;
    }

    public final String getRelevance()
    {
        return j;
    }

    public final String getShortAddress()
    {
        return k;
    }

    public final String getSubtitle()
    {
        return d;
    }

    public final String getTag()
    {
        return l;
    }

    public final String getTitle()
    {
        return m;
    }

    public final String getType()
    {
        return n;
    }

    public final int hashCode()
    {
        int k4 = 0;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.hashCode();
        }
        if (d == null)
        {
            k1 = 0;
        } else
        {
            k1 = d.hashCode();
        }
        if (e == null)
        {
            l1 = 0;
        } else
        {
            l1 = e.hashCode();
        }
        if (f == null)
        {
            i2 = 0;
        } else
        {
            i2 = f.hashCode();
        }
        if (g == null)
        {
            j2 = 0;
        } else
        {
            j2 = g.hashCode();
        }
        if (h == null)
        {
            k2 = 0;
        } else
        {
            k2 = h.hashCode();
        }
        if (i == null)
        {
            l2 = 0;
        } else
        {
            l2 = i.hashCode();
        }
        if (j == null)
        {
            i3 = 0;
        } else
        {
            i3 = j.hashCode();
        }
        if (k == null)
        {
            j3 = 0;
        } else
        {
            j3 = k.hashCode();
        }
        if (l == null)
        {
            k3 = 0;
        } else
        {
            k3 = l.hashCode();
        }
        if (m == null)
        {
            l3 = 0;
        } else
        {
            l3 = m.hashCode();
        }
        if (n == null)
        {
            i4 = 0;
        } else
        {
            i4 = n.hashCode();
        }
        if (o == null)
        {
            j4 = 0;
        } else
        {
            j4 = o.hashCode();
        }
        if (p != null)
        {
            k4 = p.hashCode();
        }
        return (j4 ^ (i4 ^ (l3 ^ (k3 ^ (j3 ^ (i3 ^ (l2 ^ (k2 ^ (j2 ^ (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k4;
    }

    public final RiderLocation setAddress(String s)
    {
        b = s;
        return this;
    }

    public final RiderLocation setFormattedAddress(String s)
    {
        c = s;
        return this;
    }

    public final RiderLocation setId(String s)
    {
        e = s;
        return this;
    }

    public final RiderLocation setListAddressComponents(List list)
    {
        o = list;
        return this;
    }

    public final RiderLocation setLocation(UberLocation uberlocation)
    {
        p = uberlocation;
        return this;
    }

    public final RiderLocation setLongAddress(String s)
    {
        f = s;
        return this;
    }

    public final RiderLocation setNickname(String s)
    {
        g = s;
        return this;
    }

    public final RiderLocation setReference(String s)
    {
        h = s;
        return this;
    }

    public final RiderLocation setReferenceType(String s)
    {
        i = s;
        return this;
    }

    public final RiderLocation setRelevance(String s)
    {
        j = s;
        return this;
    }

    public final RiderLocation setShortAddress(String s)
    {
        k = s;
        return this;
    }

    public final RiderLocation setSubtitle(String s)
    {
        d = s;
        return this;
    }

    public final RiderLocation setTag(String s)
    {
        l = s;
        return this;
    }

    public final RiderLocation setTitle(String s)
    {
        m = s;
        return this;
    }

    public final RiderLocation setType(String s)
    {
        n = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderLocation{address=")).append(b).append(", formattedAddress=").append(c).append(", subtitle=").append(d).append(", id=").append(e).append(", longAddress=").append(f).append(", nickname=").append(g).append(", reference=").append(h).append(", referenceType=").append(i).append(", relevance=").append(j).append(", shortAddress=").append(k).append(", tag=").append(l).append(", title=").append(m).append(", type=").append(n).append(", listAddressComponents=").append(o).append(", location=").append(p).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
        parcel.writeValue(f);
        parcel.writeValue(g);
        parcel.writeValue(h);
        parcel.writeValue(i);
        parcel.writeValue(j);
        parcel.writeValue(k);
        parcel.writeValue(l);
        parcel.writeValue(m);
        parcel.writeValue(n);
        parcel.writeValue(o);
        parcel.writeValue(p);
    }

}
